package com.avito.android.blueprints.district;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MultiStateDistrictItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f105885a;

    public b(Provider<c> provider) {
        this.f105885a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f105885a.get());
    }
}
