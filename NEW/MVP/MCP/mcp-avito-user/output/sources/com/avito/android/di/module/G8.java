package com.avito.android.di.module;

/* compiled from: SerpItemConverterModule_ProvideSerpEmptySearchConverterFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes13.dex */
public final class G8 implements dagger.internal.h<com.avito.android.serp.adapter.empty_search.d> {

    /* compiled from: SerpItemConverterModule_ProvideSerpEmptySearchConverterFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final G8 f143975a = new G8();
    }

    public static G8 a() {
        return a.f143975a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new com.avito.android.serp.adapter.empty_search.e();
    }
}
