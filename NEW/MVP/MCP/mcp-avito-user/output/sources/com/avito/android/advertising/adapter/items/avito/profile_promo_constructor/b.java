package com.avito.android.advertising.adapter.items.avito.profile_promo_constructor;

import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfilePromoConstructorGridBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f87180a;

    /* renamed from: b, reason: collision with root package name */
    public final l f87181b;

    public b(l lVar, u uVar) {
        this.f87180a = uVar;
        this.f87181b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f87180a.get(), (com.avito.android.advertising.a) this.f87181b.f393949a);
    }
}
