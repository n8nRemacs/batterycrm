package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import com.avito.android.J0;
import javax.inject.Provider;

/* compiled from: StrOrdersCalendarViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class F implements dagger.internal.h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J0> f290981a;

    public F(Provider<J0> provider) {
        this.f290981a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new E(this.f290981a.get());
    }
}
