package com.avito.android.short_term_rent.soft_booking.domain;

import Hl0.InterfaceC14002a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSoftBookingApplyInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14002a> f282620a;

    /* renamed from: b, reason: collision with root package name */
    public final u f282621b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f282622c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f282623d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<Gson> f282624e;

    public j(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f282620a = provider;
        this.f282621b = uVar;
        this.f282622c = provider2;
        this.f282623d = provider3;
        this.f282624e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f282620a.get(), (R0) this.f282621b.get(), this.f282622c.get(), this.f282623d.get(), this.f282624e.get());
    }
}
