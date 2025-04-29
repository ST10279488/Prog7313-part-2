package vcmsa.projects.myapplication2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    private lateinit var imgProfile: ImageView
    private lateinit var imgCoin: ImageView
    private lateinit var imgSettings: ImageView
    private lateinit var txtUsername: TextView
    private lateinit var txtCoins: TextView

    private lateinit var imgCategories: ImageView
    private lateinit var imgSetGoal: ImageView
    private lateinit var imgBreakdown: ImageView
    private lateinit var imgExpenses: ImageView
    private lateinit var imgUser: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard) // Make sure this matches your XML file name

        // Top bar
        imgProfile = findViewById(R.id.image)
        txtUsername = findViewById(R.id.user)
        imgCoin = findViewById(R.id.imageView7)
        txtCoins = findViewById(R.id.textViewCoins)
        imgSettings = findViewById(R.id.imageView9)

        // Bottom navigation icons
        imgCategories = findViewById(R.id.imageView11)
        imgSetGoal = findViewById(R.id.imageView12)
        imgBreakdown = findViewById(R.id.imageView13)
        imgExpenses = findViewById(R.id.imageView14)
        imgUser = findViewById(R.id.imageView15)

        // Setup click listeners
        imgCategories.setOnClickListener { showToast("Categories clicked") }
        imgSetGoal.setOnClickListener { showToast("Set Goal clicked") }
        imgBreakdown.setOnClickListener { showToast("Breakdown clicked") }
        imgExpenses.setOnClickListener { showToast("Expense History clicked") }
        imgUser.setOnClickListener { showToast("User clicked") }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
