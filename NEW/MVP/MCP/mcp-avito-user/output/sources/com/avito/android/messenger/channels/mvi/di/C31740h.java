package com.avito.android.messenger.channels.mvi.di;

import android.content.SharedPreferences;
import javax.inject.Provider;

/* compiled from: ChannelsBannerStorageModule_ProvideShowTimeStorageFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.channels.mvi.di.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31740h implements dagger.internal.h<com.avito.android.messenger.channels.action_banner.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SharedPreferences> f187430a;

    public C31740h(Provider<SharedPreferences> provider) {
        this.f187430a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        SharedPreferences sharedPreferences = this.f187430a.get();
        C31737e.f187428a.getClass();
        return new com.avito.android.messenger.channels.action_banner.f(sharedPreferences);
    }
}
