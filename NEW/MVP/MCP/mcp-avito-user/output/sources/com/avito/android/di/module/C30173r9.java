package com.avito.android.di.module;

/* compiled from: ServerTimeModule_ProvideLocalTimeSource$_common_server_time_implFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* renamed from: com.avito.android.di.module.r9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30173r9 implements dagger.internal.h<com.avito.android.server_time.a> {

    /* compiled from: ServerTimeModule_ProvideLocalTimeSource$_common_server_time_implFactory.java */
    /* renamed from: com.avito.android.di.module.r9$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C30173r9 f144566a = new C30173r9();
    }

    public static C30173r9 a() {
        return a.f144566a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30163q9.f144550a.getClass();
        return new com.avito.android.server_time.a();
    }
}
