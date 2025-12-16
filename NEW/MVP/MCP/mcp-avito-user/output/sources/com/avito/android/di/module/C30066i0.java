package com.avito.android.di.module;

import android.app.Application;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: AnalyticsTasksModule_ProvideReleaseLeakCanaryInitializerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.i0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30066i0 implements dagger.internal.h<com.avito.android.leakcanary.release.f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f144333a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f144334b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f144335c;

    public C30066i0(dagger.internal.f fVar, dagger.internal.l lVar, Provider provider) {
        this.f144333a = lVar;
        this.f144334b = fVar;
        this.f144335c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f144333a.f393949a;
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f144334b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f144335c.get();
        Z z12 = Z.f144213a;
        return new com.avito.android.leakcanary.release.f(application, interfaceC28373a, interfaceC35745a5, null, 8, null);
    }
}
