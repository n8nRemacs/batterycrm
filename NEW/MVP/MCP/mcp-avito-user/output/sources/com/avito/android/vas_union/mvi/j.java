package com.avito.android.vas_union.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.lib.design.chips.state.ItemChipable;
import com.avito.android.vas_union.mvi.entity.VasUnionV2InternalAction;
import com.avito.android.vas_union.ui.items.vas_bundle.c;
import com.avito.android.vas_union.ui.items.vas_performance_select.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import qM0.C47322c;

/* compiled from: VasUnionV2Reducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_union/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction;", "LqM0/c;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements u<VasUnionV2InternalAction, C47322c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_union.data.a f323238b;

    @Inject
    public j(@Y61.k com.avito.android.vas_union.data.a aVar) {
        this.f323238b = aVar;
    }

    public static ArrayList b(ArrayList arrayList, Integer num) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) obj;
            if (aVar instanceof com.avito.android.vas_union.ui.items.vas_performance_click.a) {
                int i12 = ((com.avito.android.vas_union.ui.items.vas_performance_click.a) aVar).f323321h;
                if (num != null && i12 == num.intValue()) {
                    arrayList2.add(obj);
                }
            } else {
                if (aVar instanceof com.avito.android.vas_union.ui.items.vas_performance_select.c) {
                    int i13 = ((com.avito.android.vas_union.ui.items.vas_performance_select.c) aVar).f323348d;
                    if (num != null && i13 == num.intValue()) {
                    }
                }
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static c.a c(ArrayList arrayList) {
        Object obj;
        Object next;
        List<c.a> list;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof com.avito.android.vas_union.ui.items.vas_bundle.c) {
                break;
            }
        }
        if (!(next instanceof com.avito.android.vas_union.ui.items.vas_bundle.c)) {
            next = null;
        }
        com.avito.android.vas_union.ui.items.vas_bundle.c cVar = (com.avito.android.vas_union.ui.items.vas_bundle.c) next;
        if (cVar == null || (list = cVar.f323278d) == null) {
            return null;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((c.a) next2).f323280c) {
                obj = next2;
                break;
            }
        }
        return (c.a) obj;
    }

    public static Integer d(List list) {
        Object next;
        List<ItemChipable> list2;
        Object next2;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof com.avito.android.vas_union.ui.items.vas_performance_chips.c) {
                break;
            }
        }
        if (!(next instanceof com.avito.android.vas_union.ui.items.vas_performance_chips.c)) {
            next = null;
        }
        com.avito.android.vas_union.ui.items.vas_performance_chips.c cVar = (com.avito.android.vas_union.ui.items.vas_performance_chips.c) next;
        if (cVar == null || (list2 = cVar.f323310c) == null) {
            return null;
        }
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((ItemChipable) next2).f178766f) {
                break;
            }
        }
        ItemChipable itemChipable = (ItemChipable) next2;
        if (itemChipable != null) {
            return Integer.valueOf(itemChipable.f178762b);
        }
        return null;
    }

    public static c.a e(ArrayList arrayList) {
        Object obj;
        Object next;
        List<c.a> list;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof com.avito.android.vas_union.ui.items.vas_performance_select.c) {
                break;
            }
        }
        if (!(next instanceof com.avito.android.vas_union.ui.items.vas_performance_select.c)) {
            next = null;
        }
        com.avito.android.vas_union.ui.items.vas_performance_select.c cVar = (com.avito.android.vas_union.ui.items.vas_performance_select.c) next;
        if (cVar == null || (list = cVar.f323347c) == null) {
            return null;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((c.a) next2).f323350c) {
                obj = next2;
                break;
            }
        }
        return (c.a) obj;
    }

    public static List f(String str, Map map) {
        if (str == null) {
            List list = (List) C42745f0.F(map.values());
            return list == null ? C42784z0.f406748b : list;
        }
        List list2 = (List) map.get(str);
        return list2 == null ? C42784z0.f406748b : list2;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a1  */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qM0.C47322c a(com.avito.android.vas_union.mvi.entity.VasUnionV2InternalAction r34, qM0.C47322c r35) {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_union.mvi.j.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
