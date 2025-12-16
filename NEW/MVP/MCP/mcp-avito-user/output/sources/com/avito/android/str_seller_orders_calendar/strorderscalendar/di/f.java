package com.avito.android.str_seller_orders_calendar.strorderscalendar.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.StrSellerOrdersCalendarScreen;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrOrdersCalendarCoreModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final d f290643a;

    /* renamed from: b, reason: collision with root package name */
    public final l f290644b;

    public f(d dVar, l lVar) {
        this.f290643a = dVar;
        this.f290644b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = (r) this.f290644b.f393949a;
        this.f290643a.getClass();
        return new C28478k(StrSellerOrdersCalendarScreen.f90519d, rVar, null, 4, null);
    }
}
