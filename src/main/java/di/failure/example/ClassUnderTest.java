package di.failure.example;

import javax.inject.Singleton;

@Singleton
public class ClassUnderTest {
	private final Dependency dependency;

	public ClassUnderTest(Dependency dependency) {
		this.dependency = dependency;
	}
}
