package com.avito.android.contact_access.di.service;

import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.H;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactAccessServiceTrackerModule_ProvidesScreenFlowTrackerProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f126123a;

    public g(Provider<H> provider) {
        this.f126123a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f126123a.get();
        int i12 = c.f126118a;
        o oVarA = h12.a();
        t.d(oVarA);
        return oVarA;
    }
}
