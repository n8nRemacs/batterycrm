package com.avito.android.service_booking_common.blueprints.info_banner;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SbInfoBannerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f276429a;

    public b(u uVar) {
        this.f276429a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f276429a.get());
    }
}
