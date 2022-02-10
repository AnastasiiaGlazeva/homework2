package ru.netology

import kotlin.random.Random

fun main(){
 moneyTransfer(3600)
peoples(980796)
    musicLover(80)
}

fun moneyTransfer(amount:Int){
    //val persent = (75/10000)
    val commision = amount*75/10000
    val result = (amount-commision)
    val resultless0 = result-3500

    if (commision<3500){
        if(resultless0<0)
            println(0)
        else
            println(result)
    }
    else
        println(result)
    }

fun peoples(likes:Int){
    val remains1: Int = (likes%10)
    val remains11 = likes%100
    val text: String

        if (remains1 == 1 && remains11 !==11)
            text = " человеку"
        else
        text = " людям"

    println(likes.toString()+text)
}

fun musicLover(summ: Int){
    val lover: Boolean = Random.nextBoolean()
    val middiscount = summ-100
    val maxdiscount = summ*95/100
    val lovermindisc = summ*99/100
    val lovermiddisc = middiscount*99/100
    val lovermaxdisc = maxdiscount*99/100

    println(lover)

    if(lover == true){
        if(summ<1000)
            println(lovermindisc)
        else if (summ>1001 && summ<10000)
            println(lovermiddisc)
        else if (summ>10001)
            println(lovermaxdisc)
    }
    else{
    if(summ<1000)
        println(summ)
    else if (summ>1001 && summ<10000)
        println(middiscount)
    else if (summ>10001)
        println(maxdiscount)
    }

}
