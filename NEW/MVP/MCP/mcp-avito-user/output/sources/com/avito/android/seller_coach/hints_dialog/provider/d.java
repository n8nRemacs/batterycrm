package com.avito.android.seller_coach.hints_dialog.provider;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HintDialogModule_ProvideAdapterPresenter$_avito_seller_coach_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f267534a;

    public d(u uVar) {
        this.f267534a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f267534a.get();
        c.f267533a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
