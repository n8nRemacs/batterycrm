package com.avito.android.publish.di;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;

/* compiled from: PublishModule_ProvidesScreenDiInjectTracker$_avito_publish_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class G implements dagger.internal.h<InterfaceC28499v> {

    /* renamed from: a, reason: collision with root package name */
    public final C33824o f235141a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f235142b;

    public G(C33824o c33824o, dagger.internal.u uVar) {
        this.f235141a = c33824o;
        this.f235142b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.screens.tracker.H h12 = (com.avito.android.analytics.screens.tracker.H) this.f235142b.get();
        this.f235141a.getClass();
        InterfaceC28499v interfaceC28499vB = h12.b(H.a.f90737a);
        dagger.internal.t.d(interfaceC28499vB);
        return interfaceC28499vB;
    }
}
