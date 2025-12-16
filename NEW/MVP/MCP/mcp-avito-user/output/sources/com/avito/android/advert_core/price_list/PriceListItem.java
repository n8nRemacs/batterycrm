package com.avito.android.advert_core.price_list;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.advert_core.advert.BlockItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PriceListBaseItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/price_list/PriceListItem;", "Lcom/avito/android/advert_core/price_list/PriceListBaseItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PriceListItem extends PriceListBaseItem {

    @k
    public static final Parcelable.Creator<PriceListItem> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f84025c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f84026d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f84027e;

    /* renamed from: f, reason: collision with root package name */
    public final int f84028f;

    /* compiled from: PriceListBaseItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PriceListItem> {
        @Override // android.os.Parcelable.Creator
        public final PriceListItem createFromParcel(Parcel parcel) {
            return new PriceListItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PriceListItem[] newArray(int i12) {
            return new PriceListItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PriceListItem(@k String str, @k String str2, @k String str3, int i12) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        this.f84025c = str;
        this.f84026d = str2;
        this.f84027e = str3;
        this.f84028f = i12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new PriceListItem(this.f84025c, this.f84026d, this.f84027e, i12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceListItem)) {
            return false;
        }
        PriceListItem priceListItem = (PriceListItem) obj;
        return L.f(this.f84025c, priceListItem.f84025c) && L.f(this.f84026d, priceListItem.f84026d) && L.f(this.f84027e, priceListItem.f84027e) && this.f84028f == priceListItem.f84028f;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF80598d() {
        return this.f84028f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF296503b() {
        return this.f84025c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f84028f) + H.d(H.d(this.f84025c.hashCode() * 31, 31, this.f84026d), 31, this.f84027e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceListItem(stringId=");
        sb2.append(this.f84025c);
        sb2.append(", name=");
        sb2.append(this.f84026d);
        sb2.append(", price=");
        sb2.append(this.f84027e);
        sb2.append(", spanCount=");
        return r.t(sb2, this.f84028f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f84025c);
        parcel.writeString(this.f84026d);
        parcel.writeString(this.f84027e);
        parcel.writeInt(this.f84028f);
    }
}
