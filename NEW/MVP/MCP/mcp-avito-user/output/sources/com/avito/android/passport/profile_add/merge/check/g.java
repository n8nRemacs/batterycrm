package com.avito.android.passport.profile_add.merge.check;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: CheckMergePossibilityViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.check.mvi.i f212625a;

    public g(com.avito.android.passport.profile_add.merge.check.mvi.i iVar) {
        this.f212625a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.passport.profile_add.merge.check.mvi.h hVar = (com.avito.android.passport.profile_add.merge.check.mvi.h) this.f212625a.get();
        i2.f411430a.getClass();
        return new f(hVar, i2.a.f411433c);
    }
}
