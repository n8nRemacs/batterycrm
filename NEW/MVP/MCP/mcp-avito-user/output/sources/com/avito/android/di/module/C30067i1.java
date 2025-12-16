package com.avito.android.di.module;

import java.util.ArrayList;
import javax.inject.Provider;
import kotlin.collections.C42745f0;

/* compiled from: AvitoAnalyticsModule_BindErrorReporterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.i1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30067i1 implements dagger.internal.h<com.avito.android.error_reporting.error_reporter.n> {

    /* renamed from: a, reason: collision with root package name */
    public final C30056h1 f144336a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.S f144337b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.error_reporting.f> f144338c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.error_reporting.l f144339d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.error_reporting.b f144340e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.error_reporting.error_reporter.r f144341f;

    public C30067i1(C30056h1 c30056h1, com.avito.android.S s5, Provider provider, com.avito.android.error_reporting.l lVar, com.avito.android.error_reporting.b bVar, com.avito.android.error_reporting.error_reporter.r rVar) {
        this.f144336a = c30056h1;
        this.f144337b = s5;
        this.f144338c = provider;
        this.f144339d = lVar;
        this.f144340e = bVar;
        this.f144341f = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.P p12 = (com.avito.android.P) this.f144337b.get();
        h31.e eVarB = dagger.internal.g.b(this.f144338c);
        h31.e eVarB2 = dagger.internal.g.b(this.f144339d);
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f144340e));
        h31.e eVarB3 = dagger.internal.g.b(this.f144341f);
        this.f144336a.getClass();
        ArrayList arrayList = new ArrayList();
        kotlin.reflect.n<Object>[] nVarArr = com.avito.android.P.f67370w0;
        kotlin.reflect.n<Object> nVar = nVarArr[52];
        arrayList.add(((Boolean) p12.f67383M.a().invoke()).booleanValue() ? (com.avito.android.error_reporting.j) eVarB2.get() : null);
        kotlin.reflect.n<Object> nVar2 = nVarArr[53];
        arrayList.add(((Boolean) p12.f67384N.a().invoke()).booleanValue() ? (com.avito.android.error_reporting.f) eVarB.get() : null);
        kotlin.reflect.n<Object> nVar3 = nVarArr[54];
        arrayList.add(((Boolean) p12.f67385O.a().invoke()).booleanValue() ? (com.avito.android.error_reporting.a) eVarA.get() : null);
        arrayList.add(arrayList.isEmpty() ? (com.avito.android.error_reporting.error_reporter.p) eVarB3.get() : null);
        return new com.avito.android.error_reporting.error_reporter.t(C42745f0.C(arrayList));
    }
}
