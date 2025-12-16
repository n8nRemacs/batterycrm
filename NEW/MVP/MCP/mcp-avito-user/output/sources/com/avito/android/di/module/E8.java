package com.avito.android.di.module;

import javax.inject.Provider;

/* compiled from: SerpItemConverterModule_ProvideSerpDevelopmentConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class E8 implements dagger.internal.h<com.avito.android.serp.adapter.H0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.G> f143912a;

    public E8(Provider<com.avito.android.serp.adapter.G> provider) {
        this.f143912a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.G g12 = this.f143912a.get();
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new com.avito.android.serp.adapter.I0(g12);
    }
}
