package com.avito.android.iac_dialer_watcher.impl_module.api;

import com.avito.android.iac_api_utils.util_module.i;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacDialerWatcherApiImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f167786a;

    /* renamed from: b, reason: collision with root package name */
    public final i f167787b;

    public c(u uVar, i iVar) {
        this.f167786a = uVar;
        this.f167787b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(dagger.internal.g.a(w.a(this.f167786a)), (com.avito.android.iac_api_utils.util_module.a) this.f167787b.get());
    }
}
