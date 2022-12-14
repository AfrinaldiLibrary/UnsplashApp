package com.afrinaldi.foodaplication.network.model

import com.google.gson.annotations.SerializedName

data class RelatedPhotosModel(

	@field:SerializedName("topic_submissions")
	val topicSubmissions: TopicSubmissionss,

	@field:SerializedName("current_user_collections")
	val currentUserCollections: List<Any>,

	@field:SerializedName("color")
	val color: String,

	@field:SerializedName("sponsorship")
	val sponsorship: Sponsorshipp,

	@field:SerializedName("created_at")
	val createdAt: String,

	@field:SerializedName("description")
	val description: Any,

	@field:SerializedName("public_domain")
	val publicDomain: Boolean,

	@field:SerializedName("urls")
	val urls: Urlss,

	@field:SerializedName("alt_description")
	val altDescription: Any,

	@field:SerializedName("updated_at")
	val updatedAt: String,

	@field:SerializedName("downloads")
	val downloads: Int,

	@field:SerializedName("links")
	val links: Linkss,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("categories")
	val categories: List<Any>,

	@field:SerializedName("views")
	val views: Int,

	@field:SerializedName("height")
	val height: Int,

	@field:SerializedName("likes")
	val likes: Int,

	@field:SerializedName("related_collections")
	val relatedCollections: RelatedCollections,

	@field:SerializedName("topics")
	val topics: List<Any>,

	@field:SerializedName("tags_preview")
	val tagsPreview: List<Any>,

	@field:SerializedName("liked_by_user")
	val likedByUser: Boolean,

	@field:SerializedName("tags")
	val tags: List<Any>,

	@field:SerializedName("meta")
	val meta: Meta,

	@field:SerializedName("width")
	val width: Int,

	@field:SerializedName("blur_hash")
	val blurHash: String,

	@field:SerializedName("location")
	val location: Location,

	@field:SerializedName("promoted_at")
	val promotedAt: Any,

	@field:SerializedName("user")
	val user: Userr,

	@field:SerializedName("exif")
	val exif: Exif
)

data class Source(

	@field:SerializedName("meta_description")
	val metaDescription: String,

	@field:SerializedName("ancestry")
	val ancestry: Ancestry,

	@field:SerializedName("cover_photo")
	val coverPhoto: CoverPhoto,

	@field:SerializedName("meta_title")
	val metaTitle: String,

	@field:SerializedName("subtitle")
	val subtitle: String,

	@field:SerializedName("description")
	val description: String,

	@field:SerializedName("title")
	val title: String
)

data class Position(

	@field:SerializedName("latitude")
	val latitude: Any,

	@field:SerializedName("longitude")
	val longitude: Any
)

data class Urlss(

	@field:SerializedName("small")
	val small: String,

	@field:SerializedName("small_s3")
	val smallS3: String,

	@field:SerializedName("thumb")
	val thumb: String,

	@field:SerializedName("raw")
	val raw: String,

	@field:SerializedName("regular")
	val regular: String,

	@field:SerializedName("full")
	val full: String
)

data class CurrentEvents(

	@field:SerializedName("approved_on")
	val approvedOn: String,

	@field:SerializedName("status")
	val status: String
)

data class Location(

	@field:SerializedName("country")
	val country: Any,

	@field:SerializedName("city")
	val city: Any,

	@field:SerializedName("name")
	val name: Any,

	@field:SerializedName("position")
	val position: Position,

	@field:SerializedName("title")
	val title: Any
)

data class Travel(

	@field:SerializedName("approved_on")
	val approvedOn: String,

	@field:SerializedName("status")
	val status: String
)

data class Film(

	@field:SerializedName("approved_on")
	val approvedOn: String,

	@field:SerializedName("status")
	val status: String
)

data class Meta(

	@field:SerializedName("index")
	val index: Boolean
)

data class Linkss(

	@field:SerializedName("followers")
	val followers: String,

	@field:SerializedName("portfolio")
	val portfolio: String,

	@field:SerializedName("following")
	val following: String,

	@field:SerializedName("self")
	val self: String,

	@field:SerializedName("html")
	val html: String,

	@field:SerializedName("photos")
	val photos: String,

	@field:SerializedName("likes")
	val likes: String,

	@field:SerializedName("download")
	val download: String,

	@field:SerializedName("download_location")
	val downloadLocation: String,

	@field:SerializedName("related")
	val related: String
)

data class Userr(

	@field:SerializedName("total_photos")
	val totalPhotos: Int,

	@field:SerializedName("accepted_tos")
	val acceptedTos: Boolean,

	@field:SerializedName("social")
	val social: Social,

	@field:SerializedName("twitter_username")
	val twitterUsername: Any,

	@field:SerializedName("last_name")
	val lastName: String,

	@field:SerializedName("bio")
	val bio: Any,

	@field:SerializedName("total_likes")
	val totalLikes: Int,

	@field:SerializedName("portfolio_url")
	val portfolioUrl: String,

	@field:SerializedName("profile_image")
	val profileImage: ProfileImagee,

	@field:SerializedName("updated_at")
	val updatedAt: String,

	@field:SerializedName("for_hire")
	val forHire: Boolean,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("location")
	val location: String,

	@field:SerializedName("links")
	val links: Links,

	@field:SerializedName("total_collections")
	val totalCollections: Int,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("first_name")
	val firstName: String,

	@field:SerializedName("instagram_username")
	val instagramUsername: Any,

	@field:SerializedName("username")
	val username: String
)

data class Subcategory(

	@field:SerializedName("pretty_slug")
	val prettySlug: String,

	@field:SerializedName("slug")
	val slug: String
)

data class ResultsItem(

	@field:SerializedName("featured")
	val featured: Boolean,

	@field:SerializedName("private")
	val jsonMemberPrivate: Boolean,

	@field:SerializedName("cover_photo")
	val coverPhoto: CoverPhoto,

	@field:SerializedName("total_photos")
	val totalPhotos: Int,

	@field:SerializedName("share_key")
	val shareKey: String,

	@field:SerializedName("description")
	val description: String,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("tags")
	val tags: List<TagsItem>,

	@field:SerializedName("preview_photos")
	val previewPhotos: List<PreviewPhotosItem>,

	@field:SerializedName("updated_at")
	val updatedAt: String,

	@field:SerializedName("curated")
	val curated: Boolean,

	@field:SerializedName("last_collected_at")
	val lastCollectedAt: String,

	@field:SerializedName("links")
	val links: Links,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("published_at")
	val publishedAt: String,

	@field:SerializedName("user")
	val user: User
)

data class ProfileImagee(

	@field:SerializedName("small")
	val small: String,

	@field:SerializedName("large")
	val large: String,

	@field:SerializedName("medium")
	val medium: String
)

data class TopicSubmissionss(

	@field:SerializedName("film")
	val film: Film,

	@field:SerializedName("travel")
	val travel: Travel,

	@field:SerializedName("textures-patterns")
	val texturesPatterns: TexturesPatterns,

	@field:SerializedName("current-events")
	val currentEvents: CurrentEvents,

	@field:SerializedName("wallpapers")
	val wallpapers: Wallpapers
)

data class Category(

	@field:SerializedName("pretty_slug")
	val prettySlug: String,

	@field:SerializedName("slug")
	val slug: String
)

data class Type(

	@field:SerializedName("pretty_slug")
	val prettySlug: String,

	@field:SerializedName("slug")
	val slug: String
)

data class TagsItem(

	@field:SerializedName("source")
	val source: Source,

	@field:SerializedName("type")
	val type: String,

	@field:SerializedName("title")
	val title: String
)

data class Ancestry(

	@field:SerializedName("type")
	val type: Type,

	@field:SerializedName("category")
	val category: Category,

	@field:SerializedName("subcategory")
	val subcategory: Subcategory
)

data class CoverPhoto(

	@field:SerializedName("topic_submissions")
	val topicSubmissions: TopicSubmissions,

	@field:SerializedName("current_user_collections")
	val currentUserCollections: List<Any>,

	@field:SerializedName("color")
	val color: String,

	@field:SerializedName("sponsorship")
	val sponsorship: Any,

	@field:SerializedName("created_at")
	val createdAt: String,

	@field:SerializedName("description")
	val description: Any,

	@field:SerializedName("liked_by_user")
	val likedByUser: Boolean,

	@field:SerializedName("urls")
	val urls: Urls,

	@field:SerializedName("alt_description")
	val altDescription: Any,

	@field:SerializedName("updated_at")
	val updatedAt: String,

	@field:SerializedName("width")
	val width: Int,

	@field:SerializedName("blur_hash")
	val blurHash: String,

	@field:SerializedName("links")
	val links: Links,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("categories")
	val categories: List<Any>,

	@field:SerializedName("promoted_at")
	val promotedAt: String,

	@field:SerializedName("user")
	val user: User,

	@field:SerializedName("height")
	val height: Int,

	@field:SerializedName("likes")
	val likes: Int
)

data class Sponsorshipp(

	@field:SerializedName("sponsor")
	val sponsor: Sponsorr,

	@field:SerializedName("tagline_url")
	val taglineUrl: String,

	@field:SerializedName("tagline")
	val tagline: String,

	@field:SerializedName("impression_urls")
	val impressionUrls: List<String>
)

data class RelatedCollections(

	@field:SerializedName("total")
	val total: Int,

	@field:SerializedName("type")
	val type: String,

	@field:SerializedName("results")
	val results: List<ResultsItem>
)

data class Sponsorr(

	@field:SerializedName("total_photos")
	val totalPhotos: Int,

	@field:SerializedName("accepted_tos")
	val acceptedTos: Boolean,

	@field:SerializedName("social")
	val social: Social,

	@field:SerializedName("twitter_username")
	val twitterUsername: Any,

	@field:SerializedName("last_name")
	val lastName: Any,

	@field:SerializedName("bio")
	val bio: String,

	@field:SerializedName("total_likes")
	val totalLikes: Int,

	@field:SerializedName("portfolio_url")
	val portfolioUrl: String,

	@field:SerializedName("profile_image")
	val profileImage: ProfileImage,

	@field:SerializedName("updated_at")
	val updatedAt: String,

	@field:SerializedName("for_hire")
	val forHire: Boolean,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("location")
	val location: Any,

	@field:SerializedName("links")
	val links: Links,

	@field:SerializedName("total_collections")
	val totalCollections: Int,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("first_name")
	val firstName: String,

	@field:SerializedName("instagram_username")
	val instagramUsername: String,

	@field:SerializedName("username")
	val username: String
)

data class Exif(

	@field:SerializedName("exposure_time")
	val exposureTime: String,

	@field:SerializedName("aperture")
	val aperture: String,

	@field:SerializedName("focal_length")
	val focalLength: String,

	@field:SerializedName("iso")
	val iso: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("model")
	val model: String,

	@field:SerializedName("make")
	val make: String
)

data class Wallpapers(

	@field:SerializedName("approved_on")
	val approvedOn: String,

	@field:SerializedName("status")
	val status: String
)

data class TexturesPatterns(

	@field:SerializedName("approved_on")
	val approvedOn: String,

	@field:SerializedName("status")
	val status: String
)

data class PreviewPhotosItem(

	@field:SerializedName("urls")
	val urls: Urls,

	@field:SerializedName("updated_at")
	val updatedAt: String,

	@field:SerializedName("blur_hash")
	val blurHash: String,

	@field:SerializedName("created_at")
	val createdAt: String,

	@field:SerializedName("id")
	val id: String
)
