package com.avito.android.position_in_search.stats.screen.position_in_search.domain;

import com.avito.android.position_in_search.stats.screen.position_in_search.storage.PositionInSearchStorage;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PositionInSearchMapperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f221407a;

    public f(u uVar) {
        this.f221407a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((PositionInSearchStorage) this.f221407a.get());
    }
}
