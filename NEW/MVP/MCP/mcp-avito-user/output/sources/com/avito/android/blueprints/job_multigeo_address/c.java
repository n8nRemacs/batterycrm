package com.avito.android.blueprints.job_multigeo_address;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobMultiGeoBlueprintVacancyFlow_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f106001a;

    public c(Provider<e> provider) {
        this.f106001a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f106001a.get());
    }
}
