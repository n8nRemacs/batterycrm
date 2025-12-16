package com.avito.android.seller_coach.hints_dialog.provider;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HintDialogModule_ProvideRecyclerAdapter$_avito_seller_coach_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f267547a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f267548b;

    public j(u uVar, Provider provider) {
        this.f267547a = uVar;
        this.f267548b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f267547a.get();
        com.avito.konveyor.a aVar2 = this.f267548b.get();
        c.f267533a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
