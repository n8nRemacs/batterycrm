package com.avito.android.campaigns_sale.mvi;

import gj.InterfaceC40691b;
import javax.inject.Provider;
import lj.InterfaceC43779a;

/* compiled from: CampaignsSaleBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class J implements dagger.internal.h<I> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f114097a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC43779a> f114098b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f114099c;

    public J(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f114097a = provider;
        this.f114098b = provider2;
        this.f114099c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new I(this.f114097a.get(), this.f114098b.get(), (com.avito.android.campaigns_sale.network.a) this.f114099c.get());
    }
}
