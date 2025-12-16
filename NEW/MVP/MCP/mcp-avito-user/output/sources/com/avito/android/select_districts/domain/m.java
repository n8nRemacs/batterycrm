package com.avito.android.select_districts.domain;

import com.avito.android.advert.item.blocks.items_factories.C28081y0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectDistrictsItemsManager.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/domain/m;", "", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m {
    @Inject
    public m() {
    }

    @Y61.k
    public static List a(@Y61.k String str, @Y61.k List list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.avito.android.select_districts.items.selected.e) {
                arrayList.add(obj);
            }
        }
        com.avito.android.select_districts.items.selected.e eVar = (com.avito.android.select_districts.items.selected.e) C42745f0.G(arrayList);
        if (eVar == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayListB = b(str, list);
        Iterator it = arrayListB.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((com.avito.android.select_districts.items.selectable.c) next).f266966b, str)) {
                break;
            }
        }
        com.avito.android.select_districts.items.selectable.c cVar = (com.avito.android.select_districts.items.selectable.c) next;
        ArrayList arrayList2 = new ArrayList(eVar.f266984e);
        if (cVar == null || !cVar.f266968d) {
            arrayList2.removeIf(new C28081y0(new l(cVar), 13));
            kotlin.ranges.k it2 = C42745f0.I(arrayList2).iterator();
            while (it2.f406910d) {
                int iA2 = it2.a();
                com.avito.android.select_districts.items.selected.o oVar = (com.avito.android.select_districts.items.selected.o) arrayList2.get(iA2);
                arrayList2.set(iA2, new com.avito.android.select_districts.items.selected.o(oVar.f267003a, iA2, oVar.f267005c));
            }
        } else {
            arrayList2.add(new com.avito.android.select_districts.items.selected.o(cVar.f266966b, arrayList2.size(), cVar.f266967c));
        }
        Set setP0 = C42745f0.P0(arrayList2);
        boolean z12 = eVar.f266983d;
        return C42745f0.h0(arrayListB, Collections.singletonList(new com.avito.android.select_districts.items.selected.e(eVar.f266982c, eVar.f266981b, setP0, z12)));
    }

    public static ArrayList b(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.avito.android.select_districts.items.selectable.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.avito.android.select_districts.items.selectable.c cVarA = (com.avito.android.select_districts.items.selectable.c) it.next();
            if (L.f(cVarA.f266966b, str)) {
                cVarA = com.avito.android.select_districts.items.selectable.c.a(cVarA, !cVarA.f266968d);
            }
            arrayList2.add(cVarA);
        }
        return arrayList2;
    }
}
