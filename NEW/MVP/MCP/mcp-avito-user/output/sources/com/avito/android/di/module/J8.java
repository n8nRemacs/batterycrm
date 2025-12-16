package com.avito.android.di.module;

/* compiled from: SerpItemConverterModule_ProvideSerpWarningConverterFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes13.dex */
public final class J8 implements dagger.internal.h<com.avito.android.serp.adapter.warning.a> {

    /* compiled from: SerpItemConverterModule_ProvideSerpWarningConverterFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final J8 f144022a = new J8();
    }

    public static J8 a() {
        return a.f144022a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new com.avito.android.serp.adapter.warning.b();
    }
}
