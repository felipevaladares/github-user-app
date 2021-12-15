package com.example.githubprofile.data

import com.example.githubprofile.data.models.UserProfileResponse
import retrofit2.http.GET
import retrofit2.http.Path


/**
 * https://docs.github.com/en/rest/reference/users#get-a-user
 */
interface UserProfileApi {
    @GET("/users/{username}")
    suspend fun getUserProfile(@Path("username") username: String): UserProfileResponse

    companion object {
        const val BASE_URL = "https://api.github.com"
    }
}