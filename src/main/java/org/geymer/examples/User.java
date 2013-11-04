package org.geymer.examples;

import org.springframework.stereotype.Component;

@Component("userAnnotation")
public class User {


private String name;
private String password;
private Role role;
public User(){}
public User(String name, String password) {
	this.name = name;
	this.password = password;
}

public User(String name, String password, Role role) {
	this.name = name;
	this.password = password;
	this.role = role;
}

public void init(){
	System.out.println("Init");
}

public void destroy(){
	System.out.println("Destroy");
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}
@Override
public String toString() {
	return "User [name=" + name + ", password=" + password + ", role=" + role
			+ "]";
}


}
