package com.avito.android.select.bottom_sheet_pagination.blueprints.loading;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaginationLoadingItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f265346a;

    public b(u uVar) {
        this.f265346a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f265346a.get());
    }
}
