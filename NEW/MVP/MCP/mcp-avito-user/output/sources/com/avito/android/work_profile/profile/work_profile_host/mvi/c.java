package com.avito.android.work_profile.profile.work_profile_host.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WorkProfileHostActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final YP0.e f331273a;

    /* renamed from: b, reason: collision with root package name */
    public final u f331274b;

    public c(YP0.e eVar, u uVar) {
        this.f331273a = eVar;
        this.f331274b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((YP0.d) this.f331273a.get(), (com.avito.android.work_profile.domain.g) this.f331274b.get());
    }
}
