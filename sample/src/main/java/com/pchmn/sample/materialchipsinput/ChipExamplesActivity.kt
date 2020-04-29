package com.pchmn.sample.materialchipsinput

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.pchmn.materialchips.ChipView
import com.pchmn.sample.materialchipsinput.ChipExamplesActivity
import kotlinx.android.synthetic.main.activity_chip_examples.*

class ChipExamplesActivity : AppCompatActivity() {
    var mLayout: LinearLayout? = layout

    var mChip1: ChipView? = chip1


    var mChip2: ChipView? = chip2


    var mChip3: ChipView? = chip3

    var mChip4: ChipView? = chip4

    var mChip5: ChipView? = chip5

    var mChip6: ChipView? = chip6

    var mChip7: ChipView? = chip7
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chip_examples)
        // butter knife

        // chip 1
        mChip1!!.setOnChipClicked { view: View? -> Toast.makeText(this@ChipExamplesActivity, mChip1!!.label + ": clicked", Toast.LENGTH_SHORT).show() }
        mChip1!!.setOnDeleteClicked { view: View? -> Toast.makeText(this@ChipExamplesActivity, mChip1!!.label + ": delete clicked", Toast.LENGTH_SHORT).show() }

        // chip 2
        mChip2!!.setOnChipClicked { view: View? -> Toast.makeText(this@ChipExamplesActivity, mChip2!!.label + ": clicked", Toast.LENGTH_SHORT).show() }

        // chip 3
        mChip3!!.setOnChipClicked { view: View? -> Toast.makeText(this@ChipExamplesActivity, mChip3!!.label + ": clicked", Toast.LENGTH_SHORT).show() }
        mChip3!!.setOnDeleteClicked { view: View? -> Toast.makeText(this@ChipExamplesActivity, mChip3!!.label + ": delete clicked", Toast.LENGTH_SHORT).show() }

        // chip 4
        mChip4!!.setOnChipClicked { view: View? -> Toast.makeText(this@ChipExamplesActivity, mChip4!!.label + ": clicked", Toast.LENGTH_SHORT).show() }
        mChip4!!.setOnDeleteClicked { view: View? -> Toast.makeText(this@ChipExamplesActivity, mChip4!!.label + ": delete clicked", Toast.LENGTH_SHORT).show() }

        // chip 5
        mChip5!!.setOnChipClicked { view: View? -> Toast.makeText(this@ChipExamplesActivity, mChip5!!.label + ": clicked", Toast.LENGTH_SHORT).show() }

        // chip 6
        mChip6!!.setOnChipClicked { view: View? -> Toast.makeText(this@ChipExamplesActivity, mChip6!!.label + ": clicked", Toast.LENGTH_SHORT).show() }
        mChip6!!.setOnDeleteClicked { view: View? -> Toast.makeText(this@ChipExamplesActivity, mChip6!!.label + ": delete clicked", Toast.LENGTH_SHORT).show() }

        // chip 7
        mChip7!!.setOnChipClicked { view: View? -> Toast.makeText(this@ChipExamplesActivity, mChip7!!.label + ": clicked", Toast.LENGTH_SHORT).show() }
        mChip7!!.setOnDeleteClicked { view: View? -> Toast.makeText(this@ChipExamplesActivity, mChip7!!.label + ": delete clicked", Toast.LENGTH_SHORT).show() }


        // programmatically
        val uri: Uri? = null
        val chipView1 = ChipView(this)
        chipView1.label = "Pritesh"
        chipView1.setPadding(2, 2, 2, 2)
        chipView1.setHasAvatarIcon(true)
        val chipView2 = ChipView(this)
        chipView2.label = "Test 1"
        chipView2.setChipBackgroundColor(ContextCompat.getColor(this, R.color.colorAccent))
        chipView2.setLabelColor(ContextCompat.getColor(this, R.color.colorPrimary))
        chipView2.setAvatarIcon(uri)
        chipView2.setDeleteIconColor(ContextCompat.getColor(this, R.color.colorPrimary))
        mLayout!!.addView(chipView1)
        mLayout!!.addView(chipView2)
    }

    companion object {
        private val TAG = ChipExamplesActivity::class.java.toString()
    }
}