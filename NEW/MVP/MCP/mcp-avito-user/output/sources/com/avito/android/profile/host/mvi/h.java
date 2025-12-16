package com.avito.android.profile.host.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserProfileHostBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile.host.mvi.domain.f f222409a;

    public h(com.avito.android.profile.host.mvi.domain.f fVar) {
        this.f222409a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.profile.host.mvi.domain.e) this.f222409a.get());
    }
}
