package com.avito.android.seller_coach.hints_dialog.provider;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HintDialogModule_ProvideItemBinder$_avito_seller_coach_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.seller_coach.hints_dialog.item.hint.c f267540a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.seller_coach.hints_dialog.item.header.c f267541b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.seller_coach.hints_dialog.item.empty_hints.c f267542c;

    public g(com.avito.android.seller_coach.hints_dialog.item.hint.c cVar, com.avito.android.seller_coach.hints_dialog.item.header.c cVar2, com.avito.android.seller_coach.hints_dialog.item.empty_hints.c cVar3) {
        this.f267540a = cVar;
        this.f267541b = cVar2;
        this.f267542c = cVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.seller_coach.hints_dialog.item.hint.b bVar = (com.avito.android.seller_coach.hints_dialog.item.hint.b) this.f267540a.get();
        com.avito.android.seller_coach.hints_dialog.item.header.b bVar2 = (com.avito.android.seller_coach.hints_dialog.item.header.b) this.f267541b.get();
        com.avito.android.seller_coach.hints_dialog.item.empty_hints.b bVar3 = (com.avito.android.seller_coach.hints_dialog.item.empty_hints.b) this.f267542c.get();
        c.f267533a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(bVar3);
        return c10493a.a();
    }
}
