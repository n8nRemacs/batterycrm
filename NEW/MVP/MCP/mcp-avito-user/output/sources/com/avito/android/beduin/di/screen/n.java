package com.avito.android.beduin.di.screen;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.di.screen.p;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinScreenTrackerModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f103971a;

    /* renamed from: b, reason: collision with root package name */
    public final u f103972b;

    public n(u uVar, Provider provider) {
        this.f103971a = provider;
        this.f103972b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((p.b.d) this.f103971a).get();
        C28478k c28478k = (C28478k) this.f103972b.get();
        l.f103968a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
