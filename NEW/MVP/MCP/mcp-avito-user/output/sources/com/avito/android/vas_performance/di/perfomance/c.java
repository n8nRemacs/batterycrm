package com.avito.android.vas_performance.di.perfomance;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ListModuleNew_ProvideHeaderItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final b f320033a;

    /* renamed from: b, reason: collision with root package name */
    public final u f320034b;

    public c(b bVar, u uVar) {
        this.f320033a = bVar;
        this.f320034b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_performance.ui.items.header.c cVar = (com.avito.android.vas_performance.ui.items.header.c) this.f320034b.get();
        this.f320033a.getClass();
        return new com.avito.android.vas_performance.ui.items.header.a(cVar);
    }
}
