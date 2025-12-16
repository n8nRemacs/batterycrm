package com.avito.android.universal_transaction.transaction;

import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.util.R0;
import java.util.Set;
import javax.inject.Provider;
import yG0.C50113a;

/* compiled from: TransactionViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class B implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.universal_transaction.mvi.o f306541a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<n.a> f306542b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f306543c;

    /* renamed from: d, reason: collision with root package name */
    public final C31151u0 f306544d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C50113a> f306545e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.beduin.v2.engine.component.B> f306546f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<Set<FV0.h>> f306547g;

    /* renamed from: h, reason: collision with root package name */
    public final C31144q0 f306548h;

    public B(com.avito.android.universal_transaction.mvi.o oVar, Provider provider, Provider provider2, C31151u0 c31151u0, Provider provider3, Provider provider4, Provider provider5, C31144q0 c31144q0) {
        this.f306541a = oVar;
        this.f306542b = provider;
        this.f306543c = provider2;
        this.f306544d = c31151u0;
        this.f306545e = provider3;
        this.f306546f = provider4;
        this.f306547g = provider5;
        this.f306548h = c31144q0;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A((com.avito.android.universal_transaction.mvi.n) this.f306541a.get(), this.f306542b.get(), this.f306543c.get(), (ZS.b) this.f306544d.get(), this.f306545e.get(), this.f306546f.get(), this.f306547g.get(), (aU0.b) this.f306548h.get());
    }
}
