package com.avito.android.advert.item.additionalSeller;

import com.avito.android.advert.item.additionalSeller.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdditionalSellerFeaturesBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f72612a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f72613b;

    public p(dagger.internal.f fVar, dagger.internal.u uVar) {
        this.f72612a = uVar;
        this.f72613b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((q) this.f72612a.get(), (t.b) this.f72613b.get());
    }
}
