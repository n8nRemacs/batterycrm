package com.avito.android.serp.adapter.vertical_main.sellers_carousel.with_reviews;

import Oi0.C14700d;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SellersCarouselWithReviewsWidgetBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f273202a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f273203b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C14700d> f273204c;

    public b(d dVar, Provider provider, Provider provider2) {
        this.f273202a = dVar;
        this.f273203b = provider;
        this.f273204c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f273202a.getClass();
        return new a(new c(), this.f273203b.get(), this.f273204c.get());
    }
}
