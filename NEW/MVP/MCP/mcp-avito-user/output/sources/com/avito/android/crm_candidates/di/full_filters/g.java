package com.avito.android.crm_candidates.di.full_filters;

import com.avito.android.crm_candidates.di.full_filters.a;
import com.avito.android.di.module.C30136o4;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: FiltersModule_ProvideFormatterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements h<com.avito.android.date_time_formatter.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f129284a;

    /* renamed from: b, reason: collision with root package name */
    public final C30136o4 f129285b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f129286c;

    public g(Provider provider, C30136o4 c30136o4, Provider provider2) {
        this.f129284a = provider;
        this.f129285b = c30136o4;
        this.f129286c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.f fVar = (com.avito.android.server_time.f) ((a.c.f) this.f129284a).get();
        com.avito.android.date_time_formatter.f fVar2 = (com.avito.android.date_time_formatter.f) this.f129285b.get();
        Locale locale = (Locale) ((a.c.e) this.f129286c).get();
        e.f129281a.getClass();
        return new com.avito.android.date_time_formatter.c(fVar, fVar2, locale);
    }
}
