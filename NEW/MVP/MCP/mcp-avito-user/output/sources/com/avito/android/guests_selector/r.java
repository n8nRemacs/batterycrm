package com.avito.android.guests_selector;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GuestsSelectorViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.guests_selector.mvi.h f161585a;

    public r(com.avito.android.guests_selector.mvi.h hVar) {
        this.f161585a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q((com.avito.android.guests_selector.mvi.g) this.f161585a.get(), null, 2, null);
    }
}
