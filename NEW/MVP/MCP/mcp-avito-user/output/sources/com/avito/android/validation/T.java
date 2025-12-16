package com.avito.android.validation;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.L4;
import com.avito.android.util.S3;
import javax.inject.Provider;

/* compiled from: ParametersListModule_ProvideParametersListInteractorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class T implements dagger.internal.h<InterfaceC36026p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d1> f319292a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f319293b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f319294c;

    /* renamed from: d, reason: collision with root package name */
    public final S3 f319295d;

    /* renamed from: e, reason: collision with root package name */
    public final c1 f319296e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f319297f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<g1> f319298g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<Q1> f319299h;

    public T(Provider provider, Provider provider2, dagger.internal.u uVar, S3 s32, c1 c1Var, dagger.internal.u uVar2, Provider provider3, Provider provider4) {
        this.f319292a = provider;
        this.f319293b = provider2;
        this.f319294c = uVar;
        this.f319295d = s32;
        this.f319296e = c1Var;
        this.f319297f = uVar2;
        this.f319298g = provider3;
        this.f319299h = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d1 d1Var = this.f319292a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f319293b.get();
        m1 m1Var = (m1) this.f319294c.get();
        this.f319295d.getClass();
        L4 l4A = S3.a();
        InterfaceC35998b interfaceC35998b = (InterfaceC35998b) this.f319296e.get();
        com.avito.android.util.C c12 = (com.avito.android.util.C) this.f319297f.get();
        g1 g1Var = this.f319298g.get();
        Q1 q12 = this.f319299h.get();
        A.f319242a.getClass();
        return new C36045z(d1Var, interfaceC35745a5, m1Var, l4A, new B(interfaceC35998b, c12), g1Var, q12);
    }
}
