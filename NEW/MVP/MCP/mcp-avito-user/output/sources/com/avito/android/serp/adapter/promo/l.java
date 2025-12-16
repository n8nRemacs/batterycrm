package com.avito.android.serp.adapter.promo;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PromoHeaderPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f270496a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f270497b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f270498c;

    public l(dagger.internal.f fVar, dagger.internal.f fVar2, Provider provider) {
        this.f270496a = provider;
        this.f270497b = fVar;
        this.f270498c = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f270496a.get(), dagger.internal.g.b(this.f270497b), dagger.internal.g.b(this.f270498c));
    }
}
