package com.avito.android.advert.item.creditinfo.buzzoola;

import javax.inject.Provider;

/* compiled from: BuzzoolaCreditBannerBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<k> f74930a;

    public c(Provider<k> provider) {
        this.f74930a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f74930a.get());
    }
}
