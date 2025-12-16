package com.avito.android.profile_phones.phones_list.actions.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneActionsModule_ProvideItemBinder$_avito_profile_phones_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f227494a;

    /* renamed from: b, reason: collision with root package name */
    public final u f227495b;

    public h(d dVar, u uVar) {
        this.f227494a = dVar;
        this.f227495b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.profile_phones.phones_list.actions.items.b bVar = (com.avito.android.profile_phones.phones_list.actions.items.b) this.f227495b.get();
        this.f227494a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        return c10493a.a();
    }
}
