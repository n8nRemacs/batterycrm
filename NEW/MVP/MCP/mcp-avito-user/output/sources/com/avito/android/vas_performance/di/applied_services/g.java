package com.avito.android.vas_performance.di.applied_services;

import androidx.view.P0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_performance.InterfaceC36049c;
import com.avito.android.vas_performance.di.applied_services.h;
import com.avito.android.vas_performance.ui.applied_services.k;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AppliedServicesModule_ProvideVmFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<P0.c> {

    /* renamed from: a, reason: collision with root package name */
    public final c f319909a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.vas_performance.repository.a> f319910b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC36049c> f319911c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f319912d;

    /* renamed from: e, reason: collision with root package name */
    public final u f319913e;

    public g(c cVar, Provider provider, Provider provider2, Provider provider3, u uVar) {
        this.f319909a = cVar;
        this.f319910b = provider;
        this.f319911c = provider2;
        this.f319912d = provider3;
        this.f319913e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_performance.repository.a aVar = this.f319910b.get();
        InterfaceC36049c interfaceC36049c = this.f319911c.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((h.b.C9915b) this.f319912d).get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f319913e.get();
        c cVar = this.f319909a;
        cVar.getClass();
        return new k(cVar.f319903b, aVar, interfaceC36049c, interfaceC35745a5, screenPerformanceTracker);
    }
}
