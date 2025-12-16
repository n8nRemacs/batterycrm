package com.avito.android.auction.offer.domain;

import Pd.InterfaceC14769a;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lD.C43617a;
import sj0.InterfaceC48373a;

/* compiled from: AuctionOfferInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14769a> f92514a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC48373a> f92515b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C43617a> f92516c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f92517d;

    public i(Provider<InterfaceC14769a> provider, Provider<InterfaceC48373a> provider2, Provider<C43617a> provider3, Provider<com.avito.android.deep_linking.x> provider4) {
        this.f92514a = provider;
        this.f92515b = provider2;
        this.f92516c = provider3;
        this.f92517d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(dagger.internal.g.a(w.a(this.f92514a)), dagger.internal.g.a(w.a(this.f92515b)), this.f92516c.get(), this.f92517d.get());
    }
}
