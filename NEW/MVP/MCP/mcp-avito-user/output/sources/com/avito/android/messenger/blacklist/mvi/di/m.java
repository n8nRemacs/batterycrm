package com.avito.android.messenger.blacklist.mvi.di;

import com.avito.android.messenger.blacklist.mvi.G;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BlacklistFragmentModule_ProvideUnblockClickListener$_avito_messenger_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f186427a;

    public m(u uVar) {
        this.f186427a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        G g12 = (G) this.f186427a.get();
        e.f186415a.getClass();
        return g12;
    }
}
