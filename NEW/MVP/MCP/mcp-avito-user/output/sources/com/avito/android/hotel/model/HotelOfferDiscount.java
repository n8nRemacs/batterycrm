package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DeliverySummarySlotKt;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AdvertHotelRoom.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/hotel/model/HotelOfferDiscount;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", DeliverySummarySlotKt.ORIGINAL_PRICE, "percent", "Lcom/avito/android/remote/model/UniversalColor;", "percentBackgroundColor", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalColor;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "Lcom/avito/android/remote/model/UniversalColor;", "e", "()Lcom/avito/android/remote/model/UniversalColor;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HotelOfferDiscount implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelOfferDiscount> CREATOR = new a();

    @c(DeliverySummarySlotKt.ORIGINAL_PRICE)
    @l
    private final AttributedText originalPrice;

    @c("percent")
    @l
    private final AttributedText percent;

    @c("percentBackgroundColor")
    @l
    private final UniversalColor percentBackgroundColor;

    /* compiled from: AdvertHotelRoom.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelOfferDiscount> {
        @Override // android.os.Parcelable.Creator
        public final HotelOfferDiscount createFromParcel(Parcel parcel) {
            return new HotelOfferDiscount((AttributedText) parcel.readParcelable(HotelOfferDiscount.class.getClassLoader()), (AttributedText) parcel.readParcelable(HotelOfferDiscount.class.getClassLoader()), (UniversalColor) parcel.readParcelable(HotelOfferDiscount.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelOfferDiscount[] newArray(int i12) {
            return new HotelOfferDiscount[i12];
        }
    }

    public HotelOfferDiscount(@l AttributedText attributedText, @l AttributedText attributedText2, @l UniversalColor universalColor) {
        this.originalPrice = attributedText;
        this.percent = attributedText2;
        this.percentBackgroundColor = universalColor;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getOriginalPrice() {
        return this.originalPrice;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getPercent() {
        return this.percent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final UniversalColor getPercentBackgroundColor() {
        return this.percentBackgroundColor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.originalPrice, i12);
        parcel.writeParcelable(this.percent, i12);
        parcel.writeParcelable(this.percentBackgroundColor, i12);
    }
}
