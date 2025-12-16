package com.avito.android.service_booking_calendar.flexible.data.domain;

import Ys0.InterfaceC18323a;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LoadCalendarDaysUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC18323a> f275696a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_calendar.day.schedule.domain.d> f275697b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<g> f275698c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f275699d;

    /* renamed from: e, reason: collision with root package name */
    public final u f275700e;

    public f(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f275696a = provider;
        this.f275697b = provider2;
        this.f275698c = provider3;
        this.f275699d = provider4;
        this.f275700e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f275696a.get(), this.f275697b.get(), this.f275698c.get(), this.f275699d.get(), (com.avito.android.service_booking_calendar.flexible.header.mvi.domain.g) this.f275700e.get());
    }
}
