package com.avito.android.vas_discount.v2.mvi;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasDiscountV2Actor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f319801a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.vas_discount.v2.domain.b f319802b;

    public b(l lVar, com.avito.android.vas_discount.v2.domain.b bVar) {
        this.f319801a = lVar;
        this.f319802b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((String) this.f319801a.f393949a, (com.avito.android.vas_discount.v2.domain.a) this.f319802b.get());
    }
}
