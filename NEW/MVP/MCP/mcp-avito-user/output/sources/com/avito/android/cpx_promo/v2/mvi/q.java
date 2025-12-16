package com.avito.android.cpx_promo.v2.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import dagger.internal.y;
import javax.inject.Provider;
import ls.C43824c;
import ls.InterfaceC43822a;

/* compiled from: CpxPromoV2Bootstrap_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f127761a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f127762b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f127763c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.cpx_promo.v2.domain.g f127764d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f127765e;

    /* renamed from: f, reason: collision with root package name */
    public final C43824c f127766f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f127767g;

    public q(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, com.avito.android.cpx_promo.v2.domain.g gVar, Provider provider, C43824c c43824c, Provider provider2) {
        this.f127761a = lVar;
        this.f127762b = lVar2;
        this.f127763c = lVar3;
        this.f127764d = gVar;
        this.f127765e = provider;
        this.f127766f = c43824c;
        this.f127767g = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new p((String) this.f127761a.f393949a, (String) this.f127762b.f393949a, (String) this.f127763c.f393949a, (com.avito.android.cpx_promo.v2.domain.a) this.f127764d.get(), this.f127765e.get(), (InterfaceC43822a) this.f127766f.get(), this.f127767g.get());
    }
}
