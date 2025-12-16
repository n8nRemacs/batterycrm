package com.avito.android.iac_dialer.impl_module.api;

import com.avito.android.iac_api_utils.util_module.i;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacDialerFinalLinkInteractorApiImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f165738a;

    /* renamed from: b, reason: collision with root package name */
    public final i f165739b;

    public c(u uVar, i iVar) {
        this.f165738a = uVar;
        this.f165739b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(dagger.internal.g.a(w.a(this.f165738a)), (com.avito.android.iac_api_utils.util_module.a) this.f165739b.get());
    }
}
