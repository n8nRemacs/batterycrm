package com.avito.android.vas_union.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasUnionV2Reducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_union.data.c f323239a;

    public k(com.avito.android.vas_union.data.c cVar) {
        this.f323239a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f323239a.getClass();
        return new j(new com.avito.android.vas_union.data.b());
    }
}
