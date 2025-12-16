package com.avito.android.vas_discount.v2.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasDiscountV2Reducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f319824a;

    public k(u uVar) {
        this.f319824a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.vas_discount.business.d) this.f319824a.get());
    }
}
