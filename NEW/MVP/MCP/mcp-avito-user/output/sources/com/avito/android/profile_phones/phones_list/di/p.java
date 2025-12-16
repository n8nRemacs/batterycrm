package com.avito.android.profile_phones.phones_list.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhonesListModule_ProvideDevicesItemBinder$_avito_profile_phones_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f227722a;

    /* renamed from: b, reason: collision with root package name */
    public final u f227723b;

    public p(l lVar, u uVar) {
        this.f227722a = lVar;
        this.f227723b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.profile_phones.phones_list.device_list_item.a aVar = (com.avito.android.profile_phones.phones_list.device_list_item.a) this.f227723b.get();
        this.f227722a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
