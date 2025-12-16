package com.avito.android.user_advert.soa_with_price.blueprint;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CloseReasonItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f311873a;

    public c(u uVar) {
        this.f311873a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f311873a.get());
    }
}
