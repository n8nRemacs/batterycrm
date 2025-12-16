package com.avito.android.sx_address.new_address.mvi;

import com.avito.android.sx_address.new_address.domain.AddressType;
import com.avito.android.sx_address.new_address.domain.DetailItem;
import com.avito.android.sx_address.new_address.domain.HideAddress;
import com.avito.android.sx_address.new_address.domain.ScheduleType;
import com.avito.android.sx_address.new_address.domain.WeekDay;
import com.avito.android.sx_address.new_address.domain.WorkingHours;
import com.avito.android.sx_address.new_address.mvi.SxNewAddressMviState;
import com.avito.android.sx_address.new_address.mvi.SxNewAddressMviViewState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StateConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_sx-address_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.sx_address.new_address.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35186a {
    public static final FA0.i a(WorkingHours workingHours, SxNewAddressMviState.WorkingSchedulerContent workingSchedulerContent, WeekDay weekDay) {
        ScheduleType scheduleType = workingSchedulerContent.f293737c;
        if (scheduleType == ScheduleType.f293619d) {
            return null;
        }
        WorkingHours.Day day = scheduleType == ScheduleType.f293617b ? workingHours.f293633c.get(weekDay) : workingHours.f293632b.get(weekDay);
        if (day == null) {
            return null;
        }
        WorkingHours.Day.Time time = day.f293635b;
        FA0.h hVar = new FA0.h(time.f293638b, time.f293639c);
        WorkingHours.Day.Time time2 = day.f293637d;
        return new FA0.i(hVar, day.f293636c, new FA0.h(time2.f293638b, time2.f293639c));
    }

    public static final KA0.f b(WorkingHours workingHours, SxNewAddressMviState.WorkingSchedulerContent workingSchedulerContent, WeekDay weekDay) {
        ScheduleType scheduleType = workingSchedulerContent.f293737c;
        if (scheduleType == ScheduleType.f293619d) {
            return null;
        }
        WorkingHours.Day day = scheduleType == ScheduleType.f293618c ? workingHours.f293632b.get(weekDay) : workingHours.f293633c.get(weekDay);
        if (day == null) {
            return null;
        }
        WorkingHours.Day.Time time = day.f293635b;
        KA0.e eVar = new KA0.e(time.f293638b, time.f293639c);
        WorkingHours.Day.Time time2 = day.f293637d;
        return new KA0.f(eVar, day.f293636c, new KA0.e(time2.f293638b, time2.f293639c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    @Y61.k
    public static final SxNewAddressMviState c(@Y61.k GA0.d dVar, @Y61.l String str) {
        ?? arrayList;
        SxNewAddressMviState.AddressContent addressContent = new SxNewAddressMviState.AddressContent(str == null ? "" : str, false, null, 4, null);
        GA0.a required = dVar.getRequired();
        SxNewAddressMviState.TitleContent titleContent = new SxNewAddressMviState.TitleContent(null, required != null ? required.getSellersName() : null);
        List<GA0.c> listE = dVar.e();
        int i12 = 10;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listE, 10));
        for (GA0.c cVar : listE) {
            arrayList2.add(new AddressType(null, cVar.getId(), cVar.getTitle(), false));
        }
        GA0.a required2 = dVar.getRequired();
        SxNewAddressMviState.TypesContent typesContent = new SxNewAddressMviState.TypesContent(arrayList2, required2 != null ? required2.getTypes() : null);
        List<GA0.e> listA = dVar.a();
        if (listA != null) {
            List<GA0.e> list = listA;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (GA0.e eVar : list) {
                String id2 = eVar.getId();
                String error = eVar.getError();
                boolean isRequired = eVar.getIsRequired();
                List<GA0.f> listC = eVar.c();
                ArrayList arrayList3 = new ArrayList(C42745f0.q(listC, i12));
                for (GA0.f fVar : listC) {
                    arrayList3.add(new DetailItem.Option(fVar.getId(), fVar.getTitle()));
                }
                arrayList.add(new DetailItem(id2, error, isRequired, arrayList3, eVar.getTitle(), eVar.getValue()));
                i12 = 10;
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        SxNewAddressMviState.DetailsContent detailsContent = new SxNewAddressMviState.DetailsContent(arrayList);
        ScheduleType scheduleType = ScheduleType.f293619d;
        GA0.b workingHours = dVar.getWorkingHours();
        Map mapG = P0.g(new Q(WeekDay.f293622c, j(workingHours.getMonday())), new Q(WeekDay.f293623d, j(workingHours.getTuesday())), new Q(WeekDay.f293624e, j(workingHours.getWednesday())), new Q(WeekDay.f293625f, j(workingHours.getThursday())), new Q(WeekDay.f293626g, j(workingHours.getFriday())), new Q(WeekDay.f293627h, j(workingHours.getSaturday())), new Q(WeekDay.f293628i, j(workingHours.getSunday())));
        SxNewAddressMviState.WorkingSchedulerContent workingSchedulerContent = new SxNewAddressMviState.WorkingSchedulerContent(new WorkingHours(workingHours.getStandardScheduleText(), mapG, mapG), scheduleType);
        return new SxNewAddressMviState(SxNewAddressMviState.LoadingType.f293726b, new SxNewAddressMviViewState.Content(addressContent, titleContent, typesContent, detailsContent, workingSchedulerContent, dVar.getLegal()), addressContent, titleContent, typesContent, detailsContent, workingSchedulerContent, dVar.getLegal());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    @Y61.k
    public static final SxNewAddressMviState d(@Y61.k HA0.d dVar, @Y61.l String str) {
        ?? arrayList;
        String str2 = str == null ? "" : str;
        HA0.g hideAddressDetails = dVar.getHideAddressDetails();
        SxNewAddressMviState.AddressContent addressContent = new SxNewAddressMviState.AddressContent(str2, false, hideAddressDetails != null ? new HideAddress(hideAddressDetails.getId(), hideAddressDetails.getTitle(), hideAddressDetails.getValue()) : null);
        HA0.a required = dVar.getRequired();
        SxNewAddressMviState.TitleContent titleContent = new SxNewAddressMviState.TitleContent(null, required != null ? required.getSellersName() : null);
        List<HA0.c> listF = dVar.f();
        int i12 = 10;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listF, 10));
        for (HA0.c cVar : listF) {
            arrayList2.add(new AddressType(cVar.getDescription(), cVar.getId(), cVar.getTitle(), false));
        }
        HA0.a required2 = dVar.getRequired();
        SxNewAddressMviState.TypesContent typesContent = new SxNewAddressMviState.TypesContent(arrayList2, required2 != null ? required2.getTypes() : null);
        List<HA0.e> listA = dVar.a();
        if (listA != null) {
            List<HA0.e> list = listA;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (HA0.e eVar : list) {
                String id2 = eVar.getId();
                String error = eVar.getError();
                boolean isRequired = eVar.getIsRequired();
                List<HA0.f> listC = eVar.c();
                ArrayList arrayList3 = new ArrayList(C42745f0.q(listC, i12));
                for (HA0.f fVar : listC) {
                    arrayList3.add(new DetailItem.Option(fVar.getId(), fVar.getTitle()));
                }
                arrayList.add(new DetailItem(id2, error, isRequired, arrayList3, eVar.getTitle(), eVar.getValue()));
                i12 = 10;
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        SxNewAddressMviState.DetailsContent detailsContent = new SxNewAddressMviState.DetailsContent(arrayList);
        ScheduleType scheduleType = ScheduleType.f293619d;
        HA0.b workingHours = dVar.getWorkingHours();
        Map mapG = P0.g(new Q(WeekDay.f293622c, g(workingHours.getMonday())), new Q(WeekDay.f293623d, g(workingHours.getTuesday())), new Q(WeekDay.f293624e, g(workingHours.getWednesday())), new Q(WeekDay.f293625f, g(workingHours.getThursday())), new Q(WeekDay.f293626g, g(workingHours.getFriday())), new Q(WeekDay.f293627h, g(workingHours.getSaturday())), new Q(WeekDay.f293628i, g(workingHours.getSunday())));
        SxNewAddressMviState.WorkingSchedulerContent workingSchedulerContent = new SxNewAddressMviState.WorkingSchedulerContent(new WorkingHours(workingHours.getStandardScheduleText(), mapG, mapG), scheduleType);
        return new SxNewAddressMviState(SxNewAddressMviState.LoadingType.f293726b, new SxNewAddressMviViewState.Content(addressContent, titleContent, typesContent, detailsContent, workingSchedulerContent, dVar.getLegal()), addressContent, titleContent, typesContent, detailsContent, workingSchedulerContent, dVar.getLegal());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.ArrayList] */
    @Y61.k
    public static final SxNewAddressMviState e(@Y61.k LA0.a aVar) {
        ?? arrayList;
        SxNewAddressMviState.AddressContent addressContent = new SxNewAddressMviState.AddressContent(aVar.getAddressComponents().getLocality() + ", " + aVar.getAddressComponents().getHouse(), true, null, 4, null);
        String sellersName = aVar.getSellersName();
        LA0.f required = aVar.getRequired();
        SxNewAddressMviState.TitleContent titleContent = new SxNewAddressMviState.TitleContent(sellersName, required != null ? required.getSellersName() : null);
        List<LA0.d> listH = aVar.h();
        int i12 = 10;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listH, 10));
        for (LA0.d dVar : listH) {
            arrayList2.add(new AddressType(null, dVar.getId(), dVar.getTitle(), dVar.getSelected()));
        }
        LA0.f required2 = aVar.getRequired();
        SxNewAddressMviState.TypesContent typesContent = new SxNewAddressMviState.TypesContent(arrayList2, required2 != null ? required2.getTypes() : null);
        List<LA0.b> listB = aVar.b();
        if (listB != null) {
            List<LA0.b> list = listB;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (LA0.b bVar : list) {
                String id2 = bVar.getId();
                String error = bVar.getError();
                boolean isRequired = bVar.getIsRequired();
                List<LA0.c> listC = bVar.c();
                ArrayList arrayList3 = new ArrayList(C42745f0.q(listC, i12));
                for (LA0.c cVar : listC) {
                    arrayList3.add(new DetailItem.Option(cVar.getId(), cVar.getTitle()));
                }
                arrayList.add(new DetailItem(id2, error, isRequired, arrayList3, bVar.getTitle(), bVar.getValue()));
                i12 = 10;
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        SxNewAddressMviState.DetailsContent detailsContent = new SxNewAddressMviState.DetailsContent(arrayList);
        ScheduleType scheduleType = aVar.getWorkingHours().getIsStandardSchedule() ? ScheduleType.f293617b : L.f(aVar.getWorkingHours().getIsCustomSchedule(), Boolean.TRUE) ? ScheduleType.f293618c : ScheduleType.f293619d;
        LA0.h workingHours = aVar.getWorkingHours();
        WeekDay weekDay = WeekDay.f293622c;
        Q q12 = new Q(weekDay, h(workingHours.getMonday()));
        WeekDay weekDay2 = WeekDay.f293623d;
        Q q13 = new Q(weekDay2, h(workingHours.getTuesday()));
        WeekDay weekDay3 = WeekDay.f293624e;
        Q q14 = new Q(weekDay3, h(workingHours.getWednesday()));
        WeekDay weekDay4 = WeekDay.f293625f;
        Q q15 = new Q(weekDay4, h(workingHours.getThursday()));
        WeekDay weekDay5 = WeekDay.f293626g;
        Q q16 = new Q(weekDay5, h(workingHours.getFriday()));
        WeekDay weekDay6 = WeekDay.f293627h;
        Q q17 = new Q(weekDay6, h(workingHours.getSaturday()));
        WeekDay weekDay7 = WeekDay.f293628i;
        SxNewAddressMviState.WorkingSchedulerContent workingSchedulerContent = new SxNewAddressMviState.WorkingSchedulerContent(new WorkingHours(workingHours.getStandardScheduleText(), P0.g(q12, q13, q14, q15, q16, q17, new Q(weekDay7, h(workingHours.getSunday()))), P0.g(new Q(weekDay, h(aVar.getStandardWorkingHours().getMonday())), new Q(weekDay2, h(aVar.getStandardWorkingHours().getTuesday())), new Q(weekDay3, h(aVar.getStandardWorkingHours().getWednesday())), new Q(weekDay4, h(aVar.getStandardWorkingHours().getThursday())), new Q(weekDay5, h(aVar.getStandardWorkingHours().getFriday())), new Q(weekDay6, h(aVar.getStandardWorkingHours().getSaturday())), new Q(weekDay7, h(aVar.getStandardWorkingHours().getSunday())))), scheduleType);
        return new SxNewAddressMviState(SxNewAddressMviState.LoadingType.f293726b, new SxNewAddressMviViewState.Content(addressContent, titleContent, typesContent, detailsContent, workingSchedulerContent, null), addressContent, titleContent, typesContent, detailsContent, workingSchedulerContent, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
    @Y61.k
    public static final SxNewAddressMviState f(@Y61.k MA0.a aVar) {
        ?? arrayList;
        String str = aVar.getAddressComponents().getLocality() + ", " + aVar.getAddressComponents().getHouse();
        MA0.i hideAddressDetails = aVar.getHideAddressDetails();
        SxNewAddressMviState.AddressContent addressContent = new SxNewAddressMviState.AddressContent(str, true, hideAddressDetails != null ? new HideAddress(hideAddressDetails.getId(), hideAddressDetails.getTitle(), hideAddressDetails.getValue()) : null);
        String sellersName = aVar.getSellersName();
        MA0.f required = aVar.getRequired();
        SxNewAddressMviState.TitleContent titleContent = new SxNewAddressMviState.TitleContent(sellersName, required != null ? required.getSellersName() : null);
        List<MA0.d> listH = aVar.h();
        int i12 = 10;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listH, 10));
        for (MA0.d dVar : listH) {
            arrayList2.add(new AddressType(dVar.getDescription(), dVar.getId(), dVar.getTitle(), dVar.getSelected()));
        }
        MA0.f required2 = aVar.getRequired();
        SxNewAddressMviState.TypesContent typesContent = new SxNewAddressMviState.TypesContent(arrayList2, required2 != null ? required2.getTypes() : null);
        List<MA0.b> listB = aVar.b();
        if (listB != null) {
            List<MA0.b> list = listB;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (MA0.b bVar : list) {
                String id2 = bVar.getId();
                String error = bVar.getError();
                boolean isRequired = bVar.getIsRequired();
                List<MA0.c> listC = bVar.c();
                ArrayList arrayList3 = new ArrayList(C42745f0.q(listC, i12));
                for (MA0.c cVar : listC) {
                    arrayList3.add(new DetailItem.Option(cVar.getId(), cVar.getTitle()));
                }
                arrayList.add(new DetailItem(id2, error, isRequired, arrayList3, bVar.getTitle(), bVar.getValue()));
                i12 = 10;
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        SxNewAddressMviState.DetailsContent detailsContent = new SxNewAddressMviState.DetailsContent(arrayList);
        ScheduleType scheduleType = aVar.getWorkingHours().getIsStandardSchedule() ? ScheduleType.f293617b : L.f(aVar.getWorkingHours().getIsCustomSchedule(), Boolean.TRUE) ? ScheduleType.f293618c : ScheduleType.f293619d;
        MA0.h workingHours = aVar.getWorkingHours();
        WeekDay weekDay = WeekDay.f293622c;
        Q q12 = new Q(weekDay, i(workingHours.getMonday()));
        WeekDay weekDay2 = WeekDay.f293623d;
        Q q13 = new Q(weekDay2, i(workingHours.getTuesday()));
        WeekDay weekDay3 = WeekDay.f293624e;
        Q q14 = new Q(weekDay3, i(workingHours.getWednesday()));
        WeekDay weekDay4 = WeekDay.f293625f;
        Q q15 = new Q(weekDay4, i(workingHours.getThursday()));
        WeekDay weekDay5 = WeekDay.f293626g;
        Q q16 = new Q(weekDay5, i(workingHours.getFriday()));
        WeekDay weekDay6 = WeekDay.f293627h;
        Q q17 = new Q(weekDay6, i(workingHours.getSaturday()));
        WeekDay weekDay7 = WeekDay.f293628i;
        SxNewAddressMviState.WorkingSchedulerContent workingSchedulerContent = new SxNewAddressMviState.WorkingSchedulerContent(new WorkingHours(workingHours.getStandardScheduleText(), P0.g(q12, q13, q14, q15, q16, q17, new Q(weekDay7, i(workingHours.getSunday()))), P0.g(new Q(weekDay, i(aVar.getStandardWorkingHours().getMonday())), new Q(weekDay2, i(aVar.getStandardWorkingHours().getTuesday())), new Q(weekDay3, i(aVar.getStandardWorkingHours().getWednesday())), new Q(weekDay4, i(aVar.getStandardWorkingHours().getThursday())), new Q(weekDay5, i(aVar.getStandardWorkingHours().getFriday())), new Q(weekDay6, i(aVar.getStandardWorkingHours().getSaturday())), new Q(weekDay7, i(aVar.getStandardWorkingHours().getSunday())))), scheduleType);
        return new SxNewAddressMviState(SxNewAddressMviState.LoadingType.f293726b, new SxNewAddressMviViewState.Content(addressContent, titleContent, typesContent, detailsContent, workingSchedulerContent, null), addressContent, titleContent, typesContent, detailsContent, workingSchedulerContent, null);
    }

    public static final WorkingHours.Day g(HA0.i iVar) {
        HA0.h from = iVar.getFrom();
        WorkingHours.Day.Time time = new WorkingHours.Day.Time(from.getHours(), from.getMinutes());
        boolean isWorkingDay = iVar.getIsWorkingDay();
        HA0.h to2 = iVar.getTo();
        return new WorkingHours.Day(time, isWorkingDay, new WorkingHours.Day.Time(to2.getHours(), to2.getMinutes()));
    }

    public static final WorkingHours.Day h(LA0.j jVar) {
        LA0.i from = jVar.getFrom();
        WorkingHours.Day.Time time = new WorkingHours.Day.Time(from.getHours(), from.getMinutes());
        boolean isWorkingDay = jVar.getIsWorkingDay();
        LA0.i to2 = jVar.getTo();
        return new WorkingHours.Day(time, isWorkingDay, new WorkingHours.Day.Time(to2.getHours(), to2.getMinutes()));
    }

    public static final WorkingHours.Day i(MA0.k kVar) {
        MA0.j from = kVar.getFrom();
        WorkingHours.Day.Time time = new WorkingHours.Day.Time(from.getHours(), from.getMinutes());
        boolean isWorkingDay = kVar.getIsWorkingDay();
        MA0.j to2 = kVar.getTo();
        return new WorkingHours.Day(time, isWorkingDay, new WorkingHours.Day.Time(to2.getHours(), to2.getMinutes()));
    }

    public static final WorkingHours.Day j(GA0.h hVar) {
        GA0.g from = hVar.getFrom();
        WorkingHours.Day.Time time = new WorkingHours.Day.Time(from.getHours(), from.getMinutes());
        boolean isWorkingDay = hVar.getIsWorkingDay();
        GA0.g to2 = hVar.getTo();
        return new WorkingHours.Day(time, isWorkingDay, new WorkingHours.Day.Time(to2.getHours(), to2.getMinutes()));
    }
}
