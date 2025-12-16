package com.avito.android.calendar_select.domain;

import Wl.InterfaceC15773a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.calendar_select.CalendarSettings;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LoadCalendarUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC15773a> f113375a;

    /* renamed from: b, reason: collision with root package name */
    public final u f113376b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f113377c;

    /* renamed from: d, reason: collision with root package name */
    public final l f113378d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f113379e;

    public g(l lVar, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f113375a = provider;
        this.f113376b = uVar;
        this.f113377c = provider2;
        this.f113378d = lVar;
        this.f113379e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f113375a.get(), (b) this.f113376b.get(), this.f113377c.get(), (CalendarSettings) this.f113378d.f393949a, this.f113379e.get());
    }
}
