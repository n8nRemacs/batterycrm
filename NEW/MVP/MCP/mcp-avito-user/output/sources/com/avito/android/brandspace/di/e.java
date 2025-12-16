package com.avito.android.brandspace.di;

import com.avito.android.analytics.screens.BrandspaceScreen;
import com.avito.android.brandspace.di.q;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import javax.inject.Provider;
import kj.C42699b;
import pk.InterfaceC47104b;

/* compiled from: BrandspaceFragmentModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f107681a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f107682b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f107683c;

    /* renamed from: d, reason: collision with root package name */
    public final u f107684d;

    public e(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f107681a = provider;
        this.f107682b = provider2;
        this.f107683c = provider3;
        this.f107684d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((q.b.a) this.f107681a).f107728a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((q.b.d) this.f107682b).get();
        a.b bVar = (a.b) ((q.b.e) this.f107683c).get();
        InterfaceC47104b interfaceC47104b = (InterfaceC47104b) this.f107684d.get();
        d.f107680a.getClass();
        BrandspaceScreen brandspaceScreen = BrandspaceScreen.f90302d;
        InterfaceC40691b interfaceC40691bA = d.a.a(dVarEl, aVar, bVar, interfaceC47104b, null, null, null, new C42699b(brandspaceScreen.f90471b, Collections.singletonList(Owners.f210488g), "Brandspace", false, 8, null), 56);
        ((com.avito.android.beduin.context.c) interfaceC40691bA).g(brandspaceScreen);
        return interfaceC40691bA;
    }
}
