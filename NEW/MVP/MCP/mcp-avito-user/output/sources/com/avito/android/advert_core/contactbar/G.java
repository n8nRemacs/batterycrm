package com.avito.android.advert_core.contactbar;

import com.avito.android.C29640d;
import javax.inject.Provider;
import lD.C43617a;
import ur.InterfaceC49101b;

/* compiled from: ContactBarActionsFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class G implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28262a> f83129a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f83130b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f83131c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f83132d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C29640d> f83133e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.credits.installments.d> f83134f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.price_with_delivery.c> f83135g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f83136h;

    public G(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f83129a = provider;
        this.f83130b = uVar;
        this.f83131c = uVar2;
        this.f83132d = uVar3;
        this.f83133e = provider2;
        this.f83134f = provider3;
        this.f83135g = provider4;
        this.f83136h = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C(this.f83129a.get(), (com.avito.android.advert_core.safedeal.trust_factors.a) this.f83130b.get(), (com.avito.android.deep_linking.x) this.f83131c.get(), (C43617a) this.f83132d.get(), this.f83133e.get(), this.f83134f.get(), this.f83135g.get(), (InterfaceC49101b) this.f83136h.get());
    }
}
