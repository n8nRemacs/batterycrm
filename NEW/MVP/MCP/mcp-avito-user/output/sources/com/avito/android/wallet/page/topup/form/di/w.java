package com.avito.android.wallet.page.topup.form.di;

import dagger.internal.y;

/* compiled from: TopUpFormModule_ProvideSubmitButtonBlueprintFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class w implements dagger.internal.h<com.avito.android.wallet.page.topup.form.items.submit_button_item.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f328299a;

    public w(dagger.internal.u uVar) {
        this.f328299a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.wallet.page.topup.form.items.submit_button_item.e eVar = (com.avito.android.wallet.page.topup.form.items.submit_button_item.e) this.f328299a.get();
        g.f328273a.getClass();
        return new com.avito.android.wallet.page.topup.form.items.submit_button_item.a(eVar);
    }
}
