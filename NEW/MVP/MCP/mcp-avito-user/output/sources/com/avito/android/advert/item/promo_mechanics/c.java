package com.avito.android.advert.item.promo_mechanics;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PromoMechanicsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f78260a;

    public c(u uVar) {
        this.f78260a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a) this.f78260a.get());
    }
}
