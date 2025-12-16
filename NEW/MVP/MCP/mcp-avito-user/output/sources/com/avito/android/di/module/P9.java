package com.avito.android.di.module;

import wc.C49595c;

/* compiled from: StatsdModule_ProvideFlushInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class P9 implements dagger.internal.h<com.avito.android.analytics.inhouse_transport.k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f144102a;

    public P9(dagger.internal.f fVar) {
        this.f144102a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.service.short_task.j jVar = (com.avito.android.service.short_task.j) this.f144102a.get();
        int i12 = O9.f144089a;
        return new C49595c(jVar);
    }
}
