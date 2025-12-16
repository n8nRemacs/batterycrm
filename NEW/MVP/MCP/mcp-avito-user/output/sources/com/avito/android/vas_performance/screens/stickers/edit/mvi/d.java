package com.avito.android.vas_performance.screens.stickers.edit.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StickersEditActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.stickers.edit.mvi.domain.d f320779a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.stickers.edit.mvi.domain.b f320780b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f320781c;

    public d(com.avito.android.vas_performance.screens.stickers.edit.mvi.domain.d dVar, com.avito.android.vas_performance.screens.stickers.edit.mvi.domain.b bVar, dagger.internal.l lVar) {
        this.f320779a = dVar;
        this.f320780b = bVar;
        this.f320781c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.vas_performance.screens.stickers.edit.mvi.domain.c) this.f320779a.get(), (com.avito.android.vas_performance.screens.stickers.edit.mvi.domain.a) this.f320780b.get(), (String) this.f320781c.f393949a);
    }
}
