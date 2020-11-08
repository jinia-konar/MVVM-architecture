package com.example.quotesapp.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.quotesapp.data.QuoteRepository

//this s basically when our viewModel is created/gotten
//i.e if the viewModel is already created when orientation changed then it pass
//the already existing vieModel or else create newInstance ot the viewModel
class QuotesViewModelFactory(private val quoteRepository: QuoteRepository)
    : ViewModelProvider.NewInstanceFactory(){

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quoteRepository) as T
    }
}