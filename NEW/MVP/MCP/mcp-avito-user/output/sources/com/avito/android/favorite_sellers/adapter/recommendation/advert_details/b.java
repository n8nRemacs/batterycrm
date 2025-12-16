package com.avito.android.favorite_sellers.adapter.recommendation.advert_details;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsRecommendationItemBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.favorite_sellers.adapter.recommendation.h> f155624a;

    /* renamed from: b, reason: collision with root package name */
    public final BC.b f155625b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f155626c;

    public b(Provider provider, BC.b bVar, Provider provider2) {
        this.f155624a = provider;
        this.f155625b = bVar;
        this.f155626c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f155624a.get(), (com.avito.konveyor.adapter.a) this.f155625b.get(), this.f155626c.get());
    }
}
