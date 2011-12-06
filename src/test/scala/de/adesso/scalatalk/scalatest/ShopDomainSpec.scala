package de.adesso.scalatalk.scalatest

import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ShopDomainSpec extends FlatSpec with ShouldMatchers {

  "An order" should "have prices of all its items summed up" in {
    val oneEuroInCents = 100
    val me = Customer("Felix", "Müller")
    val ipad = Item("iPad", 500 * oneEuroInCents)
    val iphone = Item("iPhone", 300 * oneEuroInCents)

    val order = Order(me, ipad :: iphone :: Nil)
    order.calculatePrice() should be (ipad.price + iphone.price)
  }
}