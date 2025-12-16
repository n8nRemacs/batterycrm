package com.avito.android.advert.item.hotel.hotel_offer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.hotel.hotel_offer.AdvertDetailsHotelOffer;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.hotel.model.HotelActionButton;
import com.avito.android.hotel.model.HotelOfferFilter;
import com.avito.android.hotel.model.HotelRoomOffer;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelOfferState.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState;", "Landroid/os/Parcelable;", "ErrorRequest", "HasOffer", "HasOffers", "Loading", "OfferNotFound", "OfferNotRequested", "RedesignLoading", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState$ErrorRequest;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState$HasOffer;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState$HasOffers;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState$Loading;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState$OfferNotFound;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState$OfferNotRequested;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState$RedesignLoading;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface HotelOfferViewState extends Parcelable {

    /* compiled from: HotelOfferState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState$ErrorRequest;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ErrorRequest implements HotelOfferViewState {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final ErrorRequest f75916b = new ErrorRequest();

        @Y61.k
        public static final Parcelable.Creator<ErrorRequest> CREATOR = new a();

        /* compiled from: HotelOfferState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ErrorRequest> {
            @Override // android.os.Parcelable.Creator
            public final ErrorRequest createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ErrorRequest.f75916b;
            }

            @Override // android.os.Parcelable.Creator
            public final ErrorRequest[] newArray(int i12) {
                return new ErrorRequest[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof ErrorRequest);
        }

        public final int hashCode() {
            return 281737364;
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState$HasOffer;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class HasOffer implements HotelOfferViewState {

        @Y61.k
        public static final Parcelable.Creator<HasOffer> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final HotelRoomOffer f75917b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final ArrayList f75918c;

        /* compiled from: HotelOfferState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HasOffer> {
            @Override // android.os.Parcelable.Creator
            public final HasOffer createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                HotelRoomOffer hotelRoomOffer = (HotelRoomOffer) parcel.readParcelable(HasOffer.class.getClassLoader());
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
                return new HasOffer(hotelRoomOffer, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final HasOffer[] newArray(int i12) {
                return new HasOffer[i12];
            }
        }

        public HasOffer(@Y61.k HotelRoomOffer hotelRoomOffer, @Y61.l ArrayList arrayList) {
            this.f75917b = hotelRoomOffer;
            this.f75918c = arrayList;
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
            return L.f(this.f75917b, hasOffer.f75917b) && L.f(this.f75918c, hasOffer.f75918c);
        }

        public final int hashCode() {
            int iHashCode = this.f75917b.hashCode() * 31;
            ArrayList arrayList = this.f75918c;
            return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HasOffer(offer=");
            sb2.append(this.f75917b);
            sb2.append(", actionButtons=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f75918c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f75917b, i12);
            ArrayList arrayList = this.f75918c;
            if (arrayList == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                parcel.writeParcelable((Parcelable) itY.next(), i12);
            }
        }
    }

    /* compiled from: HotelOfferState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState$HasOffers;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class HasOffers implements HotelOfferViewState {

        @Y61.k
        public static final Parcelable.Creator<HasOffers> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final AdvertDetailsHotelOffer.Action f75919b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ArrayList f75920c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final ParametrizedEvent f75921d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final AdvertDetailsHotelOffer.Action f75922e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f75923f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final PrintableText f75924g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final DeepLink f75925h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f75926i;

        /* compiled from: HotelOfferState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HasOffers> {
            @Override // android.os.Parcelable.Creator
            public final HasOffers createFromParcel(Parcel parcel) {
                AdvertDetailsHotelOffer.Action actionCreateFromParcel = parcel.readInt() == 0 ? null : AdvertDetailsHotelOffer.Action.CREATOR.createFromParcel(parcel);
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(HasOffers.class, parcel, arrayList, iL2, 1);
                }
                return new HasOffers(actionCreateFromParcel, arrayList, (ParametrizedEvent) parcel.readParcelable(HasOffers.class.getClassLoader()), AdvertDetailsHotelOffer.Action.CREATOR.createFromParcel(parcel), parcel.readString(), (PrintableText) parcel.readParcelable(HasOffers.class.getClassLoader()), (DeepLink) parcel.readParcelable(HasOffers.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final HasOffers[] newArray(int i12) {
                return new HasOffers[i12];
            }
        }

        public HasOffers(@Y61.l AdvertDetailsHotelOffer.Action action, @Y61.k ArrayList arrayList, @Y61.l ParametrizedEvent parametrizedEvent, @Y61.k AdvertDetailsHotelOffer.Action action2, @Y61.k String str, @Y61.l PrintableText printableText, @Y61.l DeepLink deepLink, boolean z12) {
            this.f75919b = action;
            this.f75920c = arrayList;
            this.f75921d = parametrizedEvent;
            this.f75922e = action2;
            this.f75923f = str;
            this.f75924g = printableText;
            this.f75925h = deepLink;
            this.f75926i = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HasOffers)) {
                return false;
            }
            HasOffers hasOffers = (HasOffers) obj;
            return L.f(this.f75919b, hasOffers.f75919b) && this.f75920c.equals(hasOffers.f75920c) && L.f(this.f75921d, hasOffers.f75921d) && L.f(this.f75922e, hasOffers.f75922e) && L.f(this.f75923f, hasOffers.f75923f) && L.f(this.f75924g, hasOffers.f75924g) && L.f(this.f75925h, hasOffers.f75925h) && this.f75926i == hasOffers.f75926i;
        }

        public final int hashCode() {
            AdvertDetailsHotelOffer.Action action = this.f75919b;
            int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f75920c, (action == null ? 0 : action.hashCode()) * 31, 31);
            ParametrizedEvent parametrizedEvent = this.f75921d;
            int iD2 = H.d((this.f75922e.hashCode() + ((iG2 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31)) * 31, 31, this.f75923f);
            PrintableText printableText = this.f75924g;
            int iHashCode = (iD2 + (printableText == null ? 0 : printableText.hashCode())) * 31;
            DeepLink deepLink = this.f75925h;
            return Boolean.hashCode(this.f75926i) + ((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HasOffers(bottomAction=");
            sb2.append(this.f75919b);
            sb2.append(", items=");
            sb2.append(this.f75920c);
            sb2.append(", onScrollEvent=");
            sb2.append(this.f75921d);
            sb2.append(", searchOffers=");
            sb2.append(this.f75922e);
            sb2.append(", title=");
            sb2.append(this.f75923f);
            sb2.append(", selectedDates=");
            sb2.append(this.f75924g);
            sb2.append(", selectedDatesDeeplink=");
            sb2.append(this.f75925h);
            sb2.append(", isMoreButtonVisible=");
            return androidx.appcompat.app.r.x(sb2, this.f75926i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            AdvertDetailsHotelOffer.Action action = this.f75919b;
            if (action == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                action.writeToParcel(parcel, i12);
            }
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f75920c, parcel);
            while (itZ.hasNext()) {
                parcel.writeParcelable((Parcelable) itZ.next(), i12);
            }
            parcel.writeParcelable(this.f75921d, i12);
            this.f75922e.writeToParcel(parcel, i12);
            parcel.writeString(this.f75923f);
            parcel.writeParcelable(this.f75924g, i12);
            parcel.writeParcelable(this.f75925h, i12);
            parcel.writeInt(this.f75926i ? 1 : 0);
        }
    }

    /* compiled from: HotelOfferState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState$Loading;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Loading implements HotelOfferViewState {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Loading f75927b = new Loading();

        @Y61.k
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* compiled from: HotelOfferState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Loading.f75927b;
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i12) {
                return new Loading[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1298661393;
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState$OfferNotFound;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class OfferNotFound implements HotelOfferViewState {

        @Y61.k
        public static final Parcelable.Creator<OfferNotFound> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final HotelOfferFilter f75928b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final HotelOfferFilter f75929c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final List<HotelActionButton> f75930d;

        /* compiled from: HotelOfferState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OfferNotFound> {
            @Override // android.os.Parcelable.Creator
            public final OfferNotFound createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                HotelOfferFilter hotelOfferFilter = (HotelOfferFilter) parcel.readParcelable(OfferNotFound.class.getClassLoader());
                HotelOfferFilter hotelOfferFilter2 = (HotelOfferFilter) parcel.readParcelable(OfferNotFound.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(OfferNotFound.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new OfferNotFound(hotelOfferFilter, hotelOfferFilter2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final OfferNotFound[] newArray(int i12) {
                return new OfferNotFound[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OfferNotFound(@Y61.k HotelOfferFilter hotelOfferFilter, @Y61.k HotelOfferFilter hotelOfferFilter2, @Y61.l List<? extends HotelActionButton> list) {
            this.f75928b = hotelOfferFilter;
            this.f75929c = hotelOfferFilter2;
            this.f75930d = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferNotFound)) {
                return false;
            }
            OfferNotFound offerNotFound = (OfferNotFound) obj;
            return L.f(this.f75928b, offerNotFound.f75928b) && L.f(this.f75929c, offerNotFound.f75929c) && L.f(this.f75930d, offerNotFound.f75930d);
        }

        public final int hashCode() {
            int iHashCode = (this.f75929c.hashCode() + (this.f75928b.hashCode() * 31)) * 31;
            List<HotelActionButton> list = this.f75930d;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OfferNotFound(dateFilter=");
            sb2.append(this.f75928b);
            sb2.append(", guestFilter=");
            sb2.append(this.f75929c);
            sb2.append(", actionButtons=");
            return H.p(sb2, this.f75930d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f75928b, i12);
            parcel.writeParcelable(this.f75929c, i12);
            List<HotelActionButton> list = this.f75930d;
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState$OfferNotRequested;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class OfferNotRequested implements HotelOfferViewState {

        @Y61.k
        public static final Parcelable.Creator<OfferNotRequested> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final HotelOfferFilter f75931b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final HotelOfferFilter f75932c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final List<HotelActionButton> f75933d;

        /* compiled from: HotelOfferState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OfferNotRequested> {
            @Override // android.os.Parcelable.Creator
            public final OfferNotRequested createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                HotelOfferFilter hotelOfferFilter = (HotelOfferFilter) parcel.readParcelable(OfferNotRequested.class.getClassLoader());
                HotelOfferFilter hotelOfferFilter2 = (HotelOfferFilter) parcel.readParcelable(OfferNotRequested.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(OfferNotRequested.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new OfferNotRequested(hotelOfferFilter, hotelOfferFilter2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final OfferNotRequested[] newArray(int i12) {
                return new OfferNotRequested[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OfferNotRequested(@Y61.k HotelOfferFilter hotelOfferFilter, @Y61.k HotelOfferFilter hotelOfferFilter2, @Y61.l List<? extends HotelActionButton> list) {
            this.f75931b = hotelOfferFilter;
            this.f75932c = hotelOfferFilter2;
            this.f75933d = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferNotRequested)) {
                return false;
            }
            OfferNotRequested offerNotRequested = (OfferNotRequested) obj;
            return L.f(this.f75931b, offerNotRequested.f75931b) && L.f(this.f75932c, offerNotRequested.f75932c) && L.f(this.f75933d, offerNotRequested.f75933d);
        }

        public final int hashCode() {
            int iHashCode = (this.f75932c.hashCode() + (this.f75931b.hashCode() * 31)) * 31;
            List<HotelActionButton> list = this.f75933d;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OfferNotRequested(dateFilter=");
            sb2.append(this.f75931b);
            sb2.append(", guestFilter=");
            sb2.append(this.f75932c);
            sb2.append(", actionButtons=");
            return H.p(sb2, this.f75933d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f75931b, i12);
            parcel.writeParcelable(this.f75932c, i12);
            List<HotelActionButton> list = this.f75933d;
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState$RedesignLoading;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferViewState;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class RedesignLoading implements HotelOfferViewState {

        @Y61.k
        public static final Parcelable.Creator<RedesignLoading> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f75934b;

        /* compiled from: HotelOfferState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RedesignLoading> {
            @Override // android.os.Parcelable.Creator
            public final RedesignLoading createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(RedesignLoading.class, parcel, arrayList, iL2, 1);
                }
                return new RedesignLoading(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final RedesignLoading[] newArray(int i12) {
                return new RedesignLoading[i12];
            }
        }

        public RedesignLoading(@Y61.k ArrayList arrayList) {
            this.f75934b = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RedesignLoading) && this.f75934b.equals(((RedesignLoading) obj).f75934b);
        }

        public final int hashCode() {
            return this.f75934b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("RedesignLoading(shimmerItems="), this.f75934b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f75934b, parcel);
            while (itZ.hasNext()) {
                parcel.writeParcelable((Parcelable) itZ.next(), i12);
            }
        }
    }
}
