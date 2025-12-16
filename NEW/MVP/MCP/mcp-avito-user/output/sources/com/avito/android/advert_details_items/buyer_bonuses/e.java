package com.avito.android.advert_details_items.buyer_bonuses;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BuyerBonusesPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f84485a;

    public e(u uVar) {
        this.f84485a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.deeplink_handler.handler.composite.a) this.f84485a.get());
    }
}
