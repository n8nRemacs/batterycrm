package com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_stub;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarDayStubItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_stub/CalendarDayStubItem;", "Lcom/avito/conveyor_item/a;", "StubTagType", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CalendarDayStubItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f290881b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final StubTagType f290882c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CalendarDayStubItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/items/calendar_day_stub/CalendarDayStubItem$StubTagType;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StubTagType {

        /* renamed from: b, reason: collision with root package name */
        public static final StubTagType f290883b;

        /* renamed from: c, reason: collision with root package name */
        public static final StubTagType f290884c;

        /* renamed from: d, reason: collision with root package name */
        public static final StubTagType f290885d;

        /* renamed from: e, reason: collision with root package name */
        public static final StubTagType f290886e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ StubTagType[] f290887f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f290888g;

        static {
            StubTagType stubTagType = new StubTagType("NONE", 0);
            f290883b = stubTagType;
            StubTagType stubTagType2 = new StubTagType("END", 1);
            f290884c = stubTagType2;
            StubTagType stubTagType3 = new StubTagType("START", 2);
            f290885d = stubTagType3;
            StubTagType stubTagType4 = new StubTagType("MIDDLE", 3);
            f290886e = stubTagType4;
            StubTagType[] stubTagTypeArr = {stubTagType, stubTagType2, stubTagType3, stubTagType4};
            f290887f = stubTagTypeArr;
            f290888g = kotlin.enums.c.a(stubTagTypeArr);
        }

        public StubTagType() {
            throw null;
        }

        public static StubTagType valueOf(String str) {
            return (StubTagType) Enum.valueOf(StubTagType.class, str);
        }

        public static StubTagType[] values() {
            return (StubTagType[]) f290887f.clone();
        }
    }

    public CalendarDayStubItem(@k String str, @k StubTagType stubTagType) {
        this.f290881b = str;
        this.f290882c = stubTagType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarDayStubItem)) {
            return false;
        }
        CalendarDayStubItem calendarDayStubItem = (CalendarDayStubItem) obj;
        return L.f(this.f290881b, calendarDayStubItem.f290881b) && this.f290882c == calendarDayStubItem.f290882c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return getF289436b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF289436b() {
        return this.f290881b;
    }

    public final int hashCode() {
        return this.f290882c.hashCode() + (this.f290881b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "CalendarDayStubItem(stringId=" + this.f290881b + ", tagType=" + this.f290882c + ')';
    }
}
