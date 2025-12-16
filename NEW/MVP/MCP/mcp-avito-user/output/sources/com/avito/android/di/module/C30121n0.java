package com.avito.android.di.module;

import com.avito.android.analytics_adjust.InterfaceC28533a;
import com.avito.android.app.task.UserIdentifierAnalyticsTask;
import javax.inject.Provider;

/* compiled from: AnalyticsTasksModule_ProvideUserIdentifierAnalyticsTaskFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.n0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30121n0 implements dagger.internal.h<UserIdentifierAnalyticsTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.error_reporting.error_reporter.n> f144462a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28533a> f144463b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f144464c;

    public C30121n0(Provider<com.avito.android.error_reporting.error_reporter.n> provider, Provider<InterfaceC28533a> provider2, Provider<com.avito.android.account.E> provider3) {
        this.f144462a = provider;
        this.f144463b = provider2;
        this.f144464c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.error_reporting.error_reporter.n nVar = this.f144462a.get();
        InterfaceC28533a interfaceC28533a = this.f144463b.get();
        com.avito.android.account.E e12 = this.f144464c.get();
        Z.f144213a.getClass();
        return new UserIdentifierAnalyticsTask(nVar, interfaceC28533a, e12);
    }
}
