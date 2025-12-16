package com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point;

import android.content.res.Resources;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FbsEntryPointResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f256322a;

    public d(l lVar) {
        this.f256322a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Resources) this.f256322a.f393949a);
    }
}
