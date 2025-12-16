package com.avito.android.str_booking.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrBookingAdaptersModule_ProvideAdapterPresenter$_avito_str_booking_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f285556a;

    public g(dagger.internal.u uVar) {
        this.f285556a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f285556a.get();
        int i12 = f.f285555a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
