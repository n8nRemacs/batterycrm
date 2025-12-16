package com.avito.android.di.module;

import com.avito.android.C36135w2;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: SerpItemConverterModule_ProvideConstructorAdvertConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.l8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30107l8 implements dagger.internal.h<com.avito.android.constructor_advert.ui.serp.constructor.f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f144390a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C36135w2> f144391b;

    public C30107l8(dagger.internal.u uVar, Provider provider) {
        this.f144390a = uVar;
        this.f144391b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40691b interfaceC40691b = (InterfaceC40691b) this.f144390a.get();
        C36135w2 c36135w2 = this.f144391b.get();
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new com.avito.android.constructor_advert.ui.serp.constructor.g(interfaceC40691b, c36135w2, new com.avito.android.serp.adapter.b1(1));
    }
}
