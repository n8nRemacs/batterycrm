package com.avito.android.advert_core.price_list;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_core.price_list.v2.AdvertPriceListV2Item;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PriceListBaseItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/price_list/AdvertPriceListSectionItem;", "Lcom/avito/android/advert_core/price_list/PriceListBaseItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertPriceListSectionItem extends PriceListBaseItem {

    @k
    public static final Parcelable.Creator<AdvertPriceListSectionItem> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f84010c;

    /* renamed from: d, reason: collision with root package name */
    public final int f84011d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f84012e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f84013f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f84014g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<AdvertPriceListV2Item> f84015h;

    /* compiled from: PriceListBaseItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertPriceListSectionItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertPriceListSectionItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(AdvertPriceListV2Item.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AdvertPriceListSectionItem(i12, string, string2, arrayList, z12, z13);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertPriceListSectionItem[] newArray(int i12) {
            return new AdvertPriceListSectionItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvertPriceListSectionItem(int i12, @k String str, @l String str2, @k List list, boolean z12, boolean z13) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        this.f84010c = str;
        this.f84011d = i12;
        this.f84012e = str2;
        this.f84013f = z12;
        this.f84014g = z13;
        this.f84015h = list;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        boolean z12 = this.f84013f;
        return new AdvertPriceListSectionItem(i12, this.f84010c, this.f84012e, this.f84015h, z12, this.f84014g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertPriceListSectionItem)) {
            return false;
        }
        AdvertPriceListSectionItem advertPriceListSectionItem = (AdvertPriceListSectionItem) obj;
        return L.f(this.f84010c, advertPriceListSectionItem.f84010c) && this.f84011d == advertPriceListSectionItem.f84011d && L.f(this.f84012e, advertPriceListSectionItem.f84012e) && this.f84013f == advertPriceListSectionItem.f84013f && this.f84014g == advertPriceListSectionItem.f84014g && L.f(this.f84015h, advertPriceListSectionItem.f84015h);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79339d() {
        return this.f84011d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF83382b() {
        return this.f84010c;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f84011d, this.f84010c.hashCode() * 31, 31);
        String str = this.f84012e;
        return this.f84015h.hashCode() + r.i(r.i((iE2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f84013f), 31, this.f84014g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertPriceListSectionItem(stringId=");
        sb2.append(this.f84010c);
        sb2.append(", spanCount=");
        sb2.append(this.f84011d);
        sb2.append(", title=");
        sb2.append(this.f84012e);
        sb2.append(", isExpand=");
        sb2.append(this.f84013f);
        sb2.append(", areGroupsCollapsible=");
        sb2.append(this.f84014g);
        sb2.append(", items=");
        return H.p(sb2, this.f84015h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f84010c);
        parcel.writeInt(this.f84011d);
        parcel.writeString(this.f84012e);
        parcel.writeInt(this.f84013f ? 1 : 0);
        parcel.writeInt(this.f84014g ? 1 : 0);
        Iterator itJ = C0.j(this.f84015h, parcel);
        while (itJ.hasNext()) {
            ((AdvertPriceListV2Item) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
