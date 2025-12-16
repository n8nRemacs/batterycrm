package com.avito.android.vas_performance.screens.visual.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VisualVasBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f321143a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f321144b;

    /* renamed from: c, reason: collision with root package name */
    public final u f321145c;

    public f(dagger.internal.l lVar, dagger.internal.l lVar2, u uVar) {
        this.f321143a = lVar;
        this.f321144b = lVar2;
        this.f321145c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((String) this.f321143a.f393949a, (String) this.f321144b.f393949a, (com.avito.android.vas_performance.screens.visual.mvi.domain.d) this.f321145c.get());
    }
}
