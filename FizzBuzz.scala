

object FizzBuzz {
	def main(args: Array[String]) {
		// println("Hello, World!")
		fb(100)
	}

	def fb(n: Int) {
		if (n == 0) return
		fb(n - 1)
		if (n % 15 == 0)
			println("FizzBuzz")
		else if (n % 5 == 0)
			println("Buzz")
		else if (n % 3 == 0)
			println("Fizz")
		else
			println(n)
	}
}

