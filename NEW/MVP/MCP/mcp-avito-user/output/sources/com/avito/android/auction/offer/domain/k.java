package com.avito.android.auction.offer.domain;

import com.avito.android.auction.offer.mvi.p;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AuctionOfferMapper_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f92519a;

    public k(u uVar) {
        this.f92519a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((p) this.f92519a.get());
    }
}
