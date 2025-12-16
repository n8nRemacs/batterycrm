package com.avito.android.advert.item.realty_imv;

import com.avito.android.advert.item.realty_imv.g;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RealtyImvBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f78325a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f78326b;

    public b(dagger.internal.f fVar, u uVar) {
        this.f78325a = uVar;
        this.f78326b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f78325a.get(), (g.c) this.f78326b.get());
    }
}
