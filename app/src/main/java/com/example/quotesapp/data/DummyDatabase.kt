package com.example.quotesapp.data

class DummyDatabase private constructor(){

    val quoteDAO = DummyQuoteDAO()

    //this is basically for singleton instantiation
    companion object{
        @Volatile private var instance: DummyDatabase? = null

        fun getInstance() = instance ?: synchronized(this) {
            instance ?: DummyDatabase().also { instance = it }
        }

    }
}