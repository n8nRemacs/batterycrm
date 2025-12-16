package com.avito.android.str_calendar.seller.calendar.data;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerCalendarItemStatesBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<m> f287538a;

    public h(Provider<m> provider) {
        this.f287538a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f287538a.get());
    }
}
