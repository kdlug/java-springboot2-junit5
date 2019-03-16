# JUnit 5

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
