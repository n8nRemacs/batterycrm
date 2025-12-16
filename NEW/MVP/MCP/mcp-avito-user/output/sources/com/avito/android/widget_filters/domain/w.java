package com.avito.android.widget_filters.domain;

import com.avito.android.remote.model.category_parameters.GuestsSelectParameterValue;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.widget_filters.mvi.entity.d;
import com.avito.android.widget_filters.remote.model.widgets.DateParam;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersParametersBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/domain/w;", "Lcom/avito/android/widget_filters/domain/v;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f329923a;

    @Inject
    public w(@Y61.k Gson gson) {
        this.f329923a = gson;
    }

    @Override // com.avito.android.widget_filters.domain.v
    @Y61.k
    public final Map<String, String> a(@Y61.k com.avito.android.widget_filters.mvi.entity.c cVar) {
        NP0.d dVar;
        NP0.b bVar;
        NP0.j jVar;
        NP0.i iVar;
        NP0.g gVar;
        Date date;
        Date date2;
        NP0.m mVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d.C10254d c10254d = cVar.f330101h;
        if (c10254d != null && (mVar = c10254d.f330146l) != null) {
            NP0.l lVar = mVar.f11499h;
            linkedHashMap.put(mVar.f11492a, lVar != null ? lVar.f11490a : null);
        }
        d.b bVar2 = cVar.f330102i;
        if (bVar2 != null && (gVar = bVar2.f330127j) != null) {
            DateParam dateParam = gVar.f11449f;
            String id2 = dateParam != null ? dateParam.getId() : null;
            SelectedDateRange selectedDateRange = gVar.f11451h;
            linkedHashMap.put(id2, (selectedDateRange == null || (date2 = selectedDateRange.f286645b) == null) ? null : wy0.b.d(date2));
            DateParam dateParam2 = gVar.f11450g;
            linkedHashMap.put(dateParam2 != null ? dateParam2.getId() : null, (selectedDateRange == null || (date = selectedDateRange.f286646c) == null) ? null : wy0.b.d(date));
        }
        if (bVar2 != null && (iVar = bVar2.f330128k) != null) {
            linkedHashMap.put(iVar.f11458a, String.valueOf(iVar.f11464g));
        }
        d.c cVar2 = cVar.f330104k;
        if (cVar2 != null && (jVar = cVar2.f330135i) != null) {
            List<NP0.f> list = jVar.f11484r;
            int size = list.size();
            int i12 = jVar.f11483q;
            Integer numValueOf = Integer.valueOf(size + i12);
            Integer numValueOf2 = Integer.valueOf(i12);
            List<NP0.f> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((NP0.f) it.next()).f11441a);
            }
            linkedHashMap.put(jVar.f11467a, this.f329923a.l(new GuestsSelectParameterValue(1, numValueOf, numValueOf2, arrayList)));
        }
        if (cVar2 != null && (bVar = cVar2.f330136j) != null) {
            linkedHashMap.put(bVar.f11420a, String.valueOf(bVar.f11426g));
        }
        d.a aVar = cVar.f330103j;
        if (aVar != null && (dVar = aVar.f330119i) != null) {
            boolean z12 = dVar.f11439h;
            String str = dVar.f11432a;
            List<NP0.c> list3 = dVar.f11438g;
            if (z12) {
                int i13 = 0;
                for (Object obj : list3) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    linkedHashMap.put(str + '[' + i13 + ']', ((NP0.c) obj).f11427b);
                    i13 = i14;
                }
            } else {
                NP0.c cVar3 = (NP0.c) C42745f0.G(list3);
                linkedHashMap.put(str, cVar3 != null ? cVar3.f11427b : null);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Q q12 = (key == null || value == null) ? null : new Q(key, value);
            if (q12 != null) {
                arrayList2.add(q12);
            }
        }
        return P0.p(arrayList2);
    }
}
