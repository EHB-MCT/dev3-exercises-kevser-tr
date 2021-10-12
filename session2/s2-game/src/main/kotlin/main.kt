


fun main (){
    println("help,help,heeeellllpppp")
    println("help me to find my phone in this mess")
    challengeOne()
}

 fun challengeOne(){
     println("Where would I have left my phone? Guess out of the 3 where the location could be?")
     val answersQuiz = mutableListOf(" the toilet", "my room", "my bf's house")
     val answer = "the toilet"
     println(answersQuiz)
     val userInput= readLine()
        if (userInput == answer ){
            success()
            } else{
                    gameOver()
            }
 }
fun success(){
println("sadly, you are right")

}
fun gameOver(){
println("YOU ARE WRONG BITCCHH")
}