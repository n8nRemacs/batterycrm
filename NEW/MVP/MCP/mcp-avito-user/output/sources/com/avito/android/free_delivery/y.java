package com.avito.android.free_delivery;

import android.content.Context;
import com.avito.android.di.module.C30102l3;

/* compiled from: FreeDeliveryIntentFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class y implements dagger.internal.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f158932a;

    public y(C30102l3 c30102l3) {
        this.f158932a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new x((Context) this.f158932a.get());
    }
}
