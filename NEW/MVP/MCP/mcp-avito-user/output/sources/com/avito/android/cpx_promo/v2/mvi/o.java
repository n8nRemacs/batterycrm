package com.avito.android.cpx_promo.v2.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import dagger.internal.y;
import javax.inject.Provider;
import ls.C43824c;
import ls.InterfaceC43822a;

/* compiled from: CpxPromoV2Actor_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class o implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f127741a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f127742b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.cpx_promo.v2.domain.g f127743c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f127744d;

    /* renamed from: e, reason: collision with root package name */
    public final C43824c f127745e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f127746f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f127747g;

    public o(dagger.internal.l lVar, dagger.internal.l lVar2, com.avito.android.cpx_promo.v2.domain.g gVar, Provider provider, C43824c c43824c, Provider provider2, Provider provider3) {
        this.f127741a = lVar;
        this.f127742b = lVar2;
        this.f127743c = gVar;
        this.f127744d = provider;
        this.f127745e = c43824c;
        this.f127746f = provider2;
        this.f127747g = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((String) this.f127741a.f393949a, (String) this.f127742b.f393949a, (com.avito.android.cpx_promo.v2.domain.a) this.f127743c.get(), this.f127744d.get(), (InterfaceC43822a) this.f127745e.get(), this.f127746f.get(), this.f127747g.get());
    }
}
