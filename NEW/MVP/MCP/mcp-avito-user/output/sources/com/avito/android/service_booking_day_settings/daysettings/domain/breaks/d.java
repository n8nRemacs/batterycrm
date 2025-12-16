package com.avito.android.service_booking_day_settings.daysettings.domain.breaks;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem;
import com.avito.android.service_booking_utils.events.ActionStatusEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BreaksValidationResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/domain/breaks/d;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/service_booking_day_settings/daysettings/domain/breaks/d$a;", "Lcom/avito/android/service_booking_day_settings/daysettings/domain/breaks/d$b;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class d {

    /* compiled from: BreaksValidationResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/domain/breaks/d$a;", "Lcom/avito/android/service_booking_day_settings/daysettings/domain/breaks/d;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f276763a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ActionStatusEvent.Source f276764b;

        public a(@k ArrayList arrayList, @l ActionStatusEvent.Source source) {
            super(null);
            this.f276763a = arrayList;
            this.f276764b = source;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f276763a, aVar.f276763a) && this.f276764b == aVar.f276764b;
        }

        public final int hashCode() {
            int iHashCode = this.f276763a.hashCode() * 31;
            ActionStatusEvent.Source source = this.f276764b;
            return iHashCode + (source == null ? 0 : source.hashCode());
        }

        @k
        public final String toString() {
            return "Failure(breaks=" + this.f276763a + ", error=" + this.f276764b + ')';
        }
    }

    /* compiled from: BreaksValidationResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/domain/breaks/d$b;", "Lcom/avito/android/service_booking_day_settings/daysettings/domain/breaks/d;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final List<SettingsBreakItem> f276765a;

        public b(@l List<SettingsBreakItem> list) {
            super(null);
            this.f276765a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f276765a, ((b) obj).f276765a);
        }

        public final int hashCode() {
            List<SettingsBreakItem> list = this.f276765a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Success(breaks="), this.f276765a, ')');
        }
    }

    public /* synthetic */ d(C42822w c42822w) {
        this();
    }

    public d() {
    }
}
