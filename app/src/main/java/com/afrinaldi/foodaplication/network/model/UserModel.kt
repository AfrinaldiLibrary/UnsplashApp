package com.afrinaldi.foodaplication.network.model

import com.google.gson.annotations.SerializedName

data class UserModel(

	@field:SerializedName("numeric_id")
	val numericId: Int,

	@field:SerializedName("total_photos")
	val totalPhotos: Int,

	@field:SerializedName("accepted_tos")
	val acceptedTos: Boolean,

	@field:SerializedName("followed_by_user")
	val followedByUser: Boolean,

	@field:SerializedName("twitter_username")
	val twitterUsername: Any,

	@field:SerializedName("bio")
	val bio: String,

	@field:SerializedName("portfolio_url")
	val portfolioUrl: String,

	@field:SerializedName("profile_image")
	val profileImage: ProfileImageItem,

	@field:SerializedName("updated_at")
	val updatedAt: String,

	@field:SerializedName("for_hire")
	val forHire: Boolean,

	@field:SerializedName("downloads")
	val downloads: Int,

	@field:SerializedName("links")
	val links: Links,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("first_name")
	val firstName: String,

	@field:SerializedName("instagram_username")
	val instagramUsername: String,

	@field:SerializedName("social")
	val social: Social,

	@field:SerializedName("last_name")
	val lastName: String,

	@field:SerializedName("allow_messages")
	val allowMessages: Boolean,

	@field:SerializedName("total_likes")
	val totalLikes: Int,

	@field:SerializedName("badge")
	val badge: Any,

	@field:SerializedName("following_count")
	val followingCount: Int,

	@field:SerializedName("followers_count")
	val followersCount: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("location")
	val location: String,

	@field:SerializedName("total_collections")
	val totalCollections: Int,

	@field:SerializedName("username")
	val username: String
)

data class ProfileImageItem(

	@field:SerializedName("small")
	val small: String,

	@field:SerializedName("large")
	val large: String,

	@field:SerializedName("medium")
	val medium: String
)