package com.avito.android.vas_discount.v2.mvi;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasDiscountV2Bootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f319805a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.vas_discount.v2.domain.b f319806b;

    public d(l lVar, com.avito.android.vas_discount.v2.domain.b bVar) {
        this.f319805a = lVar;
        this.f319806b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((String) this.f319805a.f393949a, (com.avito.android.vas_discount.v2.domain.a) this.f319806b.get());
    }
}
