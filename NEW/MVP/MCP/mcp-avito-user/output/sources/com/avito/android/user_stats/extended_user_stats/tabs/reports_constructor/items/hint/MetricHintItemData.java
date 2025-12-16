package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.hint;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MetricHintItemData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/hint/MetricHintItemData;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesItem;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MetricHintItemData implements ExpensesItem {

    @k
    public static final Parcelable.Creator<MetricHintItemData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f318008b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f318009c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f318010d;

    /* compiled from: MetricHintItemData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MetricHintItemData> {
        @Override // android.os.Parcelable.Creator
        public final MetricHintItemData createFromParcel(Parcel parcel) {
            return new MetricHintItemData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MetricHintItemData[] newArray(int i12) {
            return new MetricHintItemData[i12];
        }
    }

    public MetricHintItemData(@k String str, @k String str2, @k String str3) {
        this.f318008b = str;
        this.f318009c = str2;
        this.f318010d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricHintItemData)) {
            return false;
        }
        MetricHintItemData metricHintItemData = (MetricHintItemData) obj;
        return L.f(this.f318008b, metricHintItemData.f318008b) && L.f(this.f318009c, metricHintItemData.f318009c) && L.f(this.f318010d, metricHintItemData.f318010d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222258b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309850c() {
        return this.f318008b;
    }

    public final int hashCode() {
        return this.f318010d.hashCode() + H.d(this.f318008b.hashCode() * 31, 31, this.f318009c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetricHintItemData(stringId=");
        sb2.append(this.f318008b);
        sb2.append(", title=");
        sb2.append(this.f318009c);
        sb2.append(", hint=");
        return C22026a.c(sb2, this.f318010d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f318008b);
        parcel.writeString(this.f318009c);
        parcel.writeString(this.f318010d);
    }
}
