package com.avito.android.auction.offer.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AuctionOfferFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final d f92594a;

    /* renamed from: b, reason: collision with root package name */
    public final f f92595b;

    /* renamed from: c, reason: collision with root package name */
    public final m f92596c;

    /* renamed from: d, reason: collision with root package name */
    public final o f92597d;

    public i(d dVar, f fVar, m mVar, o oVar) {
        this.f92594a = dVar;
        this.f92595b = fVar;
        this.f92596c = mVar;
        this.f92597d = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f92594a.get();
        e eVar = (e) this.f92595b.get();
        this.f92596c.getClass();
        l lVar = new l();
        this.f92597d.getClass();
        n nVar = new n();
        Nd.d.f11644i.getClass();
        return new h("AuctionOffer", Nd.d.f11645j, new g(cVar, eVar, lVar, nVar));
    }
}
