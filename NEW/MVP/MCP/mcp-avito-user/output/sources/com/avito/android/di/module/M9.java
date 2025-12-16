package com.avito.android.di.module;

/* compiled from: SpanAdapterModule_ProvideSerpSpanProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class M9 implements dagger.internal.h<com.avito.android.serp.adapter.Y0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f144075a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.h f144076b;

    public M9(dagger.internal.u uVar, dagger.internal.h hVar) {
        this.f144075a = uVar;
        this.f144076b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.h1 h1Var = (com.avito.android.serp.adapter.h1) this.f144075a.get();
        int iIntValue = ((Integer) this.f144076b.get()).intValue();
        int i12 = L9.f144050a;
        return new com.avito.android.serp.adapter.Z0(iIntValue, h1Var);
    }
}
