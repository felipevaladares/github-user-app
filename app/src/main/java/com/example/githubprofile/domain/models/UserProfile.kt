package com.example.githubprofile.domain.models

import com.example.githubprofile.data.models.UserProfileResponse

data class UserProfile(
    val name: String,
    val avatarUrl: String,
)


fun UserProfileResponse.toUserProfile() =
    UserProfile(
        name = this.name,
        avatarUrl = this.avatarUrl
    )