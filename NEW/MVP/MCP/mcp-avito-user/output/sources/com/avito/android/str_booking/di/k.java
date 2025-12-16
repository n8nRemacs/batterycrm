package com.avito.android.str_booking.di;

import dagger.internal.x;
import dagger.internal.y;
import dy0.C39827a;
import dy0.C39828b;
import javax.inject.Provider;

/* compiled from: StrBookingAdaptersModule_ProvideListRecyclerAdapter$_avito_str_booking_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f285561a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f285562b;

    /* renamed from: c, reason: collision with root package name */
    public final C39828b f285563c;

    public k(Provider provider, Provider provider2, C39828b c39828b) {
        this.f285561a = provider;
        this.f285562b = provider2;
        this.f285563c = c39828b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f285561a.get();
        com.avito.konveyor.a aVar2 = this.f285562b.get();
        C39827a c39827a = (C39827a) this.f285563c.get();
        int i12 = f.f285555a;
        return new com.avito.konveyor.adapter.d(aVar, aVar2, c39827a);
    }
}
