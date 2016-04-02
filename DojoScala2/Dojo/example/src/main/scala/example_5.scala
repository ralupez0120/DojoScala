/*
	Currying or returning functions
*/
object example5 extends App {

	// Retorna una funcion que realiza la operacion entre los enteros de A y B
	def sum(f: Int => Int): (Int, Int) => Int = {
		def sumFunction(a: Int, b: Int): Int = {
			if (a > b) 0 else f(a) + sumFunction(a + 1, b)
		}
		sumFunction
	}
	
	// Retorna el factorial del entero enviado
	def factorial(x: Int) : Int = {
		if (x <= 0) 1 else factorial(x -1)
	}

	// De esta manera se evita la definicion de las funciones especificas y son usadas como

	println("Suma Enteros 1 a 10")
	println(sum(x => x)(1, 10))

	println("Suma Cubos 1 a 10")
	println(sum(x => x * x * x)(1, 10))

	println("Suma Factoriales 1 a 10")
	println(sum(factorial)(1, 10))
}