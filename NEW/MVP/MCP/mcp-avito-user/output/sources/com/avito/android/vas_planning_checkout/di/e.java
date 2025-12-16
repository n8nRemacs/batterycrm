package com.avito.android.vas_planning_checkout.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasPlanCheckoutModule_ProvideHeaderItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f322870a;

    public e(u uVar) {
        this.f322870a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_planning_checkout.item.header.b bVar = (com.avito.android.vas_planning_checkout.item.header.b) this.f322870a.get();
        d dVar = d.f322869a;
        return new com.avito.android.vas_planning_checkout.item.header.a(bVar);
    }
}
