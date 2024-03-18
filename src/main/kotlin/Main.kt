fun main(){
//   println(sum(66,77))
println(turn("Beverly"))
println(ispalindromeaaa("january"))
}
//Write a Kotlin function named sum that takes two integers as parameters and returns their differences. Print the result.
fun sum(num1:Int,num2:Int):Int{
    var add=num1 - num2
  return add

}
/////Write a Kotlin function named reverseString that takes a string as a parameter and returns the reversed version of the string. Print the reversed string.
fun turn(name:String) {
var str = "Beverly"
   var reversedString = str.reversed()
 println(reversedString)
}
//////Create a Kotlin function named isPalindrome that takes a string as a parameter and returns true if the string is a palindrome (reads the same backward as forward) and false otherwise. Print the result.
fun ispalindromeaaa(name: String):String{
var word="character"
   var reverse= word.reversed()
    if (reverse=="character")
   println(){
    } else(println(false))
      return reverse

}

//////Write a Kotlin function named power that takes two parameters,
// bas


    fun power(num1: Int, num2: Int) {
        val base = num1
        var exponent = num2

        val result = base.toInt()
        println(result)
    }

    fun talk(name: String) {
        var word = name[0]
        if (name.isNotEmpty()) {
            println("Entered name: $name")
        } else {
            println("No name provided. Please provide a name as a command-line argument.")
        }
    }

