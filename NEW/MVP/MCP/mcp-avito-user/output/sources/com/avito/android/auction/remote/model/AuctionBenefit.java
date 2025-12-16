package com.avito.android.auction.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalImage;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuctionOfferResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/auction/remote/model/AuctionBenefit;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "_avito-discouraged_avito-api_auction"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AuctionBenefit implements Parcelable {

    @k
    public static final Parcelable.Creator<AuctionBenefit> CREATOR = new a();

    @c("description")
    @l
    private final String description;

    @c("image")
    @l
    private final UniversalImage image;

    @c("title")
    @l
    private final String title;

    /* compiled from: AuctionOfferResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AuctionBenefit> {
        @Override // android.os.Parcelable.Creator
        public final AuctionBenefit createFromParcel(Parcel parcel) {
            return new AuctionBenefit(parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(AuctionBenefit.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AuctionBenefit[] newArray(int i12) {
            return new AuctionBenefit[i12];
        }
    }

    public AuctionBenefit(@l String str, @l String str2, @l UniversalImage universalImage) {
        this.title = str;
        this.description = str2;
        this.image = universalImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionBenefit)) {
            return false;
        }
        AuctionBenefit auctionBenefit = (AuctionBenefit) obj;
        return L.f(this.title, auctionBenefit.title) && L.f(this.description, auctionBenefit.description) && L.f(this.image, auctionBenefit.image);
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        return iHashCode2 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AuctionBenefit(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.image, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.image, i12);
    }
}
