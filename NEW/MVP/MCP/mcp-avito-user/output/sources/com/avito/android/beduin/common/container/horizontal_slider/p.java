package com.avito.android.beduin.common.container.horizontal_slider;

import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HorizontalSliderContainerParametersExtractionStrategy_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f103125a;

    public p(dagger.internal.f fVar) {
        this.f103125a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(dagger.internal.g.a(w.a(this.f103125a)));
    }
}
