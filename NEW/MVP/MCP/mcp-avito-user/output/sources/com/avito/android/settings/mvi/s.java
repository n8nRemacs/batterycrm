package com.avito.android.settings.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SettingsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final n f280960a;

    public s(n nVar) {
        this.f280960a = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r((l) this.f280960a.get());
    }
}
