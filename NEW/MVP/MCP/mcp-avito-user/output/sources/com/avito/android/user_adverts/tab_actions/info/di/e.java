package com.avito.android.user_adverts.tab_actions.info.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserAdvertsActionResultInfoModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f314651a;

    public e(u uVar) {
        this.f314651a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f314651a.get();
        d.f314650a.getClass();
        return new com.avito.konveyor.adapter.d(new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null), aVar, null, 4, null);
    }
}
