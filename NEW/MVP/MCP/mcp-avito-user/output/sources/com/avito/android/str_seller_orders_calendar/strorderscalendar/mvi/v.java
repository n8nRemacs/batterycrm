package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import com.avito.android.util.R0;
import javax.inject.Provider;
import yF0.InterfaceC50108b;

/* compiled from: StrOrdersCalendarBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f291170a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f291171b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.c f291172c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f291173d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f291174e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC50108b> f291175f;

    public v(dagger.internal.l lVar, Provider provider, com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.c cVar, dagger.internal.u uVar, Provider provider2, Provider provider3) {
        this.f291170a = lVar;
        this.f291171b = provider;
        this.f291172c = cVar;
        this.f291173d = uVar;
        this.f291174e = provider2;
        this.f291175f = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new u(((Integer) this.f291170a.f393949a).intValue(), this.f291171b.get(), (com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.a) this.f291172c.get(), (com.avito.android.str_core.c) this.f291173d.get(), this.f291174e.get(), this.f291175f.get());
    }
}
