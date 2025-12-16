package com.avito.android.payment.di.module;

import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.P3;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: PaymentGenericFormModule_ProvideCategoryParametersElementConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.payment.di.module.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32979f implements dagger.internal.h<com.avito.android.category_parameters.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214258a;

    /* renamed from: b, reason: collision with root package name */
    public final P3 f214259b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f214260c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Locale> f214261d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<hJ.e> f214262e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<hJ.g> f214263f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<Q1> f214264g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f214265h;

    public C32979f(C32977d c32977d, P3 p32, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f214258a = c32977d;
        this.f214259b = p32;
        this.f214260c = provider;
        this.f214261d = provider2;
        this.f214262e = provider3;
        this.f214263f = provider4;
        this.f214264g = provider5;
        this.f214265h = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35945t1 interfaceC35945t1 = (InterfaceC35945t1) this.f214259b.get();
        com.avito.android.server_time.h hVar = this.f214260c.get();
        Locale locale = this.f214261d.get();
        hJ.e eVar = this.f214262e.get();
        return new com.avito.android.category_parameters.a(interfaceC35945t1, this.f214258a.f214255e, hVar, true, false, locale, false, this.f214263f.get(), eVar, this.f214264g.get(), false, false, false, false, false, this.f214265h.get(), 31824, null);
    }
}
