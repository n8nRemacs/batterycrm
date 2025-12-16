package com.avito.android.auction.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuctionOfferResponse.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/auction/remote/model/AuctionOfferResponse;", "Landroid/os/Parcelable;", "", SearchParamsConverterKt.LOCATION_ID, "title", "", "Lcom/avito/android/auction/remote/model/AuctionBenefit;", "benefits", "Lcom/avito/android/auction/remote/model/AuctionFooter;", "footer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/auction/remote/model/AuctionFooter;)V", "Ljava/lang/String;", "getLocationId", "()Ljava/lang/String;", "getTitle", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/auction/remote/model/AuctionFooter;", "d", "()Lcom/avito/android/auction/remote/model/AuctionFooter;", "_avito-discouraged_avito-api_auction"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AuctionOfferResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<AuctionOfferResponse> CREATOR = new a();

    @c("benefits")
    @l
    private final List<AuctionBenefit> benefits;

    @c("footer")
    @l
    private final AuctionFooter footer;

    @c(SearchParamsConverterKt.LOCATION_ID)
    @l
    private final String locationId;

    @c("title")
    @l
    private final String title;

    /* compiled from: AuctionOfferResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AuctionOfferResponse> {
        @Override // android.os.Parcelable.Creator
        public final AuctionOfferResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AuctionBenefit.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new AuctionOfferResponse(string, string2, arrayList, parcel.readInt() != 0 ? AuctionFooter.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AuctionOfferResponse[] newArray(int i12) {
            return new AuctionOfferResponse[i12];
        }
    }

    public AuctionOfferResponse(@l String str, @l String str2, @l List<AuctionBenefit> list, @l AuctionFooter auctionFooter) {
        this.locationId = str;
        this.title = str2;
        this.benefits = list;
        this.footer = auctionFooter;
    }

    @l
    public final List<AuctionBenefit> c() {
        return this.benefits;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AuctionFooter getFooter() {
        return this.footer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionOfferResponse)) {
            return false;
        }
        AuctionOfferResponse auctionOfferResponse = (AuctionOfferResponse) obj;
        return L.f(this.locationId, auctionOfferResponse.locationId) && L.f(this.title, auctionOfferResponse.title) && L.f(this.benefits, auctionOfferResponse.benefits) && L.f(this.footer, auctionOfferResponse.footer);
    }

    @l
    public final String getLocationId() {
        return this.locationId;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.locationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AuctionBenefit> list = this.benefits;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        AuctionFooter auctionFooter = this.footer;
        return iHashCode3 + (auctionFooter != null ? auctionFooter.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AuctionOfferResponse(locationId=" + this.locationId + ", title=" + this.title + ", benefits=" + this.benefits + ", footer=" + this.footer + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.locationId);
        parcel.writeString(this.title);
        List<AuctionBenefit> list = this.benefits;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AuctionBenefit) itA.next()).writeToParcel(parcel, i12);
            }
        }
        AuctionFooter auctionFooter = this.footer;
        if (auctionFooter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            auctionFooter.writeToParcel(parcel, i12);
        }
    }
}
