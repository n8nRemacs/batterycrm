package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: StrOrdersCalendarActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class r implements dagger.internal.h<C35130a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.c f291141a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f291142b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.f f291143c;

    /* renamed from: d, reason: collision with root package name */
    public final Hz0.c f291144d;

    public r(com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.c cVar, Provider provider, com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.f fVar, Hz0.c cVar2) {
        this.f291141a = cVar;
        this.f291142b = provider;
        this.f291143c = fVar;
        this.f291144d = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35130a((com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.a) this.f291141a.get(), this.f291142b.get(), (com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.a) this.f291143c.get(), (com.avito.android.str_seller_orders_calendar.analytics.a) this.f291144d.get());
    }
}
