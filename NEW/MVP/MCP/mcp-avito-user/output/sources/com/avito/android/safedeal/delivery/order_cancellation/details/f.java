package com.avito.android.safedeal.delivery.order_cancellation.details;

import com.avito.android.safedeal.delivery.order_cancellation.details.mvi.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReasonDetailsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final g f256202a;

    public f(g gVar) {
        this.f256202a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.safedeal.delivery.order_cancellation.details.mvi.f) this.f256202a.get(), null, 2, null);
    }
}
