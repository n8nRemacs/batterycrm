package com.avito.android.safedeal.universal_delivery_type.courier.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import com.avito.android.safedeal.universal_delivery_type.courier.di.b;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47099b;

/* compiled from: UniversalDeliveryTypeCourierModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f256493a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f256494b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f256495c;

    /* renamed from: d, reason: collision with root package name */
    public final l f256496d;

    public e(l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f256493a = provider;
        this.f256494b = provider2;
        this.f256495c = provider3;
        this.f256496d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((b.C7682b.C7683b) this.f256493a).f256488a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((b.C7682b.c) this.f256494b).get();
        a.b bVar = (a.b) ((b.C7682b.d) this.f256495c).get();
        C28478k c28478k = (C28478k) this.f256496d.f393949a;
        d.f256492a.getClass();
        return d.a.a(dVarEl, aVar, bVar, C47099b.f428743a, null, null, null, new C42699b(c28478k.f90636a.f90471b, Collections.singletonList(Owners.f210401E0), "UniversalDeliveryTypeCourier", false, 8, null), 56);
    }
}
