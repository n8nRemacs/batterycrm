package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: AuctionDetailsBottomSheetLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/AuctionDetailsBottomSheetLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class AuctionDetailsBottomSheetLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<AuctionDetailsBottomSheetLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AuctionDetails f133017b;

    /* compiled from: AuctionDetailsBottomSheetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AuctionDetailsBottomSheetLink> {
        @Override // android.os.Parcelable.Creator
        public final AuctionDetailsBottomSheetLink createFromParcel(Parcel parcel) {
            return new AuctionDetailsBottomSheetLink(AuctionDetails.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AuctionDetailsBottomSheetLink[] newArray(int i12) {
            return new AuctionDetailsBottomSheetLink[i12];
        }
    }

    public AuctionDetailsBottomSheetLink(@Y61.k AuctionDetails auctionDetails) {
        this.f133017b = auctionDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuctionDetailsBottomSheetLink) && kotlin.jvm.internal.L.f(this.f133017b, ((AuctionDetailsBottomSheetLink) obj).f133017b);
    }

    public final int hashCode() {
        return this.f133017b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "AuctionDetailsBottomSheetLink(details=" + this.f133017b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f133017b.writeToParcel(parcel, i12);
    }
}
