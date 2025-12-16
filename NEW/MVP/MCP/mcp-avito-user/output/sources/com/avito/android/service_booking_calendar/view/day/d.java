package com.avito.android.service_booking_calendar.view.day;

import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarCellItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_calendar/view/day/d;", "Lcom/avito/android/service_booking_calendar/a;", "a", "c", "Lcom/avito/android/service_booking_calendar/view/day/d$a;", "Lcom/avito/android/service_booking_calendar/view/day/d$c;", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface d extends com.avito.android.service_booking_calendar.a {

    /* compiled from: CalendarCellItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/view/day/d$a;", "Lcom/avito/android/service_booking_calendar/view/day/d;", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f276189b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DayItemContent f276190c;

        public a(@Y61.k String str, @Y61.k DayItemContent dayItemContent) {
            this.f276189b = str;
            this.f276190c = dayItemContent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f276189b, aVar.f276189b) && L.f(this.f276190c, aVar.f276190c);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF250003b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF270394b() {
            return this.f276189b;
        }

        public final int hashCode() {
            return this.f276190c.hashCode() + (this.f276189b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "DayItem(stringId=" + this.f276189b + ", content=" + this.f276190c + ')';
        }
    }

    /* compiled from: CalendarCellItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: CalendarCellItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/view/day/d$c;", "Lcom/avito/android/service_booking_calendar/view/day/d;", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f276191b;

        public c(@Y61.k String str) {
            this.f276191b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f276191b, ((c) obj).f276191b);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF250003b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF270394b() {
            return this.f276191b;
        }

        public final int hashCode() {
            return this.f276191b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("EmptyItem(stringId="), this.f276191b, ')');
        }
    }
}
