package com.avito.android.short_term_rent.soft_booking.domain;

import Xv0.InterfaceC17053a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.d1;
import com.google.gson.Gson;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSoftBookingDetailsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class r implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d1> f282648a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f282649b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC17053a> f282650c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Gson> f282651d;

    /* renamed from: e, reason: collision with root package name */
    public final u f282652e;

    public r(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f282648a = provider;
        this.f282649b = provider2;
        this.f282650c = provider3;
        this.f282651d = provider4;
        this.f282652e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f282648a.get(), this.f282649b.get(), this.f282650c.get(), this.f282651d.get(), (com.avito.android.short_term_rent.utils.d) this.f282652e.get());
    }
}
