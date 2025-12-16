package com.avito.android.str_booking.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrBookingAdaptersModule_ProvideHeaderAdapterPresenter$_avito_str_booking_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f285557a;

    public h(Provider<com.avito.konveyor.a> provider) {
        this.f285557a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f285557a.get();
        int i12 = f.f285555a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
