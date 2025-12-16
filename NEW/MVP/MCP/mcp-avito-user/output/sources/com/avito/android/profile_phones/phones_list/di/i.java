package com.avito.android.profile_phones.phones_list.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneProtectionModule_ProvidePhonesCardBlueprint$_avito_profile_phones_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<com.avito.android.phone_protection_info.item.a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f227713a;

    /* renamed from: b, reason: collision with root package name */
    public final u f227714b;

    public i(h hVar, u uVar) {
        this.f227713a = hVar;
        this.f227714b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.phone_protection_info.item.e eVar = (com.avito.android.phone_protection_info.item.e) this.f227714b.get();
        this.f227713a.getClass();
        return new com.avito.android.phone_protection_info.item.a(eVar);
    }
}
