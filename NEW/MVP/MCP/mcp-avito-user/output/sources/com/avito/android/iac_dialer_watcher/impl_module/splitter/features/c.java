package com.avito.android.iac_dialer_watcher.impl_module.splitter.features;

import com.avito.android.C34161r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacDialerWatcherFeaturesModule_ProvideIacDialerWatcherFeaturesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f168146a;

    public c(Provider<C34161r> provider) {
        this.f168146a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f168146a.get();
        b.f168145a.getClass();
        return (a) c34161r.f246393a.b(a.class);
    }
}
