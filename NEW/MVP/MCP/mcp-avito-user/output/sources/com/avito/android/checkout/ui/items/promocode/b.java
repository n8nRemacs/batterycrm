package com.avito.android.checkout.ui.items.promocode;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckoutPromoCodeItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f118455a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f118456b;

    public b(u uVar, Provider provider) {
        this.f118455a = uVar;
        this.f118456b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f118455a.get(), this.f118456b.get());
    }
}
