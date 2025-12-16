package com.avito.android.di.module;

import java.util.Locale;
import javax.inject.Provider;

/* compiled from: DateTimeFormatterModule_ProvideLowerCaseDateTimeFormatterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.l4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30103l4 implements dagger.internal.h<com.avito.android.date_time_formatter.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f144386a;

    /* renamed from: b, reason: collision with root package name */
    public final C30114m4 f144387b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f144388c;

    public C30103l4(Provider provider, C30114m4 c30114m4, dagger.internal.u uVar) {
        this.f144386a = provider;
        this.f144387b = c30114m4;
        this.f144388c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.h hVar = this.f144386a.get();
        com.avito.android.date_time_formatter.f fVar = (com.avito.android.date_time_formatter.f) this.f144387b.get();
        Locale locale = (Locale) this.f144388c.get();
        int i12 = C30070i4.f144347a;
        return new com.avito.android.date_time_formatter.c(hVar, fVar, locale);
    }
}
