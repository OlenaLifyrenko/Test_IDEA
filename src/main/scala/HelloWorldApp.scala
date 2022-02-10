

object HelloWorldApp extends App {

  val anton: String = "Anton"
  val olena: String = "Olena"

  def greeting(name: String): String = {
    if(name == "Anton") s"Hello, $name, nice to meet you"
    else if (name == "Olena") s"Hi $name"
    else s"I don't know who you are, $name"
  }

  def ageGroup(age: Int): String = {
    if(age == 2) s"You are a baby"
    else if(age == 5) s"You are a child"
    else if(age == 18) s"You are an adult"
    else s"I don't know your age"

  }

  val response = ageGroup(age = 5)

  println(response)
}
