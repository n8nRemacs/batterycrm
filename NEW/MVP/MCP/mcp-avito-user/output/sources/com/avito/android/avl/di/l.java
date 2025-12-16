package com.avito.android.avl.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avl.di.r;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvlPlayerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f98084a;

    /* renamed from: b, reason: collision with root package name */
    public final u f98085b;

    public l(u uVar, Provider provider) {
        this.f98084a = provider;
        this.f98085b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((r.b.u) this.f98084a).get();
        C28478k c28478k = (C28478k) this.f98085b.get();
        f.f98077a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
