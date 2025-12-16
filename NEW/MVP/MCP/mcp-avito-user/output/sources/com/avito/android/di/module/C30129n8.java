package com.avito.android.di.module;

/* compiled from: SerpItemConverterModule_ProvideEmptyPlaceholderItemConverterFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* renamed from: com.avito.android.di.module.n8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30129n8 implements dagger.internal.h<com.avito.android.serp.adapter.empty_placeholder.f> {

    /* compiled from: SerpItemConverterModule_ProvideEmptyPlaceholderItemConverterFactory.java */
    /* renamed from: com.avito.android.di.module.n8$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C30129n8 f144480a = new C30129n8();
    }

    public static C30129n8 a() {
        return a.f144480a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new com.avito.android.serp.adapter.empty_placeholder.g();
    }
}
