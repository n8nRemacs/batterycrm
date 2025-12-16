package com.avito.android.publish.merge_pretend_premoderation;

import com.avito.android.publish.C0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MergePretendPremoderationViewModelImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f237435a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.publish.pretend.e> f237436b;

    /* renamed from: c, reason: collision with root package name */
    public final u f237437c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C0> f237438d;

    /* renamed from: e, reason: collision with root package name */
    public final n f237439e;

    public k(Provider provider, Provider provider2, u uVar, Provider provider3, n nVar) {
        this.f237435a = provider;
        this.f237436b = provider2;
        this.f237437c = uVar;
        this.f237438d = provider3;
        this.f237439e = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = this.f237435a.get();
        com.avito.android.publish.pretend.e eVar = this.f237436b.get();
        com.avito.android.publish.premoderation.k kVar = (com.avito.android.publish.premoderation.k) this.f237437c.get();
        C0 c02 = this.f237438d.get();
        this.f237439e.getClass();
        return new j(interfaceC35745a5, eVar, kVar, c02, new m());
    }
}
