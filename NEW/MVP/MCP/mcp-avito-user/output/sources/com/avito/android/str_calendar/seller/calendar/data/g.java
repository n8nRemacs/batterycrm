package com.avito.android.str_calendar.seller.calendar.data;

import Iy0.InterfaceC14175a;
import Iy0.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.str_calendar.common.models.DateRange;
import com.avito.android.str_calendar.common.models.Position;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.ranges.g;

/* compiled from: StrSellerCalendarItemStatesBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/data/g;", "Lcom/avito/android/str_calendar/seller/calendar/data/f;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f287537a;

    @Inject
    public g(@Y61.k m mVar) {
        this.f287537a = mVar;
    }

    public static boolean b(List list, Date date) {
        List<DateRange> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (DateRange dateRange : list2) {
            dateRange.getClass();
            if (g.a.a(dateRange, date)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Jy0.C14262b c(Iy0.c r11, java.util.Date r12, Iy0.c.b r13, java.util.Date r14) {
        /*
            int r0 = r12.compareTo(r14)
            r1 = 0
            if (r0 <= 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = r1
        La:
            boolean r12 = r12.equals(r14)
            if (r13 == 0) goto L14
            boolean r2 = r13.f8663b
            r8 = r2
            goto L15
        L14:
            r8 = r1
        L15:
            if (r13 == 0) goto L19
            boolean r1 = r13.f8665d
        L19:
            r9 = r1
            java.lang.String r1 = ""
            if (r13 != 0) goto L20
        L1e:
            r10 = r1
            goto L2e
        L20:
            if (r8 == 0) goto L29
            java.lang.String r13 = r13.f8664c
            if (r13 != 0) goto L27
            goto L1e
        L27:
            r10 = r13
            goto L2e
        L29:
            Iy0.c$a r13 = r11.f8657d
            java.lang.String r13 = r13.f8661a
            goto L27
        L2e:
            if (r0 == 0) goto L3a
            com.avito.android.str_calendar.seller.calendar.mvi.entity.Status r11 = com.avito.android.str_calendar.seller.calendar.mvi.entity.Status.f287692g
            com.avito.android.str_calendar.common.models.Position r13 = com.avito.android.str_calendar.common.models.Position.f286642f
            kotlin.Q r14 = new kotlin.Q
            r14.<init>(r11, r13)
            goto L7f
        L3a:
            java.lang.Object r13 = r11.f8654a
            boolean r0 = b(r13, r14)
            if (r0 == 0) goto L4e
            com.avito.android.str_calendar.seller.calendar.mvi.entity.Status r11 = com.avito.android.str_calendar.seller.calendar.mvi.entity.Status.f287689d
            com.avito.android.str_calendar.common.models.Position r13 = d(r13, r14)
            kotlin.Q r14 = new kotlin.Q
            r14.<init>(r11, r13)
            goto L7f
        L4e:
            java.lang.Object r13 = r11.f8655b
            boolean r0 = b(r13, r14)
            if (r0 == 0) goto L62
            com.avito.android.str_calendar.seller.calendar.mvi.entity.Status r11 = com.avito.android.str_calendar.seller.calendar.mvi.entity.Status.f287690e
            com.avito.android.str_calendar.common.models.Position r13 = d(r13, r14)
            kotlin.Q r14 = new kotlin.Q
            r14.<init>(r11, r13)
            goto L7f
        L62:
            java.lang.Object r11 = r11.f8656c
            boolean r13 = b(r11, r14)
            if (r13 == 0) goto L76
            com.avito.android.str_calendar.seller.calendar.mvi.entity.Status r13 = com.avito.android.str_calendar.seller.calendar.mvi.entity.Status.f287691f
            com.avito.android.str_calendar.common.models.Position r11 = d(r11, r14)
            kotlin.Q r14 = new kotlin.Q
            r14.<init>(r13, r11)
            goto L7f
        L76:
            com.avito.android.str_calendar.seller.calendar.mvi.entity.Status r11 = com.avito.android.str_calendar.seller.calendar.mvi.entity.Status.f287693h
            com.avito.android.str_calendar.common.models.Position r13 = com.avito.android.str_calendar.common.models.Position.f286642f
            kotlin.Q r14 = new kotlin.Q
            r14.<init>(r11, r13)
        L7f:
            A r11 = r14.f406619b
            r4 = r11
            com.avito.android.str_calendar.seller.calendar.mvi.entity.Status r4 = (com.avito.android.str_calendar.seller.calendar.mvi.entity.Status) r4
            B r11 = r14.f406620c
            r5 = r11
            com.avito.android.str_calendar.common.models.Position r5 = (com.avito.android.str_calendar.common.models.Position) r5
            if (r12 == 0) goto L8f
            com.avito.android.str_calendar.seller.calendar.mvi.entity.Status r11 = com.avito.android.str_calendar.seller.calendar.mvi.entity.Status.f287688c
        L8d:
            r6 = r11
            goto L92
        L8f:
            com.avito.android.str_calendar.seller.calendar.mvi.entity.Status r11 = com.avito.android.str_calendar.seller.calendar.mvi.entity.Status.f287694i
            goto L8d
        L92:
            if (r12 == 0) goto L98
            com.avito.android.str_calendar.common.models.Position r11 = com.avito.android.str_calendar.common.models.Position.f286640d
        L96:
            r7 = r11
            goto L9b
        L98:
            com.avito.android.str_calendar.common.models.Position r11 = com.avito.android.str_calendar.common.models.Position.f286642f
            goto L96
        L9b:
            Jy0.b r11 = new Jy0.b
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calendar.data.g.c(Iy0.c, java.util.Date, Iy0.c$b, java.util.Date):Jy0.b");
    }

    public static Position d(List list, Date date) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DateRange dateRange = (DateRange) it.next();
            dateRange.getClass();
            if (g.a.a(dateRange, date)) {
                return wy0.b.e(dateRange, date);
            }
        }
        throw new IllegalStateException("Day not found in ranges");
    }

    @Override // com.avito.android.str_calendar.seller.calendar.data.f
    @Y61.k
    public final LinkedHashMap a(@Y61.k Iy0.c cVar, @Y61.k List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Date time = this.f287537a.a().getTime();
        for (c.b bVar : (Iterable) cVar.f8658e) {
            Date date = bVar.f8662a;
            linkedHashMap.put(wy0.b.d(date), c(cVar, time, bVar, date));
        }
        Iy0.b bVar2 = (Iy0.b) C42745f0.G(list);
        if (bVar2 != null) {
            ArrayList arrayList = bVar2.f8652a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof InterfaceC14175a.b) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Date date2 = ((InterfaceC14175a.b) it.next()).f8651a;
                String strD = wy0.b.d(date2);
                if (linkedHashMap.get(strD) == null) {
                    linkedHashMap.put(strD, c(cVar, time, null, date2));
                }
            }
        }
        return linkedHashMap;
    }
}
