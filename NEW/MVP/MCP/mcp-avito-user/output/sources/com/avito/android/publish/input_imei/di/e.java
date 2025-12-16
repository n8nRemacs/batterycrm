package com.avito.android.publish.input_imei.di;

import android.content.res.Resources;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.publish.input_imei.di.a;
import com.avito.android.util.L4;
import com.avito.android.util.S3;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: InputImeiModule_ProvideCategoryParametersElementConverterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<com.avito.android.category_parameters.a> {

    /* renamed from: a, reason: collision with root package name */
    public final S3 f236323a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f236324b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f236325c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Locale> f236326d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<hJ.e> f236327e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<hJ.g> f236328f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<Q1> f236329g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f236330h;

    public e(S3 s32, dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f236323a = s32;
        this.f236324b = provider;
        this.f236325c = lVar;
        this.f236326d = provider2;
        this.f236327e = provider3;
        this.f236328f = provider4;
        this.f236329g = provider5;
        this.f236330h = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        this.f236323a.getClass();
        L4 l4A = S3.a();
        com.avito.android.server_time.h hVar = (com.avito.android.server_time.h) ((a.c.v) this.f236324b).get();
        Resources resources = (Resources) this.f236325c.f393949a;
        Locale locale = (Locale) ((a.c.k) this.f236326d).get();
        hJ.e eVar = (hJ.e) ((a.c.g) this.f236327e).get();
        hJ.g gVar = (hJ.g) ((a.c.h) this.f236328f).get();
        Q1 q12 = (Q1) ((a.c.o) this.f236329g).get();
        u3.l lVar = (u3.l) ((a.c.r) this.f236330h).get();
        d dVar = d.f236322a;
        return new com.avito.android.category_parameters.a(l4A, resources, hVar, false, false, locale, false, gVar, eVar, q12, false, false, false, false, false, lVar, 31832, null);
    }
}
