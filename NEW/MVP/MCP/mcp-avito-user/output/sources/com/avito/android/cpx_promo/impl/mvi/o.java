package com.avito.android.cpx_promo.impl.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import fs.InterfaceC40470a;
import javax.inject.Provider;

/* compiled from: CpxPromoBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f127226a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f127227b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f127228c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.cpx_promo.impl.interactor.g f127229d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f127230e;

    /* renamed from: f, reason: collision with root package name */
    public final fs.c f127231f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f127232g;

    public o(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, com.avito.android.cpx_promo.impl.interactor.g gVar, Provider provider, fs.c cVar, Provider provider2) {
        this.f127226a = lVar;
        this.f127227b = lVar2;
        this.f127228c = lVar3;
        this.f127229d = gVar;
        this.f127230e = provider;
        this.f127231f = cVar;
        this.f127232g = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n((String) this.f127226a.f393949a, (String) this.f127227b.f393949a, (String) this.f127228c.f393949a, (com.avito.android.cpx_promo.impl.interactor.a) this.f127229d.get(), this.f127230e.get(), (InterfaceC40470a) this.f127231f.get(), this.f127232g.get());
    }
}
