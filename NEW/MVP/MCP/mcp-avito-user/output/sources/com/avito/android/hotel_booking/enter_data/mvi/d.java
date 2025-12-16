package com.avito.android.hotel_booking.enter_data.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EnterDataActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<p> f163562a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f163563b;

    public d(dagger.internal.u uVar, Provider provider) {
        this.f163562a = provider;
        this.f163563b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f163562a.get(), (PI.a) this.f163563b.get());
    }
}
