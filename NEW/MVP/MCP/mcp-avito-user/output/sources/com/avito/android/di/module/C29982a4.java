package com.avito.android.di.module;

import com.avito.android.analytics.InterfaceC28373a;

/* compiled from: CoreTasksModule_ProvideStartupAnalyticsTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.a4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29982a4 implements dagger.internal.h<com.avito.android.analytics.task.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f144227a;

    public C29982a4(dagger.internal.f fVar) {
        this.f144227a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f144227a.get();
        H3.f143982a.getClass();
        return new com.avito.android.analytics.task.b(interfaceC28373a, null, 2, null);
    }
}
