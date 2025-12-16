package com.avito.android.auction.offer.mvi;

import com.avito.android.auction.offer.AuctionOfferParams;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lD.C43617a;

/* compiled from: AuctionOfferBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.auction.offer.domain.i f92585a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f92586b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.auction.offer.domain.k f92587c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.auction.offer.domain.c f92588d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C43617a> f92589e;

    public f(com.avito.android.auction.offer.domain.i iVar, dagger.internal.l lVar, com.avito.android.auction.offer.domain.k kVar, com.avito.android.auction.offer.domain.c cVar, Provider provider) {
        this.f92585a = iVar;
        this.f92586b = lVar;
        this.f92587c = kVar;
        this.f92588d = cVar;
        this.f92589e = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.auction.offer.domain.d) this.f92585a.get(), (AuctionOfferParams) this.f92586b.f393949a, (com.avito.android.auction.offer.domain.j) this.f92587c.get(), (com.avito.android.auction.offer.domain.a) this.f92588d.get(), this.f92589e.get());
    }
}
