package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrCalendarParametersViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<k> f287458a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.str_calendar.seller.calandar_parameters.t> f287459b;

    public x(Provider<k> provider, Provider<com.avito.android.str_calendar.seller.calandar_parameters.t> provider2) {
        this.f287458a = provider;
        this.f287459b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w(this.f287458a.get(), this.f287459b.get());
    }
}
