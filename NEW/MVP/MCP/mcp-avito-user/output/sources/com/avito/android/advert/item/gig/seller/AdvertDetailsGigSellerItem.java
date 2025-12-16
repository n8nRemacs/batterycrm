package com.avito.android.advert.item.gig.seller;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsGigSellerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/gig/seller/AdvertDetailsGigSellerItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsGigSellerItem implements BlockItem {

    @k
    public static final Parcelable.Creator<AdvertDetailsGigSellerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f75748b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f75749c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f75750d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f75751e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f75752f;

    /* compiled from: AdvertDetailsGigSellerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsGigSellerItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsGigSellerItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsGigSellerItem(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsGigSellerItem[] newArray(int i12) {
            return new AdvertDetailsGigSellerItem[i12];
        }
    }

    public AdvertDetailsGigSellerItem(@k String str, int i12, @k String str2, @l String str3, @l String str4) {
        this.f75748b = i12;
        this.f75749c = str;
        this.f75750d = str2;
        this.f75751e = str3;
        this.f75752f = str4;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsGigSellerItem(this.f75749c, i12, this.f75750d, this.f75751e, this.f75752f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsGigSellerItem)) {
            return false;
        }
        AdvertDetailsGigSellerItem advertDetailsGigSellerItem = (AdvertDetailsGigSellerItem) obj;
        return this.f75748b == advertDetailsGigSellerItem.f75748b && L.f(this.f75749c, advertDetailsGigSellerItem.f75749c) && L.f(this.f75750d, advertDetailsGigSellerItem.f75750d) && L.f(this.f75751e, advertDetailsGigSellerItem.f75751e) && L.f(this.f75752f, advertDetailsGigSellerItem.f75752f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74643b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF74645d() {
        return this.f75748b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF74644c() {
        return this.f75749c;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(Integer.hashCode(this.f75748b) * 31, 31, this.f75749c), 31, this.f75750d);
        String str = this.f75751e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f75752f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsGigSellerItem(spanCount=");
        sb2.append(this.f75748b);
        sb2.append(", stringId=");
        sb2.append(this.f75749c);
        sb2.append(", name=");
        sb2.append(this.f75750d);
        sb2.append(", count=");
        sb2.append(this.f75751e);
        sb2.append(", logoUrl=");
        return C22026a.c(sb2, this.f75752f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f75748b);
        parcel.writeString(this.f75749c);
        parcel.writeString(this.f75750d);
        parcel.writeString(this.f75751e);
        parcel.writeString(this.f75752f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsGigSellerItem(int i12, String str, String str2, String str3, String str4, int i13, C42822w c42822w) {
        if ((i13 & 2) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            str = "ITEM_GIG_SELLER";
        }
        this(str, i12, str2, str3, str4);
    }
}
