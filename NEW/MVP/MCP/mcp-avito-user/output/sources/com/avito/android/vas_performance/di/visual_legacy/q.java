package com.avito.android.vas_performance.di.visual_legacy;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LegacyVisualVasModule_ProvideViewModel$_avito_vas_performance_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class q implements dagger.internal.h<com.avito.android.vas_performance.ui.visual_legacy.m> {

    /* renamed from: a, reason: collision with root package name */
    public final o f320198a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f320199b;

    /* renamed from: c, reason: collision with root package name */
    public final u f320200c;

    public q(o oVar, dagger.internal.l lVar, u uVar) {
        this.f320198a = oVar;
        this.f320199b = lVar;
        this.f320200c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f320199b.f393949a;
        P0.c cVar = (P0.c) this.f320200c.get();
        this.f320198a.getClass();
        return (com.avito.android.vas_performance.ui.visual_legacy.m) new P0(fragment, cVar).a(com.avito.android.vas_performance.ui.visual_legacy.p.class);
    }
}
