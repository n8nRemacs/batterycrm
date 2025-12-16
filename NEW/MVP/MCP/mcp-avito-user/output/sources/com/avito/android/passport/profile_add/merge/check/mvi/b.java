package com.avito.android.passport.profile_add.merge.check.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CheckMergePossibilityActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.domain.i f212650a;

    public b(com.avito.android.passport.profile_add.merge.domain.i iVar) {
        this.f212650a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.passport.profile_add.merge.domain.a) this.f212650a.get());
    }
}
