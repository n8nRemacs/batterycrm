package com.avito.android.inline_filters.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.inline_filters.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FiltersCalendarPickerModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f171124a;

    /* renamed from: b, reason: collision with root package name */
    public final u f171125b;

    public l(u uVar, Provider provider) {
        this.f171124a = provider;
        this.f171125b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.C5067c) this.f171124a).get();
        C28478k c28478k = (C28478k) this.f171125b.get();
        e.f171113a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
