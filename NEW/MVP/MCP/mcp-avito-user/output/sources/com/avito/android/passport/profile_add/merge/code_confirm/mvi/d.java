package com.avito.android.passport.profile_add.merge.code_confirm.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CodeConfirmActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.domain.i f212745a;

    public d(com.avito.android.passport.profile_add.merge.domain.i iVar) {
        this.f212745a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.passport.profile_add.merge.domain.a) this.f212745a.get());
    }
}
