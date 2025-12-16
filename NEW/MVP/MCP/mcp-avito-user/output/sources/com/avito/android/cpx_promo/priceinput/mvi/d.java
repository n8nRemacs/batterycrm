package com.avito.android.cpx_promo.priceinput.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputContent;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxPromoPriceInputBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f127327a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f127328b;

    public d(l lVar, Provider provider) {
        this.f127327a = lVar;
        this.f127328b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((CpxPromoPriceInputContent) this.f127327a.f393949a, this.f127328b.get());
    }
}
