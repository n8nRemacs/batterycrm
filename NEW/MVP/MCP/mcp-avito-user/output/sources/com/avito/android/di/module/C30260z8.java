package com.avito.android.di.module;

/* compiled from: SerpItemConverterModule_ProvideReformulationsConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.z8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30260z8 implements dagger.internal.h<com.avito.android.serp.adapter.reformulations.b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f144743a;

    public C30260z8(dagger.internal.u uVar) {
        this.f144743a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.J0 j02 = (com.avito.android.J0) this.f144743a.get();
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new com.avito.android.serp.adapter.reformulations.c(j02);
    }
}
