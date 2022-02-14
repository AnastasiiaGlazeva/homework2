package ru.netology

import kotlin.random.Random

fun main(){
 moneyTransfer(3600)
peoples(1)
    musicLover(8000)
}

fun moneyTransfer(amount:Int){
    val commision = amount*75/10000
    val mincomm = 3500

    if (commision<mincomm)
        println(mincomm)
    else
        println(commision)
    }

fun peoples(likes:Int){
    val remains1: Int = likes%10
    val remains11 = likes%100
    val text: String

        if (remains1 == 1 && remains11 !== 11)
            text = " человеку"
        else
        text = " людям"

    println(likes.toString()+text)
}

fun musicLover(summ: Int){
    val lover: Boolean = Random.nextBoolean()
    var result = 0
    val loveresult : Int

    println(lover)

    if(summ<1000)
        result = summ
    else if (summ>1001 && summ<10000)
        result = summ-100
    else if (summ>10001)
        result = summ*95/100

    if(lover) {
        loveresult = result*99/100
        println(loveresult)
    }
    else
        println(result)
}
