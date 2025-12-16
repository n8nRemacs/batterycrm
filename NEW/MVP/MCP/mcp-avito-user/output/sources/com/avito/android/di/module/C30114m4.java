package com.avito.android.di.module;

import com.avito.android.date_time_formatter.g;

/* compiled from: DateTimeFormatterModule_ProvideLowerCaseDateTimeFormatterResourceProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.m4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30114m4 implements dagger.internal.h<com.avito.android.date_time_formatter.f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f144397a;

    public C30114m4(dagger.internal.l lVar) {
        this.f144397a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g.a aVar = (g.a) this.f144397a.f393949a;
        int i12 = C30070i4.f144347a;
        return aVar.a(0);
    }
}
