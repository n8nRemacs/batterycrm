package com.avito.android.user_advert.advert.items.installments_promoblock;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import com.avito.android.user_advert.advert.items.C35401b;
import com.avito.android.user_advert.advert.items.installments_promoblock.a;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InstallmentsPromoBlockItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/installments_promoblock/h;", "Lcom/avito/android/user_advert/advert/items/installments_promoblock/d;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.util.groupable_item.b f309521b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f309522c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f309523d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f309524e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public MyAdvertDetailsActivity f309525f;

    @Inject
    public h(@Y61.k com.avito.android.lib.util.groupable_item.b bVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f309521b = bVar;
        this.f309522c = aVar;
        this.f309523d = interfaceC28373a;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((j) eVar, (a) aVar);
    }

    @Override // com.avito.android.user_advert.advert.items.installments_promoblock.d
    public final void c0() {
        this.f309525f = null;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        j jVar = (j) eVar;
        a aVar2 = (a) aVar;
        Iterator it = list.iterator();
        Object obj = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null ? next instanceof C35401b : true) {
                obj = next;
            }
        }
        if (!(obj instanceof C35401b)) {
            obj = null;
        }
        C35401b c35401b = (C35401b) obj;
        if (c35401b == null) {
            k(jVar, aVar2);
            return;
        }
        jVar.eL(c35401b.f309272c, new e(this.f309522c));
        jVar.UM(c35401b.f309270a);
        f fVar = new f(aVar2, this);
        jVar.Bu(null);
        jVar.rx(c35401b.f309271b);
        jVar.Bu(fVar);
    }

    public final void k(@Y61.k j jVar, @Y61.k a aVar) {
        this.f309521b.a(jVar, aVar);
        jVar.Kc(aVar.f309494f);
        jVar.e(aVar.f309492d);
        jVar.k(aVar.f309493e);
        a.C9491a c9491a = aVar.f309495g;
        jVar.Ka(c9491a != null ? c9491a.f309499a : null);
        jVar.eL(c9491a != null ? c9491a.f309500b : null, new com.avito.android.advert_details_items.buyer_bonuses.g(9, this, c9491a));
        jVar.PO(c9491a != null ? c9491a.f309501c : null);
        jVar.UM(c9491a != null ? c9491a.f309504f : false);
        boolean z12 = c9491a != null ? c9491a.f309502d : false;
        g gVar = new g(c9491a, this, aVar);
        jVar.Bu(null);
        jVar.rx(z12);
        jVar.Bu(gVar);
        if (this.f309524e) {
            return;
        }
        this.f309524e = true;
        com.avito.android.analytics.provider.clickstream.a aVar2 = aVar.f309496h;
        if (aVar2 != null) {
            this.f309523d.c(aVar2);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.installments_promoblock.d
    public final void m2(@Y61.k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309525f = myAdvertDetailsActivity;
    }
}
