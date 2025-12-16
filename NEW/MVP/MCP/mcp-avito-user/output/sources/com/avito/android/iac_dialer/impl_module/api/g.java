package com.avito.android.iac_dialer.impl_module.api;

import com.avito.android.remote.R0;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacDialerFinalLinkInteractorRetrofitApi_Module_ProvideIacDialerFinalLinkInteractorRetrofitApiFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f165741a;

    public g(dagger.internal.f fVar) {
        this.f165741a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f165741a.get();
        f.f165740a.getClass();
        e eVar = (e) r02.create(e.class);
        t.d(eVar);
        return eVar;
    }
}
