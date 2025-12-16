package com.avito.android.credits.credit_partner_screen.di;

import com.avito.android.analytics.screens.CreditPartner;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.credits.credit_partner_screen.di.j;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreditPartnerTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f128798a;

    /* renamed from: b, reason: collision with root package name */
    public final l f128799b;

    public i(l lVar, Provider provider) {
        this.f128798a = provider;
        this.f128799b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((j.b.C3818b) this.f128798a).get();
        r rVar = (r) this.f128799b.f393949a;
        int i12 = e.f128794a;
        return interfaceC28481c.b(CreditPartner.f90333d, rVar);
    }
}
