package com.avito.android.di.module;

import com.avito.android.serp.adapter.C34690c0;

/* compiled from: SpanAdapterModule_ProvideSpannedGridPositionProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class N9 implements dagger.internal.h<com.avito.android.serp.adapter.h1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.h f144083a;

    public N9(dagger.internal.h hVar) {
        this.f144083a = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        int iIntValue = ((Integer) this.f144083a.get()).intValue();
        int i12 = L9.f144050a;
        return new C34690c0(iIntValue);
    }
}
