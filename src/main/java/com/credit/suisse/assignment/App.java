package com.credit.suisse.assignment;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Supplier;
import java.util.stream.Stream;

import com.credit.suisse.assignment.domain.EventModel;
import com.credit.suisse.assignment.domain.EventState;
import com.credit.suisse.assignment.domain.FinishedCache;
import com.credit.suisse.assignment.domain.StartCache;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

	 public final static StartCache START_CACHE = new StartCache();
	 public final static FinishedCache FINISHED_CACHE = new FinishedCache();
	
	 public static void main(String[] args) {
		try {
			try (Stream<String> input = Files.lines(Paths.get("c:\\data\\sample.log"))) {
				Supplier<Stream<String>> sup = () -> input;

				sup.get().map(string -> convert(string, EventModel.class)).forEach(e -> {
					if (EventState.STARTED.equals(e.getState())) {
						
						dosomeThing(e);
					}else if (EventState.FINISHED.equals(e.getState())) {
					
						dosomeThing2(e);
					}
				});
				// sup.get().filter(line ->
				// line.contains("STARTED")).forEach(System.out::println);
			}
			// Files.lines(Paths.get("c:\\data\\sample.log"))
			// .filter(line -> line.contains("STARTED")).forEach(s->System.out.println(s));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static <T> T convert(String string, Class<T> pojo) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(string, pojo);
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}
	
	public static void dosomeThing(EventModel e) {
		START_CACHE.saveEvent();
		System.out.println(e.getId());
	}
	
	public static void dosomeThing2(EventModel e) {
		
		FINISHED_CACHE.saveEvent();
		System.out.println(e.getId());
	}
}
