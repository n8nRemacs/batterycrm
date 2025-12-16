package com.avito.android.profile_phones.phones_list.actions.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneActionsModule_ProvideActionItemBlueprint$_avito_profile_phones_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<com.avito.android.profile_phones.phones_list.actions.items.b> {

    /* renamed from: a, reason: collision with root package name */
    public final d f227487a;

    /* renamed from: b, reason: collision with root package name */
    public final u f227488b;

    public e(d dVar, u uVar) {
        this.f227487a = dVar;
        this.f227488b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile_phones.phones_list.actions.items.d dVar = (com.avito.android.profile_phones.phones_list.actions.items.d) this.f227488b.get();
        this.f227487a.getClass();
        return new com.avito.android.profile_phones.phones_list.actions.items.b(dVar);
    }
}
