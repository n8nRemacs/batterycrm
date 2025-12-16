package com.avito.android.service_booking_calendar.flexible.header.mvi.domain;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import it0.InterfaceC42109d;
import javax.inject.Provider;

/* compiled from: CalendarHeaderInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC42109d> f275972a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f275973b;

    public e(Provider<InterfaceC42109d> provider, Provider<R0> provider2) {
        this.f275972a = provider;
        this.f275973b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f275972a.get(), this.f275973b.get());
    }
}
