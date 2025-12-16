package com.avito.android.str_calendar.booking_calendar.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.short_term_rent.StrBookingIntentFactory;
import com.avito.android.str_calendar.booking_calendar.model.StrBookingCalendarScreenConfig;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import oy0.C44956a;
import vy0.C49398a;

/* compiled from: StrBookingCalendarState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Companion", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StrBookingCalendarState extends q {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final Companion f286422r = new Companion(null);

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final StrBookingCalendarState f286423s;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f286424b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f286425c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Date f286426d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SelectedDateRange f286427e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Date f286428f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Date f286429g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f286430h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<StrBookingIntentFactory.CalendarRestriction> f286431i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final List<C49398a> f286432j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final C44956a f286433k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final StrBookingCalendarScreenConfig f286434l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f286435m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f286436n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final Companion.LoadingState f286437o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final PrintableText f286438p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final a f286439q;

    /* compiled from: StrBookingCalendarState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarState$Companion;", "", "<init>", "()V", "LoadingState", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: StrBookingCalendarState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarState$Companion$LoadingState;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LoadingState {

            /* renamed from: b, reason: collision with root package name */
            public static final LoadingState f286440b;

            /* renamed from: c, reason: collision with root package name */
            public static final LoadingState f286441c;

            /* renamed from: d, reason: collision with root package name */
            public static final LoadingState f286442d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ LoadingState[] f286443e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f286444f;

            static {
                LoadingState loadingState = new LoadingState("LOADING", 0);
                f286440b = loadingState;
                LoadingState loadingState2 = new LoadingState("LOADED", 1);
                f286441c = loadingState2;
                LoadingState loadingState3 = new LoadingState("ERROR", 2);
                f286442d = loadingState3;
                LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3};
                f286443e = loadingStateArr;
                f286444f = c.a(loadingStateArr);
            }

            public LoadingState() {
                throw null;
            }

            public static LoadingState valueOf(String str) {
                return (LoadingState) Enum.valueOf(LoadingState.class, str);
            }

            public static LoadingState[] values() {
                return (LoadingState[]) f286443e.clone();
            }
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    static {
        SelectedDateRange selectedDateRange = new SelectedDateRange(null, null, null, null, 12, null);
        C42784z0 c42784z0 = C42784z0.f406748b;
        StrBookingCalendarScreenConfig.Default r13 = new StrBookingCalendarScreenConfig.Default(false, false, 3, null);
        Companion.LoadingState loadingState = Companion.LoadingState.f286440b;
        a.f286445d.getClass();
        f286423s = new StrBookingCalendarState(null, null, null, selectedDateRange, null, null, false, c42784z0, c42784z0, null, r13, null, null, loadingState, null, a.f286446e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StrBookingCalendarState(@l String str, @l String str2, @l Date date, @k SelectedDateRange selectedDateRange, @l Date date2, @l Date date3, boolean z12, @k List<? extends StrBookingIntentFactory.CalendarRestriction> list, @k List<C49398a> list2, @l C44956a c44956a, @k StrBookingCalendarScreenConfig strBookingCalendarScreenConfig, @l String str3, @l String str4, @k Companion.LoadingState loadingState, @l PrintableText printableText, @k a aVar) {
        this.f286424b = str;
        this.f286425c = str2;
        this.f286426d = date;
        this.f286427e = selectedDateRange;
        this.f286428f = date2;
        this.f286429g = date3;
        this.f286430h = z12;
        this.f286431i = list;
        this.f286432j = list2;
        this.f286433k = c44956a;
        this.f286434l = strBookingCalendarScreenConfig;
        this.f286435m = str3;
        this.f286436n = str4;
        this.f286437o = loadingState;
        this.f286438p = printableText;
        this.f286439q = aVar;
    }

    public static StrBookingCalendarState a(StrBookingCalendarState strBookingCalendarState, String str, String str2, Date date, SelectedDateRange selectedDateRange, Date date2, Date date3, boolean z12, List list, List list2, C44956a c44956a, StrBookingCalendarScreenConfig strBookingCalendarScreenConfig, String str3, String str4, Companion.LoadingState loadingState, PrintableText printableText, a aVar, int i12) {
        String str5 = (i12 & 1) != 0 ? strBookingCalendarState.f286424b : str;
        String str6 = (i12 & 2) != 0 ? strBookingCalendarState.f286425c : str2;
        Date date4 = (i12 & 4) != 0 ? strBookingCalendarState.f286426d : date;
        SelectedDateRange selectedDateRange2 = (i12 & 8) != 0 ? strBookingCalendarState.f286427e : selectedDateRange;
        Date date5 = (i12 & 16) != 0 ? strBookingCalendarState.f286428f : date2;
        Date date6 = (i12 & 32) != 0 ? strBookingCalendarState.f286429g : date3;
        boolean z13 = (i12 & 64) != 0 ? strBookingCalendarState.f286430h : z12;
        List list3 = (i12 & 128) != 0 ? strBookingCalendarState.f286431i : list;
        List list4 = (i12 & 256) != 0 ? strBookingCalendarState.f286432j : list2;
        C44956a c44956a2 = (i12 & 512) != 0 ? strBookingCalendarState.f286433k : c44956a;
        StrBookingCalendarScreenConfig strBookingCalendarScreenConfig2 = (i12 & 1024) != 0 ? strBookingCalendarState.f286434l : strBookingCalendarScreenConfig;
        String str7 = (i12 & 2048) != 0 ? strBookingCalendarState.f286435m : str3;
        String str8 = (i12 & 4096) != 0 ? strBookingCalendarState.f286436n : str4;
        Companion.LoadingState loadingState2 = (i12 & 8192) != 0 ? strBookingCalendarState.f286437o : loadingState;
        PrintableText printableText2 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? strBookingCalendarState.f286438p : printableText;
        a aVar2 = (i12 & 32768) != 0 ? strBookingCalendarState.f286439q : aVar;
        strBookingCalendarState.getClass();
        return new StrBookingCalendarState(str5, str6, date4, selectedDateRange2, date5, date6, z13, list3, list4, c44956a2, strBookingCalendarScreenConfig2, str7, str8, loadingState2, printableText2, aVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrBookingCalendarState)) {
            return false;
        }
        StrBookingCalendarState strBookingCalendarState = (StrBookingCalendarState) obj;
        return L.f(this.f286424b, strBookingCalendarState.f286424b) && L.f(this.f286425c, strBookingCalendarState.f286425c) && L.f(this.f286426d, strBookingCalendarState.f286426d) && L.f(this.f286427e, strBookingCalendarState.f286427e) && L.f(this.f286428f, strBookingCalendarState.f286428f) && L.f(this.f286429g, strBookingCalendarState.f286429g) && this.f286430h == strBookingCalendarState.f286430h && L.f(this.f286431i, strBookingCalendarState.f286431i) && L.f(this.f286432j, strBookingCalendarState.f286432j) && L.f(this.f286433k, strBookingCalendarState.f286433k) && L.f(this.f286434l, strBookingCalendarState.f286434l) && L.f(this.f286435m, strBookingCalendarState.f286435m) && L.f(this.f286436n, strBookingCalendarState.f286436n) && this.f286437o == strBookingCalendarState.f286437o && L.f(this.f286438p, strBookingCalendarState.f286438p) && L.f(this.f286439q, strBookingCalendarState.f286439q);
    }

    public final int hashCode() {
        String str = this.f286424b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f286425c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.f286426d;
        int iHashCode3 = (this.f286427e.hashCode() + ((iHashCode2 + (date == null ? 0 : date.hashCode())) * 31)) * 31;
        Date date2 = this.f286428f;
        int iHashCode4 = (iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.f286429g;
        int iE2 = H.e(H.e(r.i((iHashCode4 + (date3 == null ? 0 : date3.hashCode())) * 31, 31, this.f286430h), 31, this.f286431i), 31, this.f286432j);
        C44956a c44956a = this.f286433k;
        int iHashCode5 = (this.f286434l.hashCode() + ((iE2 + (c44956a == null ? 0 : c44956a.f422375a.hashCode())) * 31)) * 31;
        String str3 = this.f286435m;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f286436n;
        int iHashCode7 = (this.f286437o.hashCode() + ((iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        PrintableText printableText = this.f286438p;
        return this.f286439q.hashCode() + ((iHashCode7 + (printableText != null ? printableText.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "StrBookingCalendarState(advertId=" + this.f286424b + ", requestId=" + this.f286425c + ", todayDate=" + this.f286426d + ", selectedDateRange=" + this.f286427e + ", firstAvailableDate=" + this.f286428f + ", lastAvailableDate=" + this.f286429g + ", canSelectSingleDay=" + this.f286430h + ", restrictions=" + this.f286431i + ", bookingCalendarItems=" + this.f286432j + ", calendarData=" + this.f286433k + ", screenConfig=" + this.f286434l + ", title=" + this.f286435m + ", buttonTitle=" + this.f286436n + ", loadingState=" + this.f286437o + ", lastErrorMessage=" + this.f286438p + ", viewState=" + this.f286439q + ')';
    }
}
