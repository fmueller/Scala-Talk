package de.adesso.scalatalk.first

class Greeter(greetingPrefix: String) {

  def sayHelloTo(person: String) {
    println(greetingPrefix + person)
  }
}

object Greeter {

  def main(args: Array[String]) = {
    new Greeter("Hello ").sayHelloTo("Felix")
  }
}