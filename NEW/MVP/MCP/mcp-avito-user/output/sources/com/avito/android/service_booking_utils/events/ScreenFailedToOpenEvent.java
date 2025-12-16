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

/* compiled from: ScreenFailedToOpenEvent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_utils/events/ScreenFailedToOpenEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "b", "Screen", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScreenFailedToOpenEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f278343c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final InterfaceC42726C<c> f278344d = C42727D.c(a.f278354l);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f278345b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScreenFailedToOpenEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_utils/events/ScreenFailedToOpenEvent$Screen;", "", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Screen {

        /* renamed from: c, reason: collision with root package name */
        public static final Screen f278346c;

        /* renamed from: d, reason: collision with root package name */
        public static final Screen f278347d;

        /* renamed from: e, reason: collision with root package name */
        public static final Screen f278348e;

        /* renamed from: f, reason: collision with root package name */
        public static final Screen f278349f;

        /* renamed from: g, reason: collision with root package name */
        public static final Screen f278350g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ Screen[] f278351h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f278352i;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f278353b;

        static {
            Screen screen = new Screen("CALENDAR", 0, "schedule_day");
            f278346c = screen;
            Screen screen2 = new Screen("REPETITION_SHEET", 1, "set_repeat_days");
            f278347d = screen2;
            Screen screen3 = new Screen("ADDITIONAL_SETTINGS", 2, "settings");
            f278348e = screen3;
            Screen screen4 = new Screen("CALENDAR_HEADER", 3, "calendar_day_header");
            f278349f = screen4;
            Screen screen5 = new Screen("CALENDAR_BODY", 4, "calendar_day_body");
            f278350g = screen5;
            Screen[] screenArr = {screen, screen2, screen3, screen4, screen5};
            f278351h = screenArr;
            f278352i = kotlin.enums.c.a(screenArr);
        }

        public Screen(String str, int i12, String str2) {
            this.f278353b = str2;
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) f278351h.clone();
        }
    }

    /* compiled from: ScreenFailedToOpenEvent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/threeten/bp/format/c;", "kotlin.jvm.PlatformType", "invoke", "()Lorg/threeten/bp/format/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<c> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f278354l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final c invoke() {
            return c.b(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT);
        }
    }

    /* compiled from: ScreenFailedToOpenEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_utils/events/ScreenFailedToOpenEvent$b;", "", "<init>", "()V", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public ScreenFailedToOpenEvent(@k Screen screen, @l f fVar) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("from_page", screen.f278353b));
        if (fVar != null) {
            f278343c.getClass();
            linkedHashMapJ.put("services_booking_calendar_gg_date", fVar.A(f278344d.getValue()));
        }
        G0 g02 = G0.f406611a;
        this.f278345b = new ParametrizedClickStreamEvent(9895, 1, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return this.f278345b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f278345b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return this.f278345b.f90248c;
    }

    public /* synthetic */ ScreenFailedToOpenEvent(Screen screen, f fVar, int i12, C42822w c42822w) {
        this(screen, (i12 & 2) != 0 ? null : fVar);
    }
}
