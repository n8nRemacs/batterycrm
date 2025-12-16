package com.avito.android.silent_update.permissions.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.silent_update.permissions.di.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PermissionsActivityModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f283714a;

    /* renamed from: b, reason: collision with root package name */
    public final l f283715b;

    public d(l lVar, Provider provider) {
        this.f283714a = provider;
        this.f283715b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.b) this.f283714a).get();
        C28478k c28478k = (C28478k) this.f283715b.f393949a;
        c.f283713a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
