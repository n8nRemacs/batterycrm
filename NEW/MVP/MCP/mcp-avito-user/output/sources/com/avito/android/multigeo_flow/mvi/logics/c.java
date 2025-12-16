package com.avito.android.multigeo_flow.mvi.logics;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobMultiGeoActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f207019a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f207020b;

    public c(u uVar, Provider provider) {
        this.f207019a = uVar;
        this.f207020b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.multigeo_flow.domain.b) this.f207019a.get(), this.f207020b.get());
    }
}
