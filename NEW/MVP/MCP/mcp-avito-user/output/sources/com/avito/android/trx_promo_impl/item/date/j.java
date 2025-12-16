package com.avito.android.trx_promo_impl.item.date;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TrxPromoDatesPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f304256a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f304257b;

    public j(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f304256a = lVar;
        this.f304257b = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Y41.l) this.f304256a.f393949a, (Y41.l) this.f304257b.f393949a);
    }
}
