package com.avito.android.credits.credit_partner_screen.di;

import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.H;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreditPartnerTrackerModule_ProvideScreenFlowTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f128796a;

    public g(Provider<H> provider) {
        this.f128796a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f128796a.get();
        int i12 = e.f128794a;
        o oVarA = h12.a();
        t.d(oVarA);
        return oVarA;
    }
}
