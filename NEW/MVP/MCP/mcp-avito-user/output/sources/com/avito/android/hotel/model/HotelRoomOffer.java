package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertHotelRoom.kt */
@d
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/avito/android/hotel/model/HotelRoomOffer;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "previewImage", "", "images", "Lcom/avito/android/remote/model/text/AttributedText;", "price", "details", "Lcom/avito/android/hotel/model/HotelOfferDiscount;", "discount", "description", "Lcom/avito/android/hotel/model/HotelOfferInstallments;", AdvertDetailsBlockIdKt.BLOCK_ID_CREDIT_CALCULATOR, "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/hotel/model/HotelOfferDiscount;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/hotel/model/HotelOfferInstallments;)V", "Lcom/avito/android/remote/model/Image;", "f", "()Lcom/avito/android/remote/model/Image;", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "g", "()Lcom/avito/android/remote/model/text/AttributedText;", "c", "Lcom/avito/android/hotel/model/HotelOfferDiscount;", "d", "()Lcom/avito/android/hotel/model/HotelOfferDiscount;", "getDescription", "Lcom/avito/android/hotel/model/HotelOfferInstallments;", "e", "()Lcom/avito/android/hotel/model/HotelOfferInstallments;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HotelRoomOffer implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelRoomOffer> CREATOR = new a();

    @c("description")
    @l
    private final AttributedText description;

    @c("details")
    @l
    private final AttributedText details;

    @c("discount")
    @l
    private final HotelOfferDiscount discount;

    @c("images")
    @l
    private final List<Image> images;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_CREDIT_CALCULATOR)
    @l
    private final HotelOfferInstallments installments;

    @c("previewImage")
    @l
    private final Image previewImage;

    @c("price")
    @l
    private final AttributedText price;

    /* compiled from: AdvertHotelRoom.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelRoomOffer> {
        @Override // android.os.Parcelable.Creator
        public final HotelRoomOffer createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Image image = (Image) parcel.readParcelable(HotelRoomOffer.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(HotelRoomOffer.class, parcel, arrayList, iL2, 1);
                }
            }
            return new HotelRoomOffer(image, arrayList, (AttributedText) parcel.readParcelable(HotelRoomOffer.class.getClassLoader()), (AttributedText) parcel.readParcelable(HotelRoomOffer.class.getClassLoader()), parcel.readInt() == 0 ? null : HotelOfferDiscount.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(HotelRoomOffer.class.getClassLoader()), parcel.readInt() != 0 ? HotelOfferInstallments.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final HotelRoomOffer[] newArray(int i12) {
            return new HotelRoomOffer[i12];
        }
    }

    public HotelRoomOffer(@l Image image, @l List<Image> list, @l AttributedText attributedText, @l AttributedText attributedText2, @l HotelOfferDiscount hotelOfferDiscount, @l AttributedText attributedText3, @l HotelOfferInstallments hotelOfferInstallments) {
        this.previewImage = image;
        this.images = list;
        this.price = attributedText;
        this.details = attributedText2;
        this.discount = hotelOfferDiscount;
        this.description = attributedText3;
        this.installments = hotelOfferInstallments;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getDetails() {
        return this.details;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final HotelOfferDiscount getDiscount() {
        return this.discount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final HotelOfferInstallments getInstallments() {
        return this.installments;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Image getPreviewImage() {
        return this.previewImage;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final AttributedText getPrice() {
        return this.price;
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final List<Image> getImages() {
        return this.images;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.previewImage, i12);
        List<Image> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.price, i12);
        parcel.writeParcelable(this.details, i12);
        HotelOfferDiscount hotelOfferDiscount = this.discount;
        if (hotelOfferDiscount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hotelOfferDiscount.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.description, i12);
        HotelOfferInstallments hotelOfferInstallments = this.installments;
        if (hotelOfferInstallments == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hotelOfferInstallments.writeToParcel(parcel, i12);
        }
    }
}
