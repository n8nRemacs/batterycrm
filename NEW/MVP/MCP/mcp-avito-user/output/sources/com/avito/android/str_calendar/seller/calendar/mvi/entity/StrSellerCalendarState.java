package com.avito.android.str_calendar.seller.calendar.mvi.entity;

import Iy0.b;
import Iy0.c;
import Jy0.C14262b;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.str_calendar.common.models.DateRange;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerCalendarState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "LoadingType", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StrSellerCalendarState extends q {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f287713m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final StrSellerCalendarState f287714n;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final c f287715b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LoadingType f287716c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Date f287717d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DateRange f287718e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<b> f287719f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Map<String, C14262b> f287720g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f287721h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f287722i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Integer f287723j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f287724k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final com.avito.android.str_calendar.seller.calendar.mvi.entity.a f287725l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StrSellerCalendarState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarState$LoadingType;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingType {

        /* renamed from: b, reason: collision with root package name */
        public static final LoadingType f287726b;

        /* renamed from: c, reason: collision with root package name */
        public static final LoadingType f287727c;

        /* renamed from: d, reason: collision with root package name */
        public static final LoadingType f287728d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ LoadingType[] f287729e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f287730f;

        static {
            LoadingType loadingType = new LoadingType("LOADING", 0);
            f287726b = loadingType;
            LoadingType loadingType2 = new LoadingType("LOADED", 1);
            f287727c = loadingType2;
            LoadingType loadingType3 = new LoadingType("ERROR", 2);
            f287728d = loadingType3;
            LoadingType[] loadingTypeArr = {loadingType, loadingType2, loadingType3};
            f287729e = loadingTypeArr;
            f287730f = kotlin.enums.c.a(loadingTypeArr);
        }

        public LoadingType() {
            throw null;
        }

        public static LoadingType valueOf(String str) {
            return (LoadingType) Enum.valueOf(LoadingType.class, str);
        }

        public static LoadingType[] values() {
            return (LoadingType[]) f287729e.clone();
        }
    }

    /* compiled from: StrSellerCalendarState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/mvi/entity/StrSellerCalendarState$a;", "", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        LoadingType loadingType = LoadingType.f287726b;
        C42784z0 c42784z0 = C42784z0.f406748b;
        Map mapC = P0.c();
        com.avito.android.str_calendar.seller.calendar.mvi.entity.a.f287731b.getClass();
        f287714n = new StrSellerCalendarState(null, loadingType, null, null, c42784z0, mapC, null, false, null, false, com.avito.android.str_calendar.seller.calendar.mvi.entity.a.f287732c);
    }

    public StrSellerCalendarState(@l c cVar, @k LoadingType loadingType, @l Date date, @l DateRange dateRange, @k List<b> list, @k Map<String, C14262b> map, @l String str, boolean z12, @l Integer num, boolean z13, @k com.avito.android.str_calendar.seller.calendar.mvi.entity.a aVar) {
        this.f287715b = cVar;
        this.f287716c = loadingType;
        this.f287717d = date;
        this.f287718e = dateRange;
        this.f287719f = list;
        this.f287720g = map;
        this.f287721h = str;
        this.f287722i = z12;
        this.f287723j = num;
        this.f287724k = z13;
        this.f287725l = aVar;
    }

    public static StrSellerCalendarState a(StrSellerCalendarState strSellerCalendarState, c cVar, LoadingType loadingType, Date date, DateRange dateRange, List list, Map map, String str, boolean z12, Integer num, boolean z13, com.avito.android.str_calendar.seller.calendar.mvi.entity.a aVar, int i12) {
        c cVar2 = (i12 & 1) != 0 ? strSellerCalendarState.f287715b : cVar;
        LoadingType loadingType2 = (i12 & 2) != 0 ? strSellerCalendarState.f287716c : loadingType;
        Date date2 = (i12 & 4) != 0 ? strSellerCalendarState.f287717d : date;
        DateRange dateRange2 = (i12 & 8) != 0 ? strSellerCalendarState.f287718e : dateRange;
        List list2 = (i12 & 16) != 0 ? strSellerCalendarState.f287719f : list;
        Map map2 = (i12 & 32) != 0 ? strSellerCalendarState.f287720g : map;
        String str2 = (i12 & 64) != 0 ? strSellerCalendarState.f287721h : str;
        boolean z14 = (i12 & 128) != 0 ? strSellerCalendarState.f287722i : z12;
        Integer num2 = (i12 & 256) != 0 ? strSellerCalendarState.f287723j : num;
        boolean z15 = (i12 & 512) != 0 ? strSellerCalendarState.f287724k : z13;
        com.avito.android.str_calendar.seller.calendar.mvi.entity.a aVar2 = (i12 & 1024) != 0 ? strSellerCalendarState.f287725l : aVar;
        strSellerCalendarState.getClass();
        return new StrSellerCalendarState(cVar2, loadingType2, date2, dateRange2, list2, map2, str2, z14, num2, z15, aVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrSellerCalendarState)) {
            return false;
        }
        StrSellerCalendarState strSellerCalendarState = (StrSellerCalendarState) obj;
        return L.f(this.f287715b, strSellerCalendarState.f287715b) && this.f287716c == strSellerCalendarState.f287716c && L.f(this.f287717d, strSellerCalendarState.f287717d) && L.f(this.f287718e, strSellerCalendarState.f287718e) && L.f(this.f287719f, strSellerCalendarState.f287719f) && L.f(this.f287720g, strSellerCalendarState.f287720g) && L.f(this.f287721h, strSellerCalendarState.f287721h) && this.f287722i == strSellerCalendarState.f287722i && L.f(this.f287723j, strSellerCalendarState.f287723j) && this.f287724k == strSellerCalendarState.f287724k && L.f(this.f287725l, strSellerCalendarState.f287725l);
    }

    public final int hashCode() {
        c cVar = this.f287715b;
        int iHashCode = (this.f287716c.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31)) * 31;
        Date date = this.f287717d;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        DateRange dateRange = this.f287718e;
        int iC2 = AK.c.c(H.e((iHashCode2 + (dateRange == null ? 0 : dateRange.hashCode())) * 31, 31, this.f287719f), 31, this.f287720g);
        String str = this.f287721h;
        int i12 = r.i((iC2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f287722i);
        Integer num = this.f287723j;
        return this.f287725l.hashCode() + r.i((i12 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f287724k);
    }

    @k
    public final String toString() {
        return "StrSellerCalendarState(data=" + this.f287715b + ", loadingType=" + this.f287716c + ", selectedDate=" + this.f287717d + ", selectedRange=" + this.f287718e + ", months=" + this.f287719f + ", itemsStates=" + this.f287720g + ", advertId=" + this.f287721h + ", shouldCloseFlowAfterApply=" + this.f287722i + ", firstSelectedItemPosition=" + this.f287723j + ", needToDeliverScroll=" + this.f287724k + ", viewState=" + this.f287725l + ')';
    }
}
