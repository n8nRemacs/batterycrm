package com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.advert_stats.detail.tab.OneStatsTabItem;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.Action;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailStatsMVIState.kt */
@d
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/mvi/entity/AdvertDetailStatsMVIState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailStatsMVIState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Action f86112b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Action f86113c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f86114d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f86115e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Error f86116f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<OneStatsTabItem> f86117g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Integer f86118h;

    /* renamed from: i, reason: collision with root package name */
    public final long f86119i;

    /* renamed from: j, reason: collision with root package name */
    public final int f86120j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f86110k = new a(null);

    @k
    public static final Parcelable.Creator<AdvertDetailStatsMVIState> CREATOR = new b();

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final AdvertDetailStatsMVIState f86111l = new AdvertDetailStatsMVIState(null, null, "", false, null, null, null, 0, 0);

    /* compiled from: AdvertDetailStatsMVIState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/mvi/entity/AdvertDetailStatsMVIState$a;", "", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertDetailStatsMVIState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AdvertDetailStatsMVIState> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailStatsMVIState createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Action action = (Action) parcel.readParcelable(AdvertDetailStatsMVIState.class.getClassLoader());
            Action action2 = (Action) parcel.readParcelable(AdvertDetailStatsMVIState.class.getClassLoader());
            String string = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            Error errorCreateFromParcel = parcel.readInt() == 0 ? null : Error.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(OneStatsTabItem.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new AdvertDetailStatsMVIState(action, action2, string, z12, errorCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailStatsMVIState[] newArray(int i12) {
            return new AdvertDetailStatsMVIState[i12];
        }
    }

    public AdvertDetailStatsMVIState(@l Action action, @l Action action2, @k String str, boolean z12, @l Error error, @l List<OneStatsTabItem> list, @l Integer num, long j12, int i12) {
        this.f86112b = action;
        this.f86113c = action2;
        this.f86114d = str;
        this.f86115e = z12;
        this.f86116f = error;
        this.f86117g = list;
        this.f86118h = num;
        this.f86119i = j12;
        this.f86120j = i12;
    }

    public static AdvertDetailStatsMVIState a(AdvertDetailStatsMVIState advertDetailStatsMVIState, Action action, Action action2, String str, boolean z12, Error error, ArrayList arrayList, Integer num, long j12, int i12) {
        Action action3 = (i12 & 1) != 0 ? advertDetailStatsMVIState.f86112b : action;
        Action action4 = (i12 & 2) != 0 ? advertDetailStatsMVIState.f86113c : action2;
        String str2 = (i12 & 4) != 0 ? advertDetailStatsMVIState.f86114d : str;
        boolean z13 = (i12 & 8) != 0 ? advertDetailStatsMVIState.f86115e : z12;
        Error error2 = (i12 & 16) != 0 ? advertDetailStatsMVIState.f86116f : error;
        List<OneStatsTabItem> list = (i12 & 32) != 0 ? advertDetailStatsMVIState.f86117g : arrayList;
        Integer num2 = (i12 & 64) != 0 ? advertDetailStatsMVIState.f86118h : num;
        long j13 = (i12 & 128) != 0 ? advertDetailStatsMVIState.f86119i : j12;
        int i13 = advertDetailStatsMVIState.f86120j;
        advertDetailStatsMVIState.getClass();
        return new AdvertDetailStatsMVIState(action3, action4, str2, z13, error2, list, num2, j13, i13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailStatsMVIState)) {
            return false;
        }
        AdvertDetailStatsMVIState advertDetailStatsMVIState = (AdvertDetailStatsMVIState) obj;
        return L.f(this.f86112b, advertDetailStatsMVIState.f86112b) && L.f(this.f86113c, advertDetailStatsMVIState.f86113c) && L.f(this.f86114d, advertDetailStatsMVIState.f86114d) && this.f86115e == advertDetailStatsMVIState.f86115e && L.f(this.f86116f, advertDetailStatsMVIState.f86116f) && L.f(this.f86117g, advertDetailStatsMVIState.f86117g) && L.f(this.f86118h, advertDetailStatsMVIState.f86118h) && this.f86119i == advertDetailStatsMVIState.f86119i && this.f86120j == advertDetailStatsMVIState.f86120j;
    }

    public final int hashCode() {
        Action action = this.f86112b;
        int iHashCode = (action == null ? 0 : action.hashCode()) * 31;
        Action action2 = this.f86113c;
        int i12 = r.i(H.d((iHashCode + (action2 == null ? 0 : action2.hashCode())) * 31, 31, this.f86114d), 31, this.f86115e);
        Error error = this.f86116f;
        int iHashCode2 = (i12 + (error == null ? 0 : error.hashCode())) * 31;
        List<OneStatsTabItem> list = this.f86117g;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.f86118h;
        return Integer.hashCode(this.f86120j) + r.g((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f86119i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailStatsMVIState(buttonActionChanges=");
        sb2.append(this.f86112b);
        sb2.append(", buttonExtraActionChanges=");
        sb2.append(this.f86113c);
        sb2.append(", toolbarTitle=");
        sb2.append(this.f86114d);
        sb2.append(", isLoading=");
        sb2.append(this.f86115e);
        sb2.append(", error=");
        sb2.append(this.f86116f);
        sb2.append(", tabs=");
        sb2.append(this.f86117g);
        sb2.append(", selectedTabIndex=");
        sb2.append(this.f86118h);
        sb2.append(", lastSelectedDatePeriod=");
        sb2.append(this.f86119i);
        sb2.append(", activeChartBarIndex=");
        return r.t(sb2, this.f86120j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f86112b, i12);
        parcel.writeParcelable(this.f86113c, i12);
        parcel.writeString(this.f86114d);
        parcel.writeInt(this.f86115e ? 1 : 0);
        Error error = this.f86116f;
        if (error == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            error.writeToParcel(parcel, i12);
        }
        List<OneStatsTabItem> list = this.f86117g;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((OneStatsTabItem) itA.next()).writeToParcel(parcel, i12);
            }
        }
        Integer num = this.f86118h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeLong(this.f86119i);
        parcel.writeInt(this.f86120j);
    }
}
