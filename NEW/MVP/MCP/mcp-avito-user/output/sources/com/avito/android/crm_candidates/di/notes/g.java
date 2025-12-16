package com.avito.android.crm_candidates.di.notes;

import com.avito.android.crm_candidates.di.notes.a;
import com.avito.android.di.module.C30136o4;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: JobCrmAddNoteModule_ProvideFormatterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<com.avito.android.date_time_formatter.b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f129329a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f129330b;

    /* renamed from: c, reason: collision with root package name */
    public final C30136o4 f129331c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Locale> f129332d;

    public g(f fVar, Provider provider, C30136o4 c30136o4, Provider provider2) {
        this.f129329a = fVar;
        this.f129330b = provider;
        this.f129331c = c30136o4;
        this.f129332d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.f fVar = (com.avito.android.server_time.f) ((a.c.f) this.f129330b).get();
        com.avito.android.date_time_formatter.f fVar2 = (com.avito.android.date_time_formatter.f) this.f129331c.get();
        Locale locale = (Locale) ((a.c.e) this.f129332d).get();
        this.f129329a.getClass();
        return new com.avito.android.date_time_formatter.c(fVar, fVar2, locale);
    }
}
