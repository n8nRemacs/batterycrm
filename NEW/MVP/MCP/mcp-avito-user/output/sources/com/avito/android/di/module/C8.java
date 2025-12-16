package com.avito.android.di.module;

import as0.C24171b;
import javax.inject.Provider;

/* compiled from: SerpItemConverterModule_ProvideSellersCarouselWidgetItemConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class C8 implements dagger.internal.h<C24171b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.J0> f143875a;

    public C8(Provider<com.avito.android.J0> provider) {
        this.f143875a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.J0 j02 = this.f143875a.get();
        C29986a8.f144230a.getClass();
        return new C24171b(j02);
    }
}
