package org.geymer.examples;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Instruments {
private List list;
private Set set;
private HashMap map;
private Properties props;
public List getList() {
	return list;
}
public void setList(List list) {
	this.list = list;
}
public Set getSet() {
	return set;
}
public void setSet(Set set) {
	this.set = set;
}
public HashMap getMap() {
	return map;
}
public void setMap(HashMap map) {
	this.map = map;
}
@Override
public String toString() {
	return "Instruments [list=" + list + ", set=" + set + ", map=" + map
			+ ", props=" + props + "]";
}
public Properties getProps() {
	return props;
}
public void setProps(Properties props) {
	this.props = props;
}

}
