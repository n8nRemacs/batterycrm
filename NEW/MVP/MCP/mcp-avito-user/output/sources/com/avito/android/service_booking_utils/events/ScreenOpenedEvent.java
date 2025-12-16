package com.avito.android.service_booking_utils.events;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import org.threeten.bp.f;
import org.threeten.bp.format.c;

/* compiled from: ScreenOpenedEvent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_utils/events/ScreenOpenedEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "b", "Screen", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScreenOpenedEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f278355c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final InterfaceC42726C<c> f278356d = C42727D.c(a.f278369l);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f278357b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScreenOpenedEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_utils/events/ScreenOpenedEvent$Screen;", "", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Screen {

        /* renamed from: c, reason: collision with root package name */
        public static final Screen f278358c;

        /* renamed from: d, reason: collision with root package name */
        public static final Screen f278359d;

        /* renamed from: e, reason: collision with root package name */
        public static final Screen f278360e;

        /* renamed from: f, reason: collision with root package name */
        public static final Screen f278361f;

        /* renamed from: g, reason: collision with root package name */
        public static final Screen f278362g;

        /* renamed from: h, reason: collision with root package name */
        public static final Screen f278363h;

        /* renamed from: i, reason: collision with root package name */
        public static final Screen f278364i;

        /* renamed from: j, reason: collision with root package name */
        public static final Screen f278365j;

        /* renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ Screen[] f278366k;

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f278367l;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f278368b;

        static {
            Screen screen = new Screen("CALENDAR", 0, "schedule_day");
            f278358c = screen;
            Screen screen2 = new Screen("WORK_TIME_SHEET_FROM", 1, "set_time_from");
            f278359d = screen2;
            Screen screen3 = new Screen("WORK_TIME_SHEET_TO", 2, "set_time_to");
            f278360e = screen3;
            Screen screen4 = new Screen("REPETITION_SHEET", 3, "set_repeat_days");
            f278361f = screen4;
            Screen screen5 = new Screen("ADDITIONAL_SETTINGS", 4, "settings");
            Screen screen6 = new Screen("CALENDAR_HEADER", 5, "calendar_day_header");
            f278362g = screen6;
            Screen screen7 = new Screen("CALENDAR_BODY", 6, "calendar_day_body");
            f278363h = screen7;
            Screen screen8 = new Screen("SET_BREAK_FROM", 7, "set_break_from");
            f278364i = screen8;
            Screen screen9 = new Screen("SET_BREAK_TO", 8, "set_break_to");
            f278365j = screen9;
            Screen[] screenArr = {screen, screen2, screen3, screen4, screen5, screen6, screen7, screen8, screen9};
            f278366k = screenArr;
            f278367l = kotlin.enums.c.a(screenArr);
        }

        public Screen(String str, int i12, String str2) {
            this.f278368b = str2;
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) f278366k.clone();
        }
    }

    /* compiled from: ScreenOpenedEvent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/threeten/bp/format/c;", "kotlin.jvm.PlatformType", "invoke", "()Lorg/threeten/bp/format/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<c> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f278369l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final c invoke() {
            return c.b(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT);
        }
    }

    /* compiled from: ScreenOpenedEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_utils/events/ScreenOpenedEvent$b;", "", "<init>", "()V", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public ScreenOpenedEvent(@k Screen screen, @l f fVar) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("from_page", screen.f278368b));
        if (fVar != null) {
            f278355c.getClass();
            linkedHashMapJ.put("services_booking_calendar_gg_date", fVar.A(f278356d.getValue()));
        }
        G0 g02 = G0.f406611a;
        this.f278357b = new ParametrizedClickStreamEvent(9894, 1, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return this.f278357b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f278357b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return this.f278357b.f90248c;
    }

    public /* synthetic */ ScreenOpenedEvent(Screen screen, f fVar, int i12, C42822w c42822w) {
        this(screen, (i12 & 2) != 0 ? null : fVar);
    }
}
