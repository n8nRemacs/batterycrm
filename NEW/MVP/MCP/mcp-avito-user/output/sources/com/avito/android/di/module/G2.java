package com.avito.android.di.module;

import javax.inject.Provider;
import rc.C47635b;

/* compiled from: ClickStreamModule_ProvideClickstreamFlushInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class G2 implements dagger.internal.h<com.avito.android.analytics.inhouse_transport.k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f143965a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f143966b;

    public G2(dagger.internal.f fVar, Provider provider) {
        this.f143965a = fVar;
        this.f143966b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.service.short_task.j jVar = (com.avito.android.service.short_task.j) this.f143965a.get();
        com.avito.android.util.C c12 = this.f143966b.get();
        E2 e22 = E2.f143902a;
        return new C47635b(jVar, c12);
    }
}
