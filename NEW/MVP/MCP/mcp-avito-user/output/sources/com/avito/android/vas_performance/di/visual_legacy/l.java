package com.avito.android.vas_performance.di.visual_legacy;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LegacyVisualVasListModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f320182a;

    /* renamed from: b, reason: collision with root package name */
    public final u f320183b;

    public l(k kVar, u uVar) {
        this.f320182a = kVar;
        this.f320183b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f320183b.get();
        this.f320182a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
