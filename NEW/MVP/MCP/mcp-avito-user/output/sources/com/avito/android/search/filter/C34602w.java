package com.avito.android.search.filter;

import android.app.Application;

/* compiled from: FiltersIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.search.filter.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34602w implements dagger.internal.h<C34600v> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f263809a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.O f263810b;

    public C34602w(dagger.internal.l lVar, com.avito.android.O o12) {
        this.f263809a = lVar;
        this.f263810b = o12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34600v((Application) this.f263809a.f393949a, (com.avito.android.L) this.f263810b.get());
    }
}
