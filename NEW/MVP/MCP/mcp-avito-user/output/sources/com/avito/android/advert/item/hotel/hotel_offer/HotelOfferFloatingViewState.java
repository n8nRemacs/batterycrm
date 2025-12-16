package com.avito.android.advert.item.hotel.hotel_offer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.hotel.model.HotelActionButton;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HotelOfferState.kt */
@P
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState;", "Landroid/os/Parcelable;", "ErrorRequest", "HasOffer", "HasOffers", "Loading", "NoBookingInfo", "OfferNotFound", "OfferNotRequested", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState$ErrorRequest;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState$HasOffer;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState$HasOffers;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState$Loading;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState$NoBookingInfo;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState$OfferNotFound;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState$OfferNotRequested;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class HotelOfferFloatingViewState implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final HotelActionButton f75888b;

    /* compiled from: HotelOfferState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState$ErrorRequest;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ErrorRequest extends HotelOfferFloatingViewState {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final ErrorRequest f75889c = new ErrorRequest();

        @Y61.k
        public static final Parcelable.Creator<ErrorRequest> CREATOR = new a();

        /* compiled from: HotelOfferState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ErrorRequest> {
            @Override // android.os.Parcelable.Creator
            public final ErrorRequest createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ErrorRequest.f75889c;
            }

            @Override // android.os.Parcelable.Creator
            public final ErrorRequest[] newArray(int i12) {
                return new ErrorRequest[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ErrorRequest() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof ErrorRequest);
        }

        public final int hashCode() {
            return -1543452358;
        }

        @Y61.k
        public final String toString() {
            return "ErrorRequest";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: HotelOfferState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState$HasOffer;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class HasOffer extends HotelOfferFloatingViewState {

        @Y61.k
        public static final Parcelable.Creator<HasOffer> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final HotelActionButton f75890c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Image f75891d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final AttributedText f75892e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final AttributedText f75893f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final List<Image> f75894g;

        /* compiled from: HotelOfferState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HasOffer> {
            @Override // android.os.Parcelable.Creator
            public final HasOffer createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                HotelActionButton hotelActionButton = (HotelActionButton) parcel.readParcelable(HasOffer.class.getClassLoader());
                Image image = (Image) parcel.readParcelable(HasOffer.class.getClassLoader());
                AttributedText attributedText = (AttributedText) parcel.readParcelable(HasOffer.class.getClassLoader());
                AttributedText attributedText2 = (AttributedText) parcel.readParcelable(HasOffer.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(HasOffer.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new HasOffer(hotelActionButton, image, attributedText, attributedText2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final HasOffer[] newArray(int i12) {
                return new HasOffer[i12];
            }
        }

        public HasOffer(@Y61.l HotelActionButton hotelActionButton, @Y61.l Image image, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l List<Image> list) {
            super(hotelActionButton, null);
            this.f75890c = hotelActionButton;
            this.f75891d = image;
            this.f75892e = attributedText;
            this.f75893f = attributedText2;
            this.f75894g = list;
        }

        @Override // com.avito.android.advert.item.hotel.hotel_offer.HotelOfferFloatingViewState
        @Y61.l
        /* renamed from: c, reason: from getter */
        public final HotelActionButton getF75888b() {
            return this.f75890c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HasOffer)) {
                return false;
            }
            HasOffer hasOffer = (HasOffer) obj;
            return L.f(this.f75890c, hasOffer.f75890c) && L.f(this.f75891d, hasOffer.f75891d) && L.f(this.f75892e, hasOffer.f75892e) && L.f(this.f75893f, hasOffer.f75893f) && L.f(this.f75894g, hasOffer.f75894g);
        }

        public final int hashCode() {
            HotelActionButton hotelActionButton = this.f75890c;
            int iHashCode = (hotelActionButton == null ? 0 : hotelActionButton.hashCode()) * 31;
            Image image = this.f75891d;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            AttributedText attributedText = this.f75892e;
            int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            AttributedText attributedText2 = this.f75893f;
            int iHashCode4 = (iHashCode3 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
            List<Image> list = this.f75894g;
            return iHashCode4 + (list != null ? list.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HasOffer(actionButton=");
            sb2.append(this.f75890c);
            sb2.append(", image=");
            sb2.append(this.f75891d);
            sb2.append(", price=");
            sb2.append(this.f75892e);
            sb2.append(", description=");
            sb2.append(this.f75893f);
            sb2.append(", images=");
            return H.p(sb2, this.f75894g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f75890c, i12);
            parcel.writeParcelable(this.f75891d, i12);
            parcel.writeParcelable(this.f75892e, i12);
            parcel.writeParcelable(this.f75893f, i12);
            List<Image> list = this.f75894g;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
    }

    /* compiled from: HotelOfferState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState$HasOffers;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class HasOffers extends HotelOfferFloatingViewState {

        @Y61.k
        public static final Parcelable.Creator<HasOffers> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final HotelActionButton f75895c;

        /* compiled from: HotelOfferState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HasOffers> {
            @Override // android.os.Parcelable.Creator
            public final HasOffers createFromParcel(Parcel parcel) {
                return new HasOffers((HotelActionButton) parcel.readParcelable(HasOffers.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final HasOffers[] newArray(int i12) {
                return new HasOffers[i12];
            }
        }

        public HasOffers(@Y61.l HotelActionButton hotelActionButton) {
            super(hotelActionButton, null);
            this.f75895c = hotelActionButton;
        }

        @Override // com.avito.android.advert.item.hotel.hotel_offer.HotelOfferFloatingViewState
        @Y61.l
        /* renamed from: c, reason: from getter */
        public final HotelActionButton getF75888b() {
            return this.f75895c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HasOffers) && L.f(this.f75895c, ((HasOffers) obj).f75895c);
        }

        public final int hashCode() {
            HotelActionButton hotelActionButton = this.f75895c;
            if (hotelActionButton == null) {
                return 0;
            }
            return hotelActionButton.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "HasOffers(actionButton=" + this.f75895c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f75895c, i12);
        }
    }

    /* compiled from: HotelOfferState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState$Loading;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Loading extends HotelOfferFloatingViewState {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final Loading f75896c = new Loading();

        @Y61.k
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* compiled from: HotelOfferState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Loading.f75896c;
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i12) {
                return new Loading[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loading() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 2134892425;
        }

        @Y61.k
        public final String toString() {
            return "Loading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: HotelOfferState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState$NoBookingInfo;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class NoBookingInfo extends HotelOfferFloatingViewState {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final NoBookingInfo f75897c = new NoBookingInfo();

        @Y61.k
        public static final Parcelable.Creator<NoBookingInfo> CREATOR = new a();

        /* compiled from: HotelOfferState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NoBookingInfo> {
            @Override // android.os.Parcelable.Creator
            public final NoBookingInfo createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NoBookingInfo.f75897c;
            }

            @Override // android.os.Parcelable.Creator
            public final NoBookingInfo[] newArray(int i12) {
                return new NoBookingInfo[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NoBookingInfo() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof NoBookingInfo);
        }

        public final int hashCode() {
            return 1922401459;
        }

        @Y61.k
        public final String toString() {
            return "NoBookingInfo";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: HotelOfferState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState$OfferNotFound;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class OfferNotFound extends HotelOfferFloatingViewState {

        @Y61.k
        public static final Parcelable.Creator<OfferNotFound> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final HotelActionButton f75898c;

        /* compiled from: HotelOfferState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OfferNotFound> {
            @Override // android.os.Parcelable.Creator
            public final OfferNotFound createFromParcel(Parcel parcel) {
                return new OfferNotFound((HotelActionButton) parcel.readParcelable(OfferNotFound.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OfferNotFound[] newArray(int i12) {
                return new OfferNotFound[i12];
            }
        }

        public OfferNotFound(@Y61.k HotelActionButton hotelActionButton) {
            super(hotelActionButton, null);
            this.f75898c = hotelActionButton;
        }

        @Override // com.avito.android.advert.item.hotel.hotel_offer.HotelOfferFloatingViewState
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final HotelActionButton getF75888b() {
            return this.f75898c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OfferNotFound) && L.f(this.f75898c, ((OfferNotFound) obj).f75898c);
        }

        public final int hashCode() {
            return this.f75898c.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OfferNotFound(actionButton=" + this.f75898c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f75898c, i12);
        }
    }

    /* compiled from: HotelOfferState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState$OfferNotRequested;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferFloatingViewState;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class OfferNotRequested extends HotelOfferFloatingViewState {

        @Y61.k
        public static final Parcelable.Creator<OfferNotRequested> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final HotelActionButton f75899c;

        /* compiled from: HotelOfferState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OfferNotRequested> {
            @Override // android.os.Parcelable.Creator
            public final OfferNotRequested createFromParcel(Parcel parcel) {
                return new OfferNotRequested((HotelActionButton) parcel.readParcelable(OfferNotRequested.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OfferNotRequested[] newArray(int i12) {
                return new OfferNotRequested[i12];
            }
        }

        public OfferNotRequested(@Y61.k HotelActionButton hotelActionButton) {
            super(hotelActionButton, null);
            this.f75899c = hotelActionButton;
        }

        @Override // com.avito.android.advert.item.hotel.hotel_offer.HotelOfferFloatingViewState
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final HotelActionButton getF75888b() {
            return this.f75899c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OfferNotRequested) && L.f(this.f75899c, ((OfferNotRequested) obj).f75899c);
        }

        public final int hashCode() {
            return this.f75899c.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OfferNotRequested(actionButton=" + this.f75899c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f75899c, i12);
        }
    }

    public /* synthetic */ HotelOfferFloatingViewState(HotelActionButton hotelActionButton, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : hotelActionButton, null);
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public HotelActionButton getF75888b() {
        return this.f75888b;
    }

    public HotelOfferFloatingViewState(HotelActionButton hotelActionButton, C42822w c42822w) {
        this.f75888b = hotelActionButton;
    }
}
