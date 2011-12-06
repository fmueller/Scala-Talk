package de.adesso.scalatalk.basic

sealed trait Human
case class Adessi(firstname: String, surname: String, age: Int) extends Human
case class Student(name: String, gotEnoughSleep: Boolean) extends Human

class PersonGreeterAdvanced(greetingPrefix: String) {

  def sayHelloTo(person: Human) {
    person match {
      case Adessi(firstname, _, _) =>
        println(greetingPrefix + firstname)

      case Student(name, gotEnoughSleep) if (!gotEnoughSleep) =>
        println("Get some sleep, " + name + "!")

      case Student(name, _) =>
        println(greetingPrefix + name)
    }
  }
}

object PersonGreeterAdvanced {

  def main(args: Array[String]) = {
    val greeter = new PersonGreeterAdvanced("Hello ")
    val anonymous = Adessi("Hans", "Muster", 32)
    val me = Student("Felix", false)

    greeter.sayHelloTo(anonymous)
    greeter.sayHelloTo(me)
  }
}