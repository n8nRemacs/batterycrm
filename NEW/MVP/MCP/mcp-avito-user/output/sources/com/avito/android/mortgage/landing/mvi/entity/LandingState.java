package com.avito.android.mortgage.landing.mvi.entity;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.api.model.OffersResult;
import com.avito.android.mortgage.api.model.landing.LandingHeader;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.android.mortgage.landing.model.LandingArguments;
import com.avito.android.mortgage.landing.mvi.entity.LandingViewState;
import java.time.Instant;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: LandingState.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LandingState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final LandingHeader f200226b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, LandingItem> f200227c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f200228d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final OffersResult f200229e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final LandingArguments f200230f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f200231g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final DeepLink f200232h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f200233i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f200234j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f200235k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f200236l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f200237m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f200238n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final String f200239o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final Instant f200240p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final LandingViewState f200241q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f200224r = new a(null);

    @k
    public static final Parcelable.Creator<LandingState> CREATOR = new b();

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final LandingState f200225s = new LandingState(null, P0.c(), true, null, null, null, null, "personal", null, true, false, false, false, null, null, LandingViewState.Loading.f200251b);

    /* compiled from: LandingState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingState$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LandingState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<LandingState> {
        @Override // android.os.Parcelable.Creator
        public final LandingState createFromParcel(Parcel parcel) {
            LandingHeader landingHeaderCreateFromParcel = parcel.readInt() == 0 ? null : LandingHeader.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = f.c(LandingState.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            return new LandingState(landingHeaderCreateFromParcel, linkedHashMap, parcel.readInt() != 0, parcel.readInt() == 0 ? null : OffersResult.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LandingArguments.CREATOR.createFromParcel(parcel) : null, parcel.readString(), (DeepLink) parcel.readParcelable(LandingState.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (Instant) parcel.readSerializable(), (LandingViewState) parcel.readParcelable(LandingState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LandingState[] newArray(int i12) {
            return new LandingState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LandingState(@l LandingHeader landingHeader, @k Map<String, ? extends LandingItem> map, boolean z12, @l OffersResult offersResult, @l LandingArguments landingArguments, @l String str, @l DeepLink deepLink, @k String str2, @l String str3, boolean z13, boolean z14, boolean z15, boolean z16, @l String str4, @l Instant instant, @k LandingViewState landingViewState) {
        this.f200226b = landingHeader;
        this.f200227c = map;
        this.f200228d = z12;
        this.f200229e = offersResult;
        this.f200230f = landingArguments;
        this.f200231g = str;
        this.f200232h = deepLink;
        this.f200233i = str2;
        this.f200234j = str3;
        this.f200235k = z13;
        this.f200236l = z14;
        this.f200237m = z15;
        this.f200238n = z16;
        this.f200239o = str4;
        this.f200240p = instant;
        this.f200241q = landingViewState;
    }

    public static LandingState a(LandingState landingState, LandingHeader landingHeader, Map map, boolean z12, OffersResult offersResult, LandingArguments landingArguments, String str, DeepLink deepLink, String str2, String str3, boolean z13, boolean z14, boolean z15, boolean z16, String str4, Instant instant, LandingViewState landingViewState, int i12) {
        LandingHeader landingHeader2 = (i12 & 1) != 0 ? landingState.f200226b : landingHeader;
        Map map2 = (i12 & 2) != 0 ? landingState.f200227c : map;
        boolean z17 = (i12 & 4) != 0 ? landingState.f200228d : z12;
        OffersResult offersResult2 = (i12 & 8) != 0 ? landingState.f200229e : offersResult;
        LandingArguments landingArguments2 = (i12 & 16) != 0 ? landingState.f200230f : landingArguments;
        String str5 = (i12 & 32) != 0 ? landingState.f200231g : str;
        DeepLink deepLink2 = (i12 & 64) != 0 ? landingState.f200232h : deepLink;
        String str6 = (i12 & 128) != 0 ? landingState.f200233i : str2;
        String str7 = (i12 & 256) != 0 ? landingState.f200234j : str3;
        boolean z18 = (i12 & 512) != 0 ? landingState.f200235k : z13;
        boolean z19 = (i12 & 1024) != 0 ? landingState.f200236l : z14;
        boolean z22 = (i12 & 2048) != 0 ? landingState.f200237m : z15;
        boolean z23 = (i12 & 4096) != 0 ? landingState.f200238n : z16;
        String str8 = (i12 & 8192) != 0 ? landingState.f200239o : str4;
        Instant instant2 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? landingState.f200240p : instant;
        LandingViewState landingViewState2 = (i12 & 32768) != 0 ? landingState.f200241q : landingViewState;
        landingState.getClass();
        return new LandingState(landingHeader2, map2, z17, offersResult2, landingArguments2, str5, deepLink2, str6, str7, z18, z19, z22, z23, str8, instant2, landingViewState2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingState)) {
            return false;
        }
        LandingState landingState = (LandingState) obj;
        return L.f(this.f200226b, landingState.f200226b) && L.f(this.f200227c, landingState.f200227c) && this.f200228d == landingState.f200228d && L.f(this.f200229e, landingState.f200229e) && L.f(this.f200230f, landingState.f200230f) && L.f(this.f200231g, landingState.f200231g) && L.f(this.f200232h, landingState.f200232h) && L.f(this.f200233i, landingState.f200233i) && L.f(this.f200234j, landingState.f200234j) && this.f200235k == landingState.f200235k && this.f200236l == landingState.f200236l && this.f200237m == landingState.f200237m && this.f200238n == landingState.f200238n && L.f(this.f200239o, landingState.f200239o) && L.f(this.f200240p, landingState.f200240p) && L.f(this.f200241q, landingState.f200241q);
    }

    public final int hashCode() {
        LandingHeader landingHeader = this.f200226b;
        int i12 = r.i(c.c((landingHeader == null ? 0 : landingHeader.hashCode()) * 31, 31, this.f200227c), 31, this.f200228d);
        OffersResult offersResult = this.f200229e;
        int iHashCode = (i12 + (offersResult == null ? 0 : offersResult.hashCode())) * 31;
        LandingArguments landingArguments = this.f200230f;
        int iHashCode2 = (iHashCode + (landingArguments == null ? 0 : landingArguments.hashCode())) * 31;
        String str = this.f200231g;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f200232h;
        int iD2 = H.d((iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f200233i);
        String str2 = this.f200234j;
        int i13 = r.i(r.i(r.i(r.i((iD2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f200235k), 31, this.f200236l), 31, this.f200237m), 31, this.f200238n);
        String str3 = this.f200239o;
        int iHashCode4 = (i13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Instant instant = this.f200240p;
        return this.f200241q.hashCode() + ((iHashCode4 + (instant != null ? instant.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "LandingState(header=" + this.f200226b + ", data=" + this.f200227c + ", needUpdateConfirm=" + this.f200228d + ", offersResult=" + this.f200229e + ", arguments=" + this.f200230f + ", applicationId=" + this.f200231g + ", applicationDeeplink=" + this.f200232h + ", flowType=" + this.f200233i + ", sourceType=" + this.f200234j + ", isCalculationLoading=" + this.f200235k + ", isCalculationError=" + this.f200236l + ", isOffersLoading=" + this.f200237m + ", isOffersError=" + this.f200238n + ", fromPage=" + this.f200239o + ", screenOpenedTime=" + this.f200240p + ", viewState=" + this.f200241q + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        LandingHeader landingHeader = this.f200226b;
        if (landingHeader == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            landingHeader.writeToParcel(parcel, i12);
        }
        Iterator itI = C0.i(parcel, this.f200227c);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i12);
        }
        parcel.writeInt(this.f200228d ? 1 : 0);
        OffersResult offersResult = this.f200229e;
        if (offersResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offersResult.writeToParcel(parcel, i12);
        }
        LandingArguments landingArguments = this.f200230f;
        if (landingArguments == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            landingArguments.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f200231g);
        parcel.writeParcelable(this.f200232h, i12);
        parcel.writeString(this.f200233i);
        parcel.writeString(this.f200234j);
        parcel.writeInt(this.f200235k ? 1 : 0);
        parcel.writeInt(this.f200236l ? 1 : 0);
        parcel.writeInt(this.f200237m ? 1 : 0);
        parcel.writeInt(this.f200238n ? 1 : 0);
        parcel.writeString(this.f200239o);
        parcel.writeSerializable(this.f200240p);
        parcel.writeParcelable(this.f200241q, i12);
    }
}
