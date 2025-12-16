package com.avito.android.gig_apply.mvi;

import com.avito.android.gig_apply.ui.GigSlotOpenParams;
import javax.inject.Provider;
import mH.C43964c;
import mH.C43965d;

/* compiled from: GigSlotActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f159749a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f159750b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.gig_apply.domain.i f159751c;

    /* renamed from: d, reason: collision with root package name */
    public final C43965d f159752d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.gig_apply.domain.g f159753e;

    public p(dagger.internal.l lVar, Provider provider, com.avito.android.gig_apply.domain.i iVar, C43965d c43965d, com.avito.android.gig_apply.domain.g gVar) {
        this.f159749a = lVar;
        this.f159750b = provider;
        this.f159751c = iVar;
        this.f159752d = c43965d;
        this.f159753e = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n((GigSlotOpenParams) this.f159749a.f393949a, this.f159750b.get(), (com.avito.android.gig_apply.domain.h) this.f159751c.get(), (C43964c) this.f159752d.get(), (com.avito.android.gig_apply.domain.e) this.f159753e.get());
    }
}
