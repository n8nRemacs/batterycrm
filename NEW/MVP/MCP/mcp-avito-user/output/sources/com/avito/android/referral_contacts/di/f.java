package com.avito.android.referral_contacts.di;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReferralContactsModule_ProvideListAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f252443a;

    public f(e eVar) {
        this.f252443a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f252443a.get();
        d.f252441a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
