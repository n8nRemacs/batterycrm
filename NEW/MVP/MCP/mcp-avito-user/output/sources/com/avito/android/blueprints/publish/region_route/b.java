package com.avito.android.blueprints.publish.region_route;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RegionRouteBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f106450a;

    public b(Provider<c> provider) {
        this.f106450a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f106450a.get());
    }
}
