package com.avito.android.hotel_booking.mvi.entity;

import RI.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.hotel.model.HotelBookingFormResponse;
import com.avito.android.hotel_booking.mvi.entity.a;
import com.avito.android.printable_text.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "LoadingState", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelBookingState extends q {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f163866o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final HotelBookingState f163867p = new HotelBookingState(null, null, null, null, null, null, null, null, null, false, LoadingState.f163881b, a.b.f163888a, new c(null, null, -1, b.a(), false, false));

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f163868b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f163869c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<Integer> f163870d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f163871e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f163872f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f163873g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f163874h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final HotelBookingFormResponse.Form f163875i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final RI.a f163876j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f163877k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final LoadingState f163878l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final com.avito.android.hotel_booking.mvi.entity.a f163879m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final c f163880n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HotelBookingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingState$LoadingState;", "", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingState {

        /* renamed from: b, reason: collision with root package name */
        public static final LoadingState f163881b;

        /* renamed from: c, reason: collision with root package name */
        public static final LoadingState f163882c;

        /* renamed from: d, reason: collision with root package name */
        public static final LoadingState f163883d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ LoadingState[] f163884e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f163885f;

        static {
            LoadingState loadingState = new LoadingState("LOADING", 0);
            f163881b = loadingState;
            LoadingState loadingState2 = new LoadingState("LOADED", 1);
            f163882c = loadingState2;
            LoadingState loadingState3 = new LoadingState("ERROR", 2);
            f163883d = loadingState3;
            LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3};
            f163884e = loadingStateArr;
            f163885f = kotlin.enums.c.a(loadingStateArr);
        }

        public LoadingState() {
            throw null;
        }

        public static LoadingState valueOf(String str) {
            return (LoadingState) Enum.valueOf(LoadingState.class, str);
        }

        public static LoadingState[] values() {
            return (LoadingState[]) f163884e.clone();
        }
    }

    /* compiled from: HotelBookingState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingState$a;", "", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public HotelBookingState(@l String str, @l Integer num, @l List<Integer> list, @l String str2, @l String str3, @l String str4, @l String str5, @l HotelBookingFormResponse.Form form, @l RI.a aVar, boolean z12, @k LoadingState loadingState, @k com.avito.android.hotel_booking.mvi.entity.a aVar2, @k c cVar) {
        this.f163868b = str;
        this.f163869c = num;
        this.f163870d = list;
        this.f163871e = str2;
        this.f163872f = str3;
        this.f163873g = str4;
        this.f163874h = str5;
        this.f163875i = form;
        this.f163876j = aVar;
        this.f163877k = z12;
        this.f163878l = loadingState;
        this.f163879m = aVar2;
        this.f163880n = cVar;
    }

    public static HotelBookingState a(HotelBookingState hotelBookingState, String str, Integer num, ArrayList arrayList, String str2, String str3, String str4, String str5, HotelBookingFormResponse.Form form, RI.a aVar, boolean z12, LoadingState loadingState, com.avito.android.hotel_booking.mvi.entity.a aVar2, c cVar, int i12) {
        String str6 = (i12 & 1) != 0 ? hotelBookingState.f163868b : str;
        Integer num2 = (i12 & 2) != 0 ? hotelBookingState.f163869c : num;
        List<Integer> list = (i12 & 4) != 0 ? hotelBookingState.f163870d : arrayList;
        String str7 = (i12 & 8) != 0 ? hotelBookingState.f163871e : str2;
        String str8 = (i12 & 16) != 0 ? hotelBookingState.f163872f : str3;
        String str9 = (i12 & 32) != 0 ? hotelBookingState.f163873g : str4;
        String str10 = (i12 & 64) != 0 ? hotelBookingState.f163874h : str5;
        HotelBookingFormResponse.Form form2 = (i12 & 128) != 0 ? hotelBookingState.f163875i : form;
        RI.a aVar3 = (i12 & 256) != 0 ? hotelBookingState.f163876j : aVar;
        boolean z13 = (i12 & 512) != 0 ? hotelBookingState.f163877k : z12;
        LoadingState loadingState2 = (i12 & 1024) != 0 ? hotelBookingState.f163878l : loadingState;
        com.avito.android.hotel_booking.mvi.entity.a aVar4 = (i12 & 2048) != 0 ? hotelBookingState.f163879m : aVar2;
        c cVar2 = (i12 & 4096) != 0 ? hotelBookingState.f163880n : cVar;
        hotelBookingState.getClass();
        return new HotelBookingState(str6, num2, list, str7, str8, str9, str10, form2, aVar3, z13, loadingState2, aVar4, cVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelBookingState)) {
            return false;
        }
        HotelBookingState hotelBookingState = (HotelBookingState) obj;
        return L.f(this.f163868b, hotelBookingState.f163868b) && L.f(this.f163869c, hotelBookingState.f163869c) && L.f(this.f163870d, hotelBookingState.f163870d) && L.f(this.f163871e, hotelBookingState.f163871e) && L.f(this.f163872f, hotelBookingState.f163872f) && L.f(this.f163873g, hotelBookingState.f163873g) && L.f(this.f163874h, hotelBookingState.f163874h) && L.f(this.f163875i, hotelBookingState.f163875i) && L.f(this.f163876j, hotelBookingState.f163876j) && this.f163877k == hotelBookingState.f163877k && this.f163878l == hotelBookingState.f163878l && L.f(this.f163879m, hotelBookingState.f163879m) && L.f(this.f163880n, hotelBookingState.f163880n);
    }

    public final int hashCode() {
        String str = this.f163868b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f163869c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list = this.f163870d;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f163871e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f163872f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f163873g;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f163874h;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        HotelBookingFormResponse.Form form = this.f163875i;
        int iHashCode8 = (iHashCode7 + (form == null ? 0 : form.hashCode())) * 31;
        RI.a aVar = this.f163876j;
        return this.f163880n.hashCode() + ((this.f163879m.hashCode() + ((this.f163878l.hashCode() + r.i((iHashCode8 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.f163877k)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "HotelBookingState(offerCode=" + this.f163868b + ", adultGuests=" + this.f163869c + ", childAges=" + this.f163870d + ", itemId=" + this.f163871e + ", roomId=" + this.f163872f + ", checkIn=" + this.f163873g + ", checkOut=" + this.f163874h + ", formData=" + this.f163875i + ", bookingState=" + this.f163876j + ", isKeyboardVisible=" + this.f163877k + ", loadingState=" + this.f163878l + ", formViewState=" + this.f163879m + ", floatingBlockViewState=" + this.f163880n + ')';
    }
}
