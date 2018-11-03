package di.failure.example;

import io.micronaut.test.annotation.MicronautTest;
import io.micronaut.test.annotation.MockBean;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.mockito.Mockito.mock;

@MicronautTest
public class ClassUnderTestTest {

	@Inject ClassUnderTest classUnderTest;

	@Test
	public void test() {

	}

	@MockBean
	Dependency dependency() {
		return mock(Dependency.class);
	}

}