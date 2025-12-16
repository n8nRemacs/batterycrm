package com.avito.android.wallet.page.topup.form.di;

import dagger.internal.y;

/* compiled from: TopUpFormModule_ProvideBubbleItemPresenterFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<com.avito.android.wallet.page.topup.form.items.bubble.e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f328276a;

    public j(dagger.internal.l lVar) {
        this.f328276a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.l lVar = (Y41.l) this.f328276a.f393949a;
        g.f328273a.getClass();
        return new com.avito.android.wallet.page.topup.form.items.bubble.g(lVar);
    }
}
