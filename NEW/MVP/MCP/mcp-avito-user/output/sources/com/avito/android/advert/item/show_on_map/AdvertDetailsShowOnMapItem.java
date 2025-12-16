package com.avito.android.advert.item.show_on_map;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.RouteButtons;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsShowOnMapItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/show_on_map/AdvertDetailsShowOnMapItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsShowOnMapItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsShowOnMapItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f80181b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f80182c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Coordinates f80183d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f80184e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final RouteButtons f80185f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f80186g;

    /* renamed from: h, reason: collision with root package name */
    public final int f80187h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public SerpDisplayType f80188i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SerpViewType f80189j;

    /* compiled from: AdvertDetailsShowOnMapItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsShowOnMapItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsShowOnMapItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsShowOnMapItem(parcel.readString(), parcel.readString(), (Coordinates) parcel.readParcelable(AdvertDetailsShowOnMapItem.class.getClassLoader()), parcel.readString(), (RouteButtons) parcel.readParcelable(AdvertDetailsShowOnMapItem.class.getClassLoader()), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsShowOnMapItem[] newArray(int i12) {
            return new AdvertDetailsShowOnMapItem[i12];
        }
    }

    public AdvertDetailsShowOnMapItem(@k String str, @k String str2, @k Coordinates coordinates, @k String str3, @l RouteButtons routeButtons, @l String str4, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f80181b = str;
        this.f80182c = str2;
        this.f80183d = coordinates;
        this.f80184e = str3;
        this.f80185f = routeButtons;
        this.f80186g = str4;
        this.f80187h = i12;
        this.f80188i = serpDisplayType;
        this.f80189j = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsShowOnMapItem(this.f80181b, this.f80182c, this.f80183d, this.f80184e, this.f80185f, this.f80186g, i12, this.f80188i, this.f80189j);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f80188i = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsShowOnMapItem)) {
            return false;
        }
        AdvertDetailsShowOnMapItem advertDetailsShowOnMapItem = (AdvertDetailsShowOnMapItem) obj;
        return L.f(this.f80181b, advertDetailsShowOnMapItem.f80181b) && L.f(this.f80182c, advertDetailsShowOnMapItem.f80182c) && L.f(this.f80183d, advertDetailsShowOnMapItem.f80183d) && L.f(this.f80184e, advertDetailsShowOnMapItem.f80184e) && L.f(this.f80185f, advertDetailsShowOnMapItem.f80185f) && L.f(this.f80186g, advertDetailsShowOnMapItem.f80186g) && this.f80187h == advertDetailsShowOnMapItem.f80187h && this.f80188i == advertDetailsShowOnMapItem.f80188i && this.f80189j == advertDetailsShowOnMapItem.f80189j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79636b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79640f() {
        return this.f80187h;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79637c() {
        return this.f80181b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79638d() {
        return this.f80189j;
    }

    public final int hashCode() {
        int iD2 = H.d((this.f80183d.hashCode() + H.d(this.f80181b.hashCode() * 31, 31, this.f80182c)) * 31, 31, this.f80184e);
        RouteButtons routeButtons = this.f80185f;
        int iHashCode = (iD2 + (routeButtons == null ? 0 : routeButtons.hashCode())) * 31;
        String str = this.f80186g;
        return this.f80189j.hashCode() + com.avito.android.actions_sheet.a.h(this.f80188i, r.e(this.f80187h, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsShowOnMapItem(stringId=");
        sb2.append(this.f80181b);
        sb2.append(", title=");
        sb2.append(this.f80182c);
        sb2.append(", coords=");
        sb2.append(this.f80183d);
        sb2.append(", address=");
        sb2.append(this.f80184e);
        sb2.append(", routeButtons=");
        sb2.append(this.f80185f);
        sb2.append(", showOnMapButtonTitle=");
        sb2.append(this.f80186g);
        sb2.append(", spanCount=");
        sb2.append(this.f80187h);
        sb2.append(", displayType=");
        sb2.append(this.f80188i);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f80189j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f80181b);
        parcel.writeString(this.f80182c);
        parcel.writeParcelable(this.f80183d, i12);
        parcel.writeString(this.f80184e);
        parcel.writeParcelable(this.f80185f, i12);
        parcel.writeString(this.f80186g);
        parcel.writeInt(this.f80187h);
        parcel.writeString(this.f80188i.name());
        parcel.writeString(this.f80189j.name());
    }

    public /* synthetic */ AdvertDetailsShowOnMapItem(String str, String str2, Coordinates coordinates, String str3, RouteButtons routeButtons, String str4, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(str, str2, coordinates, str3, (i13 & 16) != 0 ? null : routeButtons, str4, i12, (i13 & 128) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 256) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
