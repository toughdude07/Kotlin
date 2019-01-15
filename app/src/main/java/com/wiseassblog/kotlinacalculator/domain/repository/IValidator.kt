package com.wiseassblog.kotlinacalculator.domain.repository

interface IValidator{


    fun validateExpression(expression: String): Boolean

}