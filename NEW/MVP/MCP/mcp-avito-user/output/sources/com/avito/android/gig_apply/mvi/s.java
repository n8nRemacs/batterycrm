package com.avito.android.gig_apply.mvi;

import com.avito.android.gig_apply.ui.GigSlotOpenParams;
import javax.inject.Provider;

/* compiled from: GigSlotBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f159781a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.gig_apply.domain.i f159782b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f159783c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<SK0.b> f159784d;

    public s(dagger.internal.l lVar, com.avito.android.gig_apply.domain.i iVar, Provider provider, Provider provider2) {
        this.f159781a = lVar;
        this.f159782b = iVar;
        this.f159783c = provider;
        this.f159784d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new r((GigSlotOpenParams) this.f159781a.f393949a, (com.avito.android.gig_apply.domain.h) this.f159782b.get(), this.f159783c.get(), this.f159784d.get());
    }
}
