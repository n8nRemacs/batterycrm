package com.avito.android.favorites.adapter.avito_for_business_exit;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvitoForBusinessExitBlockBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f156518a;

    /* renamed from: b, reason: collision with root package name */
    public final l f156519b;

    public b(l lVar, Provider provider) {
        this.f156518a = provider;
        this.f156519b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f156518a.get(), (c) this.f156519b.f393949a);
    }
}
