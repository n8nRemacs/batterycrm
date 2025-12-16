package com.avito.android.di.module;

import com.avito.android.C36135w2;
import javax.inject.Provider;
import tn0.InterfaceC48695a;

/* compiled from: SerpItemConverterModule_ProvideRubricatorRefinedItemConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class A8 implements dagger.internal.h<InterfaceC48695a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.J0> f143838a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f143839b;

    public A8(dagger.internal.u uVar, Provider provider) {
        this.f143838a = provider;
        this.f143839b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.J0 j02 = this.f143838a.get();
        C36135w2 c36135w2 = (C36135w2) this.f143839b.get();
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new com.avito.android.rubricator.items.a(j02, c36135w2);
    }
}
