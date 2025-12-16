package com.avito.android.favorite_sellers.service;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FavoriteSellerServiceIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f156125a;

    public j(C30102l3 c30102l3) {
        this.f156125a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Context) this.f156125a.get());
    }
}
