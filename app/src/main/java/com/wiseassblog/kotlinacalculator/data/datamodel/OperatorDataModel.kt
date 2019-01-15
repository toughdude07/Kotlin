package com.wiseassblog.kotlinacalculator.data.datamodel

import java.lang.IllegalArgumentException

data class OperatorDataModel(val operatorValue: String){
    val evaluateFirst: Boolean = checkPriority(operatorValue)

    private fun checkPriority(operatorValue: String): Boolean{
        return when(operatorValue){
            "*" -> true
            "/" -> true
            "+" -> false
            "-" -> false
            else -> throw IllegalArgumentException("Illegal OperatorDataModel")
        }
    }
}