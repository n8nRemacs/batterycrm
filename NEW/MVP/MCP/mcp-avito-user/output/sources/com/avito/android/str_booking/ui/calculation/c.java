package com.avito.android.str_booking.ui.calculation;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrBookingCalculationBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f285958a;

    /* renamed from: b, reason: collision with root package name */
    public final u f285959b;

    public c(u uVar, Provider provider) {
        this.f285958a = provider;
        this.f285959b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f285958a.get(), (com.avito.konveyor.adapter.d) this.f285959b.get());
    }
}
