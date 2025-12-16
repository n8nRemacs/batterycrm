package com.avito.android.auction.offer;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuctionOfferParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/offer/AuctionOfferParams;", "Lcom/avito/android/util/OpenParams;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AuctionOfferParams implements OpenParams {

    @k
    public static final Parcelable.Creator<AuctionOfferParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f92443b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f92444c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f92445d;

    /* compiled from: AuctionOfferParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AuctionOfferParams> {
        @Override // android.os.Parcelable.Creator
        public final AuctionOfferParams createFromParcel(Parcel parcel) {
            return new AuctionOfferParams(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuctionOfferParams[] newArray(int i12) {
            return new AuctionOfferParams[i12];
        }
    }

    public AuctionOfferParams(@k String str, @l String str2, @l String str3) {
        this.f92443b = str;
        this.f92444c = str2;
        this.f92445d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionOfferParams)) {
            return false;
        }
        AuctionOfferParams auctionOfferParams = (AuctionOfferParams) obj;
        return L.f(this.f92443b, auctionOfferParams.f92443b) && L.f(this.f92444c, auctionOfferParams.f92444c) && L.f(this.f92445d, auctionOfferParams.f92445d);
    }

    public final int hashCode() {
        int iHashCode = this.f92443b.hashCode() * 31;
        String str = this.f92444c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f92445d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AuctionOfferParams(itemId=");
        sb2.append(this.f92443b);
        sb2.append(", fromPage=");
        sb2.append(this.f92444c);
        sb2.append(", utmSource=");
        return C22026a.c(sb2, this.f92445d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f92443b);
        parcel.writeString(this.f92444c);
        parcel.writeString(this.f92445d);
    }
}
