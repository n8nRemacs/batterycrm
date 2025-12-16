package com.avito.android.service_booking_utils.events;

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

/* compiled from: ActionIntentByClickEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_utils/events/ActionIntentByClickEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Action", "b", "Screen", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActionIntentByClickEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f278283c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final InterfaceC42726C<c> f278284d = C42727D.c(a.f278304l);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f278285b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActionIntentByClickEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_utils/events/ActionIntentByClickEvent$Action;", "", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Action {

        /* renamed from: c, reason: collision with root package name */
        public static final Action f278286c;

        /* renamed from: d, reason: collision with root package name */
        public static final Action f278287d;

        /* renamed from: e, reason: collision with root package name */
        public static final Action f278288e;

        /* renamed from: f, reason: collision with root package name */
        public static final Action f278289f;

        /* renamed from: g, reason: collision with root package name */
        public static final Action f278290g;

        /* renamed from: h, reason: collision with root package name */
        public static final Action f278291h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ Action[] f278292i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f278293j;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f278294b;

        static {
            Action action = new Action("WORK_TIME_SHEET_SAVE_FROM", 0, "save_time_from");
            f278286c = action;
            Action action2 = new Action("WORK_TIME_SHEET_SAVE_TO", 1, "save_time_to");
            f278287d = action2;
            Action action3 = new Action("SAVE_SCHEDULE", 2, "save_custom_day");
            f278288e = action3;
            Action action4 = new Action("OPEN_REPETITION_SHEET", 3, "save_repeat_days");
            f278289f = action4;
            Action action5 = new Action("SAVE_BREAK_TO", 4, "save_break_to");
            f278290g = action5;
            Action action6 = new Action("SAVE_BREAK_FROM", 5, "save_break_from");
            f278291h = action6;
            Action[] actionArr = {action, action2, action3, action4, action5, action6};
            f278292i = actionArr;
            f278293j = kotlin.enums.c.a(actionArr);
        }

        public Action(String str, int i12, String str2) {
            this.f278294b = str2;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) f278292i.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActionIntentByClickEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_utils/events/ActionIntentByClickEvent$Screen;", "", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Screen {

        /* renamed from: c, reason: collision with root package name */
        public static final Screen f278295c;

        /* renamed from: d, reason: collision with root package name */
        public static final Screen f278296d;

        /* renamed from: e, reason: collision with root package name */
        public static final Screen f278297e;

        /* renamed from: f, reason: collision with root package name */
        public static final Screen f278298f;

        /* renamed from: g, reason: collision with root package name */
        public static final Screen f278299g;

        /* renamed from: h, reason: collision with root package name */
        public static final Screen f278300h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ Screen[] f278301i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f278302j;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f278303b;

        static {
            Screen screen = new Screen("WORK_TIME_SHEET_FROM", 0, "set_time_from");
            f278295c = screen;
            Screen screen2 = new Screen("WORK_TIME_SHEET_TO", 1, "set_time_to");
            f278296d = screen2;
            Screen screen3 = new Screen("DAY_SCHEDULE", 2, "schedule_day");
            f278297e = screen3;
            Screen screen4 = new Screen("REPETITION_SHEET", 3, "set_repeat_days");
            f278298f = screen4;
            Screen screen5 = new Screen("SET_BREAK_FROM", 4, "set_break_from");
            f278299g = screen5;
            Screen screen6 = new Screen("SET_BREAK_TO", 5, "set_break_to");
            f278300h = screen6;
            Screen[] screenArr = {screen, screen2, screen3, screen4, screen5, screen6};
            f278301i = screenArr;
            f278302j = kotlin.enums.c.a(screenArr);
        }

        public Screen(String str, int i12, String str2) {
            this.f278303b = str2;
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) f278301i.clone();
        }
    }

    /* compiled from: ActionIntentByClickEvent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/threeten/bp/format/c;", "kotlin.jvm.PlatformType", "invoke", "()Lorg/threeten/bp/format/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<c> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f278304l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final c invoke() {
            return c.b(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT);
        }
    }

    /* compiled from: ActionIntentByClickEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_utils/events/ActionIntentByClickEvent$b;", "", "<init>", "()V", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public ActionIntentByClickEvent(@k Screen screen, @k Action action, @k f fVar) {
        Q q12 = new Q("from_page", screen.f278303b);
        Q q13 = new Q("action_type", action.f278294b);
        f278283c.getClass();
        this.f278285b = new ParametrizedClickStreamEvent(9892, 2, P0.g(q12, q13, new Q("services_booking_calendar_gg_date", fVar.A(f278284d.getValue()))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f278285b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f278285b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f278285b.f90248c;
    }
}
