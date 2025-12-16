package com.avito.android.advertising.adapter.items.buzzoola.premium;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BuzzoolaPremiumBigBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f87389a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f87390b;

    public c(dagger.internal.l lVar, u uVar) {
        this.f87389a = uVar;
        this.f87390b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f87389a.get(), (com.avito.android.advertising.a) this.f87390b.f393949a);
    }
}
