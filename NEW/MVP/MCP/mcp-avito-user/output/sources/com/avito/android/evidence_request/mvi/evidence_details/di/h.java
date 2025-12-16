package com.avito.android.evidence_request.mvi.evidence_details.di;

import android.content.res.Resources;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.evidence_request.mvi.evidence_details.di.a;
import com.avito.android.util.L4;
import com.avito.android.util.S3;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: EvidenceDetailsModule_ProvideCategoryParametersElementConverterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<com.avito.android.category_parameters.a> {

    /* renamed from: a, reason: collision with root package name */
    public final S3 f148931a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f148932b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f148933c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<hJ.e> f148934d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<hJ.g> f148935e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<Resources> f148936f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<Q1> f148937g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f148938h;

    public h(S3 s32, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f148931a = s32;
        this.f148932b = provider;
        this.f148933c = provider2;
        this.f148934d = provider3;
        this.f148935e = provider4;
        this.f148936f = provider5;
        this.f148937g = provider6;
        this.f148938h = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f148931a.getClass();
        L4 l4A = S3.a();
        com.avito.android.server_time.h hVar = (com.avito.android.server_time.h) ((a.b.w) this.f148932b).get();
        Locale locale = (Locale) ((a.b.o) this.f148933c).get();
        hJ.e eVar = (hJ.e) ((a.b.k) this.f148934d).get();
        hJ.g gVar = (hJ.g) ((a.b.l) this.f148935e).get();
        Resources resources = this.f148936f.get();
        Q1 q12 = (Q1) ((a.b.r) this.f148937g).get();
        u3.l lVar = (u3.l) ((a.b.t) this.f148938h).get();
        d.f148929a.getClass();
        return new com.avito.android.category_parameters.a(l4A, resources, hVar, false, false, locale, false, gVar, eVar, q12, false, false, false, false, false, lVar, 31832, null);
    }
}
