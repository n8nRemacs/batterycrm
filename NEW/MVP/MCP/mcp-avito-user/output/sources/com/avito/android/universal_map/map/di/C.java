package com.avito.android.universal_map.map.di;

/* compiled from: UniversalMapFragmentModule_ProvideBeduinShowMapTooltipActionHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class C implements dagger.internal.h<com.avito.android.map_core.beduin.action_handler.i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f305018a;

    public C(dagger.internal.u uVar) {
        this.f305018a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.onboarding_manager.f fVar = (com.avito.android.onboarding_manager.f) this.f305018a.get();
        C35315v.f305153a.getClass();
        return new com.avito.android.map_core.beduin.action_handler.i(fVar);
    }
}
