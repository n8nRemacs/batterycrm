package com.avito.android.comfortable_deal.deal.di;

import Fp.C13824a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DealAdapterModule_ProvideDiffCalculatorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<com.avito.android.recycler.data_aware.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Fp.b f121057a;

    public e(Fp.b bVar) {
        this.f121057a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C13824a c13824a = (C13824a) this.f121057a.get();
        int i12 = b.f121052a;
        return new com.avito.android.recycler.data_aware.i(new com.avito.android.recycler.data_aware.g(), new com.avito.android.recycler.data_aware.j(), false, c13824a);
    }
}
