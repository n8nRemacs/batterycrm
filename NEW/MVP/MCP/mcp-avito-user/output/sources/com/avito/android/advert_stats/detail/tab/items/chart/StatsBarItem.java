package com.avito.android.advert_stats.detail.tab.items.chart;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItem;
import com.avito.android.advert_stats.item.BarState;
import com.avito.android.advert_stats.item.VasInfo;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StatsBarItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/chart/StatsBarItem;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItem;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class StatsBarItem implements StatsItem {

    @Y61.k
    public static final Parcelable.Creator<StatsBarItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f86281b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f86282c;

    /* renamed from: d, reason: collision with root package name */
    public final float f86283d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public BarState f86284e;

    /* renamed from: f, reason: collision with root package name */
    public final int f86285f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f86286g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final List<VasInfo> f86287h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f86288i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f86289j;

    /* compiled from: StatsBarItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StatsBarItem> {
        @Override // android.os.Parcelable.Creator
        public final StatsBarItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            float f12 = parcel.readFloat();
            BarState barStateValueOf = BarState.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(VasInfo.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new StatsBarItem(string, numValueOf, f12, barStateValueOf, i12, numValueOf2, arrayList, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StatsBarItem[] newArray(int i12) {
            return new StatsBarItem[i12];
        }
    }

    public StatsBarItem(@Y61.k String str, @Y61.l Integer num, float f12, @Y61.k BarState barState, int i12, @Y61.l Integer num2, @Y61.k List<VasInfo> list, @Y61.l String str2, boolean z12) {
        this.f86281b = str;
        this.f86282c = num;
        this.f86283d = f12;
        this.f86284e = barState;
        this.f86285f = i12;
        this.f86286g = num2;
        this.f86287h = list;
        this.f86288i = str2;
        this.f86289j = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsBarItem)) {
            return false;
        }
        StatsBarItem statsBarItem = (StatsBarItem) obj;
        return L.f(this.f86281b, statsBarItem.f86281b) && L.f(this.f86282c, statsBarItem.f86282c) && Float.compare(this.f86283d, statsBarItem.f86283d) == 0 && this.f86284e == statsBarItem.f86284e && this.f86285f == statsBarItem.f86285f && L.f(this.f86286g, statsBarItem.f86286g) && L.f(this.f86287h, statsBarItem.f86287h) && L.f(this.f86288i, statsBarItem.f86288i) && this.f86289j == statsBarItem.f86289j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83624b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF83628f() {
        return this.f86281b;
    }

    public final int hashCode() {
        int iHashCode = this.f86281b.hashCode() * 31;
        Integer num = this.f86282c;
        int iE2 = androidx.appcompat.app.r.e(this.f86285f, (this.f86284e.hashCode() + androidx.appcompat.app.r.d(this.f86283d, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31)) * 31, 31);
        Integer num2 = this.f86286g;
        int iE3 = H.e((iE2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f86287h);
        String str = this.f86288i;
        return Boolean.hashCode(this.f86289j) + ((iE3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatsBarItem(stringId=");
        sb2.append(this.f86281b);
        sb2.append(", views=");
        sb2.append(this.f86282c);
        sb2.append(", coefficient=");
        sb2.append(this.f86283d);
        sb2.append(", state=");
        sb2.append(this.f86284e);
        sb2.append(", index=");
        sb2.append(this.f86285f);
        sb2.append(", vasViews=");
        sb2.append(this.f86286g);
        sb2.append(", vasList=");
        sb2.append(this.f86287h);
        sb2.append(", date=");
        sb2.append(this.f86288i);
        sb2.append(", isCurrentDate=");
        return androidx.appcompat.app.r.x(sb2, this.f86289j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f86281b);
        Integer num = this.f86282c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeFloat(this.f86283d);
        parcel.writeString(this.f86284e.name());
        parcel.writeInt(this.f86285f);
        Integer num2 = this.f86286g;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Iterator itJ = C0.j(this.f86287h, parcel);
        while (itJ.hasNext()) {
            ((VasInfo) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f86288i);
        parcel.writeInt(this.f86289j ? 1 : 0);
    }

    public /* synthetic */ StatsBarItem(String str, Integer num, float f12, BarState barState, int i12, Integer num2, List list, String str2, boolean z12, int i13, C42822w c42822w) {
        this(str, num, f12, (i13 & 8) != 0 ? BarState.f86678b : barState, i12, num2, list, (i13 & 128) != 0 ? null : str2, z12);
    }
}
