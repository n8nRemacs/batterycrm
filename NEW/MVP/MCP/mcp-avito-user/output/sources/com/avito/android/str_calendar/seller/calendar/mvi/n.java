package com.avito.android.str_calendar.seller.calendar.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerCalendarReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.str_calendar.seller.calendar.data.f> f287771a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.str_calendar.seller.calendar.data.i> f287772b;

    /* renamed from: c, reason: collision with root package name */
    public final p f287773c;

    public n(Provider provider, Provider provider2, p pVar) {
        this.f287771a = provider;
        this.f287772b = provider2;
        this.f287773c = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f287771a.get(), this.f287772b.get(), (o) this.f287773c.get());
    }
}
