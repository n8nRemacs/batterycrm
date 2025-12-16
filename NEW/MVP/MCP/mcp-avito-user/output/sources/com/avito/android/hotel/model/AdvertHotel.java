package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AdvertHotel.kt */
@d
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/avito/android/hotel/model/AdvertHotel;", "Landroid/os/Parcelable;", "Lcom/avito/android/hotel/model/AdvertHotelDescription;", "checkinRulesDescription", "guestInfoDescription", "Lcom/avito/android/hotel/model/Amenities;", "amenities", "Lcom/avito/android/hotel/model/GuestFilter;", "guestFilter", "Lcom/avito/android/hotel/model/DateFilter;", "dateFilter", "Lcom/avito/android/hotel/model/AdvertHotelRating;", "rating", "", "context", "<init>", "(Lcom/avito/android/hotel/model/AdvertHotelDescription;Lcom/avito/android/hotel/model/AdvertHotelDescription;Lcom/avito/android/hotel/model/Amenities;Lcom/avito/android/hotel/model/GuestFilter;Lcom/avito/android/hotel/model/DateFilter;Lcom/avito/android/hotel/model/AdvertHotelRating;Ljava/lang/String;)V", "Lcom/avito/android/hotel/model/AdvertHotelDescription;", "d", "()Lcom/avito/android/hotel/model/AdvertHotelDescription;", "g", "Lcom/avito/android/hotel/model/Amenities;", "c", "()Lcom/avito/android/hotel/model/Amenities;", "Lcom/avito/android/hotel/model/GuestFilter;", "f", "()Lcom/avito/android/hotel/model/GuestFilter;", "Lcom/avito/android/hotel/model/DateFilter;", "e", "()Lcom/avito/android/hotel/model/DateFilter;", "Lcom/avito/android/hotel/model/AdvertHotelRating;", "h", "()Lcom/avito/android/hotel/model/AdvertHotelRating;", "Ljava/lang/String;", "getContext", "()Ljava/lang/String;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AdvertHotel implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertHotel> CREATOR = new a();

    @c("amenities")
    @l
    private final Amenities amenities;

    @c("checkinRulesDescription")
    @l
    private final AdvertHotelDescription checkinRulesDescription;

    @c("context")
    @l
    private final String context;

    @c("dateFilter")
    @l
    private final DateFilter dateFilter;

    @c("guestFilter")
    @l
    private final GuestFilter guestFilter;

    @c("guestInfoDescription")
    @l
    private final AdvertHotelDescription guestInfoDescription;

    @c("rating")
    @l
    private final AdvertHotelRating rating;

    /* compiled from: AdvertHotel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertHotel> {
        @Override // android.os.Parcelable.Creator
        public final AdvertHotel createFromParcel(Parcel parcel) {
            return new AdvertHotel(parcel.readInt() == 0 ? null : AdvertHotelDescription.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AdvertHotelDescription.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Amenities.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GuestFilter.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DateFilter.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AdvertHotelRating.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertHotel[] newArray(int i12) {
            return new AdvertHotel[i12];
        }
    }

    public AdvertHotel(@l AdvertHotelDescription advertHotelDescription, @l AdvertHotelDescription advertHotelDescription2, @l Amenities amenities, @l GuestFilter guestFilter, @l DateFilter dateFilter, @l AdvertHotelRating advertHotelRating, @l String str) {
        this.checkinRulesDescription = advertHotelDescription;
        this.guestInfoDescription = advertHotelDescription2;
        this.amenities = amenities;
        this.guestFilter = guestFilter;
        this.dateFilter = dateFilter;
        this.rating = advertHotelRating;
        this.context = str;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Amenities getAmenities() {
        return this.amenities;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AdvertHotelDescription getCheckinRulesDescription() {
        return this.checkinRulesDescription;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final DateFilter getDateFilter() {
        return this.dateFilter;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final GuestFilter getGuestFilter() {
        return this.guestFilter;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final AdvertHotelDescription getGuestInfoDescription() {
        return this.guestInfoDescription;
    }

    @l
    public final String getContext() {
        return this.context;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final AdvertHotelRating getRating() {
        return this.rating;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        AdvertHotelDescription advertHotelDescription = this.checkinRulesDescription;
        if (advertHotelDescription == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertHotelDescription.writeToParcel(parcel, i12);
        }
        AdvertHotelDescription advertHotelDescription2 = this.guestInfoDescription;
        if (advertHotelDescription2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertHotelDescription2.writeToParcel(parcel, i12);
        }
        Amenities amenities = this.amenities;
        if (amenities == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amenities.writeToParcel(parcel, i12);
        }
        GuestFilter guestFilter = this.guestFilter;
        if (guestFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            guestFilter.writeToParcel(parcel, i12);
        }
        DateFilter dateFilter = this.dateFilter;
        if (dateFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dateFilter.writeToParcel(parcel, i12);
        }
        AdvertHotelRating advertHotelRating = this.rating;
        if (advertHotelRating == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertHotelRating.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.context);
    }
}
