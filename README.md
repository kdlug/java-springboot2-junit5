# JUnit 5

JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage.  

- The junit-jupiter-api dependency allows us to write tests and extensions which use JUnit 5.
- The junit-jupiter-engine dependency allows us to run tests which use JUnit 5.
- The junit-vintage-engine dependency allows us to run tests which use JUnit 3 or 4.

## Enabling JUnit Platform to run your tests

Starting with version 4.6, Gradle provides native support for executing tests on the JUnit Platform. 

To enable it, you just need to specify useJUnitPlatform() within a test task declaration in
build.gradle:

```txt
// build.gradle
test {
    useJUnitPlatform()
    
    testLogging {
        // Configure events which will be logged
        events "passed", "skipped", "failed"
    }
}
```

## Running tests from command line with gradle

```console
 ./gradlew clean build
 ./gradlew test
```

## JUnit Annotations

| Annotation | Description |
|------------|-------------|
| `@Test` | Marks a method as a test method |
| `@ParametrizedTest` | Marks a method as a parametized test |
| `@ReapetedTest` | Repeat test N times |
| `@TestFactory` | Test Factory method for dynamic tests |
| `@TestInstance` | Used to configure test instance lifecycle |
| `@TestTemplate` | Creates a template to be used by multiple test cases |
| `@DisplayName` | Human friendly name for test |
| `@BeforeEach` | Method to run before each test case |
| `@AfterEach` | Method to run after each test case |
| `@BeforeAll` | Static method to run |
| `@AfterAll` | Static method to run after all test cases in current class |
| `@Nested` | Created a nested test class |
| `@Tag` | Declare tags for filtering tests |
| `Disabled` | Disable test or test class |
| `ExtendWith` | Used to register extensions |

## JUnit test lifecycle

![JUnit test lifecycle](readme/junit-lifecycle.png?raw=true "JUnit test lifecycle")

## Resources

https://www.baeldung.com/junit-5-gradle  
https://junit.org/junit5/docs/5.4.0/user-guide/index.pdf