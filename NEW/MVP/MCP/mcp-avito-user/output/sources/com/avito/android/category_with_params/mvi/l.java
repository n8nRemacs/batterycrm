package com.avito.android.category_with_params.mvi;

import com.avito.android.category_with_params.entity.CategoryParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CategoryWithParamsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f117711a;

    public l(dagger.internal.l lVar) {
        this.f117711a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k((CategoryParams) this.f117711a.f393949a);
    }
}
