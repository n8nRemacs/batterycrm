package com.avito.android.service_booking_day_settings.daysettings.domain.events;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import org.threeten.bp.f;
import org.threeten.bp.format.c;

/* compiled from: SwitchBookingStatusEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/domain/events/SwitchBookingStatusEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "b", "Status", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SwitchBookingStatusEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f276795c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final InterfaceC42726C<c> f276796d = C42727D.c(a.f276803l);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f276797b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SwitchBookingStatusEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/domain/events/SwitchBookingStatusEvent$Status;", "", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: c, reason: collision with root package name */
        public static final Status f276798c;

        /* renamed from: d, reason: collision with root package name */
        public static final Status f276799d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Status[] f276800e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f276801f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f276802b;

        static {
            Status status = new Status("STATUS_ON", 0, "on");
            f276798c = status;
            Status status2 = new Status("STATUS_OFF", 1, "off");
            f276799d = status2;
            Status[] statusArr = {status, status2};
            f276800e = statusArr;
            f276801f = kotlin.enums.c.a(statusArr);
        }

        public Status(String str, int i12, String str2) {
            this.f276802b = str2;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f276800e.clone();
        }
    }

    /* compiled from: SwitchBookingStatusEvent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/threeten/bp/format/c;", "kotlin.jvm.PlatformType", "invoke", "()Lorg/threeten/bp/format/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<c> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f276803l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final c invoke() {
            return c.b(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT);
        }
    }

    /* compiled from: SwitchBookingStatusEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/domain/events/SwitchBookingStatusEvent$b;", "", "<init>", "()V", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public SwitchBookingStatusEvent(@k Status status, @k f fVar) {
        Q q12 = new Q("action_type", status.f276802b);
        f276795c.getClass();
        this.f276797b = new ParametrizedClickStreamEvent(9890, 2, P0.g(q12, new Q("services_booking_calendar_gg_date", fVar.A(f276796d.getValue()))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f276797b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f276797b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f276797b.f90248c;
    }
}
