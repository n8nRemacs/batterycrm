package com.avito.android.important_addresses_selection.presentation.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImportantAddressesSelectionReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final p f169895a;

    public k(p pVar) {
        this.f169895a = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((n) this.f169895a.get());
    }
}
