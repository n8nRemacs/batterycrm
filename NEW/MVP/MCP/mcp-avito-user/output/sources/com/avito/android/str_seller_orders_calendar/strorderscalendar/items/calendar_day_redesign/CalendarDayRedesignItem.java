package com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_redesign;

import Sz0.InterfaceC15275d;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CalendarDayRedesignItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/CalendarDayRedesignItem;", "Lcom/avito/conveyor_item/a;", "CellType", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CalendarDayRedesignItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f290818b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f290819c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final PrintableText f290820d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final PrintableText f290821e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f290822f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f290823g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f290824h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Integer f290825i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f290826j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final InterfaceC15275d f290827k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final CellType f290828l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CalendarDayRedesignItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_redesign/CalendarDayRedesignItem$CellType;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CellType {

        /* renamed from: b, reason: collision with root package name */
        public static final CellType f290829b;

        /* renamed from: c, reason: collision with root package name */
        public static final CellType f290830c;

        /* renamed from: d, reason: collision with root package name */
        public static final CellType f290831d;

        /* renamed from: e, reason: collision with root package name */
        public static final CellType f290832e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ CellType[] f290833f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f290834g;

        static {
            CellType cellType = new CellType("REGULAR", 0);
            f290829b = cellType;
            CellType cellType2 = new CellType("UNAVAILABLE", 1);
            f290830c = cellType2;
            CellType cellType3 = new CellType("SELECTED", 2);
            f290831d = cellType3;
            CellType cellType4 = new CellType("SELECTED_UNAVAILABLE", 3);
            f290832e = cellType4;
            CellType[] cellTypeArr = {cellType, cellType2, cellType3, cellType4};
            f290833f = cellTypeArr;
            f290834g = kotlin.enums.c.a(cellTypeArr);
        }

        public CellType() {
            throw null;
        }

        public static CellType valueOf(String str) {
            return (CellType) Enum.valueOf(CellType.class, str);
        }

        public static CellType[] values() {
            return (CellType[]) f290833f.clone();
        }

        public final boolean a() {
            return this == f290830c || this == f290832e;
        }
    }

    public CalendarDayRedesignItem(@k String str, @k String str2, @l PrintableText printableText, @l PrintableText printableText2, boolean z12, boolean z13, boolean z14, @l Integer num, boolean z15, @k InterfaceC15275d interfaceC15275d, @k CellType cellType) {
        this.f290818b = str;
        this.f290819c = str2;
        this.f290820d = printableText;
        this.f290821e = printableText2;
        this.f290822f = z12;
        this.f290823g = z13;
        this.f290824h = z14;
        this.f290825i = num;
        this.f290826j = z15;
        this.f290827k = interfaceC15275d;
        this.f290828l = cellType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarDayRedesignItem)) {
            return false;
        }
        CalendarDayRedesignItem calendarDayRedesignItem = (CalendarDayRedesignItem) obj;
        return L.f(this.f290818b, calendarDayRedesignItem.f290818b) && L.f(this.f290819c, calendarDayRedesignItem.f290819c) && L.f(this.f290820d, calendarDayRedesignItem.f290820d) && L.f(this.f290821e, calendarDayRedesignItem.f290821e) && this.f290822f == calendarDayRedesignItem.f290822f && this.f290823g == calendarDayRedesignItem.f290823g && this.f290824h == calendarDayRedesignItem.f290824h && L.f(this.f290825i, calendarDayRedesignItem.f290825i) && this.f290826j == calendarDayRedesignItem.f290826j && L.f(this.f290827k, calendarDayRedesignItem.f290827k) && this.f290828l == calendarDayRedesignItem.f290828l;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return getF288417b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF288417b() {
        return this.f290818b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f290818b.hashCode() * 31, 31, this.f290819c);
        PrintableText printableText = this.f290820d;
        int iHashCode = (iD2 + (printableText == null ? 0 : printableText.hashCode())) * 31;
        PrintableText printableText2 = this.f290821e;
        int i12 = r.i(r.i(r.i((iHashCode + (printableText2 == null ? 0 : printableText2.hashCode())) * 31, 31, this.f290822f), 31, this.f290823g), 31, this.f290824h);
        Integer num = this.f290825i;
        return this.f290828l.hashCode() + ((this.f290827k.hashCode() + r.i((i12 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f290826j)) * 31);
    }

    @k
    public final String toString() {
        return "CalendarDayRedesignItem(stringId=" + this.f290818b + ", itemId=" + this.f290819c + ", mainText=" + this.f290820d + ", secondaryText=" + this.f290821e + ", hasInstantBooking=" + this.f290822f + ", hasLastMinuteOffer=" + this.f290823g + ", hasPromo=" + this.f290824h + ", minNights=" + this.f290825i + ", isPastDate=" + this.f290826j + ", tagType=" + this.f290827k + ", cellType=" + this.f290828l + ')';
    }

    public /* synthetic */ CalendarDayRedesignItem(String str, String str2, PrintableText printableText, PrintableText printableText2, boolean z12, boolean z13, boolean z14, Integer num, boolean z15, InterfaceC15275d interfaceC15275d, CellType cellType, int i12, C42822w c42822w) {
        this(str, str2, printableText, printableText2, z12, z13, z14, num, z15, (i12 & 512) != 0 ? InterfaceC15275d.c.f15258a : interfaceC15275d, (i12 & 1024) != 0 ? CellType.f290829b : cellType);
    }
}
