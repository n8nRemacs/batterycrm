package com.avito.android.advert_core.auto_select_banner;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoSelectBannerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f82903a;

    public b(u uVar) {
        this.f82903a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f82903a.get());
    }
}
