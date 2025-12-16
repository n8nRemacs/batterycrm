package com.avito.android.advert_core.development_offers;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DevelopmentOffersItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f83330a;

    public d(u uVar) {
        this.f83330a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((f) this.f83330a.get());
    }
}
