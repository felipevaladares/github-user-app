package com.example.githubprofile.domain

import com.example.githubprofile.domain.models.UserProfile

interface UserProfileRepository {
    suspend fun loadUserProfileData(input: String): UserProfile
}