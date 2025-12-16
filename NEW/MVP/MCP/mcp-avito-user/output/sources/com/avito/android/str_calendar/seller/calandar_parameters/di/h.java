package com.avito.android.str_calendar.seller.calandar_parameters.di;

import com.avito.android.str_calendar.seller.calandar_parameters.w;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrCalendarParametersAdapterModule_ProvideCheckmarkListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final d f286848a;

    /* renamed from: b, reason: collision with root package name */
    public final u f286849b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f286850c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.str_calendar.seller.calandar_parameters.x f286851d;

    public h(d dVar, u uVar, Provider provider, com.avito.android.str_calendar.seller.calandar_parameters.x xVar) {
        this.f286848a = dVar;
        this.f286849b = uVar;
        this.f286850c = provider;
        this.f286851d = xVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f286849b.get();
        com.avito.konveyor.a aVar2 = this.f286850c.get();
        this.f286851d.getClass();
        w wVar = new w();
        this.f286848a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, wVar);
    }
}
