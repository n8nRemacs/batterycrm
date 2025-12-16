package com.avito.android.advert.item.fmp.products;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.fmp.AnalyticsEvent;
import com.avito.android.remote.fmp.EnumPosition;
import com.avito.android.remote.fmp.Margin;
import com.avito.android.remote.fmp.Padding;
import com.avito.android.remote.fmp.Size;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsFmpProductsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/fmp/products/AdvertDetailsFmpProductsItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsFmpProductsItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsFmpProductsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final List<Tile> f75557b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final MortgageTile f75558c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Padding f75559d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Margin f75560e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Size f75561f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final EnumPosition f75562g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final List<AnalyticsEvent> f75563h;

    /* renamed from: i, reason: collision with root package name */
    public final long f75564i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f75565j;

    /* renamed from: k, reason: collision with root package name */
    public final int f75566k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f75567l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f75568m;

    /* compiled from: AdvertDetailsFmpProductsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsFmpProductsItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsFmpProductsItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Tile.CREATOR, parcel, arrayList3, iC2, 1);
                }
                arrayList = arrayList3;
            }
            MortgageTile mortgageTileCreateFromParcel = parcel.readInt() == 0 ? null : MortgageTile.CREATOR.createFromParcel(parcel);
            Padding padding = (Padding) parcel.readParcelable(AdvertDetailsFmpProductsItem.class.getClassLoader());
            Margin margin = (Margin) parcel.readParcelable(AdvertDetailsFmpProductsItem.class.getClassLoader());
            Size size = (Size) parcel.readParcelable(AdvertDetailsFmpProductsItem.class.getClassLoader());
            EnumPosition enumPosition = (EnumPosition) parcel.readParcelable(AdvertDetailsFmpProductsItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsFmpProductsItem.class, parcel, arrayList4, iL2, 1);
                }
                arrayList2 = arrayList4;
            }
            return new AdvertDetailsFmpProductsItem(arrayList, mortgageTileCreateFromParcel, padding, margin, size, enumPosition, arrayList2, parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsFmpProductsItem[] newArray(int i12) {
            return new AdvertDetailsFmpProductsItem[i12];
        }
    }

    public AdvertDetailsFmpProductsItem(@Y61.l List<Tile> list, @Y61.l MortgageTile mortgageTile, @Y61.l Padding padding, @Y61.l Margin margin, @Y61.l Size size, @Y61.l EnumPosition enumPosition, @Y61.l List<AnalyticsEvent> list2, long j12, @Y61.k String str, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f75557b = list;
        this.f75558c = mortgageTile;
        this.f75559d = padding;
        this.f75560e = margin;
        this.f75561f = size;
        this.f75562g = enumPosition;
        this.f75563h = list2;
        this.f75564i = j12;
        this.f75565j = str;
        this.f75566k = i12;
        this.f75567l = serpDisplayType;
        this.f75568m = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsFmpProductsItem(this.f75557b, this.f75558c, this.f75559d, this.f75560e, this.f75561f, this.f75562g, this.f75563h, this.f75564i, this.f75565j, i12, this.f75567l, this.f75568m);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f75567l = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsFmpProductsItem)) {
            return false;
        }
        AdvertDetailsFmpProductsItem advertDetailsFmpProductsItem = (AdvertDetailsFmpProductsItem) obj;
        return L.f(this.f75557b, advertDetailsFmpProductsItem.f75557b) && L.f(this.f75558c, advertDetailsFmpProductsItem.f75558c) && L.f(this.f75559d, advertDetailsFmpProductsItem.f75559d) && L.f(this.f75560e, advertDetailsFmpProductsItem.f75560e) && L.f(this.f75561f, advertDetailsFmpProductsItem.f75561f) && this.f75562g == advertDetailsFmpProductsItem.f75562g && L.f(this.f75563h, advertDetailsFmpProductsItem.f75563h) && this.f75564i == advertDetailsFmpProductsItem.f75564i && L.f(this.f75565j, advertDetailsFmpProductsItem.f75565j) && this.f75566k == advertDetailsFmpProductsItem.f75566k && this.f75567l == advertDetailsFmpProductsItem.f75567l && this.f75568m == advertDetailsFmpProductsItem.f75568m;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF83624b() {
        return this.f75564i;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF264948c() {
        return this.f75566k;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF324032b() {
        return this.f75565j;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF264884g() {
        return this.f75568m;
    }

    public final int hashCode() {
        List<Tile> list = this.f75557b;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        MortgageTile mortgageTile = this.f75558c;
        int iHashCode2 = (iHashCode + (mortgageTile == null ? 0 : mortgageTile.hashCode())) * 31;
        Padding padding = this.f75559d;
        int iHashCode3 = (iHashCode2 + (padding == null ? 0 : padding.hashCode())) * 31;
        Margin margin = this.f75560e;
        int iHashCode4 = (iHashCode3 + (margin == null ? 0 : margin.hashCode())) * 31;
        Size size = this.f75561f;
        int iHashCode5 = (iHashCode4 + (size == null ? 0 : size.hashCode())) * 31;
        EnumPosition enumPosition = this.f75562g;
        int iHashCode6 = (iHashCode5 + (enumPosition == null ? 0 : enumPosition.hashCode())) * 31;
        List<AnalyticsEvent> list2 = this.f75563h;
        return this.f75568m.hashCode() + com.avito.android.actions_sheet.a.h(this.f75567l, r.e(this.f75566k, H.d(r.g((iHashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31, 31, this.f75564i), 31, this.f75565j), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsFmpProductsItem(tiles=");
        sb2.append(this.f75557b);
        sb2.append(", mortgageTile=");
        sb2.append(this.f75558c);
        sb2.append(", padding=");
        sb2.append(this.f75559d);
        sb2.append(", margin=");
        sb2.append(this.f75560e);
        sb2.append(", size=");
        sb2.append(this.f75561f);
        sb2.append(", position=");
        sb2.append(this.f75562g);
        sb2.append(", onAppear=");
        sb2.append(this.f75563h);
        sb2.append(", id=");
        sb2.append(this.f75564i);
        sb2.append(", stringId=");
        sb2.append(this.f75565j);
        sb2.append(", spanCount=");
        sb2.append(this.f75566k);
        sb2.append(", displayType=");
        sb2.append(this.f75567l);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f75568m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        List<Tile> list = this.f75557b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Tile) itA.next()).writeToParcel(parcel, i12);
            }
        }
        MortgageTile mortgageTile = this.f75558c;
        if (mortgageTile == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mortgageTile.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f75559d, i12);
        parcel.writeParcelable(this.f75560e, i12);
        parcel.writeParcelable(this.f75561f, i12);
        parcel.writeParcelable(this.f75562g, i12);
        List<AnalyticsEvent> list2 = this.f75563h;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        parcel.writeLong(this.f75564i);
        parcel.writeString(this.f75565j);
        parcel.writeInt(this.f75566k);
        parcel.writeString(this.f75567l.name());
        parcel.writeString(this.f75568m.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsFmpProductsItem(List list, MortgageTile mortgageTile, Padding padding, Margin margin, Size size, EnumPosition enumPosition, List list2, long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 128) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 184;
        } else {
            j13 = j12;
        }
        this(list, mortgageTile, padding, margin, size, enumPosition, list2, j13, (i13 & 256) != 0 ? String.valueOf(j13) : str, i12, (i13 & 1024) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 2048) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
