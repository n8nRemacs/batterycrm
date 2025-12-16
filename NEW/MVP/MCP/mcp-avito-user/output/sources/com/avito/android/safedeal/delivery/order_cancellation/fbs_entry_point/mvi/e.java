package com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi;

import com.avito.android.remote.model.ReasonRds;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FbsEntryPointBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f256346a;

    /* renamed from: b, reason: collision with root package name */
    public final l f256347b;

    public e(l lVar, l lVar2) {
        this.f256346a = lVar;
        this.f256347b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((ReasonRds) this.f256346a.f393949a, (String) this.f256347b.f393949a);
    }
}
