package com.avito.android.loyalty.ui.criteria;

import com.avito.android.deep_linking.links.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CriteriaTabsInfoConverter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f183454a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f183455b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f183456c;

    public f(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3) {
        this.f183454a = lVar;
        this.f183455b = lVar2;
        this.f183456c = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((w) this.f183454a.f393949a, (com.avito.android.deep_linking.links.x) this.f183455b.f393949a, (CriteriaArgs) this.f183456c.f393949a);
    }
}
