package com.avito.android.vas_discount;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasDiscountIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f319678a;

    public k(C30102l3 c30102l3) {
        this.f319678a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((Context) this.f319678a.get());
    }
}
