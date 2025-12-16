package com.avito.android.advert.item.cv_motivation_banner;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvMotivationBannerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f75015a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f75016b;

    public b(Provider<e> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f75015a = provider;
        this.f75016b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f75015a.get(), this.f75016b.get());
    }
}
