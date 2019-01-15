package com.wiseassblog.kotlinacalculator.domain.repository

import com.wiseassblog.kotlinacalculator.data.datamodel.ExpressionDataModel
import io.reactivex.Flowable

interface ICalculator{

    fun evaluateExpression(expression: String): Flowable<ExpressionDataModel>
}