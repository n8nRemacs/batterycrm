package com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.usecase;

import Iz0.InterfaceC14179a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LoadBookingsUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14179a> f290807a;

    /* renamed from: b, reason: collision with root package name */
    public final u f290808b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f290809c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f290810d;

    public c(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f290807a = provider;
        this.f290808b = uVar;
        this.f290809c = provider2;
        this.f290810d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f290807a.get(), (ScreenPerformanceTracker) this.f290808b.get(), this.f290809c.get(), this.f290810d.get());
    }
}
