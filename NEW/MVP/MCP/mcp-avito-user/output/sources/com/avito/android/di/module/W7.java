package com.avito.android.di.module;

import com.avito.android.serp.warning.WarningStateProviderState;
import kotlin.collections.C42745f0;

/* compiled from: SerpInteractorModule_ProvideWarningStateProvider$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class W7 implements dagger.internal.h<com.avito.android.serp.warning.f> {

    /* renamed from: a, reason: collision with root package name */
    public final Y7 f144179a;

    /* renamed from: b, reason: collision with root package name */
    public final X7 f144180b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f144181c;

    public W7(Y7 y72, X7 x72, dagger.internal.l lVar) {
        this.f144179a = y72;
        this.f144180b = x72;
        this.f144181c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.warning.d dVar = (com.avito.android.serp.warning.d) this.f144179a.get();
        com.avito.android.serp.warning.b bVar = (com.avito.android.serp.warning.b) this.f144180b.get();
        WarningStateProviderState warningStateProviderState = (WarningStateProviderState) this.f144181c.f393949a;
        int i12 = R7.f144121a;
        return new com.avito.android.serp.warning.g(C42745f0.U(bVar, dVar), warningStateProviderState);
    }
}
