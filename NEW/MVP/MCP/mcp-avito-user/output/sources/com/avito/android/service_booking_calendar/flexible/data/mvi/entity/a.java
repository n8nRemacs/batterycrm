package com.avito.android.service_booking_calendar.flexible.data.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.J;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import it0.C42108c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CalendarDataState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/a;", "", "a", "b", "c", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final b f275721e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f275722f = new a(null, false, null, BookingSettingsStatus.f278279e);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final C8178a f275723a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f275724b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final c f275725c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final BookingSettingsStatus f275726d;

    /* compiled from: CalendarDataState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/a$a;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.service_booking_calendar.flexible.data.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C8178a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f275727a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<WeekItem> f275728b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f275729c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<C42108c> f275730d;

        public C8178a(@k ArrayList arrayList, @k List list, @k String str, @k List list2) {
            this.f275727a = arrayList;
            this.f275728b = list;
            this.f275729c = str;
            this.f275730d = list2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8178a)) {
                return false;
            }
            C8178a c8178a = (C8178a) obj;
            return this.f275727a.equals(c8178a.f275727a) && L.f(this.f275728b, c8178a.f275728b) && L.f(this.f275729c, c8178a.f275729c) && L.f(this.f275730d, c8178a.f275730d);
        }

        public final int hashCode() {
            return this.f275730d.hashCode() + H.d(H.e(this.f275727a.hashCode() * 31, 31, this.f275728b), 31, this.f275729c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CalendarData(toolbarActions=");
            sb2.append(this.f275727a);
            sb2.append(", weeks=");
            sb2.append(this.f275728b);
            sb2.append(", todayTitle=");
            sb2.append(this.f275729c);
            sb2.append(", tooltips=");
            return H.p(sb2, this.f275730d, ')');
        }
    }

    /* compiled from: CalendarDataState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/a$b;", "", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: CalendarDataState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/data/mvi/entity/a$c;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f275731a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final J.a f275732b;

        public c(@k J.a aVar, @k PrintableText printableText) {
            this.f275731a = printableText;
            this.f275732b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f275731a, cVar.f275731a) && L.f(this.f275732b, cVar.f275732b);
        }

        public final int hashCode() {
            return this.f275732b.f90384a.hashCode() + (this.f275731a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ErrorData(errorMessage=" + this.f275731a + ", errorReason=" + this.f275732b + ')';
        }
    }

    public a(@l C8178a c8178a, boolean z12, @l c cVar, @k BookingSettingsStatus bookingSettingsStatus) {
        this.f275723a = c8178a;
        this.f275724b = z12;
        this.f275725c = cVar;
        this.f275726d = bookingSettingsStatus;
    }

    public static a a(a aVar, C8178a c8178a, boolean z12, c cVar, BookingSettingsStatus bookingSettingsStatus, int i12) {
        if ((i12 & 1) != 0) {
            c8178a = aVar.f275723a;
        }
        if ((i12 & 2) != 0) {
            z12 = aVar.f275724b;
        }
        if ((i12 & 4) != 0) {
            cVar = aVar.f275725c;
        }
        if ((i12 & 8) != 0) {
            bookingSettingsStatus = aVar.f275726d;
        }
        aVar.getClass();
        return new a(c8178a, z12, cVar, bookingSettingsStatus);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f275723a, aVar.f275723a) && this.f275724b == aVar.f275724b && L.f(this.f275725c, aVar.f275725c) && this.f275726d == aVar.f275726d;
    }

    public final int hashCode() {
        C8178a c8178a = this.f275723a;
        int i12 = r.i((c8178a == null ? 0 : c8178a.hashCode()) * 31, 31, this.f275724b);
        c cVar = this.f275725c;
        return this.f275726d.hashCode() + ((i12 + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "CalendarDataState(data=" + this.f275723a + ", isLoading=" + this.f275724b + ", error=" + this.f275725c + ", settingsStatus=" + this.f275726d + ')';
    }
}
