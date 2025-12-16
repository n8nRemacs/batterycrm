package com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.reviews;

import com.avito.android.serp.analytics.widgets_tracker.g;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SellerWithReviewsPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final f f273189a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<g> f273190b;

    public d(f fVar, Provider provider) {
        this.f273189a = fVar;
        this.f273190b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f273190b.get(), dagger.internal.g.b(this.f273189a));
    }
}
