package com.avito.android.short_term_rent.bookingform.di;

import bw0.C25729b;
import bw0.C25730c;
import com.avito.android.short_term_rent.bookingform.di.c;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BookingFormModule_PageModule_KonveyorModule_ProvidePagerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f281255a;

    /* renamed from: b, reason: collision with root package name */
    public final C25730c f281256b;

    public m(Provider provider, C25730c c25730c) {
        this.f281255a = provider;
        this.f281256b = c25730c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f281255a.get();
        C25729b c25729b = (C25729b) this.f281256b.get();
        c.d.a.f281240a.getClass();
        return new com.avito.konveyor.adapter.d(new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null), aVar, c25729b);
    }
}
