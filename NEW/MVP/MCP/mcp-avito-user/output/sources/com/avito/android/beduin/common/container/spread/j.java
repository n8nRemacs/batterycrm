package com.avito.android.beduin.common.container.spread;

import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SpreadContainerExtractionStrategy_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f103203a;

    public j(dagger.internal.f fVar) {
        this.f103203a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(dagger.internal.g.a(w.a(this.f103203a)));
    }
}
