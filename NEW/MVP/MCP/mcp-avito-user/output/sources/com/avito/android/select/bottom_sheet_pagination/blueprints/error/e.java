package com.avito.android.select.bottom_sheet_pagination.blueprints.error;

import com.avito.android.select.bottom_sheet_pagination.blueprints.PaginationState;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaginationErrorItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l41.g<PaginationState>> f265340a;

    public e(Provider<l41.g<PaginationState>> provider) {
        this.f265340a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f265340a.get());
    }
}
