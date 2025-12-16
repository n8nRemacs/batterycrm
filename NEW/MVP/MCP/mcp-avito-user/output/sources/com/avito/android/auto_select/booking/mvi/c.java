package com.avito.android.auto_select.booking.mvi;

import af.InterfaceC19879a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kf.InterfaceC42678a;

/* compiled from: AutoSelectBookingActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f95839a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC42678a> f95840b;

    public c(u uVar, Provider provider) {
        this.f95839a = uVar;
        this.f95840b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC19879a) this.f95839a.get(), this.f95840b.get());
    }
}
