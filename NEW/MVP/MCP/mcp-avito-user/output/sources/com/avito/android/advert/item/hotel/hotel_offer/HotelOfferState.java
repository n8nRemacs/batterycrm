package com.avito.android.advert.item.hotel.hotel_offer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.hotel.hotel_offer.HotelOfferFloatingViewState;
import com.avito.android.advert.item.hotel.hotel_offer.HotelOfferViewState;
import com.avito.android.hotel.model.AdvertHotelRoom;
import com.avito.android.hotel.model.DateFilter;
import com.avito.android.hotel.model.GuestFilter;
import com.avito.android.hotel.model.HotelOfferRequestParams;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HotelOfferState.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState;", "Landroid/os/Parcelable;", "a", "RequestState", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class HotelOfferState implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final HotelOfferRequestParams f75902b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AdvertHotelRoom f75903c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsHotelOffer f75904d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f75905e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final RequestState f75906f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f75907g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final HotelOfferViewState f75908h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final HotelOfferFloatingViewState f75909i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final a f75900j = new a(null);

    @Y61.k
    public static final Parcelable.Creator<HotelOfferState> CREATOR = new b();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final HotelOfferState f75901k = new HotelOfferState(new HotelOfferRequestParams("", new DateFilter(null, null, null), new GuestFilter(null, null, null, null, null, null), null), null, null, false, null, true, HotelOfferViewState.Loading.f75927b, HotelOfferFloatingViewState.Loading.f75896c);

    /* compiled from: HotelOfferState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$a;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: HotelOfferState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<HotelOfferState> {
        @Override // android.os.Parcelable.Creator
        public final HotelOfferState createFromParcel(Parcel parcel) {
            return new HotelOfferState((HotelOfferRequestParams) parcel.readParcelable(HotelOfferState.class.getClassLoader()), (AdvertHotelRoom) parcel.readParcelable(HotelOfferState.class.getClassLoader()), parcel.readInt() == 0 ? null : AdvertDetailsHotelOffer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (RequestState) parcel.readParcelable(HotelOfferState.class.getClassLoader()), parcel.readInt() != 0, (HotelOfferViewState) parcel.readParcelable(HotelOfferState.class.getClassLoader()), (HotelOfferFloatingViewState) parcel.readParcelable(HotelOfferState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelOfferState[] newArray(int i12) {
            return new HotelOfferState[i12];
        }
    }

    public HotelOfferState(@Y61.k HotelOfferRequestParams hotelOfferRequestParams, @Y61.l AdvertHotelRoom advertHotelRoom, @Y61.l AdvertDetailsHotelOffer advertDetailsHotelOffer, boolean z12, @Y61.l RequestState requestState, boolean z13, @Y61.k HotelOfferViewState hotelOfferViewState, @Y61.k HotelOfferFloatingViewState hotelOfferFloatingViewState) {
        this.f75902b = hotelOfferRequestParams;
        this.f75903c = advertHotelRoom;
        this.f75904d = advertDetailsHotelOffer;
        this.f75905e = z12;
        this.f75906f = requestState;
        this.f75907g = z13;
        this.f75908h = hotelOfferViewState;
        this.f75909i = hotelOfferFloatingViewState;
    }

    public static HotelOfferState a(HotelOfferState hotelOfferState, HotelOfferRequestParams hotelOfferRequestParams, AdvertHotelRoom advertHotelRoom, AdvertDetailsHotelOffer advertDetailsHotelOffer, boolean z12, RequestState requestState, boolean z13, HotelOfferViewState hotelOfferViewState, HotelOfferFloatingViewState hotelOfferFloatingViewState, int i12) {
        HotelOfferRequestParams hotelOfferRequestParams2 = (i12 & 1) != 0 ? hotelOfferState.f75902b : hotelOfferRequestParams;
        AdvertHotelRoom advertHotelRoom2 = (i12 & 2) != 0 ? hotelOfferState.f75903c : advertHotelRoom;
        AdvertDetailsHotelOffer advertDetailsHotelOffer2 = (i12 & 4) != 0 ? hotelOfferState.f75904d : advertDetailsHotelOffer;
        boolean z14 = (i12 & 8) != 0 ? hotelOfferState.f75905e : z12;
        RequestState requestState2 = (i12 & 16) != 0 ? hotelOfferState.f75906f : requestState;
        boolean z15 = (i12 & 32) != 0 ? hotelOfferState.f75907g : z13;
        HotelOfferViewState hotelOfferViewState2 = (i12 & 64) != 0 ? hotelOfferState.f75908h : hotelOfferViewState;
        HotelOfferFloatingViewState hotelOfferFloatingViewState2 = (i12 & 128) != 0 ? hotelOfferState.f75909i : hotelOfferFloatingViewState;
        hotelOfferState.getClass();
        return new HotelOfferState(hotelOfferRequestParams2, advertHotelRoom2, advertDetailsHotelOffer2, z14, requestState2, z15, hotelOfferViewState2, hotelOfferFloatingViewState2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelOfferState)) {
            return false;
        }
        HotelOfferState hotelOfferState = (HotelOfferState) obj;
        return L.f(this.f75902b, hotelOfferState.f75902b) && L.f(this.f75903c, hotelOfferState.f75903c) && L.f(this.f75904d, hotelOfferState.f75904d) && this.f75905e == hotelOfferState.f75905e && L.f(this.f75906f, hotelOfferState.f75906f) && this.f75907g == hotelOfferState.f75907g && L.f(this.f75908h, hotelOfferState.f75908h) && L.f(this.f75909i, hotelOfferState.f75909i);
    }

    public final int hashCode() {
        int iHashCode = this.f75902b.hashCode() * 31;
        AdvertHotelRoom advertHotelRoom = this.f75903c;
        int iHashCode2 = (iHashCode + (advertHotelRoom == null ? 0 : advertHotelRoom.hashCode())) * 31;
        AdvertDetailsHotelOffer advertDetailsHotelOffer = this.f75904d;
        int i12 = androidx.appcompat.app.r.i((iHashCode2 + (advertDetailsHotelOffer == null ? 0 : advertDetailsHotelOffer.hashCode())) * 31, 31, this.f75905e);
        RequestState requestState = this.f75906f;
        return this.f75909i.hashCode() + ((this.f75908h.hashCode() + androidx.appcompat.app.r.i((i12 + (requestState != null ? requestState.hashCode() : 0)) * 31, 31, this.f75907g)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "HotelOfferState(requestParams=" + this.f75902b + ", data=" + this.f75903c + ", redesignData=" + this.f75904d + ", isAutoLoadOfferEnabled=" + this.f75905e + ", requestState=" + this.f75906f + ", isMoreButtonVisible=" + this.f75907g + ", viewState=" + this.f75908h + ", floatingViewState=" + this.f75909i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f75902b, i12);
        parcel.writeParcelable(this.f75903c, i12);
        AdvertDetailsHotelOffer advertDetailsHotelOffer = this.f75904d;
        if (advertDetailsHotelOffer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertDetailsHotelOffer.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f75905e ? 1 : 0);
        parcel.writeParcelable(this.f75906f, i12);
        parcel.writeInt(this.f75907g ? 1 : 0);
        parcel.writeParcelable(this.f75908h, i12);
        parcel.writeParcelable(this.f75909i, i12);
    }

    /* compiled from: HotelOfferState.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState;", "Landroid/os/Parcelable;", "Error", "Loaded", "Loading", "RedesignLoaded", "RedesignLoading", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState$Error;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState$Loaded;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState$Loading;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState$RedesignLoaded;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState$RedesignLoading;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RequestState extends Parcelable {

        /* compiled from: HotelOfferState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState$Loaded;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Loaded implements RequestState {

            @Y61.k
            public static final Parcelable.Creator<Loaded> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final AdvertHotelRoom f75912b;

            /* compiled from: HotelOfferState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Loaded> {
                @Override // android.os.Parcelable.Creator
                public final Loaded createFromParcel(Parcel parcel) {
                    return new Loaded((AdvertHotelRoom) parcel.readParcelable(Loaded.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Loaded[] newArray(int i12) {
                    return new Loaded[i12];
                }
            }

            public Loaded(@Y61.k AdvertHotelRoom advertHotelRoom) {
                this.f75912b = advertHotelRoom;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loaded) && L.f(this.f75912b, ((Loaded) obj).f75912b);
            }

            public final int hashCode() {
                return this.f75912b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Loaded(data=" + this.f75912b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f75912b, i12);
            }
        }

        /* compiled from: HotelOfferState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState$Loading;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Loading implements RequestState {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Loading f75913b = new Loading();

            @Y61.k
            public static final Parcelable.Creator<Loading> CREATOR = new a();

            /* compiled from: HotelOfferState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Loading> {
                @Override // android.os.Parcelable.Creator
                public final Loading createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Loading.f75913b;
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
                return 2087821720;
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
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState$RedesignLoaded;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class RedesignLoaded implements RequestState {

            @Y61.k
            public static final Parcelable.Creator<RedesignLoaded> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final AdvertDetailsHotelOffer f75914b;

            /* compiled from: HotelOfferState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RedesignLoaded> {
                @Override // android.os.Parcelable.Creator
                public final RedesignLoaded createFromParcel(Parcel parcel) {
                    return new RedesignLoaded(AdvertDetailsHotelOffer.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final RedesignLoaded[] newArray(int i12) {
                    return new RedesignLoaded[i12];
                }
            }

            public RedesignLoaded(@Y61.k AdvertDetailsHotelOffer advertDetailsHotelOffer) {
                this.f75914b = advertDetailsHotelOffer;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RedesignLoaded) && L.f(this.f75914b, ((RedesignLoaded) obj).f75914b);
            }

            public final int hashCode() {
                return this.f75914b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "RedesignLoaded(data=" + this.f75914b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                this.f75914b.writeToParcel(parcel, i12);
            }
        }

        /* compiled from: HotelOfferState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState$RedesignLoading;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class RedesignLoading implements RequestState {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final RedesignLoading f75915b = new RedesignLoading();

            @Y61.k
            public static final Parcelable.Creator<RedesignLoading> CREATOR = new a();

            /* compiled from: HotelOfferState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RedesignLoading> {
                @Override // android.os.Parcelable.Creator
                public final RedesignLoading createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return RedesignLoading.f75915b;
                }

                @Override // android.os.Parcelable.Creator
                public final RedesignLoading[] newArray(int i12) {
                    return new RedesignLoading[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof RedesignLoading);
            }

            public final int hashCode() {
                return -819829081;
            }

            @Y61.k
            public final String toString() {
                return "RedesignLoading";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: HotelOfferState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState$Error;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Error implements RequestState {

            @Y61.k
            public static final Parcelable.Creator<Error> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final ApiError f75910b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f75911c;

            /* compiled from: HotelOfferState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Error> {
                @Override // android.os.Parcelable.Creator
                public final Error createFromParcel(Parcel parcel) {
                    return new Error((ApiError) parcel.readParcelable(Error.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Error[] newArray(int i12) {
                    return new Error[i12];
                }
            }

            public Error(@Y61.k ApiError apiError, @Y61.l String str) {
                this.f75910b = apiError;
                this.f75911c = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return L.f(this.f75910b, error.f75910b) && L.f(this.f75911c, error.f75911c);
            }

            public final int hashCode() {
                int iHashCode = this.f75910b.hashCode() * 31;
                String str = this.f75911c;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(error=");
                sb2.append(this.f75910b);
                sb2.append(", errorMessage=");
                return C22026a.c(sb2, this.f75911c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f75910b, i12);
                parcel.writeString(this.f75911c);
            }

            public /* synthetic */ Error(ApiError apiError, String str, int i12, C42822w c42822w) {
                this(apiError, (i12 & 2) != 0 ? null : str);
            }
        }
    }
}
