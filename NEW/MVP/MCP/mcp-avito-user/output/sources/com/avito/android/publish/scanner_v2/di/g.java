package com.avito.android.publish.scanner_v2.di;

import com.avito.android.publish.R0;
import com.avito.android.publish.S0;
import com.avito.android.publish.scanner.i;
import com.avito.android.publish.scanner_v2.di.a;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: VinScannerModule_Companion_ProvideScannerInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<R0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H0> f239419a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f239420b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<CategoryParametersConverter> f239421c;

    /* renamed from: d, reason: collision with root package name */
    public final u f239422d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f239423e;

    public g(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f239419a = provider;
        this.f239420b = provider2;
        this.f239421c = provider3;
        this.f239422d = uVar;
        this.f239423e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H0 h02 = (H0) ((a.c.h) this.f239419a).get();
        C50213a c50213a = (C50213a) ((a.c.g) this.f239420b).get();
        CategoryParametersConverter categoryParametersConverter = (CategoryParametersConverter) ((a.c.d) this.f239421c).get();
        i iVar = (i) this.f239422d.get();
        com.avito.android.remote.error.f fVar = (com.avito.android.remote.error.f) ((a.c.m) this.f239423e).get();
        e.f239416a.getClass();
        return new S0(h02, new d(c50213a, C50213a.class, "sessionId", "getSessionId()Ljava/lang/String;", 0), iVar, categoryParametersConverter, fVar);
    }
}
