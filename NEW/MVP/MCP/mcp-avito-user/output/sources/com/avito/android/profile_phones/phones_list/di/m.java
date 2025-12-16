package com.avito.android.profile_phones.phones_list.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhonesListModule_ProvideDeviceCardBlueprint$_avito_profile_phones_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<com.avito.android.profile_phones.phones_list.device_list_item.a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f227715a;

    /* renamed from: b, reason: collision with root package name */
    public final u f227716b;

    public m(l lVar, u uVar) {
        this.f227715a = lVar;
        this.f227716b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile_phones.phones_list.device_list_item.c cVar = (com.avito.android.profile_phones.phones_list.device_list_item.c) this.f227716b.get();
        this.f227715a.getClass();
        return new com.avito.android.profile_phones.phones_list.device_list_item.a(cVar);
    }
}
