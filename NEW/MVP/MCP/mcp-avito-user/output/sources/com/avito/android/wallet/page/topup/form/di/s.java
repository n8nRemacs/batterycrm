package com.avito.android.wallet.page.topup.form.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.y;

/* compiled from: TopUpFormModule_ProvideRecommendationSectionItemBinderFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class s implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.wallet.page.topup.form.items.bubble.c f328293a;

    public s(com.avito.android.wallet.page.topup.form.items.bubble.c cVar) {
        this.f328293a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.wallet.page.topup.form.items.bubble.b bVar = (com.avito.android.wallet.page.topup.form.items.bubble.b) this.f328293a.get();
        g.f328273a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        return c10493a.a();
    }
}
