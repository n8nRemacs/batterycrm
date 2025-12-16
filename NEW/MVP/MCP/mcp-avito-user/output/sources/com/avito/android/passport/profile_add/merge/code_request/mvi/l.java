package com.avito.android.passport.profile_add.merge.code_request.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConfirmOwnershipActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.domain.i f212895a;

    public l(com.avito.android.passport.profile_add.merge.domain.i iVar) {
        this.f212895a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.passport.profile_add.merge.domain.a) this.f212895a.get());
    }
}
