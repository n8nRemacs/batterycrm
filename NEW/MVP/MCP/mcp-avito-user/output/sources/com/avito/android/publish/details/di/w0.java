package com.avito.android.publish.details.di;

import com.avito.android.Q1;
import com.avito.android.publish.details.di.C33697f;
import com.avito.android.publish.details.x2;
import com.avito.android.publish.details.y2;
import javax.inject.Provider;

/* compiled from: PublishDetailsModule_ProvideResultHandlerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class w0 implements dagger.internal.h<com.avito.android.details.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f234598a;

    /* renamed from: b, reason: collision with root package name */
    public final y2 f234599b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Q1> f234600c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.publish.details.parameters_filter.d f234601d;

    public w0(Provider provider, y2 y2Var, Provider provider2, com.avito.android.publish.details.parameters_filter.d dVar) {
        this.f234598a = provider;
        this.f234599b = y2Var;
        this.f234600c = provider2;
        this.f234601d = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.details.a aVar = this.f234598a.get();
        x2 x2Var = (x2) this.f234599b.get();
        Q1 q12 = (Q1) ((C33697f.c.f0) this.f234600c).get();
        com.avito.android.publish.details.parameters_filter.c cVar = (com.avito.android.publish.details.parameters_filter.c) this.f234601d.get();
        n0.f234577a.getClass();
        com.avito.android.details.c cVar2 = new com.avito.android.details.c(q12);
        cVar2.I(aVar);
        cVar2.f135902f = x2Var;
        cVar2.f135899c = cVar;
        return cVar2;
    }
}
