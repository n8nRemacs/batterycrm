package com.avito.android.extended_profile_widgets.adapter.search.search_geo;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchGeoItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f154815a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f154816b;

    public b(u uVar, Provider provider) {
        this.f154815a = uVar;
        this.f154816b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f154815a.get(), this.f154816b.get());
    }
}
