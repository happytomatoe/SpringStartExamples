package org.geymer.examples;

public class Session {
	private Session() {
	}

	private static class SessionHolder {
		static Session instance = new Session();
	}
		public static Session getInstance() {
			return SessionHolder.instance;

		}

	
}