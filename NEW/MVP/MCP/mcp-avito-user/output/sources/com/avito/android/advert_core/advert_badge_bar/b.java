package com.avito.android.advert_core.advert_badge_bar;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertBadgeBarBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f82720a;

    public b(u uVar) {
        this.f82720a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f82720a.get());
    }
}
