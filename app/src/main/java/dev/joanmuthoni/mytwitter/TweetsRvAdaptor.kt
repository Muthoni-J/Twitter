package dev.joanmuthoni.mytwitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetsRvAdaptor(var tweetsList: List<Tweets>): RecyclerView.Adapter<TweetsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        var itemsView = LayoutInflater.from(parent.context)
            .inflate(R.layout.twitter_list_item, parent, false)
        return TweetsViewHolder(itemsView)
    }


    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
        var currentTweets = tweetsList.get(position)
        holder.tvHolder.text = currentTweets.handler
        holder.tvTweets.text = currentTweets.tweet
        holder.tvname.text = currentTweets.displayName

    }

    override fun getItemCount(): Int {
        return tweetsList.size
    }


}
class TweetsViewHolder(itemsView: View): RecyclerView.ViewHolder(itemsView){
    var tvHolder = itemsView.findViewById<TextView>(R.id.tvHandle)
    var tvname = itemsView.findViewById<TextView>(R.id.tvDisplayname)
    var tvTweets = itemsView.findViewById<TextView>(R.id.tvTweet)
    var imgAvator = itemsView.findViewById<ImageView>(R.id.imgAvatar)
    var imgComments = itemsView.findViewById<ImageView>(R.id.imgComments)
    var imgLike = itemsView.findViewById<ImageView>(R.id.imgLikes)
    var imgSave = itemsView.findViewById<ImageView>(R.id.imgSave)


}