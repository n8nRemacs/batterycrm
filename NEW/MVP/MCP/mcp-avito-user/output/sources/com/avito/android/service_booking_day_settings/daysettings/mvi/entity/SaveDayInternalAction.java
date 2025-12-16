package com.avito.android.service_booking_day_settings.daysettings.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.service_booking_utils.events.ActionStatusEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SaveDayInternalAction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/SaveDayInternalAction;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "SaveShowError", "SaveShowSuccess", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SaveDayInternalAction extends DaySettingsInternalAction {

    /* compiled from: SaveDayInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/SaveDayInternalAction$SaveShowError;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/SaveDayInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveShowError implements SaveDayInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f277032b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f277033c;

        public SaveShowError(@k Throwable th2, @k String str) {
            this.f277032b = th2;
            this.f277033c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SaveShowError)) {
                return false;
            }
            SaveShowError saveShowError = (SaveShowError) obj;
            return L.f(this.f277032b, saveShowError.f277032b) && L.f(this.f277033c, saveShowError.f277033c);
        }

        public final int hashCode() {
            return this.f277033c.hashCode() + (this.f277032b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SaveShowError(throwable=");
            sb2.append(this.f277032b);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f277033c, ')');
        }
    }

    /* compiled from: SaveDayInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/SaveDayInternalAction$SaveShowSuccess;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/SaveDayInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveShowSuccess implements SaveDayInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f277034b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ActionStatusEvent.Action f277035c;

        public SaveShowSuccess(@k String str, @k ActionStatusEvent.Action action) {
            this.f277034b = str;
            this.f277035c = action;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SaveShowSuccess)) {
                return false;
            }
            SaveShowSuccess saveShowSuccess = (SaveShowSuccess) obj;
            return L.f(this.f277034b, saveShowSuccess.f277034b) && this.f277035c == saveShowSuccess.f277035c;
        }

        public final int hashCode() {
            return this.f277035c.hashCode() + (this.f277034b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "SaveShowSuccess(message=" + this.f277034b + ", action=" + this.f277035c + ')';
        }
    }
}
