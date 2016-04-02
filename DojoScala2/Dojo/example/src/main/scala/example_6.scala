/*
	Currying or returning functions special syntax in scala
*/
object example6 extends App {

	// Retorna una funcion que realiza la operacion entre los enteros de A y B
	def sum(f: Int => Int)(a: Int, b: Int): Int = {
		if (a > b) 0 else f(a) + sum(f)(a + 1, b)
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