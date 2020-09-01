package www.kiet.myandroid

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private var counter = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var name: String = "Neeraj"

        val text: TextView = findViewById(R.id.textView2)
        val count: TextView = findViewById(R.id.textView3)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            if(text.currentTextColor==Color.GREEN)
                text.setTextColor(Color.RED)
            else
                text.setTextColor(Color.GREEN)
        }
        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener{
            text.textSize = 50F
        }

        val floatingButton: FloatingActionButton = findViewById(R.id.floatingActionButton3)
        floatingButton.setOnClickListener{
          counter++
            count.text=counter.toString()
        }

        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener{
            startActivity(intent)

        }




        fun nextActivity(view: View){

            startActivity(intent)
        }

    }
}