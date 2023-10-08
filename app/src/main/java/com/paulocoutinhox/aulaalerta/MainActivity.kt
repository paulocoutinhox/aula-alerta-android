package com.paulocoutinhox.aulaalerta

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        createBtCenter()
    }

    private fun createBtCenter() {
        val btCenter = findViewById<Button>(R.id.btCenter)

        btCenter.setOnClickListener {
            showAlert()
        }
    }

    private fun showAlert() {
        AlertDialog.Builder(this)
            .setMessage("Hello World!")
            .setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }
}