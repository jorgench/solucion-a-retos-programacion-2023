/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    printFizzBuzz(100)
}

fun printFizzBuzz (num: Int) {
    
    for (i in 1..num) {
        println(fizzBuzzTranslate(i))
    }
    
}


fun fizzBuzzTranslate (numToTranslate: Int) : String {
	
	when {
    	numToTranslate % 15 == 0 -> return "FizzBuzz"
        numToTranslate % 3 == 0 -> return "Fizz"
        numToTranslate % 5 == 0 -> return "Buzz"
        else -> return "$numToTranslate"
    }    
    
}
