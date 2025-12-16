package com.avito.android.active_orders_common.items.all_orders;

import Y61.l;
import com.avito.android.active_orders_common.items.diff.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.L3;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: AllOrdersItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/active_orders_common/items/all_orders/h;", "Lcom/avito/android/active_orders_common/items/all_orders/f;", "<init>", "()V", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e2 f68308b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.l<? super DeepLink, G0> f68309c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e2 f68310d;

    @Inject
    public h() {
        e2 e2VarB = f2.b(0, 1, null, 5);
        this.f68308b = e2VarB;
        this.f68310d = e2VarB;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((j) eVar, (AllOrdersItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        j jVar = (j) eVar;
        AllOrdersItem allOrdersItem = (AllOrdersItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof a.C2138a) {
                obj = obj2;
            }
        }
        if (!(obj instanceof a.C2138a)) {
            obj = null;
        }
        a.C2138a c2138a = (a.C2138a) obj;
        if (c2138a == null) {
            k(jVar, allOrdersItem);
            return;
        }
        L3<String> l32 = c2138a.f68349a;
        if (l32.f318649a) {
            jVar.setTitle(l32.f318650b);
        }
        L3<DeepLink> l33 = c2138a.f68350b;
        if (l33.f318649a) {
            DeepLink deepLink = l33.f318650b;
            if (deepLink == null) {
                jVar.a(null);
            } else {
                jVar.a(new g(this, deepLink));
            }
        }
        L3<Icon> l34 = c2138a.f68351c;
        if (l34.f318649a) {
            Icon icon = l34.f318650b;
            jVar.a3(icon != null ? icon.f68299b : null, icon != null ? icon.f68300c : null);
        }
    }

    public final void k(@Y61.k j jVar, @Y61.k AllOrdersItem allOrdersItem) {
        jVar.setTitle(allOrdersItem.getF68296c());
        Icon f68298e = allOrdersItem.getF68298e();
        Integer num = f68298e != null ? f68298e.f68299b : null;
        Icon f68298e2 = allOrdersItem.getF68298e();
        jVar.a3(num, f68298e2 != null ? f68298e2.f68300c : null);
        DeepLink f68297d = allOrdersItem.getF68297d();
        if (f68297d == null) {
            jVar.a(null);
        } else {
            jVar.a(new g(this, f68297d));
        }
    }

    @Override // com.avito.android.active_orders_common.items.all_orders.f
    /* renamed from: u, reason: from getter */
    public final e2 getF68310d() {
        return this.f68310d;
    }
}
