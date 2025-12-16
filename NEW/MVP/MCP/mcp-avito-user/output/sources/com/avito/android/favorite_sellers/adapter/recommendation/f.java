package com.avito.android.favorite_sellers.adapter.recommendation;

import javax.inject.Provider;

/* compiled from: RecommendationItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<h> f155646a;

    /* renamed from: b, reason: collision with root package name */
    public final CC.b f155647b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f155648c;

    public f(Provider provider, CC.b bVar, dagger.internal.u uVar) {
        this.f155646a = provider;
        this.f155647b = bVar;
        this.f155648c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f155646a.get(), (com.avito.konveyor.adapter.a) this.f155647b.get(), (com.avito.konveyor.a) this.f155648c.get());
    }
}
