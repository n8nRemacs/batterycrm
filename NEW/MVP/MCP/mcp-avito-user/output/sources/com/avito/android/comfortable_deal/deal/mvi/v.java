package com.avito.android.comfortable_deal.deal.mvi;

import Gp.C13905a;
import com.avito.android.util.R0;
import javax.inject.Provider;
import wp.InterfaceC49662a;

/* compiled from: DealActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class v implements dagger.internal.h<C29453a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.comfortable_deal.deal.player.l> f121723a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.repository.l f121724b;

    /* renamed from: c, reason: collision with root package name */
    public final Gp.b f121725c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f121726d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f121727e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.comfortable_deal.deal.interactor.a> f121728f;

    public v(Provider provider, com.avito.android.comfortable_deal.repository.l lVar, Gp.b bVar, Provider provider2, dagger.internal.u uVar, Provider provider3) {
        this.f121723a = provider;
        this.f121724b = lVar;
        this.f121725c = bVar;
        this.f121726d = provider2;
        this.f121727e = uVar;
        this.f121728f = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C29453a(this.f121723a.get(), (com.avito.android.comfortable_deal.repository.a) this.f121724b.get(), (C13905a) this.f121725c.get(), this.f121726d.get(), (InterfaceC49662a) this.f121727e.get(), this.f121728f.get());
    }
}
