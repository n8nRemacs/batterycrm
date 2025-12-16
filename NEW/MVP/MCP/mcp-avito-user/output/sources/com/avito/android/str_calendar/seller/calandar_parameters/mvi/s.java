package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import com.avito.android.str_calendar.seller.calandar_parameters.C35095f;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrCalendarParametersOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.str_calendar.seller.calandar_parameters.domain.s f287446a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C35095f> f287447b;

    public s(com.avito.android.str_calendar.seller.calandar_parameters.domain.s sVar, Provider provider) {
        this.f287446a = sVar;
        this.f287447b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r((com.avito.android.str_calendar.seller.calandar_parameters.domain.r) this.f287446a.get(), this.f287447b.get());
    }
}
