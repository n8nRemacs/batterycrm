package com.avito.android.str_insurance.screen.di;

import com.avito.android.analytics.screens.tracker.H;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrInsuranceFragmentTrackerModule_ProvideScreenFlowTrackerProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<com.avito.android.analytics.screens.o> {

    /* renamed from: a, reason: collision with root package name */
    public final h f288709a;

    /* renamed from: b, reason: collision with root package name */
    public final u f288710b;

    public k(h hVar, u uVar) {
        this.f288709a = hVar;
        this.f288710b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = (H) this.f288710b.get();
        this.f288709a.getClass();
        com.avito.android.analytics.screens.o oVarA = h12.a();
        t.d(oVarA);
        return oVarA;
    }
}
