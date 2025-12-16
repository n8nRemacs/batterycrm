package com.avito.android.str_calendar.seller.calendar.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerCalendarModule_ProvideSellerCalendarListRecyclerAdapter$_avito_str_calendar_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final d f287587a;

    /* renamed from: b, reason: collision with root package name */
    public final u f287588b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f287589c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.str_calendar.seller.calendar.konveyor.f f287590d;

    public g(d dVar, u uVar, Provider provider, com.avito.android.str_calendar.seller.calendar.konveyor.f fVar) {
        this.f287587a = dVar;
        this.f287588b = uVar;
        this.f287589c = provider;
        this.f287590d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f287588b.get();
        com.avito.konveyor.a aVar2 = this.f287589c.get();
        this.f287590d.getClass();
        com.avito.android.str_calendar.seller.calendar.konveyor.e eVar = new com.avito.android.str_calendar.seller.calendar.konveyor.e();
        this.f287587a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, eVar);
    }
}
