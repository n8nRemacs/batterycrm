package com.avito.android.str_calendar.seller.calendar.data;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerCalendarMonthsBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<m> f287540a;

    public k(Provider<m> provider) {
        this.f287540a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f287540a.get());
    }
}
