package com.avito.android.favorite_sellers.mvi;

import com.avito.android.favorite_sellers.InterfaceC30588l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FavoriteSellersReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final I30.b f156082a;

    /* renamed from: b, reason: collision with root package name */
    public final u f156083b;

    public p(I30.b bVar, u uVar) {
        this.f156082a = bVar;
        this.f156083b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((I30.d) this.f156082a.get(), (InterfaceC30588l) this.f156083b.get());
    }
}
