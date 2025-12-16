package com.avito.android.suggest_locations;

import android.app.Application;

/* compiled from: SuggestLocationsIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.suggest_locations.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35141f implements dagger.internal.h<C35140e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f292331a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.O f292332b;

    public C35141f(dagger.internal.l lVar, com.avito.android.O o12) {
        this.f292331a = lVar;
        this.f292332b = o12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C35140e((Application) this.f292331a.f393949a, (com.avito.android.L) this.f292332b.get());
    }
}
