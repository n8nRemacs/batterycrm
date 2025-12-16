package com.avito.android.di.module;

import javax.inject.Provider;

/* compiled from: SerpItemConverterModule_ProvideSerpDevelopmentXlConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class F8 implements dagger.internal.h<com.avito.android.serp.adapter.J0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.G> f143956a;

    public F8(Provider<com.avito.android.serp.adapter.G> provider) {
        this.f143956a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.G g12 = this.f143956a.get();
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new com.avito.android.serp.adapter.K0(g12);
    }
}
