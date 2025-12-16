package com.avito.android.checkout.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckoutActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.checkout.domain.k f118377a;

    /* renamed from: b, reason: collision with root package name */
    public final u f118378b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f118379c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f118380d;

    public h(com.avito.android.checkout.domain.k kVar, u uVar, Provider provider, dagger.internal.l lVar) {
        this.f118377a = kVar;
        this.f118378b = uVar;
        this.f118379c = provider;
        this.f118380d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.checkout.domain.j) this.f118377a.get(), (v50.g) this.f118378b.get(), this.f118379c.get(), (String) this.f118380d.f393949a);
    }
}
