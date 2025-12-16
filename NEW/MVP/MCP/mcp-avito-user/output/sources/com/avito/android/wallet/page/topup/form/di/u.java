package com.avito.android.wallet.page.topup.form.di;

import dagger.internal.y;

/* compiled from: TopUpFormModule_ProvideShortcutSectionAdapterPresenterFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class u implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final s f328296a;

    public u(s sVar) {
        this.f328296a = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f328296a.get();
        g.f328273a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
