"Hello World"

val x = 1
def increase(i: Int) = i + 1
increase(x)

def square(x: Double) = x * x

square(2)

square(4+5)

//def power(x: Double, y: Int) : Double

def loop: Boolean = loop

def constOne(x: Int, y: => Int) : Int = 1

def loopInt: Int = loopInt

constOne(3,loopInt)

def and(x: Boolean, y: => Boolean) : Boolean = if (x) y else false

def or(x: Boolean, y: => Boolean) : Boolean = if (x) true else y

and(true,false)
and(false, loop)

or(true,false)
or(false,false)