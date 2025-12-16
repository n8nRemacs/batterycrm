package com.avito.android.safedeal_checkout.delivery_universal_checkout;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryUniversalCheckoutIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f257061a;

    public l(C30102l3 c30102l3) {
        this.f257061a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((Context) this.f257061a.get());
    }
}
