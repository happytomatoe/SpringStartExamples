package org.geymer.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SessionManager {
@Autowired
private	Session session;
@Autowired(required=false)
private Session sessionRequired;

@Autowired
@Qualifier("roleSpEL")
private Role role;

@Override
public String toString() {
	return "SessionManager [session=" + session + ", sessionRequired="
			+ sessionRequired + ", role=" + role + "]";
}	
	
}
