package com.avito.android.vas_performance.screens.stickers.edit.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StickersEditBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.stickers.edit.mvi.domain.b f320813a;

    public f(com.avito.android.vas_performance.screens.stickers.edit.mvi.domain.b bVar) {
        this.f320813a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.vas_performance.screens.stickers.edit.mvi.domain.a) this.f320813a.get());
    }
}
