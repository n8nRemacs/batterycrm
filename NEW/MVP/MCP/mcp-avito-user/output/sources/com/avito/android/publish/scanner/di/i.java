package com.avito.android.publish.scanner.di;

import com.avito.android.publish.R0;
import com.avito.android.publish.S0;
import com.avito.android.publish.scanner.di.a;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: ScannerModule_ProvideScannerInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<R0> {

    /* renamed from: a, reason: collision with root package name */
    public final f f239196a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<H0> f239197b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C50213a> f239198c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<CategoryParametersConverter> f239199d;

    /* renamed from: e, reason: collision with root package name */
    public final u f239200e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f239201f;

    public i(f fVar, Provider provider, Provider provider2, Provider provider3, u uVar, Provider provider4) {
        this.f239196a = fVar;
        this.f239197b = provider;
        this.f239198c = provider2;
        this.f239199d = provider3;
        this.f239200e = uVar;
        this.f239201f = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H0 h02 = (H0) ((a.c.f) this.f239197b).get();
        C50213a c50213a = (C50213a) ((a.c.e) this.f239198c).get();
        CategoryParametersConverter categoryParametersConverter = (CategoryParametersConverter) ((a.c.b) this.f239199d).get();
        com.avito.android.publish.scanner.i iVar = (com.avito.android.publish.scanner.i) this.f239200e.get();
        com.avito.android.remote.error.f fVar = (com.avito.android.remote.error.f) ((a.c.l) this.f239201f).get();
        this.f239196a.getClass();
        return new S0(h02, new g(c50213a, C50213a.class, "sessionId", "getSessionId()Ljava/lang/String;", 0), iVar, categoryParametersConverter, fVar);
    }
}
