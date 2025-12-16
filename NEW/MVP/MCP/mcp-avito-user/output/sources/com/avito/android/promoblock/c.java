package com.avito.android.promoblock;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TnsPromoBlockItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f231780a;

    /* renamed from: b, reason: collision with root package name */
    public final u f231781b;

    public c(u uVar, Provider provider) {
        this.f231780a = provider;
        this.f231781b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f231780a.get(), (m) this.f231781b.get());
    }
}
