package com.avito.android.di.module;

import Ec.C13472a;
import com.avito.android.analytics.InterfaceC28373a;

/* compiled from: CoreTasksModule_ProvideBackgroundStartupAnalyticsTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class K3 implements dagger.internal.h<com.avito.android.analytics.task.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f144029a;

    public K3(dagger.internal.f fVar) {
        this.f144029a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f144029a.get();
        H3.f143982a.getClass();
        return new com.avito.android.analytics.task.b(new I3(1, C13472a.f4111a, C13472a.class, "bgStartupTaskTime", "bgStartupTaskTime(Ljava/lang/String;)Ljava/lang/String;", 0), interfaceC28373a);
    }
}
