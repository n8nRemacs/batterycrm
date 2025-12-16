package com.avito.android.profile_phones.phones_list.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhonesListModule_ProvidePhonesItemBinder$_avito_profile_phones_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class t implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f227731a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.profile_phones.phones_list.phone_item.b> f227732b;

    /* renamed from: c, reason: collision with root package name */
    public final u f227733c;

    public t(l lVar, u uVar, Provider provider) {
        this.f227731a = lVar;
        this.f227732b = provider;
        this.f227733c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.profile_phones.phones_list.phone_item.b bVar = this.f227732b.get();
        com.avito.android.phone_protection_info.item.a aVar = (com.avito.android.phone_protection_info.item.a) this.f227733c.get();
        this.f227731a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(aVar);
        return c10493a.a();
    }
}
