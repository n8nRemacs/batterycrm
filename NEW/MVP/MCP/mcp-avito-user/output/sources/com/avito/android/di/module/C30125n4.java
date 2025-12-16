package com.avito.android.di.module;

import java.util.Locale;
import javax.inject.Provider;

/* compiled from: DateTimeFormatterModule_ProvideUpperCaseDateTimeFormatterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.n4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30125n4 implements dagger.internal.h<com.avito.android.date_time_formatter.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f144474a;

    /* renamed from: b, reason: collision with root package name */
    public final C30136o4 f144475b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f144476c;

    public C30125n4(Provider provider, C30136o4 c30136o4, Provider provider2) {
        this.f144474a = provider;
        this.f144475b = c30136o4;
        this.f144476c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.h hVar = this.f144474a.get();
        com.avito.android.date_time_formatter.f fVar = (com.avito.android.date_time_formatter.f) this.f144475b.get();
        Locale locale = this.f144476c.get();
        int i12 = C30070i4.f144347a;
        return new com.avito.android.date_time_formatter.c(hVar, fVar, locale);
    }
}
