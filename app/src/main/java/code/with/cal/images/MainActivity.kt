package code.with.cal.images

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import code.with.cal.images.databinding.ActivityMainBinding
import com.bumptech.glide.Glide


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val circularPresentDrawable = CircularProgressDrawable(this)
        circularPresentDrawable.strokeWidth = 10f
        circularPresentDrawable.centerRadius = 50f
        circularPresentDrawable.start()

        binding = ActivityMainBinding.inflate(layoutInflater)

        Glide.with(this)
            .load("https://picsum.photos/2000?rand=")
            .centerCrop()
            .placeholder(circularPresentDrawable)
            .into(binding.imageViewOne)

        Glide.with(this)
            .load("https://picsum.photos/3000?rand=")
            .centerCrop()
            .placeholder(circularPresentDrawable)
            .into(binding.imageViewTwo)

        Glide.with(this)
            .load("https://picsum.photos/4000?rand=")
            .centerCrop()
            .placeholder(circularPresentDrawable)
            .into(binding.imageViewThree)

        Glide.with(this)
            .load("https://picsum.photos/5000?rand=")
            .centerCrop()
            .placeholder(circularPresentDrawable)
            .into(binding.imageViewFour)

        setContentView(binding.root)

    }
}