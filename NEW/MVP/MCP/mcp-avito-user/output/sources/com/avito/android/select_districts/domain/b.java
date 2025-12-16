package com.avito.android.select_districts.domain;

import com.avito.android.remote.model.District;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SelectDistrictsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_districts/domain/b;", "", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f266918a;

    @Inject
    public b(@Y61.k d dVar) {
        this.f266918a = dVar;
    }

    public final ArrayList a(List list) {
        List<District> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (District district : list2) {
            arrayList.add(new com.avito.android.select_districts.items.selectable.c(district.getId(), district.getF282831b(), this.f266918a.d(district.getId())));
        }
        return arrayList;
    }

    @Y61.k
    public final ArrayList b(@Y61.k List list) {
        ArrayList arrayListA = a(list);
        d dVar = this.f266918a;
        boolean f266924d = dVar.getF266924d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (dVar.d(((District) obj).getId())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            District district = (District) next;
            arrayList2.add(new com.avito.android.select_districts.items.selected.o(district.getId(), i12, district.getF282831b()));
            i12 = i13;
        }
        return C42745f0.h0(arrayListA, Collections.singletonList(new com.avito.android.select_districts.items.selected.e(null, 0, f266924d, C42745f0.P0(arrayList2), 3, null)));
    }
}
