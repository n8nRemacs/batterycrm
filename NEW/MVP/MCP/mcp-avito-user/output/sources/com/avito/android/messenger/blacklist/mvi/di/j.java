package com.avito.android.messenger.blacklist.mvi.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BlacklistFragmentModule_ProvideBlockedUserBlueprint$_avito_messenger_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f186424a;

    public j(u uVar) {
        this.f186424a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.e eVar = (com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.e) this.f186424a.get();
        e.f186415a.getClass();
        return new com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.b(eVar);
    }
}
