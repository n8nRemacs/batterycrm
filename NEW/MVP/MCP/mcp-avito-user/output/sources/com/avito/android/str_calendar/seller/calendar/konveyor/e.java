package com.avito.android.str_calendar.seller.calendar.konveyor;

import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.str_calendar.common.models.Position;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StrSellerCalendarDiffCallback.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/konveyor/e;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends C23424o.f<TV0.a> {
    @Inject
    public e() {
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof com.avito.android.str_calendar.seller.calendar.konveyor.items.day.a) && (aVar4 instanceof com.avito.android.str_calendar.seller.calendar.konveyor.items.day.a)) {
            return aVar3.equals(aVar4);
        }
        if ((aVar3 instanceof com.avito.android.str_calendar.seller.calendar.konveyor.items.empty.a) && (aVar4 instanceof com.avito.android.str_calendar.seller.calendar.konveyor.items.empty.a)) {
            return aVar3.equals(aVar4);
        }
        if ((aVar3 instanceof com.avito.android.str_calendar.seller.calendar.konveyor.items.month.a) && (aVar4 instanceof com.avito.android.str_calendar.seller.calendar.konveyor.items.month.a)) {
            return aVar3.equals(aVar4);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF287615b() == aVar4.getF287615b() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if (!(aVar3 instanceof com.avito.android.str_calendar.seller.calendar.konveyor.items.day.a) || !(aVar4 instanceof com.avito.android.str_calendar.seller.calendar.konveyor.items.day.a)) {
            if (!(aVar3 instanceof com.avito.android.str_calendar.seller.calendar.konveyor.items.empty.a) || !(aVar4 instanceof com.avito.android.str_calendar.seller.calendar.konveyor.items.empty.a)) {
                return null;
            }
            boolean zF2 = L.f(null, null);
            Position position = Position.f286638b;
            com.avito.android.str_calendar.seller.calendar.konveyor.items.empty.d dVar = new com.avito.android.str_calendar.seller.calendar.konveyor.items.empty.d(null, !zF2);
            if (zF2) {
                return null;
            }
            return dVar;
        }
        com.avito.android.str_calendar.seller.calendar.konveyor.items.day.a aVar5 = (com.avito.android.str_calendar.seller.calendar.konveyor.items.day.a) aVar4;
        com.avito.android.str_calendar.seller.calendar.konveyor.items.day.a aVar6 = (com.avito.android.str_calendar.seller.calendar.konveyor.items.day.a) aVar3;
        boolean zEquals = aVar5.f287622i.equals(aVar6.f287622i);
        boolean z12 = !zEquals;
        boolean zF3 = L.f(aVar5.f287625l, aVar6.f287625l);
        boolean z13 = !zF3;
        boolean zF4 = L.f(aVar5.f287626m, aVar6.f287626m);
        boolean z14 = !zF4;
        boolean zF5 = L.f(aVar5.f287623j, aVar6.f287623j);
        boolean z15 = !zF5;
        boolean zF6 = L.f(aVar5.f287624k, aVar6.f287624k);
        boolean z16 = !zF6;
        String str = aVar5.f287618e;
        String str2 = !L.f(str, aVar6.f287618e) ? str : null;
        int i12 = aVar5.f287621h;
        Integer numValueOf = i12 != aVar6.f287621h ? Integer.valueOf(i12) : null;
        String str3 = aVar5.f287619f;
        if (L.f(str3, aVar6.f287619f)) {
            str3 = null;
        }
        com.avito.android.str_calendar.seller.calendar.konveyor.items.day.d dVar2 = new com.avito.android.str_calendar.seller.calendar.konveyor.items.day.d(str2, numValueOf, str3, z15, z16, z12, z13, z14);
        if (str2 == null && numValueOf == null && str3 == null && zF5 && zF6 && zEquals && zF3 && zF4) {
            return null;
        }
        return dVar2;
    }
}
