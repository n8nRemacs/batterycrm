package com.avito.android.rating_form.item.stars;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StarsItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f248660a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f248661b;

    public d(dagger.internal.l lVar, u uVar) {
        this.f248660a = uVar;
        this.f248661b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((e) this.f248660a.get(), ((Boolean) this.f248661b.f393949a).booleanValue());
    }
}
