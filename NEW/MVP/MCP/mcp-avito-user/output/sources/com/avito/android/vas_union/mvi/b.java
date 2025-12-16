package com.avito.android.vas_union.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasUnionV2Actor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_union.domain.b f323208a;

    public b(com.avito.android.vas_union.domain.b bVar) {
        this.f323208a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.vas_union.domain.a) this.f323208a.get());
    }
}
