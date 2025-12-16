package com.avito.android.realty_agency.inline_filters.district.di;

import com.avito.android.inline_filters.dialog.select.adapter.j;
import com.avito.android.inline_filters.dialog.select.adapter.p;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DistrictFilterDialogModule_ProvideInlineFiltersDialogMultiSelectItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final f f251582a;

    public g(f fVar) {
        this.f251582a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f251582a.get();
        d.f251580a.getClass();
        return new p(jVar);
    }
}
