package com.avito.android.messenger.channels.mvi.di;

import android.content.SharedPreferences;
import javax.inject.Provider;

/* compiled from: ChannelsBannerStorageModule_ProvideShowCountStorageFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.channels.mvi.di.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31739g implements dagger.internal.h<com.avito.android.messenger.channels.action_banner.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SharedPreferences> f187429a;

    public C31739g(Provider<SharedPreferences> provider) {
        this.f187429a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        SharedPreferences sharedPreferences = this.f187429a.get();
        C31737e.f187428a.getClass();
        return new com.avito.android.messenger.channels.action_banner.b(sharedPreferences);
    }
}
