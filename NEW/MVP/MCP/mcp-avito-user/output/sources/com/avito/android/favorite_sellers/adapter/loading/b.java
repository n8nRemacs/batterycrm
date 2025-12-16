package com.avito.android.favorite_sellers.adapter.loading;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LoadingItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f155579a;

    public b(e eVar) {
        this.f155579a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f155579a.get());
    }
}
