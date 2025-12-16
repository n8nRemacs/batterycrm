package com.avito.android.service_booking_calendar.view.day;

import kotlin.Metadata;

/* compiled from: DayItemContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_calendar/view/day/DayItemContent;", "", "DayType", "EventType", "HighlightType", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DayItemContent {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DayItemContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/view/day/DayItemContent$DayType;", "", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DayType {

        /* renamed from: b, reason: collision with root package name */
        public static final DayType f276171b;

        /* renamed from: c, reason: collision with root package name */
        public static final DayType f276172c;

        /* renamed from: d, reason: collision with root package name */
        public static final DayType f276173d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ DayType[] f276174e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f276175f;

        static {
            DayType dayType = new DayType("DISABLED", 0);
            f276171b = dayType;
            DayType dayType2 = new DayType("ACTIVE", 1);
            f276172c = dayType2;
            DayType dayType3 = new DayType("INACTIVE", 2);
            f276173d = dayType3;
            DayType[] dayTypeArr = {dayType, dayType2, dayType3};
            f276174e = dayTypeArr;
            f276175f = kotlin.enums.c.a(dayTypeArr);
        }

        public DayType() {
            throw null;
        }

        public static DayType valueOf(String str) {
            return (DayType) Enum.valueOf(DayType.class, str);
        }

        public static DayType[] values() {
            return (DayType[]) f276174e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DayItemContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/view/day/DayItemContent$EventType;", "", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EventType {

        /* renamed from: b, reason: collision with root package name */
        public static final EventType f276176b;

        /* renamed from: c, reason: collision with root package name */
        public static final EventType f276177c;

        /* renamed from: d, reason: collision with root package name */
        public static final EventType f276178d;

        /* renamed from: e, reason: collision with root package name */
        public static final EventType f276179e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ EventType[] f276180f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f276181g;

        static {
            EventType eventType = new EventType("NONE", 0);
            f276176b = eventType;
            EventType eventType2 = new EventType("PASSED", 1);
            f276177c = eventType2;
            EventType eventType3 = new EventType("ACTIVE", 2);
            f276178d = eventType3;
            EventType eventType4 = new EventType("NEEDS_ACTION", 3);
            f276179e = eventType4;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4};
            f276180f = eventTypeArr;
            f276181g = kotlin.enums.c.a(eventTypeArr);
        }

        public EventType() {
            throw null;
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) f276180f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DayItemContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/view/day/DayItemContent$HighlightType;", "", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HighlightType {

        /* renamed from: b, reason: collision with root package name */
        public static final HighlightType f276182b;

        /* renamed from: c, reason: collision with root package name */
        public static final HighlightType f276183c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ HighlightType[] f276184d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f276185e;

        static {
            HighlightType highlightType = new HighlightType("INSIDE_ROUND_BORDER", 0);
            f276182b = highlightType;
            HighlightType highlightType2 = new HighlightType("NONE", 1);
            f276183c = highlightType2;
            HighlightType[] highlightTypeArr = {highlightType, highlightType2};
            f276184d = highlightTypeArr;
            f276185e = kotlin.enums.c.a(highlightTypeArr);
        }

        public HighlightType() {
            throw null;
        }

        public static HighlightType valueOf(String str) {
            return (HighlightType) Enum.valueOf(HighlightType.class, str);
        }

        public static HighlightType[] values() {
            return (HighlightType[]) f276184d.clone();
        }
    }

    boolean a();

    @Y61.k
    HighlightType b();

    @Y61.k
    DayType c();

    @Y61.k
    EventType d();

    @Y61.k
    String getText();
}
