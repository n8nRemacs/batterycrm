package com.avito.android.passport.profile_add.merge.profiles_list;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: ProfilesListViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.profiles_list.mvi.l f213347a;

    public t(com.avito.android.passport.profile_add.merge.profiles_list.mvi.l lVar) {
        this.f213347a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.passport.profile_add.merge.profiles_list.mvi.k kVar = (com.avito.android.passport.profile_add.merge.profiles_list.mvi.k) this.f213347a.get();
        i2.f411430a.getClass();
        return new s(kVar, i2.a.f411433c);
    }
}
