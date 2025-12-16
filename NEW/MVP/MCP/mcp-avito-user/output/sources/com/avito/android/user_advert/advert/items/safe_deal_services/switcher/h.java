package com.avito.android.user_advert.advert.items.safe_deal_services.switcher;

import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import com.avito.android.user_advert.advert.items.i0;
import com.avito.android.user_advert.advert.items.safe_deal_services.c;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SafeDealServiceSwitcherItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/safe_deal_services/switcher/h;", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/switcher/c;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f310073b;

    @Inject
    public h() {
    }

    @Override // com.avito.android.user_advert.advert.items.safe_deal_services.switcher.c
    public final void N4(@Y61.k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f310073b = myAdvertDetailsActivity;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((j) eVar, (c.b) aVar);
    }

    @Override // com.avito.android.user_advert.advert.items.safe_deal_services.switcher.c
    public final void c0() {
        this.f310073b = null;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        Object next;
        j jVar = (j) eVar;
        c.b bVar = (c.b) aVar;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next != null ? next instanceof i0 : true) {
                    break;
                }
            }
        }
        if (!(next instanceof i0)) {
            next = null;
        }
        i0 i0Var = (i0) next;
        if (i0Var == null || !(bVar instanceof c.b.a)) {
            k(jVar, bVar);
            return;
        }
        d dVar = new d(this, bVar);
        jVar.L20(null);
        jVar.hb(i0Var.f309487b);
        jVar.L20(dVar);
        com.avito.android.user_advert.advert.items.safe_deal_services.d dVar2 = com.avito.android.user_advert.advert.items.safe_deal_services.d.f310050a;
        e eVar2 = new e(this);
        dVar2.getClass();
        jVar.Ub(com.avito.android.user_advert.advert.items.safe_deal_services.d.a(i0Var.f309488c, i0Var.f309489d, eVar2));
        jVar.Dy(i0Var.f309486a);
    }

    public final void k(@Y61.k j jVar, @Y61.k c.b bVar) {
        jVar.iL(bVar.getF310046d());
        com.avito.android.user_advert.advert.items.safe_deal_services.d dVar = com.avito.android.user_advert.advert.items.safe_deal_services.d.f310050a;
        String f310047e = bVar.getF310047e();
        DeepLink f310048f = bVar.getF310048f();
        f fVar = new f(this);
        dVar.getClass();
        jVar.Ub(com.avito.android.user_advert.advert.items.safe_deal_services.d.a(f310047e, f310048f, fVar));
        com.avito.android.user_advert.advert.items.safe_deal_services.a f310049g = bVar.getF310049g();
        if (f310049g != null) {
            jVar.zg(f310049g);
        }
        if (bVar instanceof c.b.C9502b) {
            jVar.L20(null);
            jVar.KH(false);
        } else if (bVar instanceof c.b.a) {
            jVar.KH(true);
            c.b.a aVar = (c.b.a) bVar;
            g gVar = new g(this, bVar);
            jVar.L20(null);
            jVar.hb(aVar.f310041i);
            jVar.L20(gVar);
            jVar.Dy(aVar.f310042j);
        }
    }
}
