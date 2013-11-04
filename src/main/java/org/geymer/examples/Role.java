package org.geymer.examples;

public class Role {
private String name;
private int id;




public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@Override
public String toString() {
	return "Role [role=" + name + ", id=" + id + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
