package rt0;

import Y61.k;
import com.avito.android.B2;
import com.avito.android.server_time.j;
import com.avito.android.service_booking.SbDateBlock;
import com.avito.android.service_booking_public.generated.api.api_2_booking_form.BookingFormResponseV3SuccessParamsItem;
import com.avito.android.util.K;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qt0.C47440d;

/* compiled from: ServiceBookingDateBlockConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrt0/b;", "Lrt0/a;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rt0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47720b implements InterfaceC47719a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_common.g f430274a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j f430275b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final B2 f430276c;

    @Inject
    public C47720b(@k com.avito.android.service_booking_common.g gVar, @k j jVar, @k B2 b22) {
        this.f430274a = gVar;
        this.f430275b = jVar;
        this.f430276c = b22;
    }

    public static LinkedHashMap e(String str, List list) {
        Calendar calendarA = com.avito.android.service_booking_common.b.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                Date dateB = com.avito.android.service_booking_common.b.b(str2);
                calendarA.setTime(dateB);
                K.a(calendarA);
                C47440d.a aVar = new C47440d.a(str2, str, dateB, false, true);
                if (linkedHashMap.get(calendarA.getTime()) == null) {
                    linkedHashMap.put(calendarA.getTime(), C42745f0.e0(aVar));
                } else {
                    List list2 = (List) linkedHashMap.get(calendarA.getTime());
                    if (list2 != null) {
                        list2.add(aVar);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @Override // rt0.InterfaceC47719a
    @k
    public final List<com.avito.conveyor_item.a> a(@k SbDateBlock sbDateBlock) {
        String strValueOf;
        C47440d.b bVar;
        Object obj;
        Integer numValueOf;
        Object next;
        B2 b22 = this.f430276c;
        b22.getClass();
        n<Object> nVar = B2.f67184X[23];
        if (((Boolean) b22.f67231y.a().invoke()).booleanValue()) {
            List<String> listD = sbDateBlock.d();
            strValueOf = f(listD != null ? (String) C42745f0.G(listD) : null);
        } else {
            List<String> listD2 = sbDateBlock.d();
            if (listD2 == null || (strValueOf = (String) C42745f0.G(listD2)) == null) {
                strValueOf = String.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f430275b.f274001a.now()));
            }
        }
        ArrayList arrayListA = this.f430274a.a(strValueOf, sbDateBlock.getEndDate());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayListA) {
            linkedHashMap.put(obj2, new ArrayList());
        }
        Calendar calendarA = com.avito.android.service_booking_common.b.a();
        String value = sbDateBlock.getValue();
        Date dateB = value != null ? com.avito.android.service_booking_common.b.b(value) : null;
        List<String> listD3 = sbDateBlock.d();
        if (listD3 != null) {
            obj = null;
            int i12 = 0;
            numValueOf = null;
            for (Object obj3 : listD3) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                String str = (String) obj3;
                Date dateB2 = com.avito.android.service_booking_common.b.b(str);
                calendarA.setTime(dateB2);
                K.a(calendarA);
                Object time = calendarA.getTime();
                List list = (List) linkedHashMap.get(time);
                if (list != null) {
                    list.add(new C47440d.a(str, sbDateBlock.getId(), dateB2, dateB2.equals(dateB), true));
                }
                if (dateB2.equals(dateB)) {
                    Iterator it = linkedHashMap.entrySet().iterator();
                    int i14 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i14 = -1;
                            break;
                        }
                        Object next2 = it.next();
                        if (i14 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        if (L.f(((Map.Entry) next2).getKey(), time)) {
                            break;
                        }
                        i14++;
                    }
                    numValueOf = Integer.valueOf(i14);
                    obj = time;
                }
                i12 = i13;
            }
            bVar = null;
        } else {
            bVar = null;
            obj = null;
            numValueOf = null;
        }
        if (obj == null) {
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = bVar;
                    break;
                }
                next = it2.next();
                if (!((Collection) ((Map.Entry) next).getValue()).isEmpty()) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry == null || (obj = (Date) entry.getKey()) == null) {
                Map.Entry entry2 = (Map.Entry) C42745f0.F(linkedHashMap.entrySet());
                if (entry2 != null) {
                    Object obj4 = (Date) entry2.getKey();
                    obj = obj4;
                } else {
                    obj = bVar;
                }
            } else {
                obj = obj4;
            }
        }
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry3 : setEntrySet) {
            linkedHashMap2.put(new C47440d.a(String.valueOf(((Date) entry3.getKey()).getTime()), sbDateBlock.getId(), (Date) entry3.getKey(), L.f(entry3.getKey(), obj), !((Collection) entry3.getValue()).isEmpty()), new C47440d.c.C12339c((List) entry3.getValue()));
        }
        String id2 = sbDateBlock.getId();
        String title = sbDateBlock.getTitle();
        C47440d.b bVar2 = bVar;
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            bVar2 = new C47440d.b(iIntValue, iIntValue);
        }
        return Collections.singletonList(new C47440d(id2, title, linkedHashMap2, bVar2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x010b, code lost:
    
        r9 = java.lang.Integer.valueOf(r6);
        r7 = r10;
     */
    @Override // rt0.InterfaceC47719a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.conveyor_item.a> b(@Y61.k com.avito.android.service_booking_public.generated.api.api_2_booking_form.BookingFormResponseV3SuccessParamsItem.BookingParamDateV3 r20) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt0.C47720b.b(com.avito.android.service_booking_public.generated.api.api_2_booking_form.BookingFormResponseV3SuccessParamsItem$BookingParamDateV3):java.util.List");
    }

    @Override // rt0.InterfaceC47719a
    @k
    public final List<com.avito.conveyor_item.a> c(@k BookingFormResponseV3SuccessParamsItem.BookingParamDaysV3 bookingParamDaysV3) {
        Object next;
        String strValueOf = String.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f430275b.f274001a.now()));
        String endDate = bookingParamDaysV3.getEndDate();
        Calendar calendarA = com.avito.android.service_booking_common.b.a();
        ArrayList arrayListA = this.f430274a.a(strValueOf, endDate);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayListA) {
            linkedHashMap.put(obj, new ArrayList());
        }
        LinkedHashMap linkedHashMapE = e(bookingParamDaysV3.getId().f277510b, bookingParamDaysV3.c());
        List<String> listA = bookingParamDaysV3.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            calendarA.setTime(com.avito.android.service_booking_common.b.b((String) it.next()));
            K.a(calendarA);
            arrayList.add(calendarA.getTime());
        }
        HashSet hashSetK0 = C42745f0.K0(arrayList);
        Iterator it2 = linkedHashMap.keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (hashSetK0.contains((Date) next)) {
                break;
            }
        }
        Date date = (Date) next;
        if (date == null) {
            Map.Entry entry = (Map.Entry) C42745f0.F(linkedHashMap.entrySet());
            date = entry != null ? (Date) entry.getKey() : null;
        }
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int i12 = 0;
        int i13 = 0;
        for (Map.Entry entry2 : setEntrySet) {
            boolean z12 = bookingParamDaysV3.a().isEmpty() || hashSetK0.contains(entry2.getKey());
            if (z12 && L.f(date, entry2.getKey())) {
                i12 = i13;
            } else {
                i13++;
            }
            List list = (List) linkedHashMapE.get(entry2.getKey());
            linkedHashMap2.put(new C47440d.a(String.valueOf(((Date) entry2.getKey()).getTime()), bookingParamDaysV3.getId().f277510b, (Date) entry2.getKey(), L.f(entry2.getKey(), date), z12), list != null ? new C47440d.c.C12339c(list) : C47440d.c.e.f429425a);
        }
        return Collections.singletonList(new C47440d(bookingParamDaysV3.getId().f277510b, bookingParamDaysV3.getTitle(), linkedHashMap2, i12 > 0 ? new C47440d.b(i12, i12) : null));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x010f  */
    @Override // rt0.InterfaceC47719a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.conveyor_item.a> d(@Y61.k com.avito.android.service_booking.SbDaysBlock r20) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt0.C47720b.d(com.avito.android.service_booking.SbDaysBlock):java.util.List");
    }

    public final String f(String str) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f430275b.f274001a.now());
        if (str == null) {
            return String.valueOf(seconds);
        }
        Calendar calendarA = com.avito.android.service_booking_common.b.a();
        calendarA.setTime(com.avito.android.service_booking_common.b.b(String.valueOf(seconds)));
        K.a(calendarA);
        Date time = calendarA.getTime();
        calendarA.setTime(com.avito.android.service_booking_common.b.b(str));
        K.a(calendarA);
        return time.compareTo(calendarA.getTime()) > 0 ? String.valueOf(seconds) : str;
    }
}
