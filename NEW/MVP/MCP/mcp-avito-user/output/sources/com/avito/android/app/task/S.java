package com.avito.android.app.task;

import com.avito.android.di.module.C30066i0;

/* compiled from: LeakCanaryReleaseTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class S implements dagger.internal.h<LeakCanaryReleaseTask> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.K1 f91514a;

    /* renamed from: b, reason: collision with root package name */
    public final C30066i0 f91515b;

    public S(com.avito.android.K1 k12, C30066i0 c30066i0) {
        this.f91514a = k12;
        this.f91515b = c30066i0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new LeakCanaryReleaseTask((com.avito.android.I1) this.f91514a.get(), (com.avito.android.leakcanary.release.f) this.f91515b.get());
    }
}
