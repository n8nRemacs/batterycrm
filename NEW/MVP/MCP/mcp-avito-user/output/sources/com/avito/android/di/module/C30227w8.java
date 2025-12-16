package com.avito.android.di.module;

import com.avito.android.serp.adapter.C34738i0;
import com.avito.android.serp.adapter.InterfaceC34736h0;
import javax.inject.Provider;

/* compiled from: SerpItemConverterModule_ProvideLayoutTypeProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.w8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30227w8 implements dagger.internal.h<InterfaceC34736h0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.L0> f144695a;

    public C30227w8(Provider<com.avito.android.util.L0> provider) {
        this.f144695a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.L0 l02 = this.f144695a.get();
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new C34738i0(l02);
    }
}
