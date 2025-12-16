package com.avito.android.realty_agency.inline_filters.location_suggest.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LocationSuggestBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f251707a;

    /* renamed from: b, reason: collision with root package name */
    public final m f251708b;

    public g(dagger.internal.l lVar, m mVar) {
        this.f251707a = lVar;
        this.f251708b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((String) this.f251707a.f393949a, (l) this.f251708b.get());
    }
}
