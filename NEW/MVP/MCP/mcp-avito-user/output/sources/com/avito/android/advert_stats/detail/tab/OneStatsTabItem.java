package com.avito.android.advert_stats.detail.tab;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.lib.deprecated_design.tab.CommonTab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailStatsTabItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/OneStatsTabItem;", "Lcom/avito/android/lib/deprecated_design/tab/CommonTab;", "Landroid/os/Parcelable;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OneStatsTabItem extends CommonTab implements Parcelable {

    @k
    public static final Parcelable.Creator<OneStatsTabItem> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f86187d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f86188e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f86189f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f86190g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f86191h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<TabPeriod> f86192i;

    /* compiled from: AdvertDetailStatsTabItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OneStatsTabItem> {
        @Override // android.os.Parcelable.Creator
        public final OneStatsTabItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            String string3 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(TabPeriod.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new OneStatsTabItem(string, string2, z12, z13, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final OneStatsTabItem[] newArray(int i12) {
            return new OneStatsTabItem[i12];
        }
    }

    public /* synthetic */ OneStatsTabItem(String str, String str2, boolean z12, boolean z13, String str3, List list, int i12, C42822w c42822w) {
        this(str, str2, z12, (i12 & 8) != 0 ? false : z13, str3, list);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OneStatsTabItem)) {
            return false;
        }
        OneStatsTabItem oneStatsTabItem = (OneStatsTabItem) obj;
        return L.f(this.f86187d, oneStatsTabItem.f86187d) && L.f(this.f86188e, oneStatsTabItem.f86188e) && this.f86189f == oneStatsTabItem.f86189f && this.f86190g == oneStatsTabItem.f86190g && L.f(this.f86191h, oneStatsTabItem.f86191h) && L.f(this.f86192i, oneStatsTabItem.f86192i);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.CommonTab, com.avito.android.lib.deprecated_design.tab.a
    @k
    /* renamed from: getLabel */
    public final String getF316857h() {
        return "";
    }

    @Override // com.avito.android.lib.deprecated_design.tab.CommonTab, com.avito.android.lib.deprecated_design.tab.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF245877d() {
        return this.f86187d;
    }

    public final int hashCode() {
        return this.f86192i.hashCode() + H.d(r.i(r.i(H.d(this.f86187d.hashCode() * 31, 31, this.f86188e), 31, this.f86189f), 31, this.f86190g), 31, this.f86191h);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OneStatsTabItem(title=");
        sb2.append(this.f86187d);
        sb2.append(", iid=");
        sb2.append(this.f86188e);
        sb2.append(", isSelected=");
        sb2.append(this.f86189f);
        sb2.append(", isFavorite=");
        sb2.append(this.f86190g);
        sb2.append(", shortcut=");
        sb2.append(this.f86191h);
        sb2.append(", periods=");
        return H.p(sb2, this.f86192i, ')');
    }

    @Override // com.avito.android.lib.deprecated_design.tab.CommonTab, android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f86187d);
        parcel.writeString(this.f86188e);
        parcel.writeInt(this.f86189f ? 1 : 0);
        parcel.writeInt(this.f86190g ? 1 : 0);
        parcel.writeString(this.f86191h);
        Iterator itJ = C0.j(this.f86192i, parcel);
        while (itJ.hasNext()) {
            ((TabPeriod) itJ.next()).writeToParcel(parcel, i12);
        }
    }

    public OneStatsTabItem(@k String str, @k String str2, boolean z12, boolean z13, @k String str3, @k List<TabPeriod> list) {
        super(str, null, 2, null);
        this.f86187d = str;
        this.f86188e = str2;
        this.f86189f = z12;
        this.f86190g = z13;
        this.f86191h = str3;
        this.f86192i = list;
    }
}
