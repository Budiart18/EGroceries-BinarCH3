package com.catnip.egroceries.di.hilt

import android.content.Context
import com.catnip.egroceries.utils.AssetWrapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UtilsModule {

    @Singleton
    @Provides
    fun provideUtilsModule(@ApplicationContext context: Context): AssetWrapper {
        return AssetWrapper(context)
    }
}
