package com.avito.android.auction.details;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AuctionDetailsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.auction.details.mvi.i f92388a;

    public r(com.avito.android.auction.details.mvi.i iVar) {
        this.f92388a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q((com.avito.android.auction.details.mvi.h) this.f92388a.get(), null, 2, null);
    }
}
