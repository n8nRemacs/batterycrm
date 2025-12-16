package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrCalendarParametersReducer_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<k> f287452a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<v> f287453b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f287454c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.d> f287455d;

    public u(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f287452a = provider;
        this.f287453b = provider2;
        this.f287454c = uVar;
        this.f287455d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f287452a.get(), this.f287453b.get(), (com.avito.android.str_calendar.seller.calandar_parameters.domain.children.g) this.f287454c.get(), this.f287455d.get());
    }
}
