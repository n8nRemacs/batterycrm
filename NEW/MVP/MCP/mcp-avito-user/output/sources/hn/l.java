package HN;

import MN.e;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerConfig;
import com.avito.android.inline_filters.calendar.SelectedDateRange;
import com.avito.android.inline_filters.dialog.calendar.models.CalendarPickerConstraints;
import com.avito.android.util.K;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import wy0.C49704a;

/* compiled from: RestrictionsDataSourceProvider.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"LHN/l;", "LHN/a;", "", "LMN/c;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements a<List<? extends MN.c>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final SelectedDateRange f7067a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final CalendarPickerConstraints f7068b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FiltersCalendarPickerConfig f7069c;

    @Inject
    public l(@Y61.l SelectedDateRange selectedDateRange, @Y61.l CalendarPickerConstraints calendarPickerConstraints, @Y61.k FiltersCalendarPickerConfig filtersCalendarPickerConfig) {
        this.f7067a = selectedDateRange;
        this.f7068b = calendarPickerConstraints;
        this.f7069c = filtersCalendarPickerConfig;
    }

    @Override // HN.a
    public final i a(Object obj) {
        int i12;
        int i13;
        List list = (List) obj;
        Date date = ((MN.c) C42745f0.E(list)).f10662a;
        Date date2 = ((MN.c) C42745f0.Q(list)).f10662a;
        n nVar = new n(list);
        k kVar = new k(nVar);
        ArrayList arrayList = new ArrayList();
        Calendar calendarA = C49704a.a();
        calendarA.setTime(date);
        K.a(calendarA);
        int i14 = 5;
        int i15 = 1;
        calendarA.set(5, 1);
        Calendar calendarA2 = C49704a.a();
        calendarA2.setTime(date);
        Calendar calendarA3 = C49704a.a();
        calendarA3.setTime(date2);
        int i16 = (calendarA3.get(2) + ((calendarA3.get(1) - calendarA2.get(1)) * 12)) - calendarA2.get(2);
        if (calendarA3.get(5) == calendarA3.getActualMaximum(5)) {
            i16++;
        }
        int i17 = 0;
        while (i17 < i16) {
            Date time = calendarA.getTime();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i18 = calendarA.get(7);
            switch (i18) {
                case 1:
                    i12 = 6;
                    break;
                case 2:
                    i12 = 0;
                    break;
                case 3:
                    i12 = i15;
                    break;
                case 4:
                    i12 = 2;
                    break;
                case 5:
                    i12 = 3;
                    break;
                case 6:
                    i12 = 4;
                    break;
                case 7:
                    i12 = i14;
                    break;
                default:
                    throw new IllegalArgumentException(AK.c.g(i18, "Wrong day of week: "));
            }
            for (int i19 = 0; i19 < i12; i19++) {
                arrayList3.add(new e.a(calendarA.getTime()));
            }
            arrayList2.addAll(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            int i22 = 5;
            int actualMaximum = calendarA.getActualMaximum(5);
            for (int i23 = 0; i23 < actualMaximum; i23++) {
                arrayList4.add(new e.b(calendarA.getTime()));
                i22 = 5;
                calendarA.add(5, 1);
            }
            arrayList2.addAll(arrayList4);
            ArrayList arrayList5 = new ArrayList();
            int i24 = calendarA.get(7);
            switch (i24) {
                case 1:
                    i13 = 1;
                    break;
                case 2:
                    i13 = 0;
                    break;
                case 3:
                    i13 = 6;
                    break;
                case 4:
                    i13 = i22;
                    break;
                case 5:
                    i13 = 4;
                    break;
                case 6:
                    i13 = 3;
                    break;
                case 7:
                    i13 = 2;
                    break;
                default:
                    throw new IllegalArgumentException(AK.c.g(i24, "Wrong day of week: "));
            }
            for (int i25 = 0; i25 < i13; i25++) {
                arrayList5.add(new e.a(calendarA.getTime()));
            }
            arrayList2.addAll(arrayList5);
            arrayList.add(new MN.f(arrayList2, time));
            i17++;
            i15 = 1;
            i14 = 5;
        }
        MN.f fVar = (MN.f) C42745f0.S(arrayList);
        if (fVar != null) {
            ArrayList arrayList6 = fVar.f10666a;
            ArrayList arrayList7 = new ArrayList();
            for (int i26 = 0; i26 < 14; i26++) {
                arrayList7.add(new e.a(calendarA.getTime()));
            }
            arrayList6.addAll(arrayList7);
        }
        return new i(nVar, new MN.b(arrayList), new f(kVar), this.f7067a, this.f7068b, this.f7069c.f171045c);
    }
}
