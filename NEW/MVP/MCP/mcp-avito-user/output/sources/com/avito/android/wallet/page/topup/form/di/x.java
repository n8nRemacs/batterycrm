package com.avito.android.wallet.page.topup.form.di;

import dagger.internal.y;

/* compiled from: TopUpFormModule_ProvideSubmitButtonItemPresenterFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class x implements dagger.internal.h<com.avito.android.wallet.page.topup.form.items.submit_button_item.e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f328300a;

    public x(dagger.internal.l lVar) {
        this.f328300a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.a aVar = (Y41.a) this.f328300a.f393949a;
        g.f328273a.getClass();
        return new com.avito.android.wallet.page.topup.form.items.submit_button_item.e(new h(aVar));
    }
}
