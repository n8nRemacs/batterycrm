package com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.StrSellerCalendarLastMinuteOfferResponse;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: LastMinuteOfferState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "LoadingState", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LastMinuteOfferState extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f287938i = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LoadingState f287939b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final StrSellerCalendarLastMinuteOfferResponse f287940c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f287941d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f287942e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f287943f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f287944g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.a f287945h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LastMinuteOfferState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferState$LoadingState;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingState {

        /* renamed from: b, reason: collision with root package name */
        public static final LoadingState f287946b;

        /* renamed from: c, reason: collision with root package name */
        public static final LoadingState f287947c;

        /* renamed from: d, reason: collision with root package name */
        public static final LoadingState f287948d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ LoadingState[] f287949e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f287950f;

        static {
            LoadingState loadingState = new LoadingState("LOADING", 0);
            f287946b = loadingState;
            LoadingState loadingState2 = new LoadingState("LOADED", 1);
            f287947c = loadingState2;
            LoadingState loadingState3 = new LoadingState("ERROR", 2);
            f287948d = loadingState3;
            LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3};
            f287949e = loadingStateArr;
            f287950f = c.a(loadingStateArr);
        }

        public LoadingState() {
            throw null;
        }

        public static LoadingState valueOf(String str) {
            return (LoadingState) Enum.valueOf(LoadingState.class, str);
        }

        public static LoadingState[] values() {
            return (LoadingState[]) f287949e.clone();
        }
    }

    /* compiled from: LastMinuteOfferState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferState$a;", "", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public LastMinuteOfferState(@k LoadingState loadingState, @l StrSellerCalendarLastMinuteOfferResponse strSellerCalendarLastMinuteOfferResponse, @l Boolean bool, boolean z12, boolean z13, @k String str, @k com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.a aVar) {
        this.f287939b = loadingState;
        this.f287940c = strSellerCalendarLastMinuteOfferResponse;
        this.f287941d = bool;
        this.f287942e = z12;
        this.f287943f = z13;
        this.f287944g = str;
        this.f287945h = aVar;
    }

    public static LastMinuteOfferState a(LastMinuteOfferState lastMinuteOfferState, LoadingState loadingState, StrSellerCalendarLastMinuteOfferResponse strSellerCalendarLastMinuteOfferResponse, Boolean bool, boolean z12, boolean z13, String str, com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.a aVar, int i12) {
        LoadingState loadingState2 = (i12 & 1) != 0 ? lastMinuteOfferState.f287939b : loadingState;
        StrSellerCalendarLastMinuteOfferResponse strSellerCalendarLastMinuteOfferResponse2 = (i12 & 2) != 0 ? lastMinuteOfferState.f287940c : strSellerCalendarLastMinuteOfferResponse;
        Boolean bool2 = (i12 & 4) != 0 ? lastMinuteOfferState.f287941d : bool;
        boolean z14 = (i12 & 8) != 0 ? lastMinuteOfferState.f287942e : z12;
        boolean z15 = (i12 & 16) != 0 ? lastMinuteOfferState.f287943f : z13;
        String str2 = (i12 & 32) != 0 ? lastMinuteOfferState.f287944g : str;
        com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.a aVar2 = (i12 & 64) != 0 ? lastMinuteOfferState.f287945h : aVar;
        lastMinuteOfferState.getClass();
        return new LastMinuteOfferState(loadingState2, strSellerCalendarLastMinuteOfferResponse2, bool2, z14, z15, str2, aVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastMinuteOfferState)) {
            return false;
        }
        LastMinuteOfferState lastMinuteOfferState = (LastMinuteOfferState) obj;
        return this.f287939b == lastMinuteOfferState.f287939b && L.f(this.f287940c, lastMinuteOfferState.f287940c) && L.f(this.f287941d, lastMinuteOfferState.f287941d) && this.f287942e == lastMinuteOfferState.f287942e && this.f287943f == lastMinuteOfferState.f287943f && L.f(this.f287944g, lastMinuteOfferState.f287944g) && L.f(this.f287945h, lastMinuteOfferState.f287945h);
    }

    public final int hashCode() {
        int iHashCode = this.f287939b.hashCode() * 31;
        StrSellerCalendarLastMinuteOfferResponse strSellerCalendarLastMinuteOfferResponse = this.f287940c;
        int iHashCode2 = (iHashCode + (strSellerCalendarLastMinuteOfferResponse == null ? 0 : strSellerCalendarLastMinuteOfferResponse.hashCode())) * 31;
        Boolean bool = this.f287941d;
        return this.f287945h.hashCode() + H.d(r.i(r.i((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.f287942e), 31, this.f287943f), 31, this.f287944g);
    }

    @k
    public final String toString() {
        return "LastMinuteOfferState(loadingState=" + this.f287939b + ", lastApiResponse=" + this.f287940c + ", isSwitchToggleWasChecked=" + this.f287941d + ", isSaveButtonVisible=" + this.f287942e + ", isInputErrorVisible=" + this.f287943f + ", inputErrorText=" + this.f287944g + ", viewState=" + this.f287945h + ')';
    }
}
