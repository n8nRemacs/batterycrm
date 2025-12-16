package com.avito.android.das_date_picker.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.das_date_picker.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DasCalendarModule_ProvideScreenTrackerFactoryForFragmentFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final h f132300a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f132301b;

    /* renamed from: c, reason: collision with root package name */
    public final u f132302c;

    public j(h hVar, Provider provider, u uVar) {
        this.f132300a = hVar;
        this.f132301b = provider;
        this.f132302c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.b.C3958a) this.f132301b).get();
        C28478k c28478k = (C28478k) this.f132302c.get();
        this.f132300a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
