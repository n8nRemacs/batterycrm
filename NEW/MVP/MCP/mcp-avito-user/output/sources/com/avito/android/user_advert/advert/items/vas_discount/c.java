package com.avito.android.user_advert.advert.items.vas_discount;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasDiscountDescriptionItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f310353a;

    /* renamed from: b, reason: collision with root package name */
    public final u f310354b;

    public c(u uVar, u uVar2) {
        this.f310353a = uVar;
        this.f310354b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f310353a.get(), (com.avito.android.util.text.a) this.f310354b.get());
    }
}
