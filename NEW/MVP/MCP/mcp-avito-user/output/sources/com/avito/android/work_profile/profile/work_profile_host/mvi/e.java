package com.avito.android.work_profile.profile.work_profile_host.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WorkProfileHostBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f331276a;

    public e(u uVar) {
        this.f331276a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.work_profile.domain.g) this.f331276a.get());
    }
}
