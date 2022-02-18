import org.scalatest._
class HelloWorldAppTest extends FunSuite {

  test("checkAgeGroup test case 1") {
    // Arrange
    val expectedAgeGroup = "You are a baby"

    // Act
    val actualAgeGroup = HelloWorldApp.checkAgeGroup(2)

    // Assert
    assert(expectedAgeGroup == actualAgeGroup)

  }
  test( testName = "checkAgeGroup test case 2") {
    // Arrange
    val expectedAgeGroup = "You are a child"

    // Act
    val actualAgeGroup = HelloWorldApp.checkAgeGroup(4)

    // Assert
    assert(expectedAgeGroup == actualAgeGroup)

  }
  test( testName = "checkAgeGroup test case 3") {
    // Arrange
    val expectedAgeGroup = "You are an adult"

    // Act
    val actualAgeGroup = HelloWorldApp.checkAgeGroup(19)

    // Assert
    assert(expectedAgeGroup == actualAgeGroup)
  }

  test( testName = "checkAgeGroup test case 4") {
    // Arrange
    val expectedAgeGroup = "I don't know your age"

    // Act
    val actualAgeGroup = HelloWorldApp.checkAgeGroup(age = 12)

    // Assert
    assert(expectedAgeGroup == actualAgeGroup)
  }

  }


