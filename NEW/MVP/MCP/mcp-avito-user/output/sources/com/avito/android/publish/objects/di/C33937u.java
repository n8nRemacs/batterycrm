package com.avito.android.publish.objects.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.ObjectFillFormScreen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.publish.objects.di.C33894a;
import javax.inject.Provider;

/* compiled from: ObjectFillFormAnalyticsModule_ProvidesScreenTrackerFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.objects.di.u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33937u implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f238029a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f238030b;

    public C33937u(dagger.internal.l lVar, Provider provider) {
        this.f238029a = provider;
        this.f238030b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((C33894a.c.V) this.f238029a).get();
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f238030b.f393949a;
        C33936t.f238028a.getClass();
        return interfaceC28481c.a(new C28478k(ObjectFillFormScreen.f90436d, rVar, null, 4, null));
    }
}
