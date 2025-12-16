package com.avito.android.rating_form.select_item.adapter.empty_search;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EmptySearchItemRedesignBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f248944a;

    /* renamed from: b, reason: collision with root package name */
    public final l f248945b;

    public h(l lVar, Provider provider) {
        this.f248944a = provider;
        this.f248945b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f248944a.get(), ((Boolean) this.f248945b.f393949a).booleanValue());
    }
}
