package com.ticketexchange.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

	private static final ObjectMapper om = new ObjectMapper();

	public static <T> T fromJson(String json, Class<T> type) {
		try {
			return om.readValue(json, type);
		} catch (Exception e) {
			throw new JsonException(e);
		}
	}

	public static String toJson(Object obj) {
		try {
			return om.writeValueAsString(obj);
		} catch (Exception e) {
			throw new JsonException(e);
		}
	}

}
