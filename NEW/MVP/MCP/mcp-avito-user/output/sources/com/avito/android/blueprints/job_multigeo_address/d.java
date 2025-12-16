package com.avito.android.blueprints.job_multigeo_address;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobMultiGeoBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f106002a;

    public d(Provider<e> provider) {
        this.f106002a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f106002a.get());
    }
}
