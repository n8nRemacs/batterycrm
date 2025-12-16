package com.avito.android.user_advert.di;

import com.avito.android.di.module.C30114m4;
import java.util.Locale;

/* compiled from: BaseAdvertDetailsModule_ProvideLowerCaseDateTimeFormatterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_advert.di.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35482i implements dagger.internal.h<com.avito.android.date_time_formatter.b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f310907a;

    /* renamed from: b, reason: collision with root package name */
    public final C30114m4 f310908b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f310909c;

    public C35482i(dagger.internal.u uVar, C30114m4 c30114m4, dagger.internal.u uVar2) {
        this.f310907a = uVar;
        this.f310908b = c30114m4;
        this.f310909c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.f fVar = (com.avito.android.server_time.f) this.f310907a.get();
        com.avito.android.date_time_formatter.f fVar2 = (com.avito.android.date_time_formatter.f) this.f310908b.get();
        Locale locale = (Locale) this.f310909c.get();
        C35479f c35479f = C35479f.f310904a;
        return new com.avito.android.date_time_formatter.c(fVar, fVar2, locale);
    }
}
