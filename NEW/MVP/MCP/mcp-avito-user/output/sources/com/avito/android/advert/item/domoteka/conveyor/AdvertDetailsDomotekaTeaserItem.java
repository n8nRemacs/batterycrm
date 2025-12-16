package com.avito.android.advert.item.domoteka.conveyor;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsDomotekaTeaserItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/domoteka/conveyor/AdvertDetailsDomotekaTeaserItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsDomotekaTeaserItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsDomotekaTeaserItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f75240b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f75241c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f75242d;

    /* renamed from: e, reason: collision with root package name */
    public final int f75243e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f75244f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f75245g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f75246h;

    /* compiled from: AdvertDetailsDomotekaTeaserItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsDomotekaTeaserItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsDomotekaTeaserItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsDomotekaTeaserItem(parcel.readString(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsDomotekaTeaserItem[] newArray(int i12) {
            return new AdvertDetailsDomotekaTeaserItem[i12];
        }
    }

    public AdvertDetailsDomotekaTeaserItem(@Y61.k String str, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType, int i12, @Y61.k String str2, boolean z12, boolean z13) {
        this.f75240b = str;
        this.f75241c = serpDisplayType;
        this.f75242d = serpViewType;
        this.f75243e = i12;
        this.f75244f = str2;
        this.f75245g = z12;
        this.f75246h = z13;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsDomotekaTeaserItem(this.f75240b, this.f75241c, this.f75242d, i12, this.f75244f, this.f75245g, this.f75246h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f75241c = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsDomotekaTeaserItem)) {
            return false;
        }
        AdvertDetailsDomotekaTeaserItem advertDetailsDomotekaTeaserItem = (AdvertDetailsDomotekaTeaserItem) obj;
        return L.f(this.f75240b, advertDetailsDomotekaTeaserItem.f75240b) && this.f75241c == advertDetailsDomotekaTeaserItem.f75241c && this.f75242d == advertDetailsDomotekaTeaserItem.f75242d && this.f75243e == advertDetailsDomotekaTeaserItem.f75243e && L.f(this.f75244f, advertDetailsDomotekaTeaserItem.f75244f) && this.f75245g == advertDetailsDomotekaTeaserItem.f75245g && this.f75246h == advertDetailsDomotekaTeaserItem.f75246h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF75840b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75844f() {
        return this.f75243e;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283243b() {
        return this.f75240b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75842d() {
        return this.f75242d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75246h) + r.i(H.d(r.e(this.f75243e, com.avito.android.actions_sheet.a.j(this.f75242d, com.avito.android.actions_sheet.a.h(this.f75241c, this.f75240b.hashCode() * 31, 31), 31), 31), 31, this.f75244f), 31, this.f75245g);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsDomotekaTeaserItem(stringId=");
        sb2.append(this.f75240b);
        sb2.append(", displayType=");
        sb2.append(this.f75241c);
        sb2.append(", viewType=");
        sb2.append(this.f75242d);
        sb2.append(", spanCount=");
        sb2.append(this.f75243e);
        sb2.append(", advertId=");
        sb2.append(this.f75244f);
        sb2.append(", showDivider=");
        sb2.append(this.f75245g);
        sb2.append(", isRedesign=");
        return r.x(sb2, this.f75246h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f75240b);
        parcel.writeString(this.f75241c.name());
        parcel.writeString(this.f75242d.name());
        parcel.writeInt(this.f75243e);
        parcel.writeString(this.f75244f);
        parcel.writeInt(this.f75245g ? 1 : 0);
        parcel.writeInt(this.f75246h ? 1 : 0);
    }

    public /* synthetic */ AdvertDetailsDomotekaTeaserItem(String str, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i12, String str2, boolean z12, boolean z13, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? "DOMOTEKA_TEASER_ITEM" : str, (i13 & 2) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 4) != 0 ? SerpViewType.f268585e : serpViewType, i12, str2, (i13 & 32) != 0 ? false : z12, z13);
    }
}
