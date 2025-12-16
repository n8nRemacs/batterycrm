package com.avito.android.advertising.loaders.avito_targeting;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvitoBannerConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.kebab.i> f88030a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advertising.loaders.x> f88031b;

    public c(Provider<com.avito.android.advertising.kebab.i> provider, Provider<com.avito.android.advertising.loaders.x> provider2) {
        this.f88030a = provider;
        this.f88031b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f88030a.get(), this.f88031b.get());
    }
}
