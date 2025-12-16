package com.avito.android.contact_access.di.access;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ContactAccessPackageTrackerModule_ProvideScreenDiInjectTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<InterfaceC28499v> {

    /* renamed from: a, reason: collision with root package name */
    public final u f126089a;

    public e(u uVar) {
        this.f126089a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = (H) this.f126089a.get();
        int i12 = d.f126088a;
        InterfaceC28499v interfaceC28499vB = h12.b(H.a.f90737a);
        t.d(interfaceC28499vB);
        return interfaceC28499vB;
    }
}
