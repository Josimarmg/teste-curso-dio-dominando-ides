package br.com.dio.model;

import java.util.Objects;

public class Gato {
	
	private String name;
	private String color;
	private String age;
	
	public Gato(String name, String color, String age) {
		
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, color, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(age, other.age) && Objects.equals(color, other.color) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Gato [name=" + name + ", color=" + color + ", age=" + age + "]";
	}
	
	

}
