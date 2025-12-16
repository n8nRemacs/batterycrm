package com.avito.android.installments.form.di;

import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.H;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InstallmentsFormTrackerModule_ProvideScreenFlowTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f172689a;

    public h(Provider<H> provider) {
        this.f172689a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f172689a.get();
        int i12 = f.f172687a;
        o oVarA = h12.a();
        t.d(oVarA);
        return oVarA;
    }
}
