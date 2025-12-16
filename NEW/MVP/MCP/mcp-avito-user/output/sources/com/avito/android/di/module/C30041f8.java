package com.avito.android.di.module;

import com.avito.android.C36135w2;
import javax.inject.Provider;

/* compiled from: SerpItemConverterModule_ProvideAvitoBlogItemConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.f8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30041f8 implements dagger.internal.h<com.avito.android.serp.adapter.vertical_main.avito_blog.g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.J0> f144291a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f144292b;

    public C30041f8(dagger.internal.u uVar, Provider provider) {
        this.f144291a = provider;
        this.f144292b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.J0 j02 = this.f144291a.get();
        C36135w2 c36135w2 = (C36135w2) this.f144292b.get();
        C29986a8.f144230a.getClass();
        return new com.avito.android.serp.adapter.vertical_main.avito_blog.g(j02, c36135w2);
    }
}
