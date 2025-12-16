package com.avito.android.profile.pro.impl.di;

import com.avito.android.profile.pro.impl.screen.item.service_booking_block.t;
import com.avito.android.profile.pro.impl.screen.item.service_booking_block.u;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileProModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: A, reason: collision with root package name */
    public final Provider<com.avito.android.profile.pro.impl.screen.item.avito_finance.item.b> f222611A;

    /* renamed from: B, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.avito_finance.stub.c f222612B;

    /* renamed from: C, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.avito_finance.item_skeleton.b f222613C;

    /* renamed from: D, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.avito_finance.stub_skeleton.b f222614D;

    /* renamed from: E, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.recommendations.b f222615E;

    /* renamed from: a, reason: collision with root package name */
    public final f f222616a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.avatar.b f222617b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.dashboard.b f222618c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.dashboard_stats.b f222619d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.b f222620e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.name.b f222621f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.rating.b f222622g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.passport.b f222623h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.orders.b f222624i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.active_orders_common.items.order.b f222625j;

    /* renamed from: k, reason: collision with root package name */
    public final com.avito.android.active_orders_common.items.all_orders.b f222626k;

    /* renamed from: l, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.walletandprepayment.b f222627l;

    /* renamed from: m, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.group.title.b f222628m;

    /* renamed from: n, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.group.row.c f222629n;

    /* renamed from: o, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.employee.company.b f222630o;

    /* renamed from: p, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.employee.limits.b f222631p;

    /* renamed from: q, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.employee.mode.b f222632q;

    /* renamed from: r, reason: collision with root package name */
    public final Provider<com.avito.android.profile.pro.impl.screen.item.service_booking_block.i> f222633r;

    /* renamed from: s, reason: collision with root package name */
    public final u f222634s;

    /* renamed from: t, reason: collision with root package name */
    public final Provider<com.avito.android.profile.pro.impl.screen.item.geo_banner.a> f222635t;

    /* renamed from: u, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.reputation.b f222636u;

    /* renamed from: v, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.delivery_restriction.b f222637v;

    /* renamed from: w, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.beduin.b f222638w;

    /* renamed from: x, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.my_services.b f222639x;

    /* renamed from: y, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.widget_group.title.b f222640y;

    /* renamed from: z, reason: collision with root package name */
    public final com.avito.android.profile.pro.impl.screen.item.widget_group.widget.b f222641z;

    public j(f fVar, com.avito.android.profile.pro.impl.screen.item.avatar.b bVar, com.avito.android.profile.pro.impl.screen.item.dashboard.b bVar2, com.avito.android.profile.pro.impl.screen.item.dashboard_stats.b bVar3, com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.b bVar4, com.avito.android.profile.pro.impl.screen.item.name.b bVar5, com.avito.android.profile.pro.impl.screen.item.rating.b bVar6, com.avito.android.profile.pro.impl.screen.item.passport.b bVar7, com.avito.android.profile.pro.impl.screen.item.orders.b bVar8, com.avito.android.active_orders_common.items.order.b bVar9, com.avito.android.active_orders_common.items.all_orders.b bVar10, com.avito.android.profile.pro.impl.screen.item.walletandprepayment.b bVar11, com.avito.android.profile.pro.impl.screen.item.group.title.b bVar12, com.avito.android.profile.pro.impl.screen.item.group.row.c cVar, com.avito.android.profile.pro.impl.screen.item.employee.company.b bVar13, com.avito.android.profile.pro.impl.screen.item.employee.limits.b bVar14, com.avito.android.profile.pro.impl.screen.item.employee.mode.b bVar15, Provider provider, u uVar, Provider provider2, com.avito.android.profile.pro.impl.screen.item.reputation.b bVar16, com.avito.android.profile.pro.impl.screen.item.delivery_restriction.b bVar17, com.avito.android.profile.pro.impl.screen.item.beduin.b bVar18, com.avito.android.profile.pro.impl.screen.item.my_services.b bVar19, com.avito.android.profile.pro.impl.screen.item.widget_group.title.b bVar20, com.avito.android.profile.pro.impl.screen.item.widget_group.widget.b bVar21, Provider provider3, com.avito.android.profile.pro.impl.screen.item.avito_finance.stub.c cVar2, com.avito.android.profile.pro.impl.screen.item.avito_finance.item_skeleton.b bVar22, com.avito.android.profile.pro.impl.screen.item.avito_finance.stub_skeleton.b bVar23, com.avito.android.profile.pro.impl.screen.item.recommendations.b bVar24) {
        this.f222616a = fVar;
        this.f222617b = bVar;
        this.f222618c = bVar2;
        this.f222619d = bVar3;
        this.f222620e = bVar4;
        this.f222621f = bVar5;
        this.f222622g = bVar6;
        this.f222623h = bVar7;
        this.f222624i = bVar8;
        this.f222625j = bVar9;
        this.f222626k = bVar10;
        this.f222627l = bVar11;
        this.f222628m = bVar12;
        this.f222629n = cVar;
        this.f222630o = bVar13;
        this.f222631p = bVar14;
        this.f222632q = bVar15;
        this.f222633r = provider;
        this.f222634s = uVar;
        this.f222635t = provider2;
        this.f222636u = bVar16;
        this.f222637v = bVar17;
        this.f222638w = bVar18;
        this.f222639x = bVar19;
        this.f222640y = bVar20;
        this.f222641z = bVar21;
        this.f222611A = provider3;
        this.f222612B = cVar2;
        this.f222613C = bVar22;
        this.f222614D = bVar23;
        this.f222615E = bVar24;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.profile.pro.impl.screen.item.avatar.a aVar = (com.avito.android.profile.pro.impl.screen.item.avatar.a) this.f222617b.get();
        com.avito.android.profile.pro.impl.screen.item.dashboard.a aVar2 = (com.avito.android.profile.pro.impl.screen.item.dashboard.a) this.f222618c.get();
        com.avito.android.profile.pro.impl.screen.item.dashboard_stats.a aVar3 = (com.avito.android.profile.pro.impl.screen.item.dashboard_stats.a) this.f222619d.get();
        com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.a aVar4 = (com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.a) this.f222620e.get();
        com.avito.android.profile.pro.impl.screen.item.name.a aVar5 = (com.avito.android.profile.pro.impl.screen.item.name.a) this.f222621f.get();
        com.avito.android.profile.pro.impl.screen.item.rating.a aVar6 = (com.avito.android.profile.pro.impl.screen.item.rating.a) this.f222622g.get();
        com.avito.android.profile.pro.impl.screen.item.passport.a aVar7 = (com.avito.android.profile.pro.impl.screen.item.passport.a) this.f222623h.get();
        com.avito.android.profile.pro.impl.screen.item.orders.a aVar8 = (com.avito.android.profile.pro.impl.screen.item.orders.a) this.f222624i.get();
        com.avito.android.active_orders_common.items.order.a aVar9 = (com.avito.android.active_orders_common.items.order.a) this.f222625j.get();
        com.avito.android.active_orders_common.items.all_orders.a aVar10 = (com.avito.android.active_orders_common.items.all_orders.a) this.f222626k.get();
        com.avito.android.profile.pro.impl.screen.item.walletandprepayment.a aVar11 = (com.avito.android.profile.pro.impl.screen.item.walletandprepayment.a) this.f222627l.get();
        com.avito.android.profile.pro.impl.screen.item.group.title.a aVar12 = (com.avito.android.profile.pro.impl.screen.item.group.title.a) this.f222628m.get();
        com.avito.android.profile.pro.impl.screen.item.group.row.b bVar = (com.avito.android.profile.pro.impl.screen.item.group.row.b) this.f222629n.get();
        com.avito.android.profile.pro.impl.screen.item.employee.company.a aVar13 = (com.avito.android.profile.pro.impl.screen.item.employee.company.a) this.f222630o.get();
        com.avito.android.profile.pro.impl.screen.item.employee.limits.a aVar14 = (com.avito.android.profile.pro.impl.screen.item.employee.limits.a) this.f222631p.get();
        com.avito.android.profile.pro.impl.screen.item.employee.mode.a aVar15 = (com.avito.android.profile.pro.impl.screen.item.employee.mode.a) this.f222632q.get();
        com.avito.android.profile.pro.impl.screen.item.service_booking_block.i iVar = this.f222633r.get();
        t tVar = (t) this.f222634s.get();
        com.avito.android.profile.pro.impl.screen.item.geo_banner.a aVar16 = this.f222635t.get();
        com.avito.android.profile.pro.impl.screen.item.reputation.a aVar17 = (com.avito.android.profile.pro.impl.screen.item.reputation.a) this.f222636u.get();
        com.avito.android.profile.pro.impl.screen.item.delivery_restriction.a aVar18 = (com.avito.android.profile.pro.impl.screen.item.delivery_restriction.a) this.f222637v.get();
        com.avito.android.profile.pro.impl.screen.item.beduin.a aVar19 = (com.avito.android.profile.pro.impl.screen.item.beduin.a) this.f222638w.get();
        com.avito.android.profile.pro.impl.screen.item.my_services.a aVar20 = (com.avito.android.profile.pro.impl.screen.item.my_services.a) this.f222639x.get();
        com.avito.android.profile.pro.impl.screen.item.widget_group.title.a aVar21 = (com.avito.android.profile.pro.impl.screen.item.widget_group.title.a) this.f222640y.get();
        com.avito.android.profile.pro.impl.screen.item.widget_group.widget.a aVar22 = (com.avito.android.profile.pro.impl.screen.item.widget_group.widget.a) this.f222641z.get();
        com.avito.android.profile.pro.impl.screen.item.avito_finance.item.b bVar2 = this.f222611A.get();
        com.avito.android.profile.pro.impl.screen.item.avito_finance.stub.b bVar3 = (com.avito.android.profile.pro.impl.screen.item.avito_finance.stub.b) this.f222612B.get();
        com.avito.android.profile.pro.impl.screen.item.avito_finance.item_skeleton.a aVar23 = (com.avito.android.profile.pro.impl.screen.item.avito_finance.item_skeleton.a) this.f222613C.get();
        com.avito.android.profile.pro.impl.screen.item.avito_finance.stub_skeleton.a aVar24 = (com.avito.android.profile.pro.impl.screen.item.avito_finance.stub_skeleton.a) this.f222614D.get();
        com.avito.android.profile.pro.impl.screen.item.recommendations.a aVar25 = (com.avito.android.profile.pro.impl.screen.item.recommendations.a) this.f222615E.get();
        this.f222616a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar4);
        c10493a.b(aVar3);
        c10493a.b(aVar5);
        c10493a.b(aVar6);
        c10493a.b(aVar7);
        c10493a.b(aVar8);
        c10493a.b(aVar9);
        c10493a.b(aVar10);
        c10493a.b(aVar11);
        c10493a.b(aVar12);
        c10493a.b(bVar);
        c10493a.b(aVar13);
        c10493a.b(aVar14);
        c10493a.b(aVar15);
        c10493a.b(iVar);
        c10493a.b(tVar);
        c10493a.b(aVar16);
        c10493a.b(aVar17);
        c10493a.b(aVar18);
        c10493a.b(aVar19);
        c10493a.b(aVar20);
        c10493a.b(aVar21);
        c10493a.b(aVar22);
        c10493a.b(bVar2);
        c10493a.b(bVar3);
        c10493a.b(aVar23);
        c10493a.b(aVar24);
        c10493a.b(aVar25);
        return c10493a.a();
    }
}
