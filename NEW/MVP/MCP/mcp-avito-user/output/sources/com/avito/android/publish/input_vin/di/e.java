package com.avito.android.publish.input_vin.di;

import android.content.res.Resources;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.publish.input_vin.di.a;
import com.avito.android.util.L4;
import com.avito.android.util.S3;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: InputVinModule_ProvideCategoryParametersElementConverterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<com.avito.android.category_parameters.a> {

    /* renamed from: a, reason: collision with root package name */
    public final S3 f236568a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f236569b;

    /* renamed from: c, reason: collision with root package name */
    public final l f236570c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Locale> f236571d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<hJ.e> f236572e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<hJ.g> f236573f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<Q1> f236574g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f236575h;

    public e(S3 s32, l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f236568a = s32;
        this.f236569b = provider;
        this.f236570c = lVar;
        this.f236571d = provider2;
        this.f236572e = provider3;
        this.f236573f = provider4;
        this.f236574g = provider5;
        this.f236575h = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        this.f236568a.getClass();
        L4 l4A = S3.a();
        com.avito.android.server_time.h hVar = (com.avito.android.server_time.h) ((a.c.C) this.f236569b).get();
        Resources resources = (Resources) this.f236570c.f393949a;
        Locale locale = (Locale) ((a.c.n) this.f236571d).get();
        hJ.e eVar = (hJ.e) ((a.c.j) this.f236572e).get();
        hJ.g gVar = (hJ.g) ((a.c.k) this.f236573f).get();
        Q1 q12 = (Q1) ((a.c.v) this.f236574g).get();
        u3.l lVar = (u3.l) ((a.c.y) this.f236575h).get();
        d dVar = d.f236567a;
        return new com.avito.android.category_parameters.a(l4A, resources, hVar, false, false, locale, false, gVar, eVar, q12, false, false, false, false, false, lVar, 31832, null);
    }
}
