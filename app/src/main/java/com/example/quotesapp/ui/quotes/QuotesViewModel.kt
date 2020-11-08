package com.example.quotesapp.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.quotesapp.data.QuoteRepository
import com.example.quotesapp.data.Quotes

class QuotesViewModel(private val quoteRepository: QuoteRepository): ViewModel(){

    fun getQuotes() = quoteRepository.getQuote()

    fun addQuotes(quotes: Quotes) = quoteRepository.addQuote(quotes)
}