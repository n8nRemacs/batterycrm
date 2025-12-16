package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.region;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RegionItemData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/region/RegionItemData;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesItem;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RegionItemData implements ExpensesItem {

    @k
    public static final Parcelable.Creator<RegionItemData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f318041b;

    /* renamed from: c, reason: collision with root package name */
    public final long f318042c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f318043d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f318044e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f318045f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f318046g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f318047h;

    /* renamed from: i, reason: collision with root package name */
    public final int f318048i;

    /* compiled from: RegionItemData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RegionItemData> {
        @Override // android.os.Parcelable.Creator
        public final RegionItemData createFromParcel(Parcel parcel) {
            return new RegionItemData(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RegionItemData[] newArray(int i12) {
            return new RegionItemData[i12];
        }
    }

    public RegionItemData(@k String str, long j12, @k String str2, @k String str3, @l String str4, boolean z12, boolean z13, int i12) {
        this.f318041b = str;
        this.f318042c = j12;
        this.f318043d = str2;
        this.f318044e = str3;
        this.f318045f = str4;
        this.f318046g = z12;
        this.f318047h = z13;
        this.f318048i = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegionItemData)) {
            return false;
        }
        RegionItemData regionItemData = (RegionItemData) obj;
        return L.f(this.f318041b, regionItemData.f318041b) && this.f318042c == regionItemData.f318042c && L.f(this.f318043d, regionItemData.f318043d) && L.f(this.f318044e, regionItemData.f318044e) && L.f(this.f318045f, regionItemData.f318045f) && this.f318046g == regionItemData.f318046g && this.f318047h == regionItemData.f318047h && this.f318048i == regionItemData.f318048i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287660b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309208b() {
        return this.f318041b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(r.g(this.f318041b.hashCode() * 31, 31, this.f318042c), 31, this.f318043d), 31, this.f318044e);
        String str = this.f318045f;
        return Integer.hashCode(this.f318048i) + r.i(r.i((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f318046g), 31, this.f318047h);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RegionItemData(stringId=");
        sb2.append(this.f318041b);
        sb2.append(", splitId=");
        sb2.append(this.f318042c);
        sb2.append(", title=");
        sb2.append(this.f318043d);
        sb2.append(", value=");
        sb2.append(this.f318044e);
        sb2.append(", help=");
        sb2.append(this.f318045f);
        sb2.append(", isOpen=");
        sb2.append(this.f318046g);
        sb2.append(", hasChildren=");
        sb2.append(this.f318047h);
        sb2.append(", shiftLevel=");
        return r.t(sb2, this.f318048i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f318041b);
        parcel.writeLong(this.f318042c);
        parcel.writeString(this.f318043d);
        parcel.writeString(this.f318044e);
        parcel.writeString(this.f318045f);
        parcel.writeInt(this.f318046g ? 1 : 0);
        parcel.writeInt(this.f318047h ? 1 : 0);
        parcel.writeInt(this.f318048i);
    }

    public /* synthetic */ RegionItemData(String str, long j12, String str2, String str3, String str4, boolean z12, boolean z13, int i12, int i13, C42822w c42822w) {
        this(str, j12, str2, str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? false : z12, (i13 & 64) != 0 ? false : z13, (i13 & 128) != 0 ? 0 : i12);
    }
}
