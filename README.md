# KListDemo

# 📱 KList DSL - Jetpack Compose Fluent List Builder

KList is a custom Kotlin DSL inspired by Jetpack Compose's `Modifier` chaining pattern. It allows you to build clean, reusable, and declarative list UIs using a fluent API.

---

## 🧩 Features

- ✅ Fluent chaining API: `.padding()`, `.header()`, `.items()`, `.onItemClick()`
- 📦 Uses Jetpack Compose's `LazyColumn` under the hood
- 🎨 Clean UI with customizable item composables

---

## 🚀 Preview Usage

```kotlin
KList.instance
    .padding(16.dp)
    .header("Top Gainers")
    .items(coinList) {
        KListItem(it)
    }
    .onItemClick {
        
    }
    .render()
```

---

## 📄 Project Structure

```text
├── MainActivity.kt          # Scaffold wrapper and theme
├── KList.kt                 # DSL definition and render logic
├── KListItem.kt             # Reusable composable item UI
├── HomeScreen.kt             # Example screen with sample coin data
├── ui/theme/...             # Compose Material 3 theme files
```

---

## 💰 Sample Data (Coins)
```kotlin
val coinList = listOf(
    Coin("Bitcoin", "BTC", "118,126.28"),
    Coin("Ethereum","ETH", "3,746"),
    Coin("XRP", "XRP", "3.18"),
    Coin("Tether USDT", "USDT", "1.0"),
    Coin("BNB", "BNB", "782.74"),
    Coin("Solana", "SOL", "187.46"),
    Coin("USDC", "USDC", "1.00"),
    Coin("DogeCoin", "DOGE", "0.2374"),
    Coin("TRON", "TRX", "0.3184"),
    Coin("Cardano", "ADA", "0.3184")
)
```

---

## 🛠 Requirements
- Kotlin 1.8+
- Jetpack Compose BOM 2024+ (Material3)

---

## 🔧 Setup

1. Clone the repo:
```bash
git clone https://github.com/Vipin163135/KListDemo.git
```
2. Open in Android Studio.
3. Run the app.

---

## 👨‍💻 Author
**Vipin Singh**
