package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalSearchFilterAllFiltersItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f273464a;

    public d(Provider<g> provider) {
        this.f273464a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f273464a.get());
    }
}
