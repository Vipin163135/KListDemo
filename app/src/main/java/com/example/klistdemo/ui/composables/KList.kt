package com.example.klistdemo.ui.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class KList<T> {

    private var padding: Dp = 0.dp
    private var headerTitle : String? = null
    private var items: List<T> = emptyList()
    private var itemContent : @Composable (T) -> Unit = {}
    private var onItemClick : ((T) -> Unit)? = null

    companion object {
        val instance : KList<Any> get() = KList<Any>()
    }
    fun padding(dp : Dp): KList<T> {
        this.padding = dp
        return this
    }

    fun header(title: String) : KList<T> {
        this.headerTitle = title
        return this
    }

    fun items(
        list: List<T>,
        itemContent: @Composable (T) -> Unit
    ): KList<T> {
        this.items= list
        this.itemContent = itemContent
        return this
    }

    fun onItemClick(callback: (T) -> Unit): KList<T> {
        this.onItemClick = callback
        return this
    }

    @Composable
    fun render(){
        LazyColumn(
            modifier = Modifier.fillMaxSize()
                .padding(padding)
        ) {
            headerTitle?.let {
                item{
                    Text( text = it,
                        modifier = Modifier.fillMaxWidth()
                            .padding(bottom = 8.dp),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineMedium,
                        fontSize = 20.sp
                    )
                }
            }

            items(count = items.size){index: Int ->
                val item= items[index]

                Box(modifier = Modifier.fillMaxWidth()
                    .clickable { onItemClick?.invoke(item) }
                ) {
                    itemContent(item)
                }
            }
        }
    }


}