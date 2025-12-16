package com.avito.android.crm_candidates.di.candidates;

import com.avito.android.crm_candidates.di.candidates.a;
import com.avito.android.di.module.C30136o4;
import com.avito.android.server_time.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: JobCrmCandidatesModule_ProvideFormatterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<com.avito.android.date_time_formatter.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f129244a;

    /* renamed from: b, reason: collision with root package name */
    public final C30136o4 f129245b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f129246c;

    public e(Provider provider, C30136o4 c30136o4, Provider provider2) {
        this.f129244a = provider;
        this.f129245b = c30136o4;
        this.f129246c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) ((a.c.g) this.f129244a).get();
        com.avito.android.date_time_formatter.f fVar2 = (com.avito.android.date_time_formatter.f) this.f129245b.get();
        Locale locale = (Locale) ((a.c.f) this.f129246c).get();
        d.f129243a.getClass();
        return new com.avito.android.date_time_formatter.c(fVar, fVar2, locale);
    }
}
