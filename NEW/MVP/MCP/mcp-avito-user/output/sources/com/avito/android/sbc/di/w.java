package com.avito.android.sbc.di;

import dagger.internal.y;

/* compiled from: SbcUtilsModule_ProvidePriceFormatterFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class w implements dagger.internal.h<com.avito.android.sbc.utils.a> {

    /* renamed from: a, reason: collision with root package name */
    public final x f260030a;

    public w(x xVar) {
        this.f260030a = xVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.sbc.utils.h hVar = (com.avito.android.sbc.utils.h) this.f260030a.get();
        u.f260028a.getClass();
        return new com.avito.android.sbc.utils.b(hVar);
    }
}
