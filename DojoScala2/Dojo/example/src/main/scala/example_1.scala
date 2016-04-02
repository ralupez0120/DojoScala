/*
	Ejemplo Básico
*/
object example1 extends App {

	// Eleva al cubo el entero enviado
	def alCubo(x: Int) : Int = {
		x * x * x
	}

	// Retorna el factorial del entero enviado
	def factorial(x: Int) : Int = {
		if (x <= 0) 1 else factorial(x -1)
	}

	// Funcion que realiza una suma de los enteros entre A y B
	def sumEnteros(a: Int, b: Int) : Int = {
		if(a > b) 0 else a + sumEnteros(a + 1, b)
	}

	// Suma los cubos de los elementos entre A y B
	def sumCubos(a: Int, b: Int): Int = {
		if(a > b) 0 else alCubo(a) + sumCubos(a + 1, b)
	}

	// Suma los factoriales de los enteros entre A y B
	def sumFactoriales(a: Int, b: Int): Int = {
		if(a > b) 0 else factorial(a) + sumFactoriales(a + 1, b)
	}

	println("Suma Enteros 1 a 10")
	println(sumEnteros(1, 10))

	println("Suma Cubos 1 a 10")
	println(sumCubos(1, 10))

	println("Suma Factoriales 1 a 10")
	println(sumFactoriales(1, 10))

}