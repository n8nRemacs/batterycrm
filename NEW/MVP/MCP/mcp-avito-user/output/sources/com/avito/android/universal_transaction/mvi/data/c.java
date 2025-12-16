package com.avito.android.universal_transaction.mvi.data;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zG0.InterfaceC50459a;

/* compiled from: TransactionRepositoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC50459a> f306400a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f306401b;

    /* renamed from: c, reason: collision with root package name */
    public final RK0.c f306402c;

    public c(Provider provider, Provider provider2, RK0.c cVar) {
        this.f306400a = provider;
        this.f306401b = provider2;
        this.f306402c = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = g.a(w.a(this.f306400a));
        R0 r02 = this.f306401b.get();
        this.f306402c.getClass();
        return new b(eVarA, r02, new RK0.b());
    }
}
