package com.avito.android.orders.feature.beduin_orders_list.mvi;

import gj.InterfaceC40691b;
import javax.inject.Provider;
import n50.InterfaceC44196b;

/* compiled from: BeduinOrdersActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<C32944a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f210088a;

    /* renamed from: b, reason: collision with root package name */
    public final A f210089b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC44196b> f210090c;

    public e(Provider provider, A a12, Provider provider2) {
        this.f210088a = provider;
        this.f210089b = a12;
        this.f210090c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32944a(this.f210088a.get(), (z) this.f210089b.get(), this.f210090c.get());
    }
}
