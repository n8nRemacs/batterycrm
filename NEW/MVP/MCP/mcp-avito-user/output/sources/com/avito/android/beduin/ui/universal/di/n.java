package com.avito.android.beduin.ui.universal.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.ui.universal.di.b;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalBeduinFragmentTrackerModule_ProvideScreenTrackerFactoryForFragmentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f104483a;

    /* renamed from: b, reason: collision with root package name */
    public final u f104484b;

    public n(u uVar, Provider provider) {
        this.f104483a = provider;
        this.f104484b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((b.c.C3123b) this.f104483a).get();
        C28478k c28478k = (C28478k) this.f104484b.get();
        k.f104479a.getClass();
        if (c28478k != null) {
            return interfaceC28481c.a(c28478k);
        }
        return null;
    }
}
