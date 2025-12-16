package com.avito.android.str_calendar.booking_calendar.mvi;

import javax.inject.Provider;

/* compiled from: StrBookingCalendarActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35086e implements dagger.internal.h<C35082a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f286404a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.str_calendar.booking_calendar.h> f286405b;

    public C35086e(dagger.internal.u uVar, Provider provider) {
        this.f286404a = uVar;
        this.f286405b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35082a((p) this.f286404a.get(), this.f286405b.get());
    }
}
