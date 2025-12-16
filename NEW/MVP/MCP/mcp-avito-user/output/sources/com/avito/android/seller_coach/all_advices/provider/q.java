package com.avito.android.seller_coach.all_advices.provider;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;

/* compiled from: AllAdvicesModule_ProvideItemBinder$_avito_seller_coach_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class q implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.seller_coach.all_advices.item.b f267365a;

    public q(com.avito.android.seller_coach.all_advices.item.b bVar) {
        this.f267365a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.seller_coach.all_advices.item.a aVar = (com.avito.android.seller_coach.all_advices.item.a) this.f267365a.get();
        m.f267358a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
