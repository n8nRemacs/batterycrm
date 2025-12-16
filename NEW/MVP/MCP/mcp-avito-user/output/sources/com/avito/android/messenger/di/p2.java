package com.avito.android.messenger.di;

import android.content.res.Resources;
import java.util.Locale;

/* compiled from: RelativeDateFormatterModule_ProvideRelativeDateFormatterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class p2 implements dagger.internal.h<com.avito.android.date_time_formatter.o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f196219a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f196220b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f196221c;

    public p2(dagger.internal.l lVar, dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f196219a = uVar;
        this.f196220b = uVar2;
        this.f196221c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.f fVar = (com.avito.android.server_time.f) this.f196219a.get();
        Locale locale = (Locale) this.f196220b.get();
        Resources resources = (Resources) this.f196221c.f393949a;
        o2 o2Var = o2.f196167a;
        return new com.avito.android.date_time_formatter.p(resources, fVar, locale);
    }
}
