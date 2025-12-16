package com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.CalendarDayRedesignItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarDayRedesignItem.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/e;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/e$a;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/e$b;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/e$c;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/e$d;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/e$e;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface e {

    /* compiled from: CalendarDayRedesignItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/e$a;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/e;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CalendarDayRedesignItem.CellType f290847a;

        public a(@k CalendarDayRedesignItem.CellType cellType) {
            this.f290847a = cellType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f290847a == ((a) obj).f290847a;
        }

        public final int hashCode() {
            return this.f290847a.hashCode();
        }

        @k
        public final String toString() {
            return "CellType(newCellType=" + this.f290847a + ')';
        }
    }

    /* compiled from: CalendarDayRedesignItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/e$b;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/e;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f290848a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f290849b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f290850c;

        public b(boolean z12, boolean z13, boolean z14) {
            this.f290848a = z12;
            this.f290849b = z13;
            this.f290850c = z14;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f290848a == bVar.f290848a && this.f290849b == bVar.f290849b && this.f290850c == bVar.f290850c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f290850c) + r.i(Boolean.hashCode(this.f290848a) * 31, 31, this.f290849b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Features(hasInstantBooking=");
            sb2.append(this.f290848a);
            sb2.append(", hasLastMinuteOffer=");
            sb2.append(this.f290849b);
            sb2.append(", hasPromo=");
            return r.x(sb2, this.f290850c, ')');
        }
    }

    /* compiled from: CalendarDayRedesignItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/e$c;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/e;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f290851a;

        public c(@l PrintableText printableText) {
            this.f290851a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f290851a, ((c) obj).f290851a);
        }

        public final int hashCode() {
            PrintableText printableText = this.f290851a;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("MainText(newText="), this.f290851a, ')');
        }
    }

    /* compiled from: CalendarDayRedesignItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/e$d;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/e;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements e {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f290852a;

        public d(@l Integer num) {
            this.f290852a = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f290852a, ((d) obj).f290852a);
        }

        public final int hashCode() {
            Integer num = this.f290852a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @k
        public final String toString() {
            return s.j(new StringBuilder("MinNights(newMinNights="), this.f290852a, ')');
        }
    }

    /* compiled from: CalendarDayRedesignItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/e$e;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/e;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign.e$e, reason: collision with other inner class name */
    public static final /* data */ class C8799e implements e {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f290853a;

        public C8799e(@l PrintableText printableText) {
            this.f290853a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8799e) && L.f(this.f290853a, ((C8799e) obj).f290853a);
        }

        public final int hashCode() {
            PrintableText printableText = this.f290853a;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("SecondaryText(newText="), this.f290853a, ')');
        }
    }
}
