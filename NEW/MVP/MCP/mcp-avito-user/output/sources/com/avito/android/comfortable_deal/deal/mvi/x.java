package com.avito.android.comfortable_deal.deal.mvi;

import javax.inject.Provider;

/* compiled from: DealBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.comfortable_deal.deal.player.l> f121740a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f121741b;

    public x(dagger.internal.u uVar, Provider provider) {
        this.f121740a = provider;
        this.f121741b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w(this.f121740a.get(), (com.avito.android.comfortable_deal.deal.interactor.a) this.f121741b.get());
    }
}
