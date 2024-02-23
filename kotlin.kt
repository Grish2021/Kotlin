

fun main() {
    println("Simple Calculator")
    println("Enter an expression (e.g., 2 + 3):")
    val input = readLine()
    if (input != null) {
        val parts = input.split(" ")
        if (parts.size == 3) {
            val num1 = parts[0].toDoubleOrNull()
            val operator = parts[1]
            val num2 = parts[2].toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = when (operator) {
                    "+" -> num1 + num2
                    "-" -> num1 - num2
                    "*" -> num1 * num2
                    "/" -> if (num2 != 0.0) num1 / num2 else "Division by zero"
                    else -> "Invalid operator"
                }
                println("Result: $result")
            } else {
                println("Invalid input")
            }
        } else {
            println("Invalid expression")
        }
    } else {
        println("No input provided")
    }
    Log.d("num")
}