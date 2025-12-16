package com.avito.android.referral_contacts.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReferralContactsModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.referral_contacts.contacts_list.b f252442a;

    public e(com.avito.android.referral_contacts.contacts_list.b bVar) {
        this.f252442a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.referral_contacts.contacts_list.a aVar = (com.avito.android.referral_contacts.contacts_list.a) this.f252442a.get();
        d.f252441a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
