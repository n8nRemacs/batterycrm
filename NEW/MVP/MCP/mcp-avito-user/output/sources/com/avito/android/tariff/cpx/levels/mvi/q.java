package com.avito.android.tariff.cpx.levels.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxLevelsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final GB0.c f297153a;

    public q(GB0.c cVar) {
        this.f297153a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p((GB0.a) this.f297153a.get());
    }
}
