package com.avito.android.validation;

import android.content.res.Resources;

/* compiled from: ParametersListModule_ProvideMultiGeoResourceProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class O implements dagger.internal.h<com.avito.android.blueprints.job_multigeo_address.q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f319280a;

    public O(dagger.internal.l lVar) {
        this.f319280a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f319280a.f393949a;
        A.f319242a.getClass();
        return new com.avito.android.blueprints.job_multigeo_address.r(resources);
    }
}
