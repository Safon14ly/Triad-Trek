package md.artur_miscoi.triad_trek

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button
    private lateinit var b1: String
    private lateinit var b2: String
    private lateinit var b3: String
    private lateinit var b4: String
    private lateinit var b5: String
    private lateinit var b6: String
    private lateinit var b7: String
    private lateinit var b8: String
    private lateinit var b9: String
    private var flag = 0
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
    }

    fun check(v: View) {
        val btnCurrent = v as Button
        if (btnCurrent.text.toString() == "") {
            count++
            if (flag == 0) {
                btnCurrent.text = "X"
                flag = 1
            } else {
                btnCurrent.text = "0"
                flag = 0
            }
            if (count > 4) {
                b1 = btn1.text.toString()
                b2 = btn2.text.toString()
                b3 = btn3.text.toString()
                b4 = btn4.text.toString()
                b5 = btn5.text.toString()
                b6 = btn6.text.toString()
                b7 = btn7.text.toString()
                b8 = btn8.text.toString()
                b9 = btn9.text.toString()
                if (b1 == b2 && b2 == b3 && b1 != "") {
                    Toast.makeText(this, "Winner is $b1", Toast.LENGTH_SHORT).show()
                    NewGame()
                } else if (b4 == b5 && b5 == b6 && b4 != "") {
                    Toast.makeText(this, "Winner is $b5", Toast.LENGTH_SHORT).show()
                    NewGame()
                } else if (b7 == b8 && b8 == b9 && b7 != "") {
                    Toast.makeText(this, "Winner is $b8", Toast.LENGTH_SHORT).show()
                    NewGame()
                } else if (b1 == b4 && b4 == b7 && b1 != "") {
                    Toast.makeText(this, "Winner is $b4", Toast.LENGTH_SHORT).show()
                    NewGame()
                } else if (b2 == b5 && b5 == b8 && b2 != "") {
                    Toast.makeText(this, "Winner is $b5", Toast.LENGTH_SHORT).show()
                    NewGame()
                } else if (b3 == b6 && b6 == b9 && b3 != "") {
                    Toast.makeText(this, "Winner is $b6", Toast.LENGTH_SHORT).show()
                    NewGame()
                } else if (b1 == b5 && b5 == b9 && b1 != "") {
                    Toast.makeText(this, "Winner is $b1", Toast.LENGTH_SHORT).show()
                    NewGame()
                } else if (b3 == b5 && b5 == b7 && b3 != "") {
                    Toast.makeText(this, "Winner is $b3", Toast.LENGTH_SHORT).show()
                    NewGame()
                } else if (count == 9) {
                    Toast.makeText(this, "Game is draw ", Toast.LENGTH_SHORT).show()
                    NewGame()
                }
            }
        }
    }

    private fun NewGame() {
        btn1.text = ""
        btn2.text = ""
        btn3.text = ""
        btn4.text = ""
        btn5.text = ""
        btn6.text = ""
        btn7.text = ""
        btn8.text = ""
        btn9.text = ""
        count = 0
        flag = 0
    }
}