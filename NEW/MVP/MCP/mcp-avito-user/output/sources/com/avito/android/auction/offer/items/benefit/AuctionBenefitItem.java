package com.avito.android.auction.offer.items.benefit;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalImage;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuctionBenefitItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/offer/items/benefit/AuctionBenefitItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AuctionBenefitItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<AuctionBenefitItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f92534b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f92535c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f92536d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalImage f92537e;

    /* compiled from: AuctionBenefitItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AuctionBenefitItem> {
        @Override // android.os.Parcelable.Creator
        public final AuctionBenefitItem createFromParcel(Parcel parcel) {
            return new AuctionBenefitItem(parcel.readInt(), parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(AuctionBenefitItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AuctionBenefitItem[] newArray(int i12) {
            return new AuctionBenefitItem[i12];
        }
    }

    public AuctionBenefitItem(int i12, @l String str, @l String str2, @l UniversalImage universalImage) {
        this.f92534b = i12;
        this.f92535c = str;
        this.f92536d = str2;
        this.f92537e = universalImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionBenefitItem)) {
            return false;
        }
        AuctionBenefitItem auctionBenefitItem = (AuctionBenefitItem) obj;
        return this.f92534b == auctionBenefitItem.f92534b && L.f(this.f92535c, auctionBenefitItem.f92535c) && L.f(this.f92536d, auctionBenefitItem.f92536d) && L.f(this.f92537e, auctionBenefitItem.f92537e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF331197i() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AuctionBenefitItem.class);
        sb2.append('_');
        sb2.append(this.f92534b);
        return sb2.toString();
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f92534b) * 31;
        String str = this.f92535c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f92536d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalImage universalImage = this.f92537e;
        return iHashCode3 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AuctionBenefitItem(index=");
        sb2.append(this.f92534b);
        sb2.append(", title=");
        sb2.append(this.f92535c);
        sb2.append(", description=");
        sb2.append(this.f92536d);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f92537e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f92534b);
        parcel.writeString(this.f92535c);
        parcel.writeString(this.f92536d);
        parcel.writeParcelable(this.f92537e, i12);
    }
}
