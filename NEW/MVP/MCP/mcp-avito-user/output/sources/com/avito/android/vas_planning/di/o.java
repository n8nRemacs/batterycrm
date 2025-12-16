package com.avito.android.vas_planning.di;

import androidx.view.P0;
import com.avito.android.vas_planning.VasPlanningFragment;
import com.avito.android.vas_planning.q;
import com.avito.android.vas_planning.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasPlanningModule_ProvideVasPlanningViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class o implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f322305a;

    /* renamed from: b, reason: collision with root package name */
    public final u f322306b;

    public o(dagger.internal.l lVar, u uVar) {
        this.f322305a = lVar;
        this.f322306b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        VasPlanningFragment vasPlanningFragment = (VasPlanningFragment) this.f322305a.f393949a;
        P0.c cVar = (P0.c) this.f322306b.get();
        h hVar = h.f322295a;
        return (q) new P0(vasPlanningFragment, cVar).a(t.class);
    }
}
