package com.avito.android.gig_shift_start.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GigShiftStartReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final EH.b f160814a;

    public n(EH.b bVar) {
        this.f160814a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((EH.a) this.f160814a.get());
    }
}
