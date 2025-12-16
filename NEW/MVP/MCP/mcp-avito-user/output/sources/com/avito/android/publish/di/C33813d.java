package com.avito.android.publish.di;

import com.google.gson.Gson;

/* compiled from: PublishAnalyticModule_ProvideAnalyticsSerializerFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* renamed from: com.avito.android.publish.di.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33813d implements dagger.internal.h<Gson> {

    /* compiled from: PublishAnalyticModule_ProvideAnalyticsSerializerFactory.java */
    /* renamed from: com.avito.android.publish.di.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C33813d f235274a = new C33813d();
    }

    public static C33813d a() {
        return a.f235274a;
    }

    public static Gson b() {
        int i12 = C33812c.f235273a;
        return new com.google.gson.d().a();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return b();
    }
}
