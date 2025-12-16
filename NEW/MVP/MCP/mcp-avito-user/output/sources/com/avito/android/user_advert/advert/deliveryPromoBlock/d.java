package com.avito.android.user_advert.advert.deliveryPromoBlock;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryPromoBlockInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f308890a;

    /* renamed from: b, reason: collision with root package name */
    public final u f308891b;

    public d(u uVar, u uVar2) {
        this.f308890a = uVar;
        this.f308891b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((R0) this.f308891b.get(), g.b(this.f308890a));
    }
}
