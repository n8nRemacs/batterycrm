package com.avito.android.loyalty.ui.criteria_gray;

import com.avito.android.deep_linking.links.w;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CriteriaGrayInfoConverter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f183586a;

    /* renamed from: b, reason: collision with root package name */
    public final l f183587b;

    public e(l lVar, l lVar2) {
        this.f183586a = lVar;
        this.f183587b = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((w) this.f183586a.f393949a, (com.avito.android.deep_linking.links.x) this.f183587b.f393949a);
    }
}
