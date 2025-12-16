package com.avito.android.vas_performance.di.perfomance;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PerformanceVasModuleNew_ProvideViewModel$_avito_vas_performance_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class r implements dagger.internal.h<com.avito.android.vas_performance.o> {

    /* renamed from: a, reason: collision with root package name */
    public final q f320049a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f320050b;

    /* renamed from: c, reason: collision with root package name */
    public final u f320051c;

    public r(q qVar, dagger.internal.l lVar, u uVar) {
        this.f320049a = qVar;
        this.f320050b = lVar;
        this.f320051c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f320050b.f393949a;
        P0.c cVar = (P0.c) this.f320051c.get();
        this.f320049a.getClass();
        return (com.avito.android.vas_performance.o) new P0(fragment, cVar).a(com.avito.android.vas_performance.ui.m.class);
    }
}
