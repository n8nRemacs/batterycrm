package com.avito.android.di.module;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.app.task.SendCrashRecordsToClickStreamTask;
import javax.inject.Provider;

/* compiled from: AnalyticsTasksModule_ProvideSendCrashRecordsToClickStreamTaskFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.k0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30088k0 implements dagger.internal.h<SendCrashRecordsToClickStreamTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.error_reporting.error_reporter.a> f144357a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f144358b;

    public C30088k0(dagger.internal.f fVar, Provider provider) {
        this.f144357a = provider;
        this.f144358b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.error_reporting.error_reporter.a aVar = this.f144357a.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f144358b.get();
        Z.f144213a.getClass();
        return new SendCrashRecordsToClickStreamTask(aVar, interfaceC28373a);
    }
}
