package com.avito.android.service_booking_settings.work_hours.analytics.events;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.c;

/* compiled from: WorkHoursSwitcherInteractionEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/analytics/events/WorkHoursSwitcherInteractionEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "ActionType", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkHoursSwitcherInteractionEvent implements a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WorkHoursSwitcherInteractionEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/analytics/events/WorkHoursSwitcherInteractionEvent$ActionType;", "", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f277925b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f277926c;

        static {
            ActionType[] actionTypeArr = {new ActionType("ON", 0), new ActionType("OFF", 1)};
            f277925b = actionTypeArr;
            f277926c = c.a(actionTypeArr);
        }

        public ActionType() {
            throw null;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) f277925b.clone();
        }
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83096b() {
        throw null;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        throw null;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83097c() {
        throw null;
    }
}
