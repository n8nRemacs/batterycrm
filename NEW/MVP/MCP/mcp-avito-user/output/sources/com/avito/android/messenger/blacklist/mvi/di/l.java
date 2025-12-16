package com.avito.android.messenger.blacklist.mvi.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BlacklistFragmentModule_ProvideListItemBinder$_avito_messenger_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f186426a;

    public l(u uVar) {
        this.f186426a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.b bVar = (com.avito.android.messenger.blacklist.mvi.adapter.blocked_user.b) this.f186426a.get();
        e.f186415a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(new com.avito.android.messenger.blacklist.mvi.adapter.pagination_in_progress.b(new com.avito.android.messenger.blacklist.mvi.adapter.pagination_in_progress.d()));
        return c10493a.a();
    }
}
