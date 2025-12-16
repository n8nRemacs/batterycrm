package com.avito.android.crm_candidates.features.full_filters.logics;

import dagger.internal.x;
import dagger.internal.y;
import java.util.List;

/* compiled from: FiltersBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f129611a;

    public h(dagger.internal.l lVar) {
        this.f129611a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((List) this.f129611a.f393949a);
    }
}
