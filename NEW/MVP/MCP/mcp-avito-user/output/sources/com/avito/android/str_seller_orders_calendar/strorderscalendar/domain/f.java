package com.avito.android.str_seller_orders_calendar.strorderscalendar.domain;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersCalendarRedesignItemsCacheHandlerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<StrOrdersCalendarRedesignItemsCacheHandlerImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f290714a;

    public f(Provider<R0> provider) {
        this.f290714a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new StrOrdersCalendarRedesignItemsCacheHandlerImpl(this.f290714a.get());
    }
}
