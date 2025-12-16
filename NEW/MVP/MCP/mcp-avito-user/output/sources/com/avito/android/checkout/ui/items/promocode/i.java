package com.avito.android.checkout.ui.items.promocode;

import Y41.p;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CheckoutPromoCodeItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final l f118468a;

    /* renamed from: b, reason: collision with root package name */
    public final l f118469b;

    public i(l lVar, l lVar2) {
        this.f118468a = lVar;
        this.f118469b = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((Y41.l) this.f118468a.f393949a, (p) this.f118469b.f393949a);
    }
}
