package com.avito.android.di.module;

import android.app.Application;
import com.avito.android.ab_tests.configs.DegradeScrollTestGroup;

/* compiled from: AvitoDegradeScreenModule_ProvideDegradeScrollFPSFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class K1 implements dagger.internal.h<com.avito.android.analytics.screens.tracker.degrade.fps.f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f144027a;

    /* renamed from: b, reason: collision with root package name */
    public final t3.T f144028b;

    public K1(dagger.internal.l lVar, t3.T t12) {
        this.f144027a = lVar;
        this.f144028b = t12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f144027a.f393949a;
        DegradeScrollTestGroup degradeScrollTestGroup = (DegradeScrollTestGroup) this.f144028b.get();
        I1.f144001a.getClass();
        return new com.avito.android.analytics.screens.tracker.degrade.fps.f(application, degradeScrollTestGroup);
    }
}
