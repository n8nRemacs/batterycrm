package com.avito.android.checkout.ui.items.price;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckoutPriceItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f118416a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f118417b;

    public c(u uVar, Provider provider) {
        this.f118416a = uVar;
        this.f118417b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f118416a.get(), this.f118417b.get());
    }
}
