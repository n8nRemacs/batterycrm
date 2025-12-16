package com.avito.android.di.module;

import javax.inject.Provider;

/* compiled from: SerpItemConverterModule_ProvideTopSellersWidgetItemConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class N8 implements dagger.internal.h<com.avito.android.serp.adapter.vertical_main.top_sellers.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.J0> f144082a;

    public N8(Provider<com.avito.android.J0> provider) {
        this.f144082a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.J0 j02 = this.f144082a.get();
        C29986a8.f144230a.getClass();
        return new com.avito.android.serp.adapter.vertical_main.top_sellers.d(j02);
    }
}
