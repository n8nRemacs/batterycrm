package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxPromoGeoAnalyticsImpl_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f127791a;

    /* renamed from: b, reason: collision with root package name */
    public final l f127792b;

    public c(l lVar, u uVar) {
        this.f127791a = uVar;
        this.f127792b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC28373a) this.f127791a.get(), (String) this.f127792b.f393949a);
    }
}
