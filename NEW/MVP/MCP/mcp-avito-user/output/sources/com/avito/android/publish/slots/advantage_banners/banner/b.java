package com.avito.android.publish.slots.advantage_banners.banner;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvantageBannerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f242988a;

    public b(u uVar) {
        this.f242988a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f242988a.get());
    }
}
