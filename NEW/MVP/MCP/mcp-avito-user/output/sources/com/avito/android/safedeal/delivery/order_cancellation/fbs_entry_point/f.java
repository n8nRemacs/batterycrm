package com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point;

import com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FbsEntryPointViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi.h f256333a;

    public f(com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi.h hVar) {
        this.f256333a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((g) this.f256333a.get(), null, 2, null);
    }
}
