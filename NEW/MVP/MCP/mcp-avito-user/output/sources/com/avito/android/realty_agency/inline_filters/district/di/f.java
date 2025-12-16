package com.avito.android.realty_agency.inline_filters.district.di;

import com.avito.android.inline_filters.dialog.select.adapter.j;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DistrictFilterDialogModule_ProvideInlineFiltersDialogItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final l f251581a;

    public f(l lVar) {
        this.f251581a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.l lVar = (Y41.l) this.f251581a.f393949a;
        d.f251580a.getClass();
        return new j(lVar, c.f251579l);
    }
}
