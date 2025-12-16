package com.avito.android.profile_phones.phones_list.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhonesListModule_ProvidePhonesCardBlueprint$_avito_profile_phones_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class s implements dagger.internal.h<com.avito.android.profile_phones.phones_list.phone_item.b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f227729a;

    /* renamed from: b, reason: collision with root package name */
    public final u f227730b;

    public s(l lVar, u uVar) {
        this.f227729a = lVar;
        this.f227730b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile_phones.phones_list.phone_item.c cVar = (com.avito.android.profile_phones.phones_list.phone_item.c) this.f227730b.get();
        this.f227729a.getClass();
        return new com.avito.android.profile_phones.phones_list.phone_item.b(cVar);
    }
}
