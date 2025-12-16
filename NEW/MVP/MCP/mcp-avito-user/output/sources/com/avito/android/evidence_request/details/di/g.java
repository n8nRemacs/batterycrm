package com.avito.android.evidence_request.details.di;

import android.content.res.Resources;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.evidence_request.details.di.C30376a;
import com.avito.android.util.L4;
import com.avito.android.util.S3;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: EvidenceDetailsItemsModule_ProvideCategoryParametersElementConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<com.avito.android.category_parameters.a> {

    /* renamed from: a, reason: collision with root package name */
    public final S3 f148379a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f148380b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f148381c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<hJ.e> f148382d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<hJ.g> f148383e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f148384f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<Q1> f148385g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f148386h;

    public g(S3 s32, Provider provider, Provider provider2, Provider provider3, Provider provider4, dagger.internal.u uVar, Provider provider5, Provider provider6) {
        this.f148379a = s32;
        this.f148380b = provider;
        this.f148381c = provider2;
        this.f148382d = provider3;
        this.f148383e = provider4;
        this.f148384f = uVar;
        this.f148385g = provider5;
        this.f148386h = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        this.f148379a.getClass();
        L4 l4A = S3.a();
        com.avito.android.server_time.h hVar = (com.avito.android.server_time.h) ((C30376a.b.v) this.f148380b).get();
        Locale locale = (Locale) ((C30376a.b.o) this.f148381c).get();
        hJ.e eVar = (hJ.e) ((C30376a.b.k) this.f148382d).get();
        hJ.g gVar = (hJ.g) ((C30376a.b.l) this.f148383e).get();
        Resources resources = (Resources) this.f148384f.get();
        Q1 q12 = (Q1) ((C30376a.b.r) this.f148385g).get();
        u3.l lVar = (u3.l) ((C30376a.b.t) this.f148386h).get();
        f.f148378a.getClass();
        return new com.avito.android.category_parameters.a(l4A, resources, hVar, false, false, locale, false, gVar, eVar, q12, false, false, false, false, false, lVar, 31832, null);
    }
}
