package com.avito.android.auction.offer.items.title;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AuctionTitleItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/offer/items/title/AuctionTitleItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AuctionTitleItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<AuctionTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f92556b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f92557c;

    /* compiled from: AuctionTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AuctionTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final AuctionTitleItem createFromParcel(Parcel parcel) {
            return new AuctionTitleItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuctionTitleItem[] newArray(int i12) {
            return new AuctionTitleItem[i12];
        }
    }

    public AuctionTitleItem(@k String str, @k String str2) {
        this.f92556b = str;
        this.f92557c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionTitleItem)) {
            return false;
        }
        AuctionTitleItem auctionTitleItem = (AuctionTitleItem) obj;
        return L.f(this.f92556b, auctionTitleItem.f92556b) && L.f(this.f92557c, auctionTitleItem.f92557c);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF88732b() {
        return this.f92556b;
    }

    public final int hashCode() {
        return this.f92557c.hashCode() + (this.f92556b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AuctionTitleItem(stringId=");
        sb2.append(this.f92556b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f92557c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f92556b);
        parcel.writeString(this.f92557c);
    }

    public /* synthetic */ AuctionTitleItem(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "AuctionTitleItem" : str, str2);
    }
}
