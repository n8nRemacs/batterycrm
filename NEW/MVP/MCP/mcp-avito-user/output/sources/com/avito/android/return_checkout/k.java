package com.avito.android.return_checkout;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryReturnCheckoutIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f255307a;

    public k(C30102l3 c30102l3) {
        this.f255307a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((Context) this.f255307a.get());
    }
}
