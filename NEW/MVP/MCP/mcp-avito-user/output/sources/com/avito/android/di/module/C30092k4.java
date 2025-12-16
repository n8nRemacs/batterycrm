package com.avito.android.di.module;

import java.util.Locale;
import javax.inject.Provider;

/* compiled from: DateTimeFormatterModule_ProvideJob24DateTimeFormatterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.k4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30092k4 implements dagger.internal.h<com.avito.android.date_time_formatter.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f144362a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.date_time_formatter.m f144363b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f144364c;

    public C30092k4(Provider provider, com.avito.android.date_time_formatter.m mVar, Provider provider2) {
        this.f144362a = provider;
        this.f144363b = mVar;
        this.f144364c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.h hVar = this.f144362a.get();
        com.avito.android.date_time_formatter.f fVar = (com.avito.android.date_time_formatter.f) this.f144363b.get();
        Locale locale = this.f144364c.get();
        int i12 = C30070i4.f144347a;
        return new com.avito.android.date_time_formatter.c(hVar, fVar, locale);
    }
}
