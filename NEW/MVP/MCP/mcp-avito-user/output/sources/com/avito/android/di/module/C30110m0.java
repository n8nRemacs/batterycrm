package com.avito.android.di.module;

import com.avito.android.app.task.UpdateVersionTask;

/* compiled from: AnalyticsTasksModule_ProvideUpdateVersionTaskFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.m0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30110m0 implements dagger.internal.h<UpdateVersionTask> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f144392a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.service.short_task.app_update.f f144393b;

    public C30110m0(dagger.internal.f fVar, com.avito.android.service.short_task.app_update.f fVar2) {
        this.f144392a = fVar;
        this.f144393b = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.service.short_task.j jVar = (com.avito.android.service.short_task.j) this.f144392a.get();
        com.avito.android.service.short_task.app_update.e eVar = (com.avito.android.service.short_task.app_update.e) this.f144393b.get();
        Z.f144213a.getClass();
        return new UpdateVersionTask(eVar, jVar);
    }
}
