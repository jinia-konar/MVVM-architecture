package com.example.quotesapp.data

class QuoteRepository private constructor(private val dummyQuoteDAO: DummyQuoteDAO){

    fun addQuote(quotes: Quotes){
        dummyQuoteDAO.addQuote(quotes)
    }

    fun getQuote() = dummyQuoteDAO.getQuote()

    //this is to make the repository singleton
    companion object{
        @Volatile private var instance: QuoteRepository? = null

        fun getInstance(quoteDAO: DummyQuoteDAO) = instance ?: synchronized(this) {
            instance ?: QuoteRepository(quoteDAO).also { instance = it }
        }

    }
}