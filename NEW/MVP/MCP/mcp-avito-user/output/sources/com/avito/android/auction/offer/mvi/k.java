package com.avito.android.auction.offer.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AuctionOfferViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final i f92598a;

    public k(i iVar) {
        this.f92598a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((h) this.f92598a.get(), null, 2, null);
    }
}
