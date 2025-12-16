package com.avito.android.select.bottom_sheet_pagination.blueprints.loading;

import com.avito.android.select.bottom_sheet_pagination.blueprints.PaginationState;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaginationLoadingItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l41.g<PaginationState>> f265348a;

    public e(Provider<l41.g<PaginationState>> provider) {
        this.f265348a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f265348a.get());
    }
}
