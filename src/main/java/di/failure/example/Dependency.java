package di.failure.example;

import javax.inject.Singleton;

@Singleton
public class Dependency {
	public Dependency() {
		throw new RuntimeException("I don't want this to load!");
	}
}
