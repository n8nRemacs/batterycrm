package com.avito.android.beduin.common.container.layered;

import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LayeredContainerExtractionStrategy_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f103154a;

    public l(dagger.internal.f fVar) {
        this.f103154a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(dagger.internal.g.a(w.a(this.f103154a)));
    }
}
