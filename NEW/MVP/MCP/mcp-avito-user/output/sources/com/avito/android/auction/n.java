package com.avito.android.auction;

import android.app.Application;

/* compiled from: AuctionIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f92422a;

    public n(dagger.internal.l lVar) {
        this.f92422a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((Application) this.f92422a.f393949a);
    }
}
