package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity;

import Sz0.C15273b;
import Sz0.C15274c;
import Uz0.C15589a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: StrOrdersCalendarState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "LoadingType", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StrOrdersCalendarState extends q {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f291041r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final StrOrdersCalendarState f291042s;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Date f291043b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Date f291044c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Date f291045d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Date f291046e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f291047f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LoadingType f291048g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ApiError f291049h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Map<String, C15274c> f291050i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final List<String> f291051j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final Map<String, List<C15273b>> f291052k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final C15589a f291053l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f291054m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final Integer f291055n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final BF0.a f291056o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a f291057p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final b f291058q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StrOrdersCalendarState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarState$LoadingType;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingType {

        /* renamed from: b, reason: collision with root package name */
        public static final LoadingType f291059b;

        /* renamed from: c, reason: collision with root package name */
        public static final LoadingType f291060c;

        /* renamed from: d, reason: collision with root package name */
        public static final LoadingType f291061d;

        /* renamed from: e, reason: collision with root package name */
        public static final LoadingType f291062e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ LoadingType[] f291063f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f291064g;

        static {
            LoadingType loadingType = new LoadingType("NONE", 0);
            f291059b = loadingType;
            LoadingType loadingType2 = new LoadingType("PAGINATION", 1);
            f291060c = loadingType2;
            LoadingType loadingType3 = new LoadingType("LOADING", 2);
            f291061d = loadingType3;
            LoadingType loadingType4 = new LoadingType("ERROR", 3);
            f291062e = loadingType4;
            LoadingType[] loadingTypeArr = {loadingType, loadingType2, loadingType3, loadingType4};
            f291063f = loadingTypeArr;
            f291064g = c.a(loadingTypeArr);
        }

        public LoadingType() {
            throw null;
        }

        public static LoadingType valueOf(String str) {
            return (LoadingType) Enum.valueOf(LoadingType.class, str);
        }

        public static LoadingType[] values() {
            return (LoadingType[]) f291063f.clone();
        }
    }

    /* compiled from: StrOrdersCalendarState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarState$a;", "", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        LoadingType loadingType = LoadingType.f291061d;
        Map mapC = P0.c();
        C42784z0 c42784z0 = C42784z0.f406748b;
        Map mapC2 = P0.c();
        com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a.f291065b.getClass();
        a.b bVar = com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a.f291066c;
        b.f291075e.getClass();
        f291042s = new StrOrdersCalendarState(null, null, null, null, false, loadingType, null, mapC, c42784z0, mapC2, null, false, null, null, bVar, b.f291076f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StrOrdersCalendarState(@l Date date, @l Date date2, @l Date date3, @l Date date4, boolean z12, @k LoadingType loadingType, @l ApiError apiError, @k Map<String, C15274c> map, @k List<String> list, @k Map<String, ? extends List<C15273b>> map2, @l C15589a c15589a, boolean z13, @l Integer num, @l BF0.a aVar, @k com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a aVar2, @k b bVar) {
        this.f291043b = date;
        this.f291044c = date2;
        this.f291045d = date3;
        this.f291046e = date4;
        this.f291047f = z12;
        this.f291048g = loadingType;
        this.f291049h = apiError;
        this.f291050i = map;
        this.f291051j = list;
        this.f291052k = map2;
        this.f291053l = c15589a;
        this.f291054m = z13;
        this.f291055n = num;
        this.f291056o = aVar;
        this.f291057p = aVar2;
        this.f291058q = bVar;
    }

    public static StrOrdersCalendarState a(StrOrdersCalendarState strOrdersCalendarState, Date date, Date date2, Date date3, Date date4, boolean z12, LoadingType loadingType, ApiError apiError, Map map, ArrayList arrayList, Map map2, C15589a c15589a, boolean z13, Integer num, BF0.a aVar, com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a aVar2, b bVar, int i12) {
        Date date5 = (i12 & 1) != 0 ? strOrdersCalendarState.f291043b : date;
        Date date6 = (i12 & 2) != 0 ? strOrdersCalendarState.f291044c : date2;
        Date date7 = (i12 & 4) != 0 ? strOrdersCalendarState.f291045d : date3;
        Date date8 = (i12 & 8) != 0 ? strOrdersCalendarState.f291046e : date4;
        boolean z14 = (i12 & 16) != 0 ? strOrdersCalendarState.f291047f : z12;
        LoadingType loadingType2 = (i12 & 32) != 0 ? strOrdersCalendarState.f291048g : loadingType;
        ApiError apiError2 = (i12 & 64) != 0 ? strOrdersCalendarState.f291049h : apiError;
        Map map3 = (i12 & 128) != 0 ? strOrdersCalendarState.f291050i : map;
        List<String> list = (i12 & 256) != 0 ? strOrdersCalendarState.f291051j : arrayList;
        Map map4 = (i12 & 512) != 0 ? strOrdersCalendarState.f291052k : map2;
        C15589a c15589a2 = (i12 & 1024) != 0 ? strOrdersCalendarState.f291053l : c15589a;
        boolean z15 = (i12 & 2048) != 0 ? strOrdersCalendarState.f291054m : z13;
        Integer num2 = (i12 & 4096) != 0 ? strOrdersCalendarState.f291055n : num;
        BF0.a aVar3 = (i12 & 8192) != 0 ? strOrdersCalendarState.f291056o : aVar;
        com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a aVar4 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? strOrdersCalendarState.f291057p : aVar2;
        b bVar2 = (i12 & 32768) != 0 ? strOrdersCalendarState.f291058q : bVar;
        strOrdersCalendarState.getClass();
        return new StrOrdersCalendarState(date5, date6, date7, date8, z14, loadingType2, apiError2, map3, list, map4, c15589a2, z15, num2, aVar3, aVar4, bVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrOrdersCalendarState)) {
            return false;
        }
        StrOrdersCalendarState strOrdersCalendarState = (StrOrdersCalendarState) obj;
        return L.f(this.f291043b, strOrdersCalendarState.f291043b) && L.f(this.f291044c, strOrdersCalendarState.f291044c) && L.f(this.f291045d, strOrdersCalendarState.f291045d) && L.f(this.f291046e, strOrdersCalendarState.f291046e) && this.f291047f == strOrdersCalendarState.f291047f && this.f291048g == strOrdersCalendarState.f291048g && L.f(this.f291049h, strOrdersCalendarState.f291049h) && L.f(this.f291050i, strOrdersCalendarState.f291050i) && L.f(this.f291051j, strOrdersCalendarState.f291051j) && L.f(this.f291052k, strOrdersCalendarState.f291052k) && L.f(this.f291053l, strOrdersCalendarState.f291053l) && this.f291054m == strOrdersCalendarState.f291054m && L.f(this.f291055n, strOrdersCalendarState.f291055n) && L.f(this.f291056o, strOrdersCalendarState.f291056o) && L.f(this.f291057p, strOrdersCalendarState.f291057p) && L.f(this.f291058q, strOrdersCalendarState.f291058q);
    }

    public final int hashCode() {
        Date date = this.f291043b;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.f291044c;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.f291045d;
        int iHashCode3 = (iHashCode2 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.f291046e;
        int iHashCode4 = (this.f291048g.hashCode() + r.i((iHashCode3 + (date4 == null ? 0 : date4.hashCode())) * 31, 31, this.f291047f)) * 31;
        ApiError apiError = this.f291049h;
        int iC2 = AK.c.c(H.e(AK.c.c((iHashCode4 + (apiError == null ? 0 : apiError.hashCode())) * 31, 31, this.f291050i), 31, this.f291051j), 31, this.f291052k);
        C15589a c15589a = this.f291053l;
        int i12 = r.i((iC2 + (c15589a == null ? 0 : c15589a.hashCode())) * 31, 31, this.f291054m);
        Integer num = this.f291055n;
        int iHashCode5 = (i12 + (num == null ? 0 : num.hashCode())) * 31;
        BF0.a aVar = this.f291056o;
        return this.f291058q.hashCode() + ((this.f291057p.hashCode() + ((iHashCode5 + (aVar != null ? aVar.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "StrOrdersCalendarState(todayServerDate=" + this.f291043b + ", currentFrameDate=" + this.f291044c + ", leftmostLoadedDate=" + this.f291045d + ", rightmostLoadedDate=" + this.f291046e + ", shouldShowDebugDatesInCalendar=" + this.f291047f + ", loadingType=" + this.f291048g + ", lastApiError=" + this.f291049h + ", itemIdToItemInfoMap=" + this.f291050i + ", itemIdTooltipShowedList=" + this.f291051j + ", itemIdToCalendarRedesignDayInfosMap=" + this.f291052k + ", selectedDateRangeState=" + this.f291053l + ", isFlatRecyclerCollapsed=" + this.f291054m + ", orientation=" + this.f291055n + ", banner=" + this.f291056o + ", coreViewState=" + this.f291057p + ", recyclersViewState=" + this.f291058q + ')';
    }
}
