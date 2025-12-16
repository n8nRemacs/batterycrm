package com.avito.android.auction.details;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AuctionDetailsIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f92343a;

    public h(dagger.internal.l lVar) {
        this.f92343a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Application) this.f92343a.f393949a);
    }
}
