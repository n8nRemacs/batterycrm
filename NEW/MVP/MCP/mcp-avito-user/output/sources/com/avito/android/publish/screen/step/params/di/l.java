package com.avito.android.publish.screen.step.params.di;

import com.avito.android.Q1;
import com.avito.android.publish.details.x2;
import com.avito.android.publish.details.y2;
import com.avito.android.publish.screen.step.params.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishDetailsModule_ProvideResultHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<com.avito.android.details.b> {

    /* renamed from: a, reason: collision with root package name */
    public final d f241124a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f241125b;

    /* renamed from: c, reason: collision with root package name */
    public final y2 f241126c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Q1> f241127d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.publish.details.parameters_filter.d f241128e;

    public l(d dVar, Provider provider, y2 y2Var, Provider provider2, com.avito.android.publish.details.parameters_filter.d dVar2) {
        this.f241124a = dVar;
        this.f241125b = provider;
        this.f241126c = y2Var;
        this.f241127d = provider2;
        this.f241128e = dVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.details.a aVar = this.f241125b.get();
        x2 x2Var = (x2) this.f241126c.get();
        Q1 q12 = (Q1) ((a.c.f0) this.f241127d).get();
        com.avito.android.publish.details.parameters_filter.c cVar = (com.avito.android.publish.details.parameters_filter.c) this.f241128e.get();
        this.f241124a.getClass();
        com.avito.android.details.c cVar2 = new com.avito.android.details.c(q12);
        cVar2.I(aVar);
        cVar2.f135902f = x2Var;
        cVar2.f135899c = cVar;
        return cVar2;
    }
}
