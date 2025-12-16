package com.avito.android.avl.di;

import Cl0.InterfaceC13319a;
import Mg.InterfaceC14486a;
import com.avito.android.util.InterfaceC35950u;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zg.InterfaceC50560a;

/* compiled from: AvlSharedModule_ProvideRepositoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class p implements dagger.internal.h<InterfaceC14486a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13319a> f98088a;

    /* renamed from: b, reason: collision with root package name */
    public final u f98089b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35950u> f98090c;

    public p(u uVar, Provider provider, Provider provider2) {
        this.f98088a = provider;
        this.f98089b = uVar;
        this.f98090c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f98088a);
        InterfaceC50560a interfaceC50560a = (InterfaceC50560a) this.f98089b.get();
        InterfaceC35950u interfaceC35950u = this.f98090c.get();
        n.f98086a.getClass();
        return new com.avito.android.avl.repo.a(eVarB, interfaceC50560a, interfaceC35950u);
    }
}
