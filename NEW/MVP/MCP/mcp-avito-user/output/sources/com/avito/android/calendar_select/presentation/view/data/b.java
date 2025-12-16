package com.avito.android.calendar_select.presentation.view.data;

import Tl.AbstractC15373a;
import com.avito.android.calendar_select.utils.DateRange;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: CalendarDataConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/data/b;", "", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: CalendarDataConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static List a(c cVar, f fVar, LocalDate localDate, ArrayList arrayList, DateRange dateRange, int i12) {
            TV0.a aVar;
            LocalDate localDate2 = (i12 & 2) != 0 ? null : localDate;
            ArrayList arrayList2 = (i12 & 4) != 0 ? null : arrayList;
            DateRange dateRange2 = (i12 & 8) == 0 ? dateRange : null;
            LocalDate localDateNow = LocalDate.now();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = fVar.f113458a.iterator();
            while (it.hasNext()) {
                Tl.b bVar = (Tl.b) it.next();
                long size = arrayList3.size();
                LocalDate localDate3 = bVar.f15834b;
                arrayList3.add(new com.avito.android.calendar_select.presentation.view.konveyor.items.month.a(size, localDateNow.getYear() < localDate3.getYear() ? localDate3.format(cVar.f113454c) : localDate3.format(cVar.f113453b)));
                ArrayList arrayList4 = bVar.f15833a;
                ArrayList arrayList5 = new ArrayList(C42745f0.q(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    AbstractC15373a abstractC15373a = (AbstractC15373a) it2.next();
                    boolean z12 = abstractC15373a instanceof AbstractC15373a.b;
                    j jVar = cVar.f113452a;
                    if (z12) {
                        AbstractC15373a.b bVar2 = (AbstractC15373a.b) abstractC15373a;
                        aVar = new com.avito.android.calendar_select.presentation.view.konveyor.items.day.a(arrayList3.size(), bVar2.f15832a.format(cVar.f113455d), jVar.a(bVar2.f15832a, localDate2, arrayList2, dateRange2), bVar2.f15832a);
                    } else {
                        if (!(abstractC15373a instanceof AbstractC15373a.C1081a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        long size2 = arrayList3.size();
                        LocalDate localDate4 = ((AbstractC15373a.C1081a) abstractC15373a).f15831a;
                        aVar = new com.avito.android.calendar_select.presentation.view.konveyor.items.empty.a(size2, localDate4, jVar.b(localDate4, dateRange2));
                    }
                    arrayList5.add(aVar);
                }
                arrayList3.addAll(arrayList5);
            }
            return arrayList3;
        }
    }
}
