package com.avito.android.passport.profile_add.merge.code_request;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: CodeRequestViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.code_request.mvi.g f212896a;

    public o(com.avito.android.passport.profile_add.merge.code_request.mvi.g gVar) {
        this.f212896a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.passport.profile_add.merge.code_request.mvi.f fVar = (com.avito.android.passport.profile_add.merge.code_request.mvi.f) this.f212896a.get();
        i2.f411430a.getClass();
        return new n(fVar, i2.a.f411433c);
    }
}
