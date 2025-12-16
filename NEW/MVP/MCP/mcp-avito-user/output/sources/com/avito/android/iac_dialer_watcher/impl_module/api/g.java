package com.avito.android.iac_dialer_watcher.impl_module.api;

import com.avito.android.remote.R0;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacDialerWatcherRetrofitApi_Module_ProvideIacDialerWatcherRetrofitApiFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f167789a;

    public g(dagger.internal.f fVar) {
        this.f167789a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f167789a.get();
        f.f167788a.getClass();
        e eVar = (e) r02.create(e.class);
        t.d(eVar);
        return eVar;
    }
}
