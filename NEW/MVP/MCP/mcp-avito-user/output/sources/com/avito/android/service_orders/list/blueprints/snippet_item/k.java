package com.avito.android.service_orders.list.blueprints.snippet_item;

import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.service_orders.list.blueprints.ServiceOrdersListSnippetItem;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceOrdersListSnippetPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/snippet_item/k;", "Lcom/avito/android/service_orders/list/blueprints/snippet_item/c;", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public com.avito.android.service_orders.list.l f279350b;

    @Inject
    public k() {
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) throws InterruptedException {
        k((m) eVar, (ServiceOrdersListSnippetItem) aVar);
    }

    @Override // com.avito.android.service_orders.list.blueprints.snippet_item.c
    public final void Q1(@Y61.k com.avito.android.service_orders.list.l lVar) {
        this.f279350b = lVar;
    }

    @Override // com.avito.android.service_orders.list.blueprints.snippet_item.c
    public final void e() {
        this.f279350b = null;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) throws InterruptedException {
        m mVar = (m) eVar;
        ServiceOrdersListSnippetItem serviceOrdersListSnippetItem = (ServiceOrdersListSnippetItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof com.avito.android.service_orders.list.blueprints.d) {
                obj = obj2;
            }
        }
        com.avito.android.service_orders.list.blueprints.d dVar = (com.avito.android.service_orders.list.blueprints.d) (obj instanceof com.avito.android.service_orders.list.blueprints.d ? obj : null);
        if (dVar == null) {
            k(mVar, serviceOrdersListSnippetItem);
            return;
        }
        mVar.D80(dVar.f279293a, dVar.f279295c, dVar.f279294b);
        h hVar = new h(dVar, this, serviceOrdersListSnippetItem);
        Button button = mVar.f279361j;
        com.avito.android.lib.design.button.b.a(button, dVar.f279297e, false);
        button.setOnClickListener(new A(11, hVar));
        mVar.C80(new i(serviceOrdersListSnippetItem, this));
        I5.a(mVar.f279363l, dVar.f279298f, false);
        mVar.B80(new j(serviceOrdersListSnippetItem, this), dVar.f279299g);
        com.avito.android.service_orders.list.l lVar = this.f279350b;
        if (lVar != null) {
            lVar.a(serviceOrdersListSnippetItem.f279229b);
        }
    }

    public final void k(@Y61.k m mVar, @Y61.k ServiceOrdersListSnippetItem serviceOrdersListSnippetItem) throws InterruptedException {
        I5.a(mVar.f279357f, serviceOrdersListSnippetItem.f279232e, false);
        mVar.D80(serviceOrdersListSnippetItem.f279233f, serviceOrdersListSnippetItem.f279235h, serviceOrdersListSnippetItem.f279234g);
        ViewGroup viewGroup = mVar.f279359h;
        viewGroup.removeAllViews();
        Iterator it = serviceOrdersListSnippetItem.f279236i.iterator();
        while (it.hasNext()) {
            mVar.f279355d.a(R.layout.service_orders_list_item_snippet_price_value, viewGroup, new com.avito.android.offlinization.ui.a((ServiceOrdersListSnippetItem.b) it.next(), 24));
        }
        mVar.B80(new d(serviceOrdersListSnippetItem, this), serviceOrdersListSnippetItem.f279237j);
        Button button = mVar.f279360i;
        D6.G(button, false);
        button.setOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(10, null));
        f fVar = new f(serviceOrdersListSnippetItem, this);
        Button button2 = mVar.f279361j;
        com.avito.android.lib.design.button.b.a(button2, serviceOrdersListSnippetItem.f279239l, false);
        button2.setOnClickListener(new A(11, fVar));
        mVar.C80(new g(serviceOrdersListSnippetItem, this));
        I5.a(mVar.f279363l, serviceOrdersListSnippetItem.f279240m, false);
        com.avito.android.service_orders.list.l lVar = this.f279350b;
        if (lVar != null) {
            lVar.a(serviceOrdersListSnippetItem.f279229b);
        }
    }
}
