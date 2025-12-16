package com.avito.android.checkout.ui.items.service;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckoutServiceItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f118498a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f118499b;

    public d(u uVar, Provider provider) {
        this.f118498a = uVar;
        this.f118499b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((e) this.f118498a.get(), this.f118499b.get());
    }
}
