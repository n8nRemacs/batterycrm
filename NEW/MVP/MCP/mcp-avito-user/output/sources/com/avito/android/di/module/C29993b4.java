package com.avito.android.di.module;

import javax.inject.Provider;
import od.C44757b;
import od.InterfaceC44756a;

/* compiled from: CoreTasksModule_ProvideStartupTaskAnalyticsTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.b4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29993b4 implements dagger.internal.h<InterfaceC44756a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.task.a> f144236a;

    public C29993b4(Provider<com.avito.android.analytics.task.a> provider) {
        this.f144236a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.task.a aVar = this.f144236a.get();
        H3.f143982a.getClass();
        return new C44757b(aVar);
    }
}
