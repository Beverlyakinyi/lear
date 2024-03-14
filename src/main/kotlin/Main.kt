fun main(){
   println(sum(66,77))
   println(turn("Beverly"))
    println(factor(66))
   println(power(2,5))
  println(ispalindromeaaa("january"))
}
//Write a Kotlin function named sum that takes two integers as parameters and returns their sum. Print the result.
fun sum(num1:Int,num2:Int):Int{
    var add=num1 + num2
   return add

}
///Create a Kotlin function named calculateFactorial that takes a non-negative integer as a parameter and returns its factorial. The factorial of a number is the product of all positive integers up to that number.

fun factor(number: Int): Long {
 return if (number == 0||number == 1) {
       1
   } else {
       var b = 1L
      for (i in 2..number) {
           b *= i
       }
    b
   }
 }
///Write a Kotlin function named reverseString that takes a string as a parameter and returns the reversed version of the string. Print the reversed string.
fun turn(name:String) {
 var str = "Beverly"
   var reversedString = str.reversed()
  println(reversedString)
}
////Create a Kotlin function named isPalindrome that takes a string as a parameter and returns true if the string is a palindrome (reads the same backward as forward) and false otherwise. Print the result.
fun ispalindromeaaa(name: String):String{
var word="character"
    var reverse= word.reversed()
    if (word=="character")
    println(){
    } else(println(false))
        return reverse

}

////Write a Kotlin function named power that takes two parameters, base and exponent, and returns the result of raising the base to the power of the exponent. Print the result.
fun power(num1: Int, num2: Int): Long {
  var base = num1 % num2

    var result: Long = 1

  while (base != 0) {

  }

return result
}