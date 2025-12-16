package com.avito.android.auction.offer.mvi;

import com.avito.android.auction.offer.AuctionOfferParams;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lD.C43617a;

/* compiled from: AuctionActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.auction.offer.domain.i f92573a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f92574b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.auction.offer.domain.k f92575c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C43617a> f92576d;

    public d(com.avito.android.auction.offer.domain.i iVar, dagger.internal.l lVar, com.avito.android.auction.offer.domain.k kVar, Provider provider) {
        this.f92573a = iVar;
        this.f92574b = lVar;
        this.f92575c = kVar;
        this.f92576d = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.auction.offer.domain.d) this.f92573a.get(), (AuctionOfferParams) this.f92574b.f393949a, (com.avito.android.auction.offer.domain.j) this.f92575c.get(), this.f92576d.get());
    }
}
