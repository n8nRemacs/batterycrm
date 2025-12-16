package com.avito.android.developments_agency_search.adapter.commission_promo_banner.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CommissionPromoBannerAnalyticsInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f136236a;

    public c(u uVar) {
        this.f136236a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC28373a) this.f136236a.get());
    }
}
