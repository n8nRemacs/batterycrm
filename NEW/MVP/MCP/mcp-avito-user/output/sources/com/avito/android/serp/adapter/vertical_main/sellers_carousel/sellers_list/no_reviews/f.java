package com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.no_reviews;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SellerWithoutReviewsPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f273178a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f273179b;

    public f(dagger.internal.f fVar, Provider provider) {
        this.f273178a = fVar;
        this.f273179b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f273179b.get(), dagger.internal.g.b(this.f273178a));
    }
}
