package com.avito.android.campaigns_sale.network;

import com.avito.android.Z0;
import com.avito.android.campaigns_sale.model.CampaignsSaleArguments;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import jm.InterfaceC42397a;
import lj.InterfaceC43779a;
import om.InterfaceC44818a;

/* compiled from: CampaignsSaleInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class t implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f114404a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC44818a> f114405b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC42397a> f114406c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f114407d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f114408e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC43779a> f114409f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<Z0> f114410g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f114411h;

    public t(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f114404a = lVar;
        this.f114405b = provider;
        this.f114406c = provider2;
        this.f114407d = provider3;
        this.f114408e = lVar2;
        this.f114409f = provider4;
        this.f114410g = provider5;
        this.f114411h = provider6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((CampaignsSaleArguments) this.f114404a.f393949a, dagger.internal.g.b(this.f114405b), dagger.internal.g.b(this.f114406c), this.f114407d.get(), (String) this.f114408e.f393949a, this.f114409f.get(), this.f114410g.get(), this.f114411h.get());
    }
}
