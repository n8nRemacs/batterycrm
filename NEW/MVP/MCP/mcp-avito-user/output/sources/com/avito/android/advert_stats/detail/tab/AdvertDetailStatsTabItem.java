package com.avito.android.advert_stats.detail.tab;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.advert_stats.remote.model.detail_stats.AdvertStatTab;
import com.avito.android.advert_stats.remote.model.detail_stats.PeriodSpendings;
import com.avito.android.advert_stats.remote.model.detail_stats.PeriodSpendingsExpenses;
import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailStatsTabItem.kt */
@K51.d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/AdvertDetailStatsTabItem;", "Landroid/os/Parcelable;", "", "title", "iid", "shortcut", "", "isSelected", "isFavorite", "Lcom/avito/android/advert_stats/remote/model/detail_stats/AdvertStatTab;", NotificationOpenAtTab.TAB, "", "lastSelectedDate", "Lcom/avito/android/advert_stats/remote/model/detail_stats/PeriodSpendings;", "spendings", "Lcom/avito/android/advert_stats/remote/model/detail_stats/PeriodSpendingsExpenses;", "spendingsExpenses", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/advert_stats/remote/model/detail_stats/AdvertStatTab;JLcom/avito/android/advert_stats/remote/model/detail_stats/PeriodSpendings;Lcom/avito/android/advert_stats/remote/model/detail_stats/PeriodSpendingsExpenses;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailStatsTabItem implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertDetailStatsTabItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f86179b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f86180c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f86181d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f86182e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AdvertStatTab f86183f;

    /* renamed from: g, reason: collision with root package name */
    public final long f86184g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final PeriodSpendings f86185h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final PeriodSpendingsExpenses f86186i;

    @com.google.gson.annotations.c("title_tab")
    @k
    private final String title;

    /* compiled from: AdvertDetailStatsTabItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailStatsTabItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailStatsTabItem createFromParcel(Parcel parcel) {
            return new AdvertDetailStatsTabItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (AdvertStatTab) parcel.readParcelable(AdvertDetailStatsTabItem.class.getClassLoader()), parcel.readLong(), (PeriodSpendings) parcel.readParcelable(AdvertDetailStatsTabItem.class.getClassLoader()), (PeriodSpendingsExpenses) parcel.readParcelable(AdvertDetailStatsTabItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailStatsTabItem[] newArray(int i12) {
            return new AdvertDetailStatsTabItem[i12];
        }
    }

    public AdvertDetailStatsTabItem(@k String str, @k String str2, @k String str3, boolean z12, boolean z13, @k AdvertStatTab advertStatTab, long j12, @l PeriodSpendings periodSpendings, @l PeriodSpendingsExpenses periodSpendingsExpenses) {
        this.title = str;
        this.f86179b = str2;
        this.f86180c = str3;
        this.f86181d = z12;
        this.f86182e = z13;
        this.f86183f = advertStatTab;
        this.f86184g = j12;
        this.f86185h = periodSpendings;
        this.f86186i = periodSpendingsExpenses;
    }

    public static AdvertDetailStatsTabItem a(AdvertDetailStatsTabItem advertDetailStatsTabItem, long j12) {
        String str = advertDetailStatsTabItem.title;
        String str2 = advertDetailStatsTabItem.f86179b;
        String str3 = advertDetailStatsTabItem.f86180c;
        boolean z12 = advertDetailStatsTabItem.f86181d;
        boolean z13 = advertDetailStatsTabItem.f86182e;
        AdvertStatTab advertStatTab = advertDetailStatsTabItem.f86183f;
        PeriodSpendings periodSpendings = advertDetailStatsTabItem.f86185h;
        PeriodSpendingsExpenses periodSpendingsExpenses = advertDetailStatsTabItem.f86186i;
        advertDetailStatsTabItem.getClass();
        return new AdvertDetailStatsTabItem(str, str2, str3, z12, z13, advertStatTab, j12, periodSpendings, periodSpendingsExpenses);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailStatsTabItem)) {
            return false;
        }
        AdvertDetailStatsTabItem advertDetailStatsTabItem = (AdvertDetailStatsTabItem) obj;
        return L.f(this.title, advertDetailStatsTabItem.title) && L.f(this.f86179b, advertDetailStatsTabItem.f86179b) && L.f(this.f86180c, advertDetailStatsTabItem.f86180c) && this.f86181d == advertDetailStatsTabItem.f86181d && this.f86182e == advertDetailStatsTabItem.f86182e && L.f(this.f86183f, advertDetailStatsTabItem.f86183f) && this.f86184g == advertDetailStatsTabItem.f86184g && L.f(this.f86185h, advertDetailStatsTabItem.f86185h) && L.f(this.f86186i, advertDetailStatsTabItem.f86186i);
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iG2 = r.g((this.f86183f.hashCode() + r.i(r.i(H.d(H.d(this.title.hashCode() * 31, 31, this.f86179b), 31, this.f86180c), 31, this.f86181d), 31, this.f86182e)) * 31, 31, this.f86184g);
        PeriodSpendings periodSpendings = this.f86185h;
        int iHashCode = (iG2 + (periodSpendings == null ? 0 : periodSpendings.hashCode())) * 31;
        PeriodSpendingsExpenses periodSpendingsExpenses = this.f86186i;
        return iHashCode + (periodSpendingsExpenses != null ? periodSpendingsExpenses.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AdvertDetailStatsTabItem(title=" + this.title + ", iid=" + this.f86179b + ", shortcut=" + this.f86180c + ", isSelected=" + this.f86181d + ", isFavorite=" + this.f86182e + ", tab=" + this.f86183f + ", lastSelectedDate=" + this.f86184g + ", spendings=" + this.f86185h + ", spendingsExpenses=" + this.f86186i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.f86179b);
        parcel.writeString(this.f86180c);
        parcel.writeInt(this.f86181d ? 1 : 0);
        parcel.writeInt(this.f86182e ? 1 : 0);
        parcel.writeParcelable(this.f86183f, i12);
        parcel.writeLong(this.f86184g);
        parcel.writeParcelable(this.f86185h, i12);
        parcel.writeParcelable(this.f86186i, i12);
    }

    public /* synthetic */ AdvertDetailStatsTabItem(String str, String str2, String str3, boolean z12, boolean z13, AdvertStatTab advertStatTab, long j12, PeriodSpendings periodSpendings, PeriodSpendingsExpenses periodSpendingsExpenses, int i12, C42822w c42822w) {
        this(str, str2, str3, z12, (i12 & 16) != 0 ? false : z13, advertStatTab, j12, periodSpendings, periodSpendingsExpenses);
    }
}
