package de.adesso.scalatalk.scalatest

import java.util.Date

case class Customer(firstname: String, surname: String, bithdate: Date = new Date())
case class Item(name: String, price: Long)

case class Order(customer: Customer, items: List[Item]) {

  def calculatePrice() = items.map(item => item.price).foldLeft(0L)((left, right) => left + right)
}