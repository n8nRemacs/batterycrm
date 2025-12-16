package com.avito.android.analytics.coverage;

import android.app.Application;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PerformanceScreenCoverageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f89879a;

    /* renamed from: b, reason: collision with root package name */
    public final u f89880b;

    public f(l lVar, u uVar) {
        this.f89879a = lVar;
        this.f89880b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Application) this.f89879a.f393949a, (a) this.f89880b.get());
    }
}
