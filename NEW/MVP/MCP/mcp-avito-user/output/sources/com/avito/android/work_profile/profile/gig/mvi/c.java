package com.avito.android.work_profile.profile.gig.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f331130a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f331131b;

    public c(u uVar, Provider provider) {
        this.f331130a = uVar;
        this.f331131b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.work_profile.domain.d) this.f331130a.get(), this.f331131b.get());
    }
}
