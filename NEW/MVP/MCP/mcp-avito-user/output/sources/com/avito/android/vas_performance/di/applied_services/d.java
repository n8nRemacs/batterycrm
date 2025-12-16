package com.avito.android.vas_performance.di.applied_services;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AppliedServicesModule_ProvideTitleBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final c f319904a;

    /* renamed from: b, reason: collision with root package name */
    public final u f319905b;

    public d(c cVar, u uVar) {
        this.f319904a = cVar;
        this.f319905b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_performance.ui.items.title.e eVar = (com.avito.android.vas_performance.ui.items.title.e) this.f319905b.get();
        this.f319904a.getClass();
        return new com.avito.android.vas_performance.ui.items.title.a(eVar);
    }
}
