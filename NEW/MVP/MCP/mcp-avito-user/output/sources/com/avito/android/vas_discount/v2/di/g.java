package com.avito.android.vas_discount.v2.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasDiscountV2Module_ProvideTitleBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f319783a;

    public g(u uVar) {
        this.f319783a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_discount.ui.items.title.e eVar = (com.avito.android.vas_discount.ui.items.title.e) this.f319783a.get();
        d.f319779a.getClass();
        return new com.avito.android.vas_discount.ui.items.title.a(eVar);
    }
}
