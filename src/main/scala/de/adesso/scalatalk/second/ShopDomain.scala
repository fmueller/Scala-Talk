package de.adesso.scalatalk.second

import java.util.Date

case class Customer(firstname: String, surname: String, bithdate: Date = new Date())
case class Item(name: String, price: Long)

case class Order(customer: Customer, items: List[Item]) {

  def calculatePrice() = items.map(_.price).foldLeft(0L)(_ + _)
}