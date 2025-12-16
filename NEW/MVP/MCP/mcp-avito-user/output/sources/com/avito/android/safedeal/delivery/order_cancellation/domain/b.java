package com.avito.android.safedeal.delivery.order_cancellation.domain;

import com.avito.android.safedeal.delivery.order_cancellation.i;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GetReasonsUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f256293a;

    /* renamed from: b, reason: collision with root package name */
    public final u f256294b;

    /* renamed from: c, reason: collision with root package name */
    public final i f256295c;

    public b(l lVar, u uVar, i iVar) {
        this.f256293a = lVar;
        this.f256294b = uVar;
        this.f256295c = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str = (String) this.f256293a.f393949a;
        com.avito.android.safedeal.delivery.order_cancellation.data.a aVar = (com.avito.android.safedeal.delivery.order_cancellation.data.a) this.f256294b.get();
        this.f256295c.getClass();
        return new a(str, aVar, new com.avito.android.safedeal.delivery.order_cancellation.h());
    }
}
