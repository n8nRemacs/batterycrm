package com.avito.android.di.module;

import cK.InterfaceC27058a;
import javax.inject.Provider;
import vm.InterfaceC49346a;

/* compiled from: UserProfileStatusDataProviderModule_ProvideUserProfileStatusDataBridgeFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class ca implements dagger.internal.h<com.avito.android.ui.i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.account.G> f144252a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.remote.notification.M> f144253b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.notification_center.counter.f> f144254c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.common.a> f144255d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.calltracking_core.f> f144256e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC27058a> f144257f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.orders.badge_counter.d f144258g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC49346a> f144259h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.u f144260i;

    public ca(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, com.avito.android.orders.badge_counter.d dVar, Provider provider7, dagger.internal.u uVar) {
        this.f144252a = provider;
        this.f144253b = provider2;
        this.f144254c = provider3;
        this.f144255d = provider4;
        this.f144256e = provider5;
        this.f144257f = provider6;
        this.f144258g = dVar;
        this.f144259h = provider7;
        this.f144260i = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.account.G g12 = this.f144252a.get();
        com.avito.android.remote.notification.M m12 = this.f144253b.get();
        com.avito.android.notification_center.counter.f fVar = this.f144254c.get();
        com.avito.android.common.a aVar = this.f144255d.get();
        com.avito.android.calltracking_core.f fVar2 = this.f144256e.get();
        InterfaceC27058a interfaceC27058a = this.f144257f.get();
        W40.a aVar2 = (W40.a) this.f144258g.get();
        InterfaceC49346a interfaceC49346a = this.f144259h.get();
        com.avito.android.sales_items.a aVar3 = (com.avito.android.sales_items.a) this.f144260i.get();
        int i12 = ba.f144240a;
        return new com.avito.android.ui.m(g12, m12, aVar, fVar, fVar2, interfaceC27058a, aVar2, interfaceC49346a, aVar3);
    }
}
