package com.avito.android.tariff_select.ui.items.tariff;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffSelectTariffItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f301280a;

    /* renamed from: b, reason: collision with root package name */
    public final l f301281b;

    public h(l lVar, l lVar2) {
        this.f301280a = lVar;
        this.f301281b = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Y41.l) this.f301280a.f393949a, (Y41.l) this.f301281b.f393949a);
    }
}
