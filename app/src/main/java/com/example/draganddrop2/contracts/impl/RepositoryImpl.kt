package com.example.draganddrop2.contracts.impl

import com.example.draganddrop2.R
import com.example.draganddrop2.contracts.QuizContract
import com.example.draganddrop2.model.DataModel

class RepositoryImpl : QuizContract.Repository {
    private var dataList: ArrayList<DataModel> = arrayListOf(
        DataModel(R.drawable.olma, arrayListOf("l", "o", "m", "a"), "olma"),
        DataModel(R.drawable.nok, arrayListOf("k", "o", "n"), "nok"),
        DataModel(R.drawable.uzum, arrayListOf("u", "u", "z", "m"), "uzum"),
    )

    override fun getVariants(questionIndex: Int): ArrayList<String> = dataList[questionIndex].variants


    override fun setVariants(questionIndex: Int, newVariants: ArrayList<String>) {
        dataList[questionIndex].variants = newVariants
    }

    override fun getAnswer(questionIndex: Int): String = dataList[questionIndex].answer


    override fun getImg(questionIndex: Int): Int = dataList[questionIndex].img

}