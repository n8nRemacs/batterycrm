package com.avito.android.calendar_select.presentation.view.data;

import Tl.AbstractC15373a;
import android.os.Parcelable;
import com.avito.android.calendar_select.CalendarSelectionType;
import com.avito.android.calendar_select.CalendarSettings;
import com.avito.android.calendar_select.presentation.view.data.e;
import com.avito.android.calendar_select.presentation.view.data.l;
import com.avito.android.calendar_select.utils.DateRange;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.ranges.g;

/* compiled from: CalendarDataSourceProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/data/h;", "Lcom/avito/android/calendar_select/presentation/view/data/g;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f113459a;

    /* compiled from: CalendarDataSourceProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CalendarSelectionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<CalendarSelectionType> creator = CalendarSelectionType.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Parcelable.Creator<CalendarSelectionType> creator2 = CalendarSelectionType.CREATOR;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Parcelable.Creator<CalendarSelectionType> creator3 = CalendarSelectionType.CREATOR;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public h(@Y61.k n nVar) {
        this.f113459a = nVar;
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.g
    @Y61.k
    public final m a(@Y61.k CalendarSettings calendarSettings) {
        LocalDate localDateNow;
        LocalDate localDatePlusMonths;
        String str = calendarSettings.f113313b;
        if (str == null || (localDateNow = Xl.b.a(str)) == null) {
            localDateNow = LocalDate.now();
        }
        LocalDate localDate = localDateNow;
        String str2 = calendarSettings.f113314c;
        if (str2 == null || (localDatePlusMonths = Xl.b.a(str2)) == null) {
            Object obj = Xl.b.f19053a;
            localDatePlusMonths = LocalDate.now().plusMonths(3L);
        }
        LocalDate localDate2 = localDatePlusMonths;
        List<String> list = calendarSettings.f113317f;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            LocalDate localDateA = Xl.b.a((String) it.next());
            if (localDateA != null) {
                arrayList.add(localDateA);
            }
        }
        List<String> list2 = calendarSettings.f113315d;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            LocalDate localDateA2 = Xl.b.a((String) it2.next());
            if (localDateA2 != null) {
                arrayList2.add(localDateA2);
            }
        }
        return b(localDate, localDate2, arrayList, arrayList2, calendarSettings.f113320i, calendarSettings.f113321j);
    }

    @Override // com.avito.android.calendar_select.presentation.view.data.g
    @Y61.k
    public final m b(@Y61.k LocalDate localDate, @Y61.k LocalDate localDate2, @Y61.k List<LocalDate> list, @Y61.k List<LocalDate> list2, @Y61.k CalendarSelectionType calendarSelectionType, boolean z12) {
        List listE0;
        LocalDate localDatePlusDays;
        j wVar;
        int iBetween;
        int i12;
        int i13;
        int i14 = 1;
        DateRange dateRange = new DateRange(localDate, localDate2);
        e eVar = new e();
        eVar.f113456a = localDate.withDayOfMonth(1);
        ArrayList arrayList = new ArrayList();
        int iBetween2 = ((int) ChronoUnit.MONTHS.between(YearMonth.from(localDate), YearMonth.from(localDate2))) + 1;
        int i15 = 0;
        while (i15 < iBetween2) {
            LocalDate localDate3 = eVar.f113456a;
            ArrayList arrayList2 = new ArrayList();
            LocalDate localDate4 = eVar.f113456a;
            ArrayList arrayList3 = new ArrayList();
            switch (e.a.f113457a[localDate4.getDayOfWeek().ordinal()]) {
                case 1:
                    i12 = 0;
                    break;
                case 2:
                    i12 = i14;
                    break;
                case 3:
                    i12 = 2;
                    break;
                case 4:
                    i12 = 3;
                    break;
                case 5:
                    i12 = 4;
                    break;
                case 6:
                    i12 = 5;
                    break;
                case 7:
                    i12 = 6;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            for (int i16 = 0; i16 < i12; i16 += i14) {
                arrayList3.add(new AbstractC15373a.C1081a(localDate4));
            }
            arrayList2.addAll(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            int iLengthOfMonth = eVar.f113456a.lengthOfMonth();
            int i17 = 0;
            while (i17 < iLengthOfMonth) {
                arrayList4.add(new AbstractC15373a.b(eVar.f113456a));
                eVar.f113456a = eVar.f113456a.plusDays(1L);
                i17++;
                arrayList = arrayList;
            }
            ArrayList arrayList5 = arrayList;
            arrayList2.addAll(arrayList4);
            ArrayList arrayList6 = new ArrayList();
            switch (e.a.f113457a[eVar.f113456a.getDayOfWeek().ordinal()]) {
                case 1:
                    i13 = 0;
                    break;
                case 2:
                    i13 = 6;
                    break;
                case 3:
                    i13 = 5;
                    break;
                case 4:
                    i13 = 4;
                    break;
                case 5:
                    i13 = 3;
                    break;
                case 6:
                    i13 = 2;
                    break;
                case 7:
                    i13 = 1;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            for (int i18 = 0; i18 < i13; i18++) {
                arrayList6.add(new AbstractC15373a.C1081a(eVar.f113456a));
            }
            arrayList2.addAll(arrayList6);
            arrayList5.add(new Tl.b(arrayList2, localDate3));
            i15++;
            arrayList = arrayList5;
            i14 = 1;
        }
        ArrayList arrayList7 = arrayList;
        Tl.b bVar = (Tl.b) C42745f0.S(arrayList7);
        if (bVar != null) {
            ArrayList arrayList8 = bVar.f15833a;
            ArrayList arrayList9 = new ArrayList();
            for (int i19 = 0; i19 < 14; i19++) {
                arrayList9.add(new AbstractC15373a.C1081a(eVar.f113456a));
            }
            arrayList8.addAll(arrayList9);
        }
        f fVar = new f(arrayList7);
        l.a.f113476d.getClass();
        ArrayList arrayList10 = new ArrayList();
        List listA0 = C42745f0.A0(list);
        if (listA0.isEmpty()) {
            listE0 = C42784z0.f406748b;
        } else {
            ListIterator listIterator = listA0.listIterator(listA0.size());
            while (listIterator.hasPrevious()) {
                if (g.a.a(dateRange, (LocalDate) listIterator.previous())) {
                    listE0 = C42745f0.E0(listA0, listIterator.nextIndex() + 1);
                }
            }
            listE0 = C42784z0.f406748b;
        }
        Iterator it = listE0.iterator();
        boolean zHasNext = it.hasNext();
        LocalDate localDate5 = dateRange.f113541c;
        if (zHasNext) {
            localDatePlusDays = (LocalDate) it.next();
        } else {
            Object obj = Xl.b.f19053a;
            localDatePlusDays = localDate5.plusDays(1L);
        }
        while (localDatePlusDays.isBefore(dateRange.f113540b)) {
            if (it.hasNext()) {
                localDatePlusDays = (LocalDate) it.next();
            } else {
                Object obj2 = Xl.b.f19053a;
                localDatePlusDays = localDate5.plusDays(1L);
            }
        }
        Iterator<LocalDate> it2 = dateRange.iterator();
        while (true) {
            DateRange.b bVar2 = (DateRange.b) it2;
            if (!bVar2.hasNext()) {
                l lVar = new l(C42745f0.M0(arrayList10));
                int iOrdinal = calendarSelectionType.ordinal();
                n nVar = this.f113459a;
                if (iOrdinal == 0) {
                    wVar = new w(nVar, list, dateRange, z12);
                } else if (iOrdinal == 1) {
                    wVar = new u(nVar, list, dateRange, lVar, z12);
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wVar = new u(nVar, list, dateRange, lVar, z12);
                } else {
                    wVar = new s(nVar, list, dateRange, z12);
                }
                c cVar = new c(wVar);
                int iOrdinal2 = calendarSelectionType.ordinal();
                if (iOrdinal2 == 0) {
                    return new v(fVar, cVar, wVar, (LocalDate) C42745f0.G(list2));
                }
                if (iOrdinal2 != 1) {
                    if (iOrdinal2 == 2) {
                        return new r(fVar, cVar, wVar, list2);
                    }
                    if (iOrdinal2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return new t(fVar, cVar, wVar, calendarSelectionType, list2);
            }
            LocalDate localDate6 = (LocalDate) bVar2.next();
            Object obj3 = Xl.b.f19053a;
            if (localDate6.isBefore(localDatePlusDays.minusDays(1L))) {
                iBetween = (int) ChronoUnit.DAYS.between(localDate6, localDatePlusDays.minusDays(1L));
            } else if (localDate6.isEqual(localDatePlusDays.minusDays(1L))) {
                iBetween = 0;
            } else {
                if (!localDate6.isEqual(localDatePlusDays)) {
                    throw new IllegalArgumentException("date cannot be more than blockedDate");
                }
                localDatePlusDays = it.hasNext() ? (LocalDate) it.next() : localDate5.plusDays(1L);
                iBetween = 0;
                arrayList10.add(new l.a(localDate6, !listE0.contains(localDate6), iBetween));
            }
            arrayList10.add(new l.a(localDate6, !listE0.contains(localDate6), iBetween));
        }
    }
}
