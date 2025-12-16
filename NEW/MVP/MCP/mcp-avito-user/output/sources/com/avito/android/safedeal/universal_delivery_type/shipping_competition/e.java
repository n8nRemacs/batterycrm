package com.avito.android.safedeal.universal_delivery_type.shipping_competition;

import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalDeliveryTypeShippingCompetitionPerformanceTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28499v> f256814a;

    /* renamed from: b, reason: collision with root package name */
    public final u f256815b;

    public e(u uVar, Provider provider) {
        this.f256814a = provider;
        this.f256815b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f256814a.get(), (o) this.f256815b.get());
    }
}
