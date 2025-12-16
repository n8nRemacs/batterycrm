package com.avito.android.user_advert.advert.items.credit_info;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreditInfoItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f309345a;

    /* renamed from: b, reason: collision with root package name */
    public final u f309346b;

    public c(u uVar, Provider provider) {
        this.f309345a = provider;
        this.f309346b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f309345a.get(), (com.avito.android.util.text.a) this.f309346b.get());
    }
}
