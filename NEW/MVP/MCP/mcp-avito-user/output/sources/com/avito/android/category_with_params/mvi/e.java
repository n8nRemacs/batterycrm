package com.avito.android.category_with_params.mvi;

import com.avito.android.category_with_params.entity.CategoryParams;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CategoryWithParamsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f117688a;

    public e(dagger.internal.l lVar) {
        this.f117688a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((CategoryParams) this.f117688a.f393949a);
    }
}
