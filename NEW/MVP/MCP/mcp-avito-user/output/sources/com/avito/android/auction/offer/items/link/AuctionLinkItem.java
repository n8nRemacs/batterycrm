package com.avito.android.auction.offer.items.link;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AuctionLinkItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/offer/items/link/AuctionLinkItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AuctionLinkItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<AuctionLinkItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f92545b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f92546c;

    /* compiled from: AuctionLinkItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AuctionLinkItem> {
        @Override // android.os.Parcelable.Creator
        public final AuctionLinkItem createFromParcel(Parcel parcel) {
            return new AuctionLinkItem(parcel.readString(), (AttributedText) parcel.readParcelable(AuctionLinkItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AuctionLinkItem[] newArray(int i12) {
            return new AuctionLinkItem[i12];
        }
    }

    public AuctionLinkItem(@k String str, @k AttributedText attributedText) {
        this.f92545b = str;
        this.f92546c = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionLinkItem)) {
            return false;
        }
        AuctionLinkItem auctionLinkItem = (AuctionLinkItem) obj;
        return L.f(this.f92545b, auctionLinkItem.f92545b) && L.f(this.f92546c, auctionLinkItem.f92546c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF97044b() {
        return this.f92545b;
    }

    public final int hashCode() {
        return this.f92546c.hashCode() + (this.f92545b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AuctionLinkItem(stringId=");
        sb2.append(this.f92545b);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f92546c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f92545b);
        parcel.writeParcelable(this.f92546c, i12);
    }

    public /* synthetic */ AuctionLinkItem(String str, AttributedText attributedText, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "AuctionLinkItem" : str, attributedText);
    }
}
