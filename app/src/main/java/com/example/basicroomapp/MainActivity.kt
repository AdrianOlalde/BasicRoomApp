package com.example.basicroomapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.basicroomapp.databases.DatabaseManager
import com.example.basicroomapp.databases.User

class MainActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //mainViewModel.saveUser(User(
            //"u001",
            //"Adrian",
            //1.70,
            //80.0,
          //  "adrianolaldeortega@gmail.com",
        //"hola1234"
       // ))

        mainViewModel.getAllUsers()

        mainViewModel.savedUsers.observe(this) { userList ->
            if (!userList.isNullOrEmpty()) {
                for (user in userList) {
                    Log.d("theseAreTheUsers", user.USER_EMAIL)
                }
            } else {
                Log.d("theAreTheUsers", "thereAreNoUsers")
            }
        }


    }
}