package com.avito.android.position_in_search.stats.screen.position_in_search.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PositionInSearchReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.position_in_search.stats.screen.position_in_search.domain.f f221536a;

    public m(com.avito.android.position_in_search.stats.screen.position_in_search.domain.f fVar) {
        this.f221536a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.position_in_search.stats.screen.position_in_search.domain.d) this.f221536a.get());
    }
}
