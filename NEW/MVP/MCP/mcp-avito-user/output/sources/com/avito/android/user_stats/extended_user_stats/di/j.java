package com.avito.android.user_stats.extended_user_stats.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ExtendedUserStatsModule_ProvideItemBinder$_avito_user_stats_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.user_stats.extended_user_stats.list_search_dialog.item.b f317214a;

    public j(com.avito.android.user_stats.extended_user_stats.list_search_dialog.item.b bVar) {
        this.f317214a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.user_stats.extended_user_stats.list_search_dialog.item.a aVar = (com.avito.android.user_stats.extended_user_stats.list_search_dialog.item.a) this.f317214a.get();
        d.f317204a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
