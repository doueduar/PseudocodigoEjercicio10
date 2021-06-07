Algoritmo Ejercicio10
	suma <- 0
	sum <- 0
	multiplos <- 0
	Repetir
		Escribir "ingrese numero"
		Leer N
		multi <- N MOD(6)
		Si multi = 0 Entonces
			multiplos <- multiplos+1
		FinSi
		Si 1<=N & N<=10  Entonces
			sum <- sum+N
		FinSi
		suma <- suma+N
		Escribir "total acumuldo",suma,"cantidad de multiplos de 6 son: ",multiplos," 5suma de numeros con restricción son: ",sum
	Hasta Que 1000<=suma
FinAlgoritmo
