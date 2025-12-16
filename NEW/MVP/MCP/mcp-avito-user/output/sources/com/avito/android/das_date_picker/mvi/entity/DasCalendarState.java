package com.avito.android.das_date_picker.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import bu.C25712a;
import bu.C25713b;
import com.avito.android.analytics.screens.mvi.q;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DasCalendarState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Companion", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DasCalendarState extends q {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final Companion f132382j = new Companion(null);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final DasCalendarState f132383k;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Date f132384b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Date f132385c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Date f132386d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Date f132387e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<C25712a> f132388f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final C25713b f132389g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Companion.LoadingState f132390h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a f132391i;

    /* compiled from: DasCalendarState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarState$Companion;", "", "<init>", "()V", "LoadingState", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DasCalendarState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarState$Companion$LoadingState;", "", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LoadingState {

            /* renamed from: b, reason: collision with root package name */
            public static final LoadingState f132392b;

            /* renamed from: c, reason: collision with root package name */
            public static final LoadingState f132393c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ LoadingState[] f132394d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f132395e;

            static {
                LoadingState loadingState = new LoadingState("LOADING", 0);
                f132392b = loadingState;
                LoadingState loadingState2 = new LoadingState("LOADED", 1);
                f132393c = loadingState2;
                LoadingState[] loadingStateArr = {loadingState, loadingState2};
                f132394d = loadingStateArr;
                f132395e = c.a(loadingStateArr);
            }

            public LoadingState() {
                throw null;
            }

            public static LoadingState valueOf(String str) {
                return (LoadingState) Enum.valueOf(LoadingState.class, str);
            }

            public static LoadingState[] values() {
                return (LoadingState[]) f132394d.clone();
            }
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        Companion.LoadingState loadingState = Companion.LoadingState.f132392b;
        a.f132396b.getClass();
        f132383k = new DasCalendarState(null, null, null, null, c42784z0, null, loadingState, a.f132397c);
    }

    public DasCalendarState(@l Date date, @l Date date2, @l Date date3, @l Date date4, @k List<C25712a> list, @l C25713b c25713b, @k Companion.LoadingState loadingState, @k a aVar) {
        this.f132384b = date;
        this.f132385c = date2;
        this.f132386d = date3;
        this.f132387e = date4;
        this.f132388f = list;
        this.f132389g = c25713b;
        this.f132390h = loadingState;
        this.f132391i = aVar;
    }

    public static DasCalendarState a(DasCalendarState dasCalendarState, Date date, Date date2, Date date3, Date date4, List list, C25713b c25713b, Companion.LoadingState loadingState, a aVar, int i12) {
        Date date5 = (i12 & 1) != 0 ? dasCalendarState.f132384b : date;
        Date date6 = (i12 & 2) != 0 ? dasCalendarState.f132385c : date2;
        Date date7 = (i12 & 4) != 0 ? dasCalendarState.f132386d : date3;
        Date date8 = (i12 & 8) != 0 ? dasCalendarState.f132387e : date4;
        List list2 = (i12 & 16) != 0 ? dasCalendarState.f132388f : list;
        C25713b c25713b2 = (i12 & 32) != 0 ? dasCalendarState.f132389g : c25713b;
        Companion.LoadingState loadingState2 = (i12 & 64) != 0 ? dasCalendarState.f132390h : loadingState;
        a aVar2 = (i12 & 128) != 0 ? dasCalendarState.f132391i : aVar;
        dasCalendarState.getClass();
        return new DasCalendarState(date5, date6, date7, date8, list2, c25713b2, loadingState2, aVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DasCalendarState)) {
            return false;
        }
        DasCalendarState dasCalendarState = (DasCalendarState) obj;
        return L.f(this.f132384b, dasCalendarState.f132384b) && L.f(this.f132385c, dasCalendarState.f132385c) && L.f(this.f132386d, dasCalendarState.f132386d) && L.f(this.f132387e, dasCalendarState.f132387e) && L.f(this.f132388f, dasCalendarState.f132388f) && L.f(this.f132389g, dasCalendarState.f132389g) && this.f132390h == dasCalendarState.f132390h && L.f(this.f132391i, dasCalendarState.f132391i);
    }

    public final int hashCode() {
        Date date = this.f132384b;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.f132385c;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.f132386d;
        int iHashCode3 = (iHashCode2 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.f132387e;
        int iE2 = H.e((iHashCode3 + (date4 == null ? 0 : date4.hashCode())) * 31, 31, this.f132388f);
        C25713b c25713b = this.f132389g;
        return this.f132391i.hashCode() + ((this.f132390h.hashCode() + ((iE2 + (c25713b != null ? c25713b.f57531a.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "DasCalendarState(todayDate=" + this.f132384b + ", selectedDate=" + this.f132385c + ", firstAvailableDate=" + this.f132386d + ", lastAvailableDate=" + this.f132387e + ", calendarItems=" + this.f132388f + ", calendarData=" + this.f132389g + ", loadingState=" + this.f132390h + ", viewState=" + this.f132391i + ')';
    }
}
