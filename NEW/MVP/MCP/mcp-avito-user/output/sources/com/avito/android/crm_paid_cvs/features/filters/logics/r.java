package com.avito.android.crm_paid_cvs.features.filters.logics;

import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import com.avito.android.crm_paid_cvs.features.filters.entity.FiltersState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FiltersReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_job_crm-paid-cvs_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r {
    public static final FiltersState a(FiltersState filtersState, String str, Y41.l<? super OptionItem, OptionItem> lVar) {
        List<FilterItem> list = filtersState.f130629b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (FilterItem filterItemA : list) {
            if (L.f(filterItemA.f130357b, str)) {
                List<OptionItem> list2 = filterItemA.f130360e;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(lVar.invoke((OptionItem) it.next()));
                }
                filterItemA = FilterItem.a(filterItemA, arrayList2);
            }
            arrayList.add(filterItemA);
        }
        return new FiltersState(arrayList);
    }
}
