package com.avito.android.di.module;

import od.C44757b;
import od.InterfaceC44756a;

/* compiled from: CoreTasksModule_ProvideForegroundStartupTaskAnalyticsTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class Q3 implements dagger.internal.h<InterfaceC44756a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f144105a;

    public Q3(dagger.internal.u uVar) {
        this.f144105a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.task.a aVar = (com.avito.android.analytics.task.a) this.f144105a.get();
        H3.f143982a.getClass();
        return new C44757b(aVar);
    }
}
