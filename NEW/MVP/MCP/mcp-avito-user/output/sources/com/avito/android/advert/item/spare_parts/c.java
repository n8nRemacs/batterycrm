package com.avito.android.advert.item.spare_parts;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SparePartsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f80404a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f80405b;

    public c(u uVar, Provider provider) {
        this.f80404a = uVar;
        this.f80405b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f80404a.get(), this.f80405b.get());
    }
}
