package com.avito.android.active_orders_common.items.order;

import com.avito.android.active_orders_common.items.diff.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.L3;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: OrderItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/active_orders_common/items/order/h;", "Lcom/avito/android/active_orders_common/items/order/f;", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final j f68380b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f68381c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super DeepLink, G0> f68382d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final e2 f68383e;

    @Inject
    public h(@Y61.k j jVar) {
        this.f68380b = jVar;
        e2 e2VarB = f2.b(0, 1, null, 5);
        this.f68381c = e2VarB;
        this.f68383e = e2VarB;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((m) eVar, (OrderItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        m mVar = (m) eVar;
        OrderItem orderItem = (OrderItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof a.b) {
                obj = obj2;
            }
        }
        if (!(obj instanceof a.b)) {
            obj = null;
        }
        a.b bVar = (a.b) obj;
        if (bVar == null) {
            k(mVar, orderItem);
            return;
        }
        L3<String> l32 = bVar.f68352a;
        if (l32.f318649a) {
            mVar.setTitle(l32.f318650b);
        }
        L3<AttributedText> l33 = bVar.f68353b;
        if (l33.f318649a) {
            mVar.g(l33.f318650b);
        }
        L3<Image> l34 = bVar.f68354c;
        if (l34.f318649a) {
            mVar.X60(l34.f318650b, this.f68380b.getPlaceholder());
        }
        L3<DeepLink> l35 = bVar.f68356e;
        if (l35.f318649a) {
            DeepLink deepLink = l35.f318650b;
            if (deepLink == null) {
                mVar.a(null);
            } else {
                mVar.a(new g(this, deepLink));
            }
        }
        L3<Boolean> l36 = bVar.f68355d;
        if (l36.f318649a) {
            if (L.f(l36.f318650b, Boolean.TRUE)) {
                mVar.k40();
            } else {
                mVar.Sl();
            }
        }
    }

    public final void k(@Y61.k m mVar, @Y61.k OrderItem orderItem) {
        mVar.setTitle(orderItem.getF68367c());
        mVar.g(orderItem.getF68368d());
        if (L.f(Boolean.valueOf(orderItem.getF68371g()), Boolean.TRUE)) {
            mVar.k40();
        } else {
            mVar.Sl();
        }
        mVar.X60(orderItem.getF68369e(), this.f68380b.getPlaceholder());
        DeepLink f68370f = orderItem.getF68370f();
        if (f68370f == null) {
            mVar.a(null);
        } else {
            mVar.a(new g(this, f68370f));
        }
        String f68372h = orderItem.getF68372h();
        if (f68372h != null) {
            mVar.zv(f68372h);
        } else {
            mVar.mI();
        }
    }

    @Override // com.avito.android.active_orders_common.items.order.f
    /* renamed from: u, reason: from getter */
    public final e2 getF68383e() {
        return this.f68383e;
    }
}
