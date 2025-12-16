package com.avito.android.contact_access.di.service;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ContactAccessServiceTrackerModule_ProvideScreenDiInjectTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<InterfaceC28499v> {

    /* renamed from: a, reason: collision with root package name */
    public final u f126119a;

    public d(u uVar) {
        this.f126119a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = (H) this.f126119a.get();
        int i12 = c.f126118a;
        InterfaceC28499v interfaceC28499vB = h12.b(H.a.f90737a);
        t.d(interfaceC28499vB);
        return interfaceC28499vB;
    }
}
