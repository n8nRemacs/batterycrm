package com.avito.android.publish.screen.objects.di;

import android.content.res.Resources;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.publish.screen.objects.di.C33986a;
import com.avito.android.util.L4;
import com.avito.android.util.S3;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: ObjectFillFormModule_ProvideCategoryParametersElementConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<com.avito.android.category_parameters.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C34019j f239921a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f239922b;

    /* renamed from: c, reason: collision with root package name */
    public final S3 f239923c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f239924d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<Locale> f239925e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<hJ.e> f239926f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<hJ.g> f239927g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<Q1> f239928h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f239929i;

    public p(C34019j c34019j, dagger.internal.l lVar, S3 s32, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f239921a = c34019j;
        this.f239922b = lVar;
        this.f239923c = s32;
        this.f239924d = provider;
        this.f239925e = provider2;
        this.f239926f = provider3;
        this.f239927g = provider4;
        this.f239928h = provider5;
        this.f239929i = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f239922b.f393949a;
        this.f239923c.getClass();
        L4 l4A = S3.a();
        com.avito.android.server_time.h hVar = (com.avito.android.server_time.h) ((C33986a.c.b0) this.f239924d).get();
        Locale locale = (Locale) ((C33986a.c.B) this.f239925e).get();
        hJ.e eVar = (hJ.e) ((C33986a.c.C34008x) this.f239926f).get();
        hJ.g gVar = (hJ.g) ((C33986a.c.C34009y) this.f239927g).get();
        Q1 q12 = (Q1) ((C33986a.c.P) this.f239928h).get();
        u3.l lVar = (u3.l) ((C33986a.c.S) this.f239929i).get();
        this.f239921a.getClass();
        return new com.avito.android.category_parameters.a(l4A, resources, hVar, false, false, locale, false, gVar, eVar, q12, false, false, false, false, false, lVar, 31832, null);
    }
}
