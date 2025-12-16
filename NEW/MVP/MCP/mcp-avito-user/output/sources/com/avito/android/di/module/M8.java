package com.avito.android.di.module;

import javax.inject.Provider;

/* compiled from: SerpItemConverterModule_ProvideTopSellersSerpWidgetItemConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class M8 implements dagger.internal.h<com.avito.android.serp.adapter.top_sellers_serp.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.J0> f144074a;

    public M8(Provider<com.avito.android.J0> provider) {
        this.f144074a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.J0 j02 = this.f144074a.get();
        C29986a8.f144230a.getClass();
        return new com.avito.android.serp.adapter.top_sellers_serp.c(j02);
    }
}
