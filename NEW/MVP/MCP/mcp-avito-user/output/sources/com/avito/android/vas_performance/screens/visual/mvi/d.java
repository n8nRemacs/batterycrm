package com.avito.android.vas_performance.screens.visual.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VisualVasActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f321099a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f321100b;

    /* renamed from: c, reason: collision with root package name */
    public final u f321101c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.vas_performance.screens.visual.mvi.domain.d> f321102d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f321103e;

    public d(dagger.internal.l lVar, dagger.internal.l lVar2, u uVar, Provider provider, Provider provider2) {
        this.f321099a = lVar;
        this.f321100b = lVar2;
        this.f321101c = uVar;
        this.f321102d = provider;
        this.f321103e = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((String) this.f321099a.f393949a, (String) this.f321100b.f393949a, (com.avito.android.vas_performance.screens.visual.mvi.domain.a) this.f321101c.get(), this.f321102d.get(), this.f321103e.get());
    }
}
