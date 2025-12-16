package com.avito.android.travel_file_download_deeplink.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.travel_file_download_deeplink.di.a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FileDownloadModule_ProvideScreenPerformanceTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final f f301760a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f301761b;

    /* renamed from: c, reason: collision with root package name */
    public final l f301762c;

    public h(f fVar, Provider provider, l lVar) {
        this.f301760a = fVar;
        this.f301761b = provider;
        this.f301762c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.f) this.f301761b).get();
        C28478k c28478k = (C28478k) this.f301762c.f393949a;
        this.f301760a.getClass();
        return interfaceC28481c.a(c28478k);
    }
}
