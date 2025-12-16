package com.avito.android.service_booking_calendar.domain;

import com.avito.android.B2;
import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TimeSlotItemConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f275555a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<B2> f275556b;

    public f(Provider<InterfaceC35863o4> provider, Provider<B2> provider2) {
        this.f275555a = provider;
        this.f275556b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f275555a.get(), this.f275556b.get());
    }
}
