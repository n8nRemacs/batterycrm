package com.avito.android.passport.profile_add.create.duplication_finish.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BusinessVerificationDuplicationFinishBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.create.duplication_finish.domain.b f211313a;

    public d(com.avito.android.passport.profile_add.create.duplication_finish.domain.b bVar) {
        this.f211313a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.passport.profile_add.create.duplication_finish.domain.a) this.f211313a.get());
    }
}
