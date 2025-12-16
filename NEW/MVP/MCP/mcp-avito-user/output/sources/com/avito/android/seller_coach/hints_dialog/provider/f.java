package com.avito.android.seller_coach.hints_dialog.provider;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HintDialogModule_ProvideDiffCalculator$_avito_seller_coach_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.seller_coach.hints_dialog.item.b f267538a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.seller_coach.hints_dialog.item.d f267539b;

    public f(com.avito.android.seller_coach.hints_dialog.item.b bVar, com.avito.android.seller_coach.hints_dialog.item.d dVar) {
        this.f267538a = bVar;
        this.f267539b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f267538a.getClass();
        com.avito.android.seller_coach.hints_dialog.item.a aVar = new com.avito.android.seller_coach.hints_dialog.item.a();
        this.f267539b.getClass();
        com.avito.android.seller_coach.hints_dialog.item.c cVar = new com.avito.android.seller_coach.hints_dialog.item.c();
        c.f267533a.getClass();
        return new com.avito.android.recycler.data_aware.i(aVar, null, false, cVar, 2, null);
    }
}
