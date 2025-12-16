package com.avito.android.developments_advice.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.developments_advice.di.k;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConsultationFormModule_ProvideScreenTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final g f136066a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f136067b;

    /* renamed from: c, reason: collision with root package name */
    public final u f136068c;

    public j(g gVar, Provider provider, u uVar) {
        this.f136066a = gVar;
        this.f136067b = provider;
        this.f136068c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((k.b.C4117b) this.f136067b).get();
        C28478k c28478k = (C28478k) this.f136068c.get();
        this.f136066a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
