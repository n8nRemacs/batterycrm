package com.avito.android.iac_dialer_watcher.impl_module.logging;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacLogObsolescenceImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f167881a;

    public i(u uVar) {
        this.f167881a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((k) this.f167881a.get());
    }
}
