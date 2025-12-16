package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.horizontal_chart;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HorizontalColumnItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/horizontal_chart/HorizontalColumnItem;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesItem;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HorizontalColumnItem implements ExpensesItem {

    @k
    public static final Parcelable.Creator<HorizontalColumnItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f318018b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f318019c;

    /* renamed from: d, reason: collision with root package name */
    public final int f318020d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f318021e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalColor f318022f;

    /* compiled from: HorizontalColumnItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HorizontalColumnItem> {
        @Override // android.os.Parcelable.Creator
        public final HorizontalColumnItem createFromParcel(Parcel parcel) {
            return new HorizontalColumnItem(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), (UniversalColor) parcel.readParcelable(HorizontalColumnItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HorizontalColumnItem[] newArray(int i12) {
            return new HorizontalColumnItem[i12];
        }
    }

    public HorizontalColumnItem(@k String str, @k String str2, int i12, @k String str3, @l UniversalColor universalColor) {
        this.f318018b = str;
        this.f318019c = str2;
        this.f318020d = i12;
        this.f318021e = str3;
        this.f318022f = universalColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalColumnItem)) {
            return false;
        }
        HorizontalColumnItem horizontalColumnItem = (HorizontalColumnItem) obj;
        return L.f(this.f318018b, horizontalColumnItem.f318018b) && L.f(this.f318019c, horizontalColumnItem.f318019c) && this.f318020d == horizontalColumnItem.f318020d && L.f(this.f318021e, horizontalColumnItem.f318021e) && L.f(this.f318022f, horizontalColumnItem.f318022f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272437b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF317713b() {
        return this.f318018b;
    }

    public final int hashCode() {
        int iD2 = H.d(r.e(this.f318020d, H.d(this.f318018b.hashCode() * 31, 31, this.f318019c), 31), 31, this.f318021e);
        UniversalColor universalColor = this.f318022f;
        return iD2 + (universalColor == null ? 0 : universalColor.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalColumnItem(stringId=");
        sb2.append(this.f318018b);
        sb2.append(", title=");
        sb2.append(this.f318019c);
        sb2.append(", percent=");
        sb2.append(this.f318020d);
        sb2.append(", count=");
        sb2.append(this.f318021e);
        sb2.append(", color=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f318022f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f318018b);
        parcel.writeString(this.f318019c);
        parcel.writeInt(this.f318020d);
        parcel.writeString(this.f318021e);
        parcel.writeParcelable(this.f318022f, i12);
    }

    public /* synthetic */ HorizontalColumnItem(String str, String str2, int i12, String str3, UniversalColor universalColor, int i13, C42822w c42822w) {
        this(str, str2, i12, str3, (i13 & 16) != 0 ? null : universalColor);
    }
}
