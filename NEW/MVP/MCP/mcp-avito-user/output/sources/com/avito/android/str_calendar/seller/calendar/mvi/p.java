package com.avito.android.str_calendar.seller.calendar.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerCalendarViewStateBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final u f287775a;

    public p(u uVar) {
        this.f287775a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((com.avito.android.str_calendar.seller.calendar.data.c) this.f287775a.get());
    }
}
