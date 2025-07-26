package com.example.klistdemo.ui.screens

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.klistdemo.model.Coin
import com.example.klistdemo.ui.composables.KList
import com.example.klistdemo.ui.composables.KListItem

@Preview
@Composable
fun HomeScreen() {
    val context = LocalContext.current
    val coinList = listOf(
        Coin("Bitcoin", "BTC","118,126.28"),
        Coin("Ethereum","ETH", "3,746"),
        Coin("XRP", "XRP","3.18"),
        Coin("Tether USDT", "USDT","1.0"),
        Coin("BNB", "BNB","782.74"),
        Coin("Solana", "SOL","187.46"),
        Coin("USDC", "USDC","1.00"),
        Coin("DogeCoin","DOGE", "0.2374"),
        Coin("TRON","TRX", "0.3184"),
        Coin("Cardano","ADA", "0.8271"),
    )

    KList.instance
        .padding(24.dp)
        .header("Top Gainers")
        .items(coinList){
            KListItem(it as Coin)
        }
        .onItemClick{
            val item= it as Coin
            Toast.makeText(context, "${item.symbol}  :  $${item.price}", Toast.LENGTH_SHORT).show()
        }
        .render()
}