package com.avito.android.vas_performance.di.competitive;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CompetitiveVasModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class r implements dagger.internal.h<com.avito.android.vas_performance.ui.competitive.p> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f319965a;

    /* renamed from: b, reason: collision with root package name */
    public final u f319966b;

    public r(dagger.internal.l lVar, u uVar) {
        this.f319965a = lVar;
        this.f319966b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f319965a.f393949a;
        P0.c cVar = (P0.c) this.f319966b.get();
        int i12 = p.f319962a;
        return (com.avito.android.vas_performance.ui.competitive.p) new P0(fragment, cVar).a(com.avito.android.vas_performance.ui.competitive.p.class);
    }
}
