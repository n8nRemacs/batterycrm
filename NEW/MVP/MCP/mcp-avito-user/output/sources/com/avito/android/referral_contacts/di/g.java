package com.avito.android.referral_contacts.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReferralContactsModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f252444a;

    /* renamed from: b, reason: collision with root package name */
    public final e f252445b;

    public g(u uVar, e eVar) {
        this.f252444a = uVar;
        this.f252445b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f252444a.get();
        com.avito.konveyor.a aVar2 = (com.avito.konveyor.a) this.f252445b.get();
        d.f252441a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
