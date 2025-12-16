package com.avito.android.comparison.menu_bottom_sheet;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ComparisonBottomSheetPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f124105a;

    /* renamed from: b, reason: collision with root package name */
    public final l f124106b;

    /* renamed from: c, reason: collision with root package name */
    public final l f124107c;

    public f(l lVar, l lVar2, l lVar3) {
        this.f124105a = lVar;
        this.f124106b = lVar2;
        this.f124107c = lVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Y41.l) this.f124105a.f393949a, (Y41.l) this.f124106b.f393949a, (Y41.l) this.f124107c.f393949a);
    }
}
