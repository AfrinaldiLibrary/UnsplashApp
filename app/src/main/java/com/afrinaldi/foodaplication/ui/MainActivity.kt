package com.afrinaldi.foodaplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.afrinaldi.foodaplication.databinding.ActivityMainBinding
import com.afrinaldi.foodaplication.network.adapter.RelatedAdapter
import com.afrinaldi.foodaplication.network.adapter.SliderAdapter
import com.afrinaldi.foodaplication.network.model.RelatedModel
import com.afrinaldi.foodaplication.network.model.SliderModel
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: SliderAdapter
    private val list = ArrayList<SliderModel>()

    private lateinit var relatedAdapter: RelatedAdapter
    private val relatedList = ArrayList<RelatedModel>()

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel.getPhoto("HJ5AolcOxKHdsVVpbmSBKtAJuW3xS4ZlAdpiEjTjVxA")

        for (i in 0..9){
            mainViewModel.photo.observe(this) {
                adapter = SliderAdapter(arrayListOf())
                list.add(
                    SliderModel(
                        it[i].urls.small,
                        it[i].user.name,
                        it[i].id
                    )
                )
                if (i == 9){
                    adapter.addData(list)
                    binding.vgSlider.adapter = adapter
                }
            }
        }

        StaggeredGridLayoutManager(
            2, // span count
            StaggeredGridLayoutManager.VERTICAL // orientation
        ).apply {
            // specify the layout manager for recycler view
            binding.rvRelated.layoutManager = this
        }

        binding.vgSlider.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                mainViewModel.getRelate(list[position].id,"HJ5AolcOxKHdsVVpbmSBKtAJuW3xS4ZlAdpiEjTjVxA")
                mainViewModel.relate.observe(this@MainActivity){
                    relatedAdapter = RelatedAdapter(arrayListOf())
                    for (i in it.indices){
                        relatedList.add(
                            RelatedModel(
                                it[i].previewPhotos[0].urls.small
                            )
                        )
                    }
                    relatedAdapter.addData(relatedList)
                    binding.rvRelated.adapter = relatedAdapter
                    relatedList.clear()
                }
            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
            }

            override fun onPageScrolled(position: Int,
                                        positionOffset: Float,
                                        positionOffsetPixels: Int) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }
        })

        mainViewModel.getUser("randykinne", "HJ5AolcOxKHdsVVpbmSBKtAJuW3xS4ZlAdpiEjTjVxA")
        mainViewModel.user.observe(this) {
            binding.tvName.text = it.name
            binding.tvJob.text = it.bio
            binding.tvLocation.text = it.location
            binding.tvEmail.text = "${it.username}@gmail.com"
            Glide.with(this)
                .load(it.profileImage.small)
                .into(binding.ivPhotoProfile)
        }

    }
}