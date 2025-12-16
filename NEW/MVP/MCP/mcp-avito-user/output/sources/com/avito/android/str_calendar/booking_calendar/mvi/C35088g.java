package com.avito.android.str_calendar.booking_calendar.mvi;

import com.avito.android.str_calendar.booking_calendar.model.StrBookingCalendarInitParameters;
import javax.inject.Provider;

/* compiled from: StrBookingCalendarBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35088g implements dagger.internal.h<C35087f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f286468a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f286469b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f286470c;

    public C35088g(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider) {
        this.f286468a = lVar;
        this.f286469b = uVar;
        this.f286470c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C35087f((StrBookingCalendarInitParameters) this.f286468a.f393949a, (p) this.f286469b.get(), this.f286470c.get());
    }
}
