package com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor;

import Iz0.InterfaceC14179a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.f;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersCalendarRedesignInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14179a> f290789a;

    /* renamed from: b, reason: collision with root package name */
    public final u f290790b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.usecase.c f290791c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f290792d;

    /* renamed from: e, reason: collision with root package name */
    public final f f290793e;

    public c(Provider provider, u uVar, com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.usecase.c cVar, Provider provider2, f fVar) {
        this.f290789a = provider;
        this.f290790b = uVar;
        this.f290791c = cVar;
        this.f290792d = provider2;
        this.f290793e = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f290789a.get(), (ScreenPerformanceTracker) this.f290790b.get(), (com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.usecase.a) this.f290791c.get(), this.f290792d.get(), (com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.a) this.f290793e.get());
    }
}
