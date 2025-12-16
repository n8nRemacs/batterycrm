package com.avito.android.favorites.di;

import Ab.C13005a;
import android.os.Bundle;
import com.avito.konveyor.item_visibility_tracker.d;
import javax.inject.Provider;

/* compiled from: FavoriteAdvertsModule_ProvideItemVisibilityTracker$_avito_favorites_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class u implements dagger.internal.h<com.avito.konveyor.item_visibility_tracker.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Ab.c> f157352a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C13005a> f157353b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f157354c;

    public u(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f157352a = provider;
        this.f157353b = provider2;
        this.f157354c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Ab.c cVar = this.f157352a.get();
        C13005a c13005a = this.f157353b.get();
        Bundle bundle = (Bundle) this.f157354c.f393949a;
        C30647e.f157320a.getClass();
        d.a aVar = new d.a(bundle, true);
        aVar.a(cVar);
        aVar.a(c13005a);
        return aVar.b();
    }
}
