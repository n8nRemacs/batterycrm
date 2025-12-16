package com.avito.android.passport.profile_add.merge.select_business_vrf;

import com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.C32968a;
import com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.C32969b;
import com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.u;
import com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.v;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectBusinessVrfModule_ProvideItemsBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.n f213405a;

    /* renamed from: b, reason: collision with root package name */
    public final v f213406b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.h f213407c;

    /* renamed from: d, reason: collision with root package name */
    public final C32969b f213408d;

    public h(com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.n nVar, v vVar, com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.h hVar, C32969b c32969b) {
        this.f213405a = nVar;
        this.f213406b = vVar;
        this.f213407c = hVar;
        this.f213408d = c32969b;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.m mVar = (com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.m) this.f213405a.get();
        u uVar = (u) this.f213406b.get();
        com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.g gVar = (com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.g) this.f213407c.get();
        C32968a c32968a = (C32968a) this.f213408d.get();
        e.f213400a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(mVar);
        c10493a.b(uVar);
        c10493a.b(gVar);
        c10493a.b(c32968a);
        return c10493a.a();
    }
}
