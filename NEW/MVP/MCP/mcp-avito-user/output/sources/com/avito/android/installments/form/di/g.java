package com.avito.android.installments.form.di;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InstallmentsFormTrackerModule_ProvideScreenDiInjectTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<InterfaceC28499v> {

    /* renamed from: a, reason: collision with root package name */
    public final u f172688a;

    public g(u uVar) {
        this.f172688a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = (H) this.f172688a.get();
        int i12 = f.f172687a;
        InterfaceC28499v interfaceC28499vB = h12.b(H.a.f90737a);
        t.d(interfaceC28499vB);
        return interfaceC28499vB;
    }
}
