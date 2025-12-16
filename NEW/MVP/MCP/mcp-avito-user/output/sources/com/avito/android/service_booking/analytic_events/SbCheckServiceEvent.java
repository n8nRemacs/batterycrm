package com.avito.android.service_booking.analytic_events;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.analytics.provider.clickstream.a;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.enums.c;

/* compiled from: SbCheckServiceEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking/analytic_events/SbCheckServiceEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "ActionType", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SbCheckServiceEvent implements a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f274154b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SbCheckServiceEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/analytic_events/SbCheckServiceEvent$ActionType;", "", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {

        /* renamed from: c, reason: collision with root package name */
        public static final ActionType f274155c;

        /* renamed from: d, reason: collision with root package name */
        public static final ActionType f274156d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f274157e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f274158f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f274159b;

        static {
            ActionType actionType = new ActionType("CHECK", 0, "Выбор пункта из списка услуг");
            f274155c = actionType;
            ActionType actionType2 = new ActionType("UNCHECK", 1, "Отмена выбора пункта из списка услуг");
            f274156d = actionType2;
            ActionType[] actionTypeArr = {actionType, actionType2};
            f274157e = actionTypeArr;
            f274158f = c.a(actionTypeArr);
        }

        public ActionType(String str, int i12, String str2) {
            this.f274159b = str2;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) f274157e.clone();
        }
    }

    public SbCheckServiceEvent(@k ActionType actionType, @k String str, @l String str2, @l String str3) {
        this.f274154b = new ParametrizedClickStreamEvent(6161, 2, C35755b0.c(P0.g(new Q("iid", str), new Q("mcid", str2), new Q("locationid", str3), new Q("action_type", actionType.f274159b))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF97978b() {
        return this.f274154b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f274154b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF97979c() {
        return this.f274154b.f90248c;
    }
}
