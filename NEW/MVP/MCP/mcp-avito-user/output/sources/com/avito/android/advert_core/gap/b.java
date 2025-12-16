package com.avito.android.advert_core.gap;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsGapBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f83677a;

    public b(u uVar) {
        this.f83677a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f83677a.get());
    }
}
