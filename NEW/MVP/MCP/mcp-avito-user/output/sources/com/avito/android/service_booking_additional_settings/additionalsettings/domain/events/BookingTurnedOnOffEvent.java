package com.avito.android.service_booking_additional_settings.additionalsettings.domain.events;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: BookingTurnedOnOffEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/events/BookingTurnedOnOffEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Action", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BookingTurnedOnOffEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f274860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f274861c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BookingTurnedOnOffEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/events/BookingTurnedOnOffEvent$Action;", "", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Action {

        /* renamed from: c, reason: collision with root package name */
        public static final Action f274862c;

        /* renamed from: d, reason: collision with root package name */
        public static final Action f274863d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Action[] f274864e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f274865f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f274866b;

        static {
            Action action = new Action("ACTION_ON", 0, "on");
            f274862c = action;
            Action action2 = new Action("ACTION_OFF", 1, "off");
            f274863d = action2;
            Action[] actionArr = {action, action2};
            f274864e = actionArr;
            f274865f = c.a(actionArr);
        }

        public Action(String str, int i12, String str2) {
            this.f274866b = str2;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) f274864e.clone();
        }
    }

    public BookingTurnedOnOffEvent(boolean z12) {
        this.f274860b = z12;
        this.f274861c = new ParametrizedClickStreamEvent(9898, 1, Collections.singletonMap("action_type", (z12 ? Action.f274862c : Action.f274863d).f274866b), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingTurnedOnOffEvent)) {
            return false;
        }
        BookingTurnedOnOffEvent bookingTurnedOnOffEvent = (BookingTurnedOnOffEvent) obj;
        if (this.f274860b != bookingTurnedOnOffEvent.f274860b) {
            ParametrizedClickStreamEvent parametrizedClickStreamEvent = this.f274861c;
            int i12 = parametrizedClickStreamEvent.f90247b;
            ParametrizedClickStreamEvent parametrizedClickStreamEvent2 = bookingTurnedOnOffEvent.f274861c;
            if (i12 != parametrizedClickStreamEvent2.f90247b && parametrizedClickStreamEvent.f90248c != parametrizedClickStreamEvent2.f90248c && !L.f(parametrizedClickStreamEvent.f90249d, parametrizedClickStreamEvent2.f90249d)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f274861c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f274861c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f274861c.f90248c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f274860b) * 31;
        ParametrizedClickStreamEvent parametrizedClickStreamEvent = this.f274861c;
        return parametrizedClickStreamEvent.f90249d.hashCode() + r.e(parametrizedClickStreamEvent.f90248c, r.e(parametrizedClickStreamEvent.f90247b, iHashCode, 31), 31);
    }
}
