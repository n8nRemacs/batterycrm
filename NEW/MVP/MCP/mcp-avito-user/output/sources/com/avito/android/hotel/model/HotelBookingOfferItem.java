package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingOfferItem.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingOfferItem;", "Lcom/avito/android/hotel/model/HotelBookingFormItem;", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelBookingOfferItem implements HotelBookingFormItem {

    @k
    public static final Parcelable.Creator<HotelBookingOfferItem> CREATOR = new a();

    @c("image")
    @l
    private final Image image;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: HotelBookingOfferItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingOfferItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingOfferItem createFromParcel(Parcel parcel) {
            return new HotelBookingOfferItem((Image) parcel.readParcelable(HotelBookingOfferItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(HotelBookingOfferItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingOfferItem[] newArray(int i12) {
            return new HotelBookingOfferItem[i12];
        }
    }

    public HotelBookingOfferItem(@l Image image, @l AttributedText attributedText) {
        this.image = image;
        this.title = attributedText;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelBookingOfferItem)) {
            return false;
        }
        HotelBookingOfferItem hotelBookingOfferItem = (HotelBookingOfferItem) obj;
        return L.f(this.image, hotelBookingOfferItem.image) && L.f(this.title, hotelBookingOfferItem.title);
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    public final int hashCode() {
        Image image = this.image;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        AttributedText attributedText = this.title;
        return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelBookingOfferItem(image=");
        sb2.append(this.image);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.image, i12);
        parcel.writeParcelable(this.title, i12);
    }
}
