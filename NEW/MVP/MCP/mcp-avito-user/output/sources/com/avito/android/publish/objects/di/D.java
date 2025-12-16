package com.avito.android.publish.objects.di;

import android.content.res.Resources;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.publish.objects.di.C33894a;
import com.avito.android.util.L4;
import com.avito.android.util.S3;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: ObjectFillFormModule_ProvideCategoryParametersElementConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class D implements dagger.internal.h<com.avito.android.category_parameters.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f237604a;

    /* renamed from: b, reason: collision with root package name */
    public final S3 f237605b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f237606c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Locale> f237607d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<hJ.e> f237608e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<hJ.g> f237609f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<Q1> f237610g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f237611h;

    public D(S3 s32, dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f237604a = lVar;
        this.f237605b = s32;
        this.f237606c = provider;
        this.f237607d = provider2;
        this.f237608e = provider3;
        this.f237609f = provider4;
        this.f237610g = provider5;
        this.f237611h = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f237604a.f393949a;
        this.f237605b.getClass();
        L4 l4A = S3.a();
        com.avito.android.server_time.h hVar = (com.avito.android.server_time.h) ((C33894a.c.b0) this.f237606c).get();
        Locale locale = (Locale) ((C33894a.c.B) this.f237607d).get();
        hJ.e eVar = (hJ.e) ((C33894a.c.C33916x) this.f237608e).get();
        hJ.g gVar = (hJ.g) ((C33894a.c.C33917y) this.f237609f).get();
        Q1 q12 = (Q1) ((C33894a.c.P) this.f237610g).get();
        u3.l lVar = (u3.l) ((C33894a.c.S) this.f237611h).get();
        C33939w.f238031a.getClass();
        return new com.avito.android.category_parameters.a(l4A, resources, hVar, false, false, locale, false, gVar, eVar, q12, false, false, false, false, false, lVar, 31832, null);
    }
}
