package com.avito.android.user_advert.advert.items.installments_promoblock;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InstallmentsPromoBlockItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f309512a;

    /* renamed from: b, reason: collision with root package name */
    public final u f309513b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.vertical_main.c> f309514c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f309512a = provider;
        this.f309513b = uVar;
        this.f309514c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f309512a.get(), (com.avito.android.util.text.a) this.f309513b.get(), this.f309514c.get());
    }
}
