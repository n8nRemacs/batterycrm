package com.avito.android.advert.item.compatibility.v3.item.brand_compatibility_long;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BrandCompatibilityLongBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.compatibility.v3.item.brand_compatibility.e> f74440a;

    public b(Provider<com.avito.android.advert.item.compatibility.v3.item.brand_compatibility.e> provider) {
        this.f74440a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f74440a.get());
    }
}
