package com.example.quotesapp.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class DummyQuoteDAO {
    private val quoteList = mutableListOf<Quotes>()
    private val quote = MutableLiveData<List<Quotes>>()

    init {
        quote.value = quoteList
    }

    fun addQuote(quotes: Quotes){
        quoteList.add(quotes)
        quote.value = quoteList
    }

    fun getQuote() = quote as LiveData<List<Quotes>>
}