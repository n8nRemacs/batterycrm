package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrCalendarParametersConverterImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.str_calendar.seller.calandar_parameters.s> f287431a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.str_calendar.seller.calandar_parameters.domain.children.a> f287432b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f287433c;

    public m(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f287431a = provider;
        this.f287432b = provider2;
        this.f287433c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f287431a.get(), this.f287432b.get(), (com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.d) this.f287433c.get());
    }
}
