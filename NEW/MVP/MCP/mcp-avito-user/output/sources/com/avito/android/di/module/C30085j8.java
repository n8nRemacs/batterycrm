package com.avito.android.di.module;

import javax.inject.Provider;

/* compiled from: SerpItemConverterModule_ProvideCollectionsRecommendationsItemConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.j8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30085j8 implements dagger.internal.h<com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.J0> f144354a;

    public C30085j8(Provider<com.avito.android.J0> provider) {
        this.f144354a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.J0 j02 = this.f144354a.get();
        C29986a8.f144230a.getClass();
        return new com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.d(j02);
    }
}
