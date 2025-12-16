package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ns.InterfaceC44470a;

/* compiled from: GetCpxPromoGeoUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f127834a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC44470a> f127835b;

    /* renamed from: c, reason: collision with root package name */
    public final l f127836c;

    public c(l lVar, Provider provider, Provider provider2) {
        this.f127834a = provider;
        this.f127835b = provider2;
        this.f127836c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f127834a.get(), (String) this.f127836c.f393949a, this.f127835b.get());
    }
}
