package com.avito.android.serp.adapter.vertical_main.sellers_carousel.without_reviews;

import Oi0.C14700d;
import androidx.recyclerview.widget.RecyclerView;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SellersCarouselWithoutReviewsWidgetBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f273217a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f273218b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C14700d> f273219c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<RecyclerView.l> f273220d;

    public b(d dVar, Provider provider, Provider provider2, Provider provider3) {
        this.f273217a = dVar;
        this.f273218b = provider;
        this.f273219c = provider2;
        this.f273220d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f273217a.getClass();
        return new a(new c(), this.f273218b.get(), this.f273219c.get(), this.f273220d.get());
    }
}
