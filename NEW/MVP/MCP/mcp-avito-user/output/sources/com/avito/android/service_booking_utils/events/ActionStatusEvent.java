package com.avito.android.service_booking_utils.events;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
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
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import org.threeten.bp.f;
import org.threeten.bp.format.c;

/* compiled from: ActionStatusEvent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_utils/events/ActionStatusEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Action", "b", "Source", "Status", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActionStatusEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final b f278305f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final InterfaceC42726C<c> f278306g = C42727D.c(a.f278331l);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Action f278307b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Status f278308c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final f f278309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f278310e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActionStatusEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_utils/events/ActionStatusEvent$Action;", "", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Action {

        /* renamed from: c, reason: collision with root package name */
        public static final Action f278311c;

        /* renamed from: d, reason: collision with root package name */
        public static final Action f278312d;

        /* renamed from: e, reason: collision with root package name */
        public static final Action f278313e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Action[] f278314f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f278315g;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f278316b;

        static {
            Action action = new Action("SAVE_SCHEDULE", 0, "save_custom_day");
            f278311c = action;
            Action action2 = new Action("SAVE_REPETITION", 1, "set_repeat_days");
            f278312d = action2;
            Action action3 = new Action("SET_TIME_GAP", 2, "set_time_gap");
            Action action4 = new Action("SET_BOOKING", 3, "set_online_booking");
            f278313e = action4;
            Action[] actionArr = {action, action2, action3, action4};
            f278314f = actionArr;
            f278315g = kotlin.enums.c.a(actionArr);
        }

        public Action(String str, int i12, String str2) {
            this.f278316b = str2;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) f278314f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActionStatusEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_utils/events/ActionStatusEvent$Source;", "", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Source {

        /* renamed from: c, reason: collision with root package name */
        public static final Source f278317c;

        /* renamed from: d, reason: collision with root package name */
        public static final Source f278318d;

        /* renamed from: e, reason: collision with root package name */
        public static final Source f278319e;

        /* renamed from: f, reason: collision with root package name */
        public static final Source f278320f;

        /* renamed from: g, reason: collision with root package name */
        public static final Source f278321g;

        /* renamed from: h, reason: collision with root package name */
        public static final Source f278322h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ Source[] f278323i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f278324j;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f278325b;

        static {
            Source source = new Source("ERROR_BREAK_WORK_TIME_ERROR", 0, "error_break_work_time_err");
            f278317c = source;
            Source source2 = new Source("ERROR_BREAK_INTERSECTION_ERROR", 1, "error_break_intersection_err");
            f278318d = source2;
            Source source3 = new Source("ERROR_BREAK_INCOMPLETE_ERROR", 2, "error_break_incomplete_err");
            f278319e = source3;
            Source source4 = new Source("ERROR_BREAK_MIN_BREAK_ERROR", 3, "error_break_min_break_err");
            f278320f = source4;
            Source source5 = new Source("ERROR_BREAK_START_END_BREAK_ERROR", 4, "error_break_start_end_break_err");
            f278321g = source5;
            Source source6 = new Source("ERROR_BREAK_EQUAL_WORK_ERROR", 5, "error_break_equal_work_err");
            f278322h = source6;
            Source[] sourceArr = {source, source2, source3, source4, source5, source6};
            f278323i = sourceArr;
            f278324j = kotlin.enums.c.a(sourceArr);
        }

        public Source(String str, int i12, String str2) {
            this.f278325b = str2;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) f278323i.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActionStatusEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_utils/events/ActionStatusEvent$Status;", "", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: c, reason: collision with root package name */
        public static final Status f278326c;

        /* renamed from: d, reason: collision with root package name */
        public static final Status f278327d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Status[] f278328e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f278329f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f278330b;

        static {
            Status status = new Status("SUCCESS", 0, "success");
            f278326c = status;
            Status status2 = new Status("ERROR", 1, "error");
            f278327d = status2;
            Status[] statusArr = {status, status2};
            f278328e = statusArr;
            f278329f = kotlin.enums.c.a(statusArr);
        }

        public Status(String str, int i12, String str2) {
            this.f278330b = str2;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f278328e.clone();
        }
    }

    /* compiled from: ActionStatusEvent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/threeten/bp/format/c;", "kotlin.jvm.PlatformType", "invoke", "()Lorg/threeten/bp/format/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<c> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f278331l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final c invoke() {
            return c.b(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT);
        }
    }

    /* compiled from: ActionStatusEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_utils/events/ActionStatusEvent$b;", "", "<init>", "()V", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public ActionStatusEvent(@k Action action, @k Status status, @l f fVar, @l Source source) {
        this.f278307b = action;
        this.f278308c = status;
        this.f278309d = fVar;
        LinkedHashMap linkedHashMapJ = P0.j(new Q("from_page", action.f278316b), new Q("action_type", status.f278330b));
        if (source != null) {
        }
        if (fVar != null) {
            f278305f.getClass();
            linkedHashMapJ.put("services_booking_calendar_gg_date", fVar.A(f278306g.getValue()));
        }
        G0 g02 = G0.f406611a;
        this.f278310e = new ParametrizedClickStreamEvent(9896, 3, linkedHashMapJ, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionStatusEvent)) {
            return false;
        }
        ActionStatusEvent actionStatusEvent = (ActionStatusEvent) obj;
        if (this.f278307b != actionStatusEvent.f278307b && this.f278308c != actionStatusEvent.f278308c && !L.f(this.f278309d, actionStatusEvent.f278309d)) {
            ParametrizedClickStreamEvent parametrizedClickStreamEvent = this.f278310e;
            int i12 = parametrizedClickStreamEvent.f90247b;
            ParametrizedClickStreamEvent parametrizedClickStreamEvent2 = actionStatusEvent.f278310e;
            if (i12 != parametrizedClickStreamEvent2.f90247b && parametrizedClickStreamEvent.f90248c != parametrizedClickStreamEvent2.f90248c && !L.f(parametrizedClickStreamEvent.f90249d, parametrizedClickStreamEvent2.f90249d)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f278310e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f278310e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f278310e.f90248c;
    }

    public final int hashCode() {
        int iHashCode = (this.f278308c.hashCode() + (this.f278307b.hashCode() * 31)) * 31;
        f fVar = this.f278309d;
        int iHashCode2 = (iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        ParametrizedClickStreamEvent parametrizedClickStreamEvent = this.f278310e;
        return parametrizedClickStreamEvent.f90249d.hashCode() + r.e(parametrizedClickStreamEvent.f90248c, r.e(parametrizedClickStreamEvent.f90247b, iHashCode2, 31), 31);
    }

    public /* synthetic */ ActionStatusEvent(Action action, Status status, f fVar, Source source, int i12, C42822w c42822w) {
        this(action, status, (i12 & 4) != 0 ? null : fVar, (i12 & 8) != 0 ? null : source);
    }
}
