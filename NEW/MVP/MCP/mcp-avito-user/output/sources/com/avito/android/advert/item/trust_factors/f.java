package com.avito.android.advert.item.trust_factors;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DeliveryTrustFactorsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f80629a;

    public f(dagger.internal.f fVar) {
        this.f80629a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((i) this.f80629a.get());
    }
}
