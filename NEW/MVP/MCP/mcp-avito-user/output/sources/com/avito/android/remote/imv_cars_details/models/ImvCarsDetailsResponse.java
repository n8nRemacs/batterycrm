package com.avito.android.remote.imv_cars_details.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.PricePoll;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/avito/android/remote/imv_cars_details/models/ImvCarsDetailsResponse;", "Landroid/os/Parcelable;", "", "navigationTitle", "anchorSubtitleText", "subtitle", "title", "Lcom/avito/android/remote/imv_cars_details/models/ImvCarsDetails;", "imv", "Lcom/avito/android/remote/imv_cars_details/models/MarketPriceDynamics;", "marketPriceDynamics", "Lcom/avito/android/remote/imv_cars_details/models/Neighbors;", "neighbors", "Lcom/avito/android/remote/model/PricePoll;", "pricePoll", "Lcom/avito/android/remote/imv_cars_details/models/PriceComment;", "priceComment", "Lcom/avito/android/remote/imv_cars_details/models/ImvCarsDetailsAutotekaTeaser;", "autotekaTeaser", "Lcom/avito/android/remote/imv_cars_details/models/DifferenceImvAvgPrice;", "differenceImvAvgPrice", "Lcom/avito/android/remote/imv_cars_details/models/AffectingParams;", "affectingParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/imv_cars_details/models/ImvCarsDetails;Lcom/avito/android/remote/imv_cars_details/models/MarketPriceDynamics;Lcom/avito/android/remote/imv_cars_details/models/Neighbors;Lcom/avito/android/remote/model/PricePoll;Lcom/avito/android/remote/imv_cars_details/models/PriceComment;Lcom/avito/android/remote/imv_cars_details/models/ImvCarsDetailsAutotekaTeaser;Lcom/avito/android/remote/imv_cars_details/models/DifferenceImvAvgPrice;Lcom/avito/android/remote/imv_cars_details/models/AffectingParams;)V", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "d", "getSubtitle", "getTitle", "Lcom/avito/android/remote/imv_cars_details/models/ImvCarsDetails;", "g", "()Lcom/avito/android/remote/imv_cars_details/models/ImvCarsDetails;", "Lcom/avito/android/remote/imv_cars_details/models/MarketPriceDynamics;", "h", "()Lcom/avito/android/remote/imv_cars_details/models/MarketPriceDynamics;", "Lcom/avito/android/remote/imv_cars_details/models/Neighbors;", "j", "()Lcom/avito/android/remote/imv_cars_details/models/Neighbors;", "Lcom/avito/android/remote/model/PricePoll;", "l", "()Lcom/avito/android/remote/model/PricePoll;", "Lcom/avito/android/remote/imv_cars_details/models/PriceComment;", "k", "()Lcom/avito/android/remote/imv_cars_details/models/PriceComment;", "Lcom/avito/android/remote/imv_cars_details/models/ImvCarsDetailsAutotekaTeaser;", "e", "()Lcom/avito/android/remote/imv_cars_details/models/ImvCarsDetailsAutotekaTeaser;", "Lcom/avito/android/remote/imv_cars_details/models/DifferenceImvAvgPrice;", "f", "()Lcom/avito/android/remote/imv_cars_details/models/DifferenceImvAvgPrice;", "Lcom/avito/android/remote/imv_cars_details/models/AffectingParams;", "c", "()Lcom/avito/android/remote/imv_cars_details/models/AffectingParams;", "_avito-discouraged_avito-api_imv-cars-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImvCarsDetailsResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<ImvCarsDetailsResponse> CREATOR = new a();

    @c("affectingParams")
    @l
    private final AffectingParams affectingParams;

    @c("anchorSubtitleText")
    @l
    private final String anchorSubtitleText;

    @c("autotekaTeaser")
    @l
    private final ImvCarsDetailsAutotekaTeaser autotekaTeaser;

    @c("differenceImvAvgPrice")
    @l
    private final DifferenceImvAvgPrice differenceImvAvgPrice;

    @c("imv")
    @k
    private final ImvCarsDetails imv;

    @c("marketPriceDynamics")
    @l
    private final MarketPriceDynamics marketPriceDynamics;

    @c("navigationTitle")
    @l
    private final String navigationTitle;

    @c("neighbors")
    @l
    private final Neighbors neighbors;

    @c("priceComment")
    @l
    private final PriceComment priceComment;

    @c("poll")
    @l
    private final PricePoll pricePoll;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: ImvCarsDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvCarsDetailsResponse> {
        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsResponse createFromParcel(Parcel parcel) {
            return new ImvCarsDetailsResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), ImvCarsDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MarketPriceDynamics.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Neighbors.CREATOR.createFromParcel(parcel), (PricePoll) parcel.readParcelable(ImvCarsDetailsResponse.class.getClassLoader()), parcel.readInt() == 0 ? null : PriceComment.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ImvCarsDetailsAutotekaTeaser.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DifferenceImvAvgPrice.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AffectingParams.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsResponse[] newArray(int i12) {
            return new ImvCarsDetailsResponse[i12];
        }
    }

    public ImvCarsDetailsResponse(@l String str, @l String str2, @l String str3, @l String str4, @k ImvCarsDetails imvCarsDetails, @l MarketPriceDynamics marketPriceDynamics, @l Neighbors neighbors, @l PricePoll pricePoll, @l PriceComment priceComment, @l ImvCarsDetailsAutotekaTeaser imvCarsDetailsAutotekaTeaser, @l DifferenceImvAvgPrice differenceImvAvgPrice, @l AffectingParams affectingParams) {
        this.navigationTitle = str;
        this.anchorSubtitleText = str2;
        this.subtitle = str3;
        this.title = str4;
        this.imv = imvCarsDetails;
        this.marketPriceDynamics = marketPriceDynamics;
        this.neighbors = neighbors;
        this.pricePoll = pricePoll;
        this.priceComment = priceComment;
        this.autotekaTeaser = imvCarsDetailsAutotekaTeaser;
        this.differenceImvAvgPrice = differenceImvAvgPrice;
        this.affectingParams = affectingParams;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AffectingParams getAffectingParams() {
        return this.affectingParams;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getAnchorSubtitleText() {
        return this.anchorSubtitleText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final ImvCarsDetailsAutotekaTeaser getAutotekaTeaser() {
        return this.autotekaTeaser;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImvCarsDetailsResponse)) {
            return false;
        }
        ImvCarsDetailsResponse imvCarsDetailsResponse = (ImvCarsDetailsResponse) obj;
        return L.f(this.navigationTitle, imvCarsDetailsResponse.navigationTitle) && L.f(this.anchorSubtitleText, imvCarsDetailsResponse.anchorSubtitleText) && L.f(this.subtitle, imvCarsDetailsResponse.subtitle) && L.f(this.title, imvCarsDetailsResponse.title) && L.f(this.imv, imvCarsDetailsResponse.imv) && L.f(this.marketPriceDynamics, imvCarsDetailsResponse.marketPriceDynamics) && L.f(this.neighbors, imvCarsDetailsResponse.neighbors) && L.f(this.pricePoll, imvCarsDetailsResponse.pricePoll) && L.f(this.priceComment, imvCarsDetailsResponse.priceComment) && L.f(this.autotekaTeaser, imvCarsDetailsResponse.autotekaTeaser) && L.f(this.differenceImvAvgPrice, imvCarsDetailsResponse.differenceImvAvgPrice) && L.f(this.affectingParams, imvCarsDetailsResponse.affectingParams);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final DifferenceImvAvgPrice getDifferenceImvAvgPrice() {
        return this.differenceImvAvgPrice;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final ImvCarsDetails getImv() {
        return this.imv;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final MarketPriceDynamics getMarketPriceDynamics() {
        return this.marketPriceDynamics;
    }

    public final int hashCode() {
        String str = this.navigationTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.anchorSubtitleText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode4 = (this.imv.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        MarketPriceDynamics marketPriceDynamics = this.marketPriceDynamics;
        int iHashCode5 = (iHashCode4 + (marketPriceDynamics == null ? 0 : marketPriceDynamics.hashCode())) * 31;
        Neighbors neighbors = this.neighbors;
        int iHashCode6 = (iHashCode5 + (neighbors == null ? 0 : neighbors.hashCode())) * 31;
        PricePoll pricePoll = this.pricePoll;
        int iHashCode7 = (iHashCode6 + (pricePoll == null ? 0 : pricePoll.hashCode())) * 31;
        PriceComment priceComment = this.priceComment;
        int iHashCode8 = (iHashCode7 + (priceComment == null ? 0 : priceComment.hashCode())) * 31;
        ImvCarsDetailsAutotekaTeaser imvCarsDetailsAutotekaTeaser = this.autotekaTeaser;
        int iHashCode9 = (iHashCode8 + (imvCarsDetailsAutotekaTeaser == null ? 0 : imvCarsDetailsAutotekaTeaser.hashCode())) * 31;
        DifferenceImvAvgPrice differenceImvAvgPrice = this.differenceImvAvgPrice;
        int iHashCode10 = (iHashCode9 + (differenceImvAvgPrice == null ? 0 : differenceImvAvgPrice.hashCode())) * 31;
        AffectingParams affectingParams = this.affectingParams;
        return iHashCode10 + (affectingParams != null ? affectingParams.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final Neighbors getNeighbors() {
        return this.neighbors;
    }

    @l
    /* renamed from: k, reason: from getter */
    public final PriceComment getPriceComment() {
        return this.priceComment;
    }

    @l
    /* renamed from: l, reason: from getter */
    public final PricePoll getPricePoll() {
        return this.pricePoll;
    }

    @k
    public final String toString() {
        return "ImvCarsDetailsResponse(navigationTitle=" + this.navigationTitle + ", anchorSubtitleText=" + this.anchorSubtitleText + ", subtitle=" + this.subtitle + ", title=" + this.title + ", imv=" + this.imv + ", marketPriceDynamics=" + this.marketPriceDynamics + ", neighbors=" + this.neighbors + ", pricePoll=" + this.pricePoll + ", priceComment=" + this.priceComment + ", autotekaTeaser=" + this.autotekaTeaser + ", differenceImvAvgPrice=" + this.differenceImvAvgPrice + ", affectingParams=" + this.affectingParams + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.navigationTitle);
        parcel.writeString(this.anchorSubtitleText);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.title);
        this.imv.writeToParcel(parcel, i12);
        MarketPriceDynamics marketPriceDynamics = this.marketPriceDynamics;
        if (marketPriceDynamics == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketPriceDynamics.writeToParcel(parcel, i12);
        }
        Neighbors neighbors = this.neighbors;
        if (neighbors == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            neighbors.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.pricePoll, i12);
        PriceComment priceComment = this.priceComment;
        if (priceComment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceComment.writeToParcel(parcel, i12);
        }
        ImvCarsDetailsAutotekaTeaser imvCarsDetailsAutotekaTeaser = this.autotekaTeaser;
        if (imvCarsDetailsAutotekaTeaser == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imvCarsDetailsAutotekaTeaser.writeToParcel(parcel, i12);
        }
        DifferenceImvAvgPrice differenceImvAvgPrice = this.differenceImvAvgPrice;
        if (differenceImvAvgPrice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            differenceImvAvgPrice.writeToParcel(parcel, i12);
        }
        AffectingParams affectingParams = this.affectingParams;
        if (affectingParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            affectingParams.writeToParcel(parcel, i12);
        }
    }
}
