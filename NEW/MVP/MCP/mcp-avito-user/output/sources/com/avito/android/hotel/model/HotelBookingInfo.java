package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingForm.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "price", "description", "", "targetParameterId", "Lcom/avito/android/hotel/model/BookButton;", "bookButton", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/hotel/model/BookButton;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Lcom/avito/android/hotel/model/BookButton;", "c", "()Lcom/avito/android/hotel/model/BookButton;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelBookingInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelBookingInfo> CREATOR = new a();

    @c("bookButton")
    @l
    private final BookButton bookButton;

    @c("description")
    @l
    private final AttributedText description;

    @c("price")
    @l
    private final AttributedText price;

    @c("targetParameterId")
    @l
    private final String targetParameterId;

    /* compiled from: HotelBookingForm.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingInfo> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingInfo createFromParcel(Parcel parcel) {
            return new HotelBookingInfo((AttributedText) parcel.readParcelable(HotelBookingInfo.class.getClassLoader()), (AttributedText) parcel.readParcelable(HotelBookingInfo.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : BookButton.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingInfo[] newArray(int i12) {
            return new HotelBookingInfo[i12];
        }
    }

    public HotelBookingInfo(@l AttributedText attributedText, @l AttributedText attributedText2, @l String str, @l BookButton bookButton) {
        this.price = attributedText;
        this.description = attributedText2;
        this.targetParameterId = str;
        this.bookButton = bookButton;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final BookButton getBookButton() {
        return this.bookButton;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getPrice() {
        return this.price;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getTargetParameterId() {
        return this.targetParameterId;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelBookingInfo)) {
            return false;
        }
        HotelBookingInfo hotelBookingInfo = (HotelBookingInfo) obj;
        return L.f(this.price, hotelBookingInfo.price) && L.f(this.description, hotelBookingInfo.description) && L.f(this.targetParameterId, hotelBookingInfo.targetParameterId) && L.f(this.bookButton, hotelBookingInfo.bookButton);
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    public final int hashCode() {
        AttributedText attributedText = this.price;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.description;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str = this.targetParameterId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        BookButton bookButton = this.bookButton;
        return iHashCode3 + (bookButton != null ? bookButton.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "HotelBookingInfo(price=" + this.price + ", description=" + this.description + ", targetParameterId=" + this.targetParameterId + ", bookButton=" + this.bookButton + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.price, i12);
        parcel.writeParcelable(this.description, i12);
        parcel.writeString(this.targetParameterId);
        BookButton bookButton = this.bookButton;
        if (bookButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bookButton.writeToParcel(parcel, i12);
        }
    }
}
