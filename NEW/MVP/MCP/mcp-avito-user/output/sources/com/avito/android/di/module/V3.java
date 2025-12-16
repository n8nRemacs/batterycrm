package com.avito.android.di.module;

import com.avito.android.app.task.CheckRequestTask;

/* compiled from: CoreTasksModule_ProvidePinCertificateTaskFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class V3 implements dagger.internal.h<CheckRequestTask> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f144154a;

    public V3(dagger.internal.f fVar) {
        this.f144154a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.service.short_task.j jVar = (com.avito.android.service.short_task.j) this.f144154a.get();
        H3.f143982a.getClass();
        return new CheckRequestTask(jVar);
    }
}
