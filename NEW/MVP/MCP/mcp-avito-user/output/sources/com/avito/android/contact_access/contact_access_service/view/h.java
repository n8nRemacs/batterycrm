package com.avito.android.contact_access.contact_access_service.view;

import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactAccessServicePerformanceTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28499v> f126046a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28501x> f126047b;

    /* renamed from: c, reason: collision with root package name */
    public final u f126048c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f126046a = provider;
        this.f126047b = provider2;
        this.f126048c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f126046a.get(), this.f126047b.get(), (o) this.f126048c.get());
    }
}
