package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.total_bottom;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TotalBottomItemData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/total_bottom/TotalBottomItemData;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesItem;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TotalBottomItemData implements ExpensesItem {

    @k
    public static final Parcelable.Creator<TotalBottomItemData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f317788b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f317789c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f317790d;

    /* compiled from: TotalBottomItemData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TotalBottomItemData> {
        @Override // android.os.Parcelable.Creator
        public final TotalBottomItemData createFromParcel(Parcel parcel) {
            return new TotalBottomItemData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TotalBottomItemData[] newArray(int i12) {
            return new TotalBottomItemData[i12];
        }
    }

    public TotalBottomItemData(@k String str, @k String str2, @l String str3) {
        this.f317788b = str;
        this.f317789c = str2;
        this.f317790d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotalBottomItemData)) {
            return false;
        }
        TotalBottomItemData totalBottomItemData = (TotalBottomItemData) obj;
        return L.f(this.f317788b, totalBottomItemData.f317788b) && L.f(this.f317789c, totalBottomItemData.f317789c) && L.f(this.f317790d, totalBottomItemData.f317790d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287615b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF12154b() {
        return this.f317788b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f317788b.hashCode() * 31, 31, this.f317789c);
        String str = this.f317790d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TotalBottomItemData(stringId=");
        sb2.append(this.f317788b);
        sb2.append(", total=");
        sb2.append(this.f317789c);
        sb2.append(", bonuses=");
        return C22026a.c(sb2, this.f317790d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f317788b);
        parcel.writeString(this.f317789c);
        parcel.writeString(this.f317790d);
    }

    public /* synthetic */ TotalBottomItemData(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3);
    }
}
