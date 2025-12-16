package com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.advert_stats.detail.tab.AdvertDetailStatsTabItem;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MviFavoriteState.kt */
@d
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/mvi/entity/MviFavoriteState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MviFavoriteState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f86236b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f86237c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f86238d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AdvertDetailStatsTabItem f86239e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f86234f = new a(null);

    @k
    public static final Parcelable.Creator<MviFavoriteState> CREATOR = new b();

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final MviFavoriteState f86235g = new MviFavoriteState("", "", "", null);

    /* compiled from: MviFavoriteState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/mvi/entity/MviFavoriteState$a;", "", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MviFavoriteState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<MviFavoriteState> {
        @Override // android.os.Parcelable.Creator
        public final MviFavoriteState createFromParcel(Parcel parcel) {
            return new MviFavoriteState(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AdvertDetailStatsTabItem.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MviFavoriteState[] newArray(int i12) {
            return new MviFavoriteState[i12];
        }
    }

    public /* synthetic */ MviFavoriteState(String str, String str2, String str3, AdvertDetailStatsTabItem advertDetailStatsTabItem, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : advertDetailStatsTabItem);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MviFavoriteState)) {
            return false;
        }
        MviFavoriteState mviFavoriteState = (MviFavoriteState) obj;
        return L.f(this.f86236b, mviFavoriteState.f86236b) && L.f(this.f86237c, mviFavoriteState.f86237c) && L.f(this.f86238d, mviFavoriteState.f86238d) && L.f(this.f86239e, mviFavoriteState.f86239e);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f86236b.hashCode() * 31, 31, this.f86237c), 31, this.f86238d);
        AdvertDetailStatsTabItem advertDetailStatsTabItem = this.f86239e;
        return iD2 + (advertDetailStatsTabItem == null ? 0 : advertDetailStatsTabItem.hashCode());
    }

    @k
    public final String toString() {
        return "MviFavoriteState(count=" + this.f86236b + ", countText=" + this.f86237c + ", description=" + this.f86238d + ", tabModel=" + this.f86239e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f86236b);
        parcel.writeString(this.f86237c);
        parcel.writeString(this.f86238d);
        AdvertDetailStatsTabItem advertDetailStatsTabItem = this.f86239e;
        if (advertDetailStatsTabItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertDetailStatsTabItem.writeToParcel(parcel, i12);
        }
    }

    public MviFavoriteState(@k String str, @k String str2, @k String str3, @l AdvertDetailStatsTabItem advertDetailStatsTabItem) {
        this.f86236b = str;
        this.f86237c = str2;
        this.f86238d = str3;
        this.f86239e = advertDetailStatsTabItem;
    }
}
