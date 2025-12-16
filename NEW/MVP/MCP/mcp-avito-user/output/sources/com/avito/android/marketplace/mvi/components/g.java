package com.avito.android.marketplace.mvi.components;

import com.avito.android.marketplace.mvi.entity.FinanceMarketplaceState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FinanceMarketplaceFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f185935a;

    /* renamed from: b, reason: collision with root package name */
    public final b f185936b;

    /* renamed from: c, reason: collision with root package name */
    public final i f185937c;

    /* renamed from: d, reason: collision with root package name */
    public final k f185938d;

    public g(d dVar, b bVar, i iVar, k kVar) {
        this.f185935a = dVar;
        this.f185936b = bVar;
        this.f185937c = iVar;
        this.f185938d = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f185935a.getClass();
        c cVar = new c();
        a aVar = (a) this.f185936b.get();
        this.f185937c.getClass();
        h hVar = new h();
        this.f185938d.getClass();
        j jVar = new j();
        FinanceMarketplaceState.f185948b.getClass();
        return new f("FinanceMarketplace", FinanceMarketplaceState.f185949c, new e(cVar, aVar, jVar, hVar));
    }
}
