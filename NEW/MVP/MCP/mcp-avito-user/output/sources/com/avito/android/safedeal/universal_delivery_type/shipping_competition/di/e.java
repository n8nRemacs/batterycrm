package com.avito.android.safedeal.universal_delivery_type.shipping_competition.di;

import com.avito.android.analytics.screens.UniversalDeliveryTypeScreen;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import java.util.Set;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47099b;

/* compiled from: UniversalDeliveryTypeShippingCompetitionModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f256795a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f256796b;

    /* renamed from: c, reason: collision with root package name */
    public final u f256797c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<a.b> f256798d;

    public e(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f256795a = provider;
        this.f256796b = provider2;
        this.f256797c = uVar;
        this.f256798d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((a.c.b) this.f256795a).f256790a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((a.c.C7698c) this.f256796b).get();
        Set set = (Set) this.f256797c.get();
        a.b bVar = (a.b) ((a.c.d) this.f256798d).get();
        d.f256794a.getClass();
        return d.a.a(dVarEl, aVar, bVar, C47099b.f428743a, set, null, null, new C42699b(UniversalDeliveryTypeScreen.f90537d.f90471b, Collections.singletonList(Owners.f210401E0), "UniversalDeliveryTypeShippingCompetition", false, 8, null), 48);
    }
}
