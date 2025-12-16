package com.avito.android.advert_core.aler_banner;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AlertBannerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f82743a;

    public b(u uVar) {
        this.f82743a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f82743a.get());
    }
}
