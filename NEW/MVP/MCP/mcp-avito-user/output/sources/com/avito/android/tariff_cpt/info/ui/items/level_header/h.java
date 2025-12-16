package com.avito.android.tariff_cpt.info.ui.items.level_header;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptInfoLevelHeaderItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f298414a;

    /* renamed from: b, reason: collision with root package name */
    public final l f298415b;

    public h(l lVar, l lVar2) {
        this.f298414a = lVar;
        this.f298415b = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Y41.l) this.f298414a.f393949a, (Y41.l) this.f298415b.f393949a);
    }
}
