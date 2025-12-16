package com.avito.android.campaigns_sale_search.konveyor.search_item;

import android.content.res.Resources;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SearchItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f114619a;

    /* renamed from: b, reason: collision with root package name */
    public final l f114620b;

    public h(l lVar, l lVar2) {
        this.f114619a = lVar;
        this.f114620b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Resources) this.f114619a.f393949a, (Y41.l) this.f114620b.f393949a);
    }
}
