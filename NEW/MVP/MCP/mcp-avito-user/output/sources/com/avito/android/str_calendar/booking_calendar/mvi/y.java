package com.avito.android.str_calendar.booking_calendar.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.d1;
import com.avito.android.util.R0;
import javax.inject.Provider;
import lE.C43624b;
import yy0.InterfaceC50323a;

/* compiled from: StrBookingCalendarInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class y implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d1> f286615a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC50323a> f286616b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C43624b> f286617c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f286618d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f286619e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f286620f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.str_calendar.booking_calendar.h> f286621g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f286622h;

    public y(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f286615a = provider;
        this.f286616b = provider2;
        this.f286617c = provider3;
        this.f286618d = provider4;
        this.f286619e = provider5;
        this.f286620f = provider6;
        this.f286621g = provider7;
        this.f286622h = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f286615a.get(), this.f286616b.get(), this.f286617c.get(), this.f286618d.get(), this.f286619e.get(), this.f286620f.get(), this.f286621g.get(), (InterfaceC35089h) this.f286622h.get());
    }
}
