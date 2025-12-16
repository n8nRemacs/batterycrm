package com.avito.android.sx_address.list.mvi;

import android.content.SharedPreferences;
import com.avito.android.sx_address.SxAddressListParams;
import javax.inject.Provider;
import zA0.InterfaceC50429b;

/* compiled from: SxAddressListActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.sx_address.list.domain.b> f293384a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f293385b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f293386c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.sx_address.list.di.t f293387d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f293388e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.sx_address.list.e> f293389f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f293390g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.sx_address.list.analytics.i> f293391h;

    public y(Provider provider, dagger.internal.l lVar, Provider provider2, com.avito.android.sx_address.list.di.t tVar, Provider provider3, Provider provider4, dagger.internal.u uVar, Provider provider5) {
        this.f293384a = provider;
        this.f293385b = lVar;
        this.f293386c = provider2;
        this.f293387d = tVar;
        this.f293388e = provider3;
        this.f293389f = provider4;
        this.f293390g = uVar;
        this.f293391h = provider5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new x(this.f293384a.get(), (SxAddressListParams) this.f293385b.f393949a, this.f293386c.get(), (SharedPreferences) this.f293387d.get(), this.f293388e.get(), this.f293389f.get(), (InterfaceC50429b) this.f293390g.get(), this.f293391h.get());
    }
}
