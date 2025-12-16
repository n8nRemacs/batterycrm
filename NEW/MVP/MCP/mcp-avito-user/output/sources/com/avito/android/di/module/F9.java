package com.avito.android.di.module;

import android.app.Application;
import com.avito.android.di.C29972i;
import com.avito.android.di.component.M;
import com.avito.android.service.short_task.ShortTask;

/* compiled from: ShortTaskModule_ProvideSendMetricTaskFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class F9 implements dagger.internal.h<ShortTask> {

    /* renamed from: a, reason: collision with root package name */
    public final C30261z9 f143957a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f143958b;

    public F9(C30261z9 c30261z9, dagger.internal.l lVar) {
        this.f143957a = c30261z9;
        this.f143958b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f143958b.f393949a;
        this.f143957a.getClass();
        M.a aVarA = com.avito.android.di.component.z.a();
        aVarA.a((com.avito.android.di.N) C29972i.a(C29972i.b(application), com.avito.android.di.N.class));
        return aVarA.build().a();
    }
}
