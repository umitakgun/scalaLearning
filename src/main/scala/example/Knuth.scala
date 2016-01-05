package example

/**
  * Created by umit on 03.01.2016.
  */
object Knuth extends App {
  def t = 5

  def abs(x: Double) = if (x<0) -x else x

  def sqrtIter(guess: Double, x: Double) : Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess,x), x)

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess*guess - x) / x < 0.001

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  def sqrt(x: Double) = sqrtIter(1.0, x)

  println(sqrt(1.0e50))

//  0.001
//  0.1e-20
//  1.0e20
//  1.0e50
//  have to write is good enough

}
