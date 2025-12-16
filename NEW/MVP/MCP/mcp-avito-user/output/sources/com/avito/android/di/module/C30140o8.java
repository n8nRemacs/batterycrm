package com.avito.android.di.module;

import javax.inject.Provider;

/* compiled from: SerpItemConverterModule_ProvideFavoriteStatusResolverFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.o8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30140o8 implements dagger.internal.h<com.avito.android.serp.adapter.T> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.h> f144505a;

    public C30140o8(Provider<com.avito.android.favorite.h> provider) {
        this.f144505a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.favorite.h hVar = this.f144505a.get();
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new com.avito.android.serp.adapter.X(hVar);
    }
}
