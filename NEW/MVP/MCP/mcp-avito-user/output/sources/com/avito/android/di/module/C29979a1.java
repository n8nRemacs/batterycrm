package com.avito.android.di.module;

import android.app.Application;
import com.avito.android.ab_tests.configs.DegradeApplicationColdStartTestGroup;
import com.avito.android.analytics.InterfaceC28373a;

/* compiled from: ApplicationDelegateModule_ProvideApplicationColdStartupTimeMeasureTaskFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.a1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29979a1 implements dagger.internal.h<com.avito.android.app.coldstart.f> {

    /* renamed from: a, reason: collision with root package name */
    public final Z0 f144222a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f144223b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f144224c;

    /* renamed from: d, reason: collision with root package name */
    public final t3.S f144225d;

    public C29979a1(Z0 z02, dagger.internal.l lVar, dagger.internal.f fVar, t3.S s5) {
        this.f144222a = z02;
        this.f144223b = lVar;
        this.f144224c = fVar;
        this.f144225d = s5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f144223b.f393949a;
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f144224c.get();
        DegradeApplicationColdStartTestGroup degradeApplicationColdStartTestGroup = (DegradeApplicationColdStartTestGroup) this.f144225d.get();
        this.f144222a.getClass();
        return new com.avito.android.app.coldstart.f(interfaceC28373a, application, degradeApplicationColdStartTestGroup);
    }
}
