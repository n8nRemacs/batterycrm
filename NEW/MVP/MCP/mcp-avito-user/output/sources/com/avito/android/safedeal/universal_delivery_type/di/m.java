package com.avito.android.safedeal.universal_delivery_type.di;

import com.avito.android.analytics.screens.UniversalDeliveryTypeScreen;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import com.avito.android.safedeal.universal_delivery_type.di.a;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import java.util.Set;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47099b;

/* compiled from: UniversalDeliveryTypeModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final k f256602a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<gj.d> f256603b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f256604c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f256605d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<a.b> f256606e;

    public m(k kVar, Provider provider, Provider provider2, dagger.internal.u uVar, Provider provider3) {
        this.f256602a = kVar;
        this.f256603b = provider;
        this.f256604c = provider2;
        this.f256605d = uVar;
        this.f256606e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((a.c.C7687a) this.f256603b).f256588a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((a.c.C7688c) this.f256604c).get();
        Set set = (Set) this.f256605d.get();
        a.b bVar = (a.b) ((a.c.d) this.f256606e).get();
        this.f256602a.getClass();
        return d.a.a(dVarEl, aVar, bVar, C47099b.f428743a, set, null, null, new C42699b(UniversalDeliveryTypeScreen.f90537d.f90471b, Collections.singletonList(Owners.f210401E0), "UniversalDeliveryType", false, 8, null), 48);
    }
}
