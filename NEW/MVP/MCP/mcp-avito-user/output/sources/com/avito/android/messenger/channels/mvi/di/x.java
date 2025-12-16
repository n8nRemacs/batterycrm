package com.avito.android.messenger.channels.mvi.di;

import android.content.SharedPreferences;
import com.avito.android.messenger.channels.mvi.di.C;
import javax.inject.Provider;

/* compiled from: ChannelsModule_ProvideFoldersOnboardingStatusStorageFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class x implements dagger.internal.h<com.avito.android.messenger.folders.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SharedPreferences> f187447a;

    public x(Provider<SharedPreferences> provider) {
        this.f187447a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        SharedPreferences sharedPreferences = (SharedPreferences) ((C.c.L) this.f187447a).get();
        r.f187438a.getClass();
        return new com.avito.android.messenger.folders.d(sharedPreferences);
    }
}
