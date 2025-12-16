package com.avito.android.beduin.common.component.selector_card_group;

import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectorCardGroupExtractionStrategy_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f102575a;

    public v(dagger.internal.f fVar) {
        this.f102575a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u(dagger.internal.g.a(w.a(this.f102575a)));
    }
}
