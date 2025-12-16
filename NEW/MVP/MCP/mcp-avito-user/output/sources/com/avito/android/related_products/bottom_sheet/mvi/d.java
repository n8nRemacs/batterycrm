package com.avito.android.related_products.bottom_sheet.mvi;

import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RelatedProductsBottomSheetBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.related_products.bottom_sheet.a> f252919a;

    public d(Provider<com.avito.android.related_products.bottom_sheet.a> provider) {
        this.f252919a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(dagger.internal.g.a(w.a(this.f252919a)));
    }
}
