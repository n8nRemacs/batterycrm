package com.avito.android.guests_selector.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GuestsSelectorReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final u f161570a;

    public l(u uVar) {
        this.f161570a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((m) this.f161570a.get());
    }
}
