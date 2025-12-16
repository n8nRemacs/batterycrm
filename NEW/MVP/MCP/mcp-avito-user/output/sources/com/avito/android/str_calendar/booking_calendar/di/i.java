package com.avito.android.str_calendar.booking_calendar.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.StrBookingCalendarScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrBookingCalendarModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final h f286276a;

    /* renamed from: b, reason: collision with root package name */
    public final l f286277b;

    public i(h hVar, l lVar) {
        this.f286276a = hVar;
        this.f286277b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f286277b.f393949a;
        this.f286276a.getClass();
        return new C28478k(StrBookingCalendarScreen.f90504d, rVar, null, 4, null);
    }
}
