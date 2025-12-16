package com.avito.android.profile.pro.impl.screen.item.dashboard_stats;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProStatsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/dashboard_stats/StatsDay;", "Landroid/os/Parcelable;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class StatsDay implements Parcelable {

    @k
    public static final Parcelable.Creator<StatsDay> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f223152b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f223153c;

    /* compiled from: ProfileProStatsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StatsDay> {
        @Override // android.os.Parcelable.Creator
        public final StatsDay createFromParcel(Parcel parcel) {
            return new StatsDay(parcel.readLong(), (AttributedText) parcel.readParcelable(StatsDay.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StatsDay[] newArray(int i12) {
            return new StatsDay[i12];
        }
    }

    public StatsDay(long j12, @k AttributedText attributedText) {
        this.f223152b = j12;
        this.f223153c = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsDay)) {
            return false;
        }
        StatsDay statsDay = (StatsDay) obj;
        return this.f223152b == statsDay.f223152b && L.f(this.f223153c, statsDay.f223153c);
    }

    public final int hashCode() {
        return this.f223153c.hashCode() + (Long.hashCode(this.f223152b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatsDay(value=");
        sb2.append(this.f223152b);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f223153c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f223152b);
        parcel.writeParcelable(this.f223153c, i12);
    }

    public /* synthetic */ StatsDay(long j12, AttributedText attributedText, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 0L : j12, attributedText);
    }
}
