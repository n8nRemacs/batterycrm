package com.avito.android.guests_selector.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GuestsSelectorViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.guests_selector.converter.b f161572a;

    public o(com.avito.android.guests_selector.converter.b bVar) {
        this.f161572a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f161572a.getClass();
        return new n(new com.avito.android.guests_selector.converter.a());
    }
}
