package com.avito.android.safedeal.delivery.order_cancellation.konveyor;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ReasonItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f256367a;

    public c(f fVar) {
        this.f256367a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((e) this.f256367a.get());
    }
}
