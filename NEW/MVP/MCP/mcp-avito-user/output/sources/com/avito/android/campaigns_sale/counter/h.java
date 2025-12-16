package com.avito.android.campaigns_sale.counter;

import com.avito.android.account.E;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vm.C49352g;
import vm.InterfaceC49348c;

/* compiled from: CampaignsSaleCounterRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f113875a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f113876b;

    /* renamed from: c, reason: collision with root package name */
    public final gD.h f113877c;

    /* renamed from: d, reason: collision with root package name */
    public final C49352g f113878d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<E> f113879e;

    public h(u uVar, Provider provider, gD.h hVar, C49352g c49352g, Provider provider2) {
        this.f113875a = uVar;
        this.f113876b = provider;
        this.f113877c = hVar;
        this.f113878d = c49352g;
        this.f113879e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = dagger.internal.g.a(w.a(this.f113875a));
        InterfaceC35745a5 interfaceC35745a5 = this.f113876b.get();
        this.f113877c.get();
        return new e(eVarA, interfaceC35745a5, (InterfaceC49348c) this.f113878d.get(), this.f113879e.get());
    }
}
