package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.recall_me.InterfaceC28164a;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import javax.inject.Provider;
import lD.C43617a;

/* compiled from: AdvertDetailsContactBarItemFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class B0 implements dagger.internal.h<A0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.advert.item.similars.j> f73706a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28265d> f73707b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f73708c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C43617a> f73709d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.B2> f73710e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<Boolean> f73711f;

    public B0(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f73706a = provider;
        this.f73707b = provider2;
        this.f73708c = uVar;
        this.f73709d = provider3;
        this.f73710e = provider4;
        this.f73711f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A0(this.f73706a.get(), this.f73707b.get(), (InterfaceC28164a) this.f73708c.get(), this.f73709d.get(), this.f73710e.get(), this.f73711f.get().booleanValue());
    }
}
