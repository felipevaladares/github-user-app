package com.example.githubprofile.data

import com.example.githubprofile.domain.UserProfileRepository
import com.example.githubprofile.domain.models.UserProfile
import com.example.githubprofile.domain.models.toUserProfile

class UserProfileRepositoryImpl(
    private val apiService: UserProfileApi
): UserProfileRepository {

    override suspend fun loadUserProfileData(input: String): UserProfile {
        return apiService.getUserProfile(input).toUserProfile()
    }
}