package academy.larningprogrammin.buttonclickapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var userInput: EditText? = null
    private var button: Button? = null
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userInput = findViewById <EditText> (R.id.editText)
        button = findViewById <Button> (R.id.button)
        textView = findViewById <TextView> (R.id.textView)

        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod()

        button?.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                textView?.append(userInput?.text)
                textView?.append("\n")
            }
        })
    }
}
