package com.avito.android.str_seller_orders.orders_filters.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersOpenParams;
import com.avito.android.str_seller_orders.orders_filters.domain.models.StrOrdersFiltersDisplaying;
import com.avito.android.str_seller_orders.orders_filters.domain.models.StrOrdersFiltersOption;
import com.avito.android.str_seller_orders.orders_filters.mvi.entity.StrOrdersFiltersInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StrOrdersFiltersReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction;", "Lqz0/c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements u<StrOrdersFiltersInternalAction, qz0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n f289207b;

    @Inject
    public l(@Y61.k n nVar) {
        this.f289207b = nVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final qz0.c a(StrOrdersFiltersInternalAction strOrdersFiltersInternalAction, qz0.c cVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        StrOrdersFiltersInternalAction strOrdersFiltersInternalAction2 = strOrdersFiltersInternalAction;
        qz0.c cVar2 = cVar;
        boolean z12 = strOrdersFiltersInternalAction2 instanceof StrOrdersFiltersInternalAction.Init;
        n nVar = this.f289207b;
        if (z12) {
            StrOrdersFiltersOpenParams strOrdersFiltersOpenParams = ((StrOrdersFiltersInternalAction.Init) strOrdersFiltersInternalAction2).f289194b;
            String str = strOrdersFiltersOpenParams.f289120b;
            StrOrdersFiltersDisplaying strOrdersFiltersDisplaying = strOrdersFiltersOpenParams.f289123e;
            return nVar.a(qz0.c.a(cVar2, str, strOrdersFiltersOpenParams.f289121c, strOrdersFiltersDisplaying.f289158d, strOrdersFiltersDisplaying.f289156b, strOrdersFiltersDisplaying.f289157c, strOrdersFiltersOpenParams.f289122d, null, 64));
        }
        boolean z13 = strOrdersFiltersInternalAction2 instanceof StrOrdersFiltersInternalAction.UpdateToggleSelected;
        List<StrOrdersFiltersOption> list = cVar2.f429550c;
        if (!z13) {
            if (!(strOrdersFiltersInternalAction2 instanceof StrOrdersFiltersInternalAction.ClearSelectedToggles)) {
                return cVar2;
            }
            if (list != null) {
                List<StrOrdersFiltersOption> list2 = list;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(StrOrdersFiltersOption.a((StrOrdersFiltersOption) it.next(), false));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            return nVar.a(qz0.c.a(cVar2, null, arrayList, null, null, null, false, null, 125));
        }
        if (list != null) {
            List<StrOrdersFiltersOption> list3 = list;
            ArrayList arrayList4 = new ArrayList(C42745f0.q(list3, 10));
            for (StrOrdersFiltersOption strOrdersFiltersOptionA : list3) {
                boolean zF2 = L.f(strOrdersFiltersOptionA.f289163b, ((StrOrdersFiltersInternalAction.UpdateToggleSelected) strOrdersFiltersInternalAction2).f289195b);
                boolean z14 = strOrdersFiltersOptionA.f289165d;
                if (zF2) {
                    strOrdersFiltersOptionA = StrOrdersFiltersOption.a(strOrdersFiltersOptionA, !z14);
                } else if (!cVar2.f429554g && z14) {
                    strOrdersFiltersOptionA = StrOrdersFiltersOption.a(strOrdersFiltersOptionA, false);
                }
                arrayList4.add(strOrdersFiltersOptionA);
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        return nVar.a(qz0.c.a(cVar2, null, arrayList2, null, null, null, false, null, 125));
    }
}
