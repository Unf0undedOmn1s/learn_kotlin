// Declaring variables with "var". Kotlin gives a selection of variables that are
// Integers, Doubles, Strings, Booleans, etc
var age: Int = 25
val name: String = "John"

// Example of a function
fun greet(name: String) {
    println("Hello, $name!")
}


// Example of counterflow
fun main() {
    val x = 10
    val y = 20

    if (x > y) {
        println("x is greater than y")
    } else {
        println("x is not greater than y")
    }

    for (i in 1..5) {
        println(i)
    }

    var i = 0
    while (i < 5) {
        println(i)
        i++
    }
}


// Example of a while loop
fun main() {
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }
}
// Output of while loop: 0,1,2,3,4


// Example of an object
fun main() {
    val person = Person("Alice", 30)
    println("${person.name} is ${person.age} years old.")
}


// NullPointerExceptions
var str: String? = "Hello"
str = null // This is fine
