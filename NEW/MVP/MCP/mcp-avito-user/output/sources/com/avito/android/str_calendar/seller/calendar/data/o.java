package com.avito.android.str_calendar.seller.calendar.data;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrServerCalendarSourceImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f287546a;

    public o(Provider<com.avito.android.server_time.f> provider) {
        this.f287546a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f287546a.get());
    }
}
