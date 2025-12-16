package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AdvertHotelRoom.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/hotel/model/HotelOfferBookingInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "price", "description", "Lcom/avito/android/remote/model/ButtonAction;", "actionButton", "<init>", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ButtonAction;)V", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Lcom/avito/android/remote/model/ButtonAction;", "c", "()Lcom/avito/android/remote/model/ButtonAction;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HotelOfferBookingInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelOfferBookingInfo> CREATOR = new a();

    @c("actionButton")
    @l
    private final ButtonAction actionButton;

    @c("description")
    @l
    private final AttributedText description;

    @c("image")
    @l
    private final Image image;

    @c("price")
    @l
    private final AttributedText price;

    /* compiled from: AdvertHotelRoom.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelOfferBookingInfo> {
        @Override // android.os.Parcelable.Creator
        public final HotelOfferBookingInfo createFromParcel(Parcel parcel) {
            return new HotelOfferBookingInfo((Image) parcel.readParcelable(HotelOfferBookingInfo.class.getClassLoader()), (AttributedText) parcel.readParcelable(HotelOfferBookingInfo.class.getClassLoader()), (AttributedText) parcel.readParcelable(HotelOfferBookingInfo.class.getClassLoader()), (ButtonAction) parcel.readParcelable(HotelOfferBookingInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelOfferBookingInfo[] newArray(int i12) {
            return new HotelOfferBookingInfo[i12];
        }
    }

    public HotelOfferBookingInfo(@l Image image, @l AttributedText attributedText, @l AttributedText attributedText2, @l ButtonAction buttonAction) {
        this.image = image;
        this.price = attributedText;
        this.description = attributedText2;
        this.actionButton = buttonAction;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ButtonAction getActionButton() {
        return this.actionButton;
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
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.image, i12);
        parcel.writeParcelable(this.price, i12);
        parcel.writeParcelable(this.description, i12);
        parcel.writeParcelable(this.actionButton, i12);
    }
}
