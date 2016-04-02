/*
	Usando Funciones de mas alto orden
*/
object example2 extends App {

	// Realiza la suma de una funcion f de los enteros entre A y B
	def sum(f: Int => Int, a: Int, b: Int): Int = {
		if(a > b) 0 else f(a) + sum(f, a + 1, b)
	}

	// Devuelve el mismo entero enviado
	def identidad(x: Int): Int = x
	
	// Eleva al cubo el entero enviado
	def alCubo(x: Int) : Int = {
		x * x * x
	}

	// Retorna el factorial del entero enviado
	def factorial(x: Int) : Int = {
		if (x <= 0) 1 else factorial(x -1)
	}

	// Funcion que realiza una suma de los enteros entre A y B
	def sumEnteros(a: Int, b: Int) : Int = sum(identidad, a, b)

	// Suma los cubos de los elementos entre A y B
	def sumCubos(a: Int, b: Int): Int = sum(alCubo, a, b)

	// Suma los factoriales de los enteros entre A y B
	def sumFactoriales(a: Int, b: Int): Int = sum(factorial, a, b)

	println("Suma Enteros 1 a 10")
	println(sumEnteros(1, 10))

	println("Suma Cubos 1 a 10")
	println(sumCubos(1, 10))

	println("Suma Factoriales 1 a 10")
	println(sumFactoriales(1, 10))

}