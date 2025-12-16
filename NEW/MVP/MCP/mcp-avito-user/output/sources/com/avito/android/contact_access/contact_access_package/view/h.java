package com.avito.android.contact_access.contact_access_package.view;

import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactAccessPackagePerformanceTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28499v> f125950a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28501x> f125951b;

    /* renamed from: c, reason: collision with root package name */
    public final u f125952c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f125950a = provider;
        this.f125951b = provider2;
        this.f125952c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f125950a.get(), this.f125951b.get(), (o) this.f125952c.get());
    }
}
