package com.avito.android.comfortable_deal.deal.di;

import androidx.recyclerview.widget.C;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DealAdapterModule_ProvideListUpdateCallbackFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f121059a;

    public g(dagger.internal.f fVar) {
        this.f121059a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f121059a.get();
        int i12 = b.f121052a;
        return jVar;
    }
}
