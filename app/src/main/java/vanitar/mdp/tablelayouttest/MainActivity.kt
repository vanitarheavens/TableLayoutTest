package vanitar.mdp.tablelayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addTableRow(view: View){
        val layoutParams = TableRow.LayoutParams(
            TableRow.LayoutParams.MATCH_PARENT,
            TableRow.LayoutParams.WRAP_CONTENT
        )

        val androidVersion = TextView(this)
        androidVersion.text = findViewById<EditText>(R.id.android_version).text
        androidVersion.layoutParams = layoutParams
        androidVersion.textSize = 20F

        val androidCodeName = TextView(this)
        androidCodeName.text = findViewById<EditText>(R.id.android_code).text
        androidCodeName.layoutParams = layoutParams
        androidCodeName.textSize = 20F

        val table = findViewById<TableLayout>(R.id.tableId)
        val tableRow = TableRow(this)

        tableRow.layoutParams = layoutParams
        tableRow.addView(androidVersion)
        tableRow.addView(androidCodeName)
        table.addView(tableRow)
    }
}