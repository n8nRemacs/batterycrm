package com.avito.android.str_seller_orders_calendar.strorderscalendar;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.CalendarDayRedesignItem;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.e;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_stub.CalendarDayStubItem;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersCalendarDiffCallback.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/a;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends C23424o.f<TV0.a> {
    @Inject
    public a() {
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if (!(aVar3 instanceof CalendarDayRedesignItem) || !(aVar4 instanceof CalendarDayRedesignItem)) {
            return false;
        }
        CalendarDayRedesignItem calendarDayRedesignItem = (CalendarDayRedesignItem) aVar3;
        CalendarDayRedesignItem calendarDayRedesignItem2 = (CalendarDayRedesignItem) aVar4;
        return L.f(calendarDayRedesignItem.f290818b, calendarDayRedesignItem2.f290818b) && L.f(calendarDayRedesignItem.f290820d, calendarDayRedesignItem2.f290820d) && calendarDayRedesignItem.f290828l == calendarDayRedesignItem2.f290828l && L.f(calendarDayRedesignItem.f290821e, calendarDayRedesignItem2.f290821e) && calendarDayRedesignItem.f290824h == calendarDayRedesignItem2.f290824h && calendarDayRedesignItem.f290822f == calendarDayRedesignItem2.f290822f && calendarDayRedesignItem.f290823g == calendarDayRedesignItem2.f290823g && L.f(calendarDayRedesignItem.f290825i, calendarDayRedesignItem2.f290825i);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return ((aVar3 instanceof CalendarDayRedesignItem) && (aVar4 instanceof CalendarDayRedesignItem)) ? L.f(((CalendarDayRedesignItem) aVar3).f290818b, ((CalendarDayRedesignItem) aVar4).f290818b) : ((aVar3 instanceof CalendarDayStubItem) && (aVar4 instanceof CalendarDayStubItem)) ? L.f(((CalendarDayStubItem) aVar3).f290881b, ((CalendarDayStubItem) aVar4).f290881b) : aVar3.getF207385b() == aVar4.getF207385b() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if (!(aVar3 instanceof CalendarDayRedesignItem) || !(aVar4 instanceof CalendarDayRedesignItem)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        CalendarDayRedesignItem calendarDayRedesignItem = (CalendarDayRedesignItem) aVar3;
        CalendarDayRedesignItem calendarDayRedesignItem2 = (CalendarDayRedesignItem) aVar4;
        PrintableText printableText = calendarDayRedesignItem.f290820d;
        PrintableText printableText2 = calendarDayRedesignItem2.f290820d;
        if (!L.f(printableText, printableText2)) {
            arrayList.add(new e.c(printableText2));
        }
        CalendarDayRedesignItem.CellType cellType = calendarDayRedesignItem.f290828l;
        CalendarDayRedesignItem.CellType cellType2 = calendarDayRedesignItem2.f290828l;
        if (cellType != cellType2) {
            arrayList.add(new e.a(cellType2));
        }
        PrintableText printableText3 = calendarDayRedesignItem.f290821e;
        PrintableText printableText4 = calendarDayRedesignItem2.f290821e;
        if (!L.f(printableText3, printableText4)) {
            arrayList.add(new e.C8799e(printableText4));
        }
        Integer num = calendarDayRedesignItem.f290825i;
        Integer num2 = calendarDayRedesignItem2.f290825i;
        if (!L.f(num, num2)) {
            arrayList.add(new e.d(num2));
        }
        boolean z12 = calendarDayRedesignItem2.f290823g;
        boolean z13 = calendarDayRedesignItem.f290824h;
        boolean z14 = calendarDayRedesignItem2.f290824h;
        if (z13 == z14 && calendarDayRedesignItem.f290822f == calendarDayRedesignItem2.f290822f && calendarDayRedesignItem.f290823g == z12) {
            return arrayList;
        }
        arrayList.add(new e.b(z12, z12, z14));
        return arrayList;
    }
}
