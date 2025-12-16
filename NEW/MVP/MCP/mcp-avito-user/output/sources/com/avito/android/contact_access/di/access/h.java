package com.avito.android.contact_access.di.access;

import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.H;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactAccessPackageTrackerModule_ProvidesScreenFlowTrackerProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f126093a;

    public h(Provider<H> provider) {
        this.f126093a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f126093a.get();
        int i12 = d.f126088a;
        o oVarA = h12.a();
        t.d(oVarA);
        return oVarA;
    }
}
