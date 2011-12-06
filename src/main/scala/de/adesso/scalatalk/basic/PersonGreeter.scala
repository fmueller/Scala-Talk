package de.adesso.scalatalk.basic

class Person(val firstname: String,
    val surname: String,
    val age: Int) {

  override def toString() = firstname + " " + surname
}

class PersonGreeter(greetingPrefix: String) {

  def sayHelloTo(person: Person) {
    println(greetingPrefix + person.firstname)
  }
}

object PersonGreeter {

  def main(args: Array[String]) = {
    val me = new Person("Felix", "Müller", 23)
    new PersonGreeter("Hello ").sayHelloTo(me)
  }
}