package com.example.ujipertemuan10mobile
import ImageAdapter
import com.example.ujipertemuan10mobile.ImageItem
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 3)

        // Data contoh gambar (URL dari internet)
        val imageUrls = listOf(
            "https://media.istockphoto.com/id/586086492/id/foto/mobil-merah-mercedes-benz-c63-tetap-di-jalan-aspal-di-kota.jpg?s=1024x1024&w=is&k=20&c=-ulT985jSsyhKu2d8P17UE52lrfOEmftQigwxk7vRBs=",
            "https://freerangestock.com/sample/132255/mercedes-amg-car-.jpg",
            "https://media.istockphoto.com/id/586086492/id/foto/mobil-merah-mercedes-benz-c63-tetap-di-jalan-aspal-di-kota.jpg?s=1024x1024&w=is&k=20&c=-ulT985jSsyhKu2d8P17UE52lrfOEmftQigwxk7vRBs=",
            "https://freerangestock.com/sample/132255/mercedes-amg-car-.jpg",
            "https://media.istockphoto.com/id/586086492/id/foto/mobil-merah-mercedes-benz-c63-tetap-di-jalan-aspal-di-kota.jpg?s=1024x1024&w=is&k=20&c=-ulT985jSsyhKu2d8P17UE52lrfOEmftQigwxk7vRBs=",
            "https://freerangestock.com/sample/132255/mercedes-amg-car-.jpg"
        )

        val images = imageUrls.map { ImageItem(it) }
        recyclerView.adapter = ImageAdapter(images)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.toolbar)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}