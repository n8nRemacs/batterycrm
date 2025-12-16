package com.avito.android.installments.form;

import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InstallmentsFormTrackerImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28499v> f172802a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28501x> f172803b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f172804c;

    public o(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f172802a = provider;
        this.f172803b = provider2;
        this.f172804c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f172802a.get(), this.f172803b.get(), (com.avito.android.analytics.screens.o) this.f172804c.get());
    }
}
