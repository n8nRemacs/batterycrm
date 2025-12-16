package com.avito.android.vas_union.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasUnionV2Bootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_union.domain.b f323210a;

    public d(com.avito.android.vas_union.domain.b bVar) {
        this.f323210a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.vas_union.domain.a) this.f323210a.get());
    }
}
