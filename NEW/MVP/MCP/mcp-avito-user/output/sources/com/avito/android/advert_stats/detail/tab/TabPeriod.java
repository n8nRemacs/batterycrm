package com.avito.android.advert_stats.detail.tab;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailStatsTabItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/TabPeriod;", "Landroid/os/Parcelable;", "", "dateFrom", "", "title", "<init>", "(JLjava/lang/String;)V", "J", "c", "()J", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TabPeriod implements Parcelable {

    @k
    public static final Parcelable.Creator<TabPeriod> CREATOR = new a();

    @com.google.gson.annotations.c("dateFrom")
    private final long dateFrom;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    /* compiled from: AdvertDetailStatsTabItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TabPeriod> {
        @Override // android.os.Parcelable.Creator
        public final TabPeriod createFromParcel(Parcel parcel) {
            return new TabPeriod(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TabPeriod[] newArray(int i12) {
            return new TabPeriod[i12];
        }
    }

    public TabPeriod(long j12, @l String str) {
        this.dateFrom = j12;
        this.title = str;
    }

    /* renamed from: c, reason: from getter */
    public final long getDateFrom() {
        return this.dateFrom;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPeriod)) {
            return false;
        }
        TabPeriod tabPeriod = (TabPeriod) obj;
        return this.dateFrom == tabPeriod.dateFrom && L.f(this.title, tabPeriod.title);
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.dateFrom) * 31;
        String str = this.title;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabPeriod(dateFrom=");
        sb2.append(this.dateFrom);
        sb2.append(", title=");
        return C22026a.c(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.dateFrom);
        parcel.writeString(this.title);
    }
}
