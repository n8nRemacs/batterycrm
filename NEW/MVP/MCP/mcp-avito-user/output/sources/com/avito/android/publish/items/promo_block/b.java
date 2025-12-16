package com.avito.android.publish.items.promo_block;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PromoBlocRedesignedModule_ProvideAlertBannerReBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f237067a;

    public b(u uVar) {
        this.f237067a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f237067a.get();
        a.f237066a.getClass();
        return new g(iVar);
    }
}
