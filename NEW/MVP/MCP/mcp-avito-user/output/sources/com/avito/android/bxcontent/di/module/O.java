package com.avito.android.bxcontent.di.module;

import java.util.UUID;

/* compiled from: BxContentModule_ProviderVacancyResponseScreenIdFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* loaded from: classes12.dex */
public final class O implements dagger.internal.h<String> {

    /* compiled from: BxContentModule_ProviderVacancyResponseScreenIdFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final O f110899a = new O();
    }

    public static O a() {
        return a.f110899a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C29070s.f111022a.getClass();
        return UUID.randomUUID().toString();
    }
}
