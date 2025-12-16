package com.avito.android.str_cancellation_settings.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_cancellation_settings.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrCancellationSettingsCoreModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final c f288325a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f288326b;

    /* renamed from: c, reason: collision with root package name */
    public final u f288327c;

    public e(c cVar, Provider provider, u uVar) {
        this.f288325a = cVar;
        this.f288326b = provider;
        this.f288327c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.b) this.f288326b).get();
        C28478k c28478k = (C28478k) this.f288327c.get();
        this.f288325a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
