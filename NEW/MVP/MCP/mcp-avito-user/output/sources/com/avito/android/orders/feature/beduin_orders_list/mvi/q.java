package com.avito.android.orders.feature.beduin_orders_list.mvi;

import com.avito.android.Z0;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: BeduinOrdersBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.orders.feature.beduin_orders_list.f> f210146a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f210147b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Wi.b> f210148c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.orders.feature.beduin_orders_list.data.e f210149d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f210150e;

    /* renamed from: f, reason: collision with root package name */
    public final A f210151f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<W40.b> f210152g;

    /* renamed from: h, reason: collision with root package name */
    public final D f210153h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<Z0> f210154i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.clientEventBus.a> f210155j;

    public q(Provider provider, Provider provider2, Provider provider3, com.avito.android.orders.feature.beduin_orders_list.data.e eVar, Provider provider4, A a12, Provider provider5, D d12, Provider provider6, Provider provider7) {
        this.f210146a = provider;
        this.f210147b = provider2;
        this.f210148c = provider3;
        this.f210149d = eVar;
        this.f210150e = provider4;
        this.f210151f = a12;
        this.f210152g = provider5;
        this.f210153h = d12;
        this.f210154i = provider6;
        this.f210155j = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f210146a.get(), this.f210147b.get(), this.f210148c.get(), (com.avito.android.orders.feature.beduin_orders_list.data.a) this.f210149d.get(), this.f210150e.get(), (z) this.f210151f.get(), this.f210152g.get(), (C) this.f210153h.get(), this.f210154i.get(), this.f210155j.get());
    }
}
