package dev.joanmuthoni.mytwitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.joanmuthoni.mytwitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweet()

    }
    fun displayTweet(){
        var tweet =Tweets("Joan","@Joan","Liz outs Helen for her unusual childhood crush. Then throws herself under the bus by revealing her own (perhaps even weirder) one.","","","")
        var tweet1 =Tweets("Mercy","@mercy","Liz outs Helen for her unusual childhood crush. Then throws herself under the bus by revealing her own (perhaps even weirder) one.","","","")
        var tweet2 =Tweets("Meggy","@meggy","Liz outs Helen for her unusual childhood crush. Then throws herself under the bus by revealing her own (perhaps even weirder) one.","","","")
        var tweet3 =Tweets("Meghan","@Meghan","Liz outs Helen for her unusual childhood crush. Then throws herself under the bus by revealing her own (perhaps even weirder) one.","","","")
        var tweet4 =Tweets("Zenaida","@Zenaida","Liz outs Helen for her unusual childhood crush. Then throws herself under the bus by revealing her own (perhaps even weirder) one.","","","")
        var tweet5 =Tweets("Cathrine","@Cathrine","Liz outs Helen for her unusual childhood crush. Then throws herself under the bus by revealing her own (perhaps even weirder) one.","","","")

        var tweetsList = listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5)
        var tweetsAdapter = TweetsRvAdaptor(tweetsList)
        binding.rvTweet.layoutManager=LinearLayoutManager(this)
        binding.rvTweet.adapter =tweetsAdapter
    }
}