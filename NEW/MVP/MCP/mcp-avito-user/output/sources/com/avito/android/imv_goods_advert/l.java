package com.avito.android.imv_goods_advert;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImvGoodsAdvertIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f170535a;

    public l(C30102l3 c30102l3) {
        this.f170535a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((Context) this.f170535a.get());
    }
}
