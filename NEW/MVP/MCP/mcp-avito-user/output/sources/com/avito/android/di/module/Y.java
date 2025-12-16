package com.avito.android.di.module;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.enabler.RemoteFeaturesTouchMonitor;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35950u;
import javax.inject.Provider;

/* compiled from: AnalyticFeaturesModule_ProvideRemoteFeaturesTouchMonitorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class Y implements dagger.internal.h<RemoteFeaturesTouchMonitor> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.features.a> f144202a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f144203b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.error_reporting.app_state.K f144204c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f144205d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35950u> f144206e;

    public Y(Provider provider, Provider provider2, com.avito.android.error_reporting.app_state.K k12, dagger.internal.f fVar, Provider provider3) {
        this.f144202a = provider;
        this.f144203b = provider2;
        this.f144204c = k12;
        this.f144205d = fVar;
        this.f144206e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.features.a aVar = this.f144202a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f144203b.get();
        com.avito.android.error_reporting.app_state.J j12 = (com.avito.android.error_reporting.app_state.J) this.f144204c.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f144205d.get();
        InterfaceC35950u interfaceC35950u = this.f144206e.get();
        int i12 = T.f144138a;
        return new RemoteFeaturesTouchMonitor(aVar, interfaceC28373a, new S(j12), interfaceC35745a5, interfaceC35950u);
    }
}
