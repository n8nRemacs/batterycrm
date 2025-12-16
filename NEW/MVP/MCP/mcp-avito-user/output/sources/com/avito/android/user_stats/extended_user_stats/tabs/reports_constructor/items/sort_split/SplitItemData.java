package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.sort_split;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SplitItemData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/sort_split/SplitItemData;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesItem;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SplitItemData implements ExpensesItem {

    @Y61.k
    public static final Parcelable.Creator<SplitItemData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f318076b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f318077c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f318078d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f318079e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f318080f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f318081g;

    /* compiled from: SplitItemData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SplitItemData> {
        @Override // android.os.Parcelable.Creator
        public final SplitItemData createFromParcel(Parcel parcel) {
            return new SplitItemData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SplitItemData[] newArray(int i12) {
            return new SplitItemData[i12];
        }
    }

    public SplitItemData(@Y61.k String str, @l String str2, @l String str3, boolean z12, boolean z13, boolean z14) {
        this.f318076b = str;
        this.f318077c = str2;
        this.f318078d = str3;
        this.f318079e = z12;
        this.f318080f = z13;
        this.f318081g = z14;
    }

    public static SplitItemData a(SplitItemData splitItemData, String str, int i12) {
        String str2 = splitItemData.f318076b;
        if ((i12 & 2) != 0) {
            str = splitItemData.f318077c;
        }
        String str3 = str;
        String str4 = splitItemData.f318078d;
        boolean z12 = splitItemData.f318079e;
        boolean z13 = (i12 & 16) != 0 ? splitItemData.f318080f : true;
        boolean z14 = splitItemData.f318081g;
        splitItemData.getClass();
        return new SplitItemData(str2, str3, str4, z12, z13, z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitItemData)) {
            return false;
        }
        SplitItemData splitItemData = (SplitItemData) obj;
        return L.f(this.f318076b, splitItemData.f318076b) && L.f(this.f318077c, splitItemData.f318077c) && L.f(this.f318078d, splitItemData.f318078d) && this.f318079e == splitItemData.f318079e && this.f318080f == splitItemData.f318080f && this.f318081g == splitItemData.f318081g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268996b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309979b() {
        return this.f318076b;
    }

    public final int hashCode() {
        int iHashCode = this.f318076b.hashCode() * 31;
        String str = this.f318077c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f318078d;
        return Boolean.hashCode(this.f318081g) + r.i(r.i((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f318079e), 31, this.f318080f);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SplitItemData(stringId=");
        sb2.append(this.f318076b);
        sb2.append(", name=");
        sb2.append(this.f318077c);
        sb2.append(", order=");
        sb2.append(this.f318078d);
        sb2.append(", hasOrder=");
        sb2.append(this.f318079e);
        sb2.append(", showTooltip=");
        sb2.append(this.f318080f);
        sb2.append(", splitForOneItem=");
        return r.x(sb2, this.f318081g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f318076b);
        parcel.writeString(this.f318077c);
        parcel.writeString(this.f318078d);
        parcel.writeInt(this.f318079e ? 1 : 0);
        parcel.writeInt(this.f318080f ? 1 : 0);
        parcel.writeInt(this.f318081g ? 1 : 0);
    }
}
