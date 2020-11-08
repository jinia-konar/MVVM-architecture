package com.example.quotesapp.utilities

import com.example.quotesapp.data.DummyDatabase
import com.example.quotesapp.data.QuoteRepository
import com.example.quotesapp.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory{
        val quoteRepository = QuoteRepository.getInstance(DummyDatabase.getInstance().quoteDAO)
        return QuotesViewModelFactory(quoteRepository)
    }
}