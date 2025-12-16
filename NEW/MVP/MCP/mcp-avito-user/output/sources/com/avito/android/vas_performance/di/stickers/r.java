package com.avito.android.vas_performance.di.stickers;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StickersVasListModule_ProvideHeaderItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class r implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final q f320131a;

    /* renamed from: b, reason: collision with root package name */
    public final u f320132b;

    public r(q qVar, u uVar) {
        this.f320131a = qVar;
        this.f320132b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_performance.ui.items.header.c cVar = (com.avito.android.vas_performance.ui.items.header.c) this.f320132b.get();
        this.f320131a.getClass();
        return new com.avito.android.vas_performance.ui.items.header.a(cVar);
    }
}
