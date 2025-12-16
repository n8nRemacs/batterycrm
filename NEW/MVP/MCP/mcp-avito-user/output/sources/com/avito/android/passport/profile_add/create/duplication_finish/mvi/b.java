package com.avito.android.passport.profile_add.create.duplication_finish.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BusinessVerificationDuplicationFinishActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.create.duplication_finish.domain.b f211311a;

    public b(com.avito.android.passport.profile_add.create.duplication_finish.domain.b bVar) {
        this.f211311a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.passport.profile_add.create.duplication_finish.domain.a) this.f211311a.get());
    }
}
