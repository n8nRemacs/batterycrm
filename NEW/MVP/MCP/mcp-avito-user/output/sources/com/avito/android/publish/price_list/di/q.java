package com.avito.android.publish.price_list.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectPriceListModule_ProvideIsSelectPriceListPublishStepFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class q implements dagger.internal.h<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f238521a;

    public q(dagger.internal.l lVar) {
        this.f238521a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Integer num = (Integer) this.f238521a.f393949a;
        n.f238518a.getClass();
        return Boolean.valueOf(num != null);
    }
}
