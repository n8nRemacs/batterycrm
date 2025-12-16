package com.avito.android.vas_planning_checkout.di;

import androidx.view.P0;
import com.avito.android.vas_planning_checkout.A;
import com.avito.android.vas_planning_checkout.E;
import com.avito.android.vas_planning_checkout.VasPlanCheckoutFragment;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasPlanCheckoutModule_ProvideVasPlanningViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f322876a;

    /* renamed from: b, reason: collision with root package name */
    public final u f322877b;

    public j(dagger.internal.l lVar, u uVar) {
        this.f322876a = lVar;
        this.f322877b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        VasPlanCheckoutFragment vasPlanCheckoutFragment = (VasPlanCheckoutFragment) this.f322876a.f393949a;
        P0.c cVar = (P0.c) this.f322877b.get();
        d dVar = d.f322869a;
        return (A) new P0(vasPlanCheckoutFragment, cVar).a(E.class);
    }
}
