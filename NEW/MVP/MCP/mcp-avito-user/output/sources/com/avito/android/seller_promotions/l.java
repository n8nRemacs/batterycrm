package com.avito.android.seller_promotions;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SellerPromotionsIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f267872a;

    public l(C30102l3 c30102l3) {
        this.f267872a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((Context) this.f267872a.get());
    }
}
