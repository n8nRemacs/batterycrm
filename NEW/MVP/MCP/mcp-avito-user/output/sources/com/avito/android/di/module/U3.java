package com.avito.android.di.module;

import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* compiled from: CoreTasksModule_ProvideOkHttpNetworkFetcherFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class U3 implements dagger.internal.h<com.facebook.imagepipeline.backends.okhttp3.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<OkHttpClient> f144145a;

    public U3(Provider<OkHttpClient> provider) {
        this.f144145a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        OkHttpClient okHttpClient = this.f144145a.get();
        H3.f143982a.getClass();
        return new com.facebook.imagepipeline.backends.okhttp3.e(okHttpClient);
    }
}
