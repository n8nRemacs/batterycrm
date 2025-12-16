package com.avito.android.str_calendar.seller.calendar.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerCalendarBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.str_calendar.seller.calendar.data.b f287751a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.str_calendar.seller.calendar.data.m> f287752b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f287753c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f287754d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f287755e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f287756f;

    public g(com.avito.android.str_calendar.seller.calendar.data.b bVar, Provider provider, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4) {
        this.f287751a = bVar;
        this.f287752b = provider;
        this.f287753c = lVar;
        this.f287754d = lVar2;
        this.f287755e = lVar3;
        this.f287756f = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.str_calendar.seller.calendar.data.a) this.f287751a.get(), this.f287752b.get(), (String) this.f287753c.f393949a, (String) this.f287754d.f393949a, (String) this.f287755e.f393949a, ((Boolean) this.f287756f.f393949a).booleanValue());
    }
}
