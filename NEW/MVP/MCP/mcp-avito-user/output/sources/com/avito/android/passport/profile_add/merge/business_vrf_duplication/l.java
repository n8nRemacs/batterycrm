package com.avito.android.passport.profile_add.merge.business_vrf_duplication;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BusinessVrfDuplicationViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.j f212504a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.create.business_vrf_duplication.mvi.j f212505b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f212506c;

    public l(com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.j jVar, com.avito.android.passport.profile_add.create.business_vrf_duplication.mvi.j jVar2, dagger.internal.l lVar) {
        this.f212504a = jVar;
        this.f212505b = jVar2;
        this.f212506c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k((com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.i) this.f212504a.get(), (com.avito.android.passport.profile_add.create.business_vrf_duplication.mvi.i) this.f212505b.get(), ((Boolean) this.f212506c.f393949a).booleanValue());
    }
}
