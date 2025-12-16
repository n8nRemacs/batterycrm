package com.avito.android.messenger.blacklist.mvi.di;

import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BlacklistFragmentModule_ProvideBlockedUserPresenter$_avito_messenger_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f186425a;

    public k(u uVar) {
        this.f186425a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = dagger.internal.g.a(w.a(this.f186425a));
        e.f186415a.getClass();
        return new com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.e(eVarA);
    }
}
