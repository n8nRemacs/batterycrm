package com.avito.android.user_advert.advert.items.geo_references;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GeoReferenceItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f309454a;

    public c(u uVar) {
        this.f309454a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f309454a.get());
    }
}
