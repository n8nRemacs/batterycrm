package com.avito.android.extended_profile_adverts;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: ProfileAdvertsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.extended_profile_adverts.mvi.j f150975a;

    public u(com.avito.android.extended_profile_adverts.mvi.j jVar) {
        this.f150975a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.extended_profile_adverts.mvi.i iVar = (com.avito.android.extended_profile_adverts.mvi.i) this.f150975a.get();
        i2.f411430a.getClass();
        return new t(iVar, i2.a.f411433c);
    }
}
