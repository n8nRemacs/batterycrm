package com.avito.android.passport.profile_add.create_flow.select_vertical.di;

import com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.C32963a;
import com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.C32964b;
import com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.j;
import com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.s;
import com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.t;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectVerticalModule_ProvideItemsBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f211900a;

    /* renamed from: b, reason: collision with root package name */
    public final t f211901b;

    /* renamed from: c, reason: collision with root package name */
    public final C32964b f211902c;

    public g(j jVar, t tVar, C32964b c32964b) {
        this.f211900a = jVar;
        this.f211901b = tVar;
        this.f211902c = c32964b;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.i iVar = (com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.i) this.f211900a.get();
        s sVar = (s) this.f211901b.get();
        C32963a c32963a = (C32963a) this.f211902c.get();
        c.f211894a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(iVar);
        c10493a.b(sVar);
        c10493a.b(c32963a);
        return c10493a.a();
    }
}
