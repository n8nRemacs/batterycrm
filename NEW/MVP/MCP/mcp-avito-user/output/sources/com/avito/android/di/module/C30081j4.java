package com.avito.android.di.module;

import java.util.Locale;
import javax.inject.Provider;

/* compiled from: DateTimeFormatterModule_ProvideJob23DateTimeFormatterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.j4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30081j4 implements dagger.internal.h<com.avito.android.date_time_formatter.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f144350a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.date_time_formatter.k f144351b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f144352c;

    public C30081j4(Provider provider, com.avito.android.date_time_formatter.k kVar, Provider provider2) {
        this.f144350a = provider;
        this.f144351b = kVar;
        this.f144352c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.h hVar = this.f144350a.get();
        com.avito.android.date_time_formatter.f fVar = (com.avito.android.date_time_formatter.f) this.f144351b.get();
        Locale locale = this.f144352c.get();
        int i12 = C30070i4.f144347a;
        return new com.avito.android.date_time_formatter.c(hVar, fVar, locale);
    }
}
