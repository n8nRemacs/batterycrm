package com.avito.android.passport.profile_add.create_flow.select_specific.di;

import com.avito.android.passport.profile_add.create_flow.select_specific.recycler.C32959a;
import com.avito.android.passport.profile_add.create_flow.select_specific.recycler.C32960b;
import com.avito.android.passport.profile_add.create_flow.select_specific.recycler.j;
import com.avito.android.passport.profile_add.create_flow.select_specific.recycler.s;
import com.avito.android.passport.profile_add.create_flow.select_specific.recycler.t;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectSpecificModule_ProvideItemsBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f211708a;

    /* renamed from: b, reason: collision with root package name */
    public final t f211709b;

    /* renamed from: c, reason: collision with root package name */
    public final C32960b f211710c;

    public g(j jVar, t tVar, C32960b c32960b) {
        this.f211708a = jVar;
        this.f211709b = tVar;
        this.f211710c = c32960b;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.passport.profile_add.create_flow.select_specific.recycler.i iVar = (com.avito.android.passport.profile_add.create_flow.select_specific.recycler.i) this.f211708a.get();
        s sVar = (s) this.f211709b.get();
        C32959a c32959a = (C32959a) this.f211710c.get();
        c.f211702a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(iVar);
        c10493a.b(sVar);
        c10493a.b(c32959a);
        return c10493a.a();
    }
}
