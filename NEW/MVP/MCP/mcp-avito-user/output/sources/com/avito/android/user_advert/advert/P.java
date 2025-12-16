package com.avito.android.user_advert.advert;

import com.avito.android.C29640d;
import com.avito.android.C30566f2;
import com.avito.android.N2;
import com.avito.android.util.InterfaceC35863o4;
import gj.InterfaceC40691b;
import javax.inject.Provider;
import tz.InterfaceC48743a;

/* compiled from: MyAdvertDetailsConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class P implements dagger.internal.h<N> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f308401a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f308402b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<hJ.h> f308403c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f308404d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f308405e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f308406f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f308407g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35373a> f308408h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.u f308409i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.advert_core.feature_teasers.common.f f308410j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.price_list.converter.a> f308411k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.lib.util.groupable_item.f> f308412l;

    /* renamed from: m, reason: collision with root package name */
    public final dagger.internal.u f308413m;

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.u f308414n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f308415o;

    /* renamed from: p, reason: collision with root package name */
    public final dagger.internal.u f308416p;

    /* renamed from: q, reason: collision with root package name */
    public final com.avito.android.user_advert.advert.delegate.multi_urgency.c f308417q;

    /* renamed from: r, reason: collision with root package name */
    public final Provider<com.avito.android.user_advert.advert.delegate.multi_items.a> f308418r;

    /* renamed from: s, reason: collision with root package name */
    public final dagger.internal.u f308419s;

    /* renamed from: t, reason: collision with root package name */
    public final dagger.internal.u f308420t;

    public P(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider, dagger.internal.u uVar3, dagger.internal.u uVar4, dagger.internal.u uVar5, dagger.internal.u uVar6, Provider provider2, dagger.internal.u uVar7, com.avito.android.advert_core.feature_teasers.common.f fVar, Provider provider3, Provider provider4, dagger.internal.u uVar8, dagger.internal.u uVar9, Provider provider5, dagger.internal.u uVar10, com.avito.android.user_advert.advert.delegate.multi_urgency.c cVar, Provider provider6, dagger.internal.u uVar11, dagger.internal.u uVar12) {
        this.f308401a = uVar;
        this.f308402b = uVar2;
        this.f308403c = provider;
        this.f308404d = uVar3;
        this.f308405e = uVar4;
        this.f308406f = uVar5;
        this.f308407g = uVar6;
        this.f308408h = provider2;
        this.f308409i = uVar7;
        this.f308410j = fVar;
        this.f308411k = provider3;
        this.f308412l = provider4;
        this.f308413m = uVar8;
        this.f308414n = uVar9;
        this.f308415o = provider5;
        this.f308416p = uVar10;
        this.f308417q = cVar;
        this.f308418r = provider6;
        this.f308419s = uVar11;
        this.f308420t = uVar12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        hJ.i iVar = (hJ.i) this.f308401a.get();
        hJ.e eVar = (hJ.e) this.f308402b.get();
        hJ.h hVar = this.f308403c.get();
        InterfaceC35863o4 interfaceC35863o4 = (InterfaceC35863o4) this.f308404d.get();
        N2 n22 = (N2) this.f308405e.get();
        C29640d c29640d = (C29640d) this.f308406f.get();
        com.avito.android.Z0 z02 = (com.avito.android.Z0) this.f308407g.get();
        InterfaceC35373a interfaceC35373a = this.f308408h.get();
        com.avito.android.deep_linking.x xVar = (com.avito.android.deep_linking.x) this.f308409i.get();
        this.f308410j.getClass();
        return new N(iVar, eVar, hVar, interfaceC35863o4, n22, c29640d, z02, interfaceC35373a, xVar, new com.avito.android.advert_core.feature_teasers.common.e(), this.f308411k.get(), this.f308412l.get(), (AK0.l) this.f308413m.get(), (com.avito.android.service_booking_persistence.b) this.f308414n.get(), this.f308415o.get(), (com.avito.android.deeplink_handler.mapping.checker.c) this.f308416p.get(), (com.avito.android.user_advert.advert.delegate.multi_urgency.a) this.f308417q.get(), this.f308418r.get(), (C30566f2) this.f308419s.get(), (InterfaceC48743a) this.f308420t.get());
    }
}
