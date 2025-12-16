package com.avito.android.auction.offer.domain;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AuctionAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f92501a;

    /* renamed from: b, reason: collision with root package name */
    public final l f92502b;

    public c(l lVar, Provider provider) {
        this.f92501a = provider;
        this.f92502b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f92501a.get(), ((Boolean) this.f92502b.f393949a).booleanValue());
    }
}
