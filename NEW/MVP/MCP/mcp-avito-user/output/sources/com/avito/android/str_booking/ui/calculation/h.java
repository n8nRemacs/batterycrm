package com.avito.android.str_booking.ui.calculation;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrBookingCalculationPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f285970a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f285971b;

    public h(dagger.internal.l lVar, Provider provider) {
        this.f285970a = provider;
        this.f285971b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Y41.l) this.f285971b.f393949a, this.f285970a.get());
    }
}
