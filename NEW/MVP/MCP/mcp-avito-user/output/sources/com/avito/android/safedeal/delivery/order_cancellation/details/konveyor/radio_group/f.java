package com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.radio_group;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RadioGroupItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f256221a;

    /* renamed from: b, reason: collision with root package name */
    public final l f256222b;

    public f(l lVar, l lVar2) {
        this.f256221a = lVar;
        this.f256222b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.safedeal.delivery.order_cancellation.details.domain.a) this.f256221a.f393949a, (Integer) this.f256222b.f393949a);
    }
}
