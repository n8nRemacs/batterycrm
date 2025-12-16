package com.avito.android.di.module;

import od.C44757b;
import od.InterfaceC44756a;

/* compiled from: CoreTasksModule_ProvideBackgroundStartupTaskAnalyticsTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class L3 implements dagger.internal.h<InterfaceC44756a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f144041a;

    public L3(dagger.internal.u uVar) {
        this.f144041a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.task.a aVar = (com.avito.android.analytics.task.a) this.f144041a.get();
        H3.f143982a.getClass();
        return new C44757b(aVar);
    }
}
