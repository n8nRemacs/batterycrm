package com.avito.android.str_calendar.booking_calendar.di;

import TP0.b;
import android.content.Context;
import androidx.view.T0;
import com.avito.android.di.C29972i;
import com.avito.android.str_calendar.booking_calendar.di.a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrBookingCalendarModule_ProvideWidgetFiltersSharedViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<com.avito.android.widget_filters_shared.a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f286281a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Context> f286282b;

    /* renamed from: c, reason: collision with root package name */
    public final l f286283c;

    public k(h hVar, Provider provider, l lVar) {
        this.f286281a = hVar;
        this.f286282b = provider;
        this.f286283c = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context contextG = ((a.c.d) this.f286282b).f286263a.g();
        T0 t02 = (T0) this.f286283c.f393949a;
        this.f286281a.getClass();
        com.avito.android.widget_filters_shared.a aVarA = ((b.InterfaceC1073b) C29972i.a(C29972i.b(contextG), b.InterfaceC1073b.class)).Hc().f15663a.a(t02).a();
        t.d(aVarA);
        return aVarA;
    }
}
