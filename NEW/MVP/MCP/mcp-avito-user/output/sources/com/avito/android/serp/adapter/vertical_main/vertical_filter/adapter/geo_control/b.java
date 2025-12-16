package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.geo_control;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalSearchFilterGeoControlItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f273480a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f273481b;

    public b(u uVar, Provider provider) {
        this.f273480a = uVar;
        this.f273481b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f273480a.get(), this.f273481b.get());
    }
}
