package com.avito.android.di.module;

import com.avito.android.analytics.InterfaceC28373a;

/* compiled from: ShortTaskModule_ProvideRunJobFailedListenerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class D9 implements dagger.internal.h<com.avito.android.service.short_task.g> {

    /* renamed from: a, reason: collision with root package name */
    public final C30261z9 f143890a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f143891b;

    public D9(C30261z9 c30261z9, dagger.internal.f fVar) {
        this.f143890a = c30261z9;
        this.f143891b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f143891b.get();
        this.f143890a.getClass();
        return new com.avito.android.service.short_task.h(interfaceC28373a);
    }
}
