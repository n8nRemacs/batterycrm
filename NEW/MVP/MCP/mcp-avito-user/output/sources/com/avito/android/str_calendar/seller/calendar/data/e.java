package com.avito.android.str_calendar.seller.calendar.data;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerCalendarItemConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<m> f287536a;

    public e(Provider<m> provider) {
        this.f287536a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f287536a.get());
    }
}
