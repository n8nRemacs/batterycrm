package com.avito.android.service_orders.mvi;

import javax.inject.Provider;

/* compiled from: ServiceOrdersListActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class v implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.service_orders.mvi.domain.d> f279667a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.service_orders.mvi.domain.a> f279668b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_utils.ux_feedback.h> f279669c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f279670d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f279671e;

    public v(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f279667a = provider;
        this.f279668b = provider2;
        this.f279669c = provider3;
        this.f279670d = uVar;
        this.f279671e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f279667a.get(), this.f279668b.get(), this.f279669c.get(), (com.avito.android.service_booking_utils.ux_feedback.e) this.f279670d.get(), this.f279671e.get());
    }
}
