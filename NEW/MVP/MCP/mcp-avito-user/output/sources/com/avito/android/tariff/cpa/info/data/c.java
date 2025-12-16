package com.avito.android.tariff.cpa.info.data;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpaInfoMapperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final g f294625a;

    public c(g gVar) {
        this.f294625a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((e) this.f294625a.get());
    }
}
