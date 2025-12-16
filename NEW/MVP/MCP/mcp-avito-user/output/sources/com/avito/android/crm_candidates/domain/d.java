package com.avito.android.crm_candidates.domain;

import dagger.internal.x;
import dagger.internal.y;
import java.util.List;

/* compiled from: FullFilterListInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f129362a;

    public d(dagger.internal.l lVar) {
        this.f129362a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((List) this.f129362a.f393949a);
    }
}
