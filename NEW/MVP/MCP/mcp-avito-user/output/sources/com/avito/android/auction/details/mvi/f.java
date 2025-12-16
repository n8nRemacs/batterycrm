package com.avito.android.auction.details.mvi;

import com.avito.android.deep_linking.links.AuctionDetails;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AuctionDetailsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f92365a;

    public f(dagger.internal.l lVar) {
        this.f92365a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((AuctionDetails) this.f92365a.f393949a);
    }
}
