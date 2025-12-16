package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HotelPromoWidget.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/hotel/model/HotelPromoWidgetPosition;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "AFTER_DESCRIPTION", "AFTER_REVIEWS", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HotelPromoWidgetPosition implements Parcelable {

    @c("afterDescription")
    public static final HotelPromoWidgetPosition AFTER_DESCRIPTION;

    @c("afterReviews")
    public static final HotelPromoWidgetPosition AFTER_REVIEWS;

    @k
    public static final Parcelable.Creator<HotelPromoWidgetPosition> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ HotelPromoWidgetPosition[] f162642b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f162643c;

    static {
        HotelPromoWidgetPosition hotelPromoWidgetPosition = new HotelPromoWidgetPosition("AFTER_DESCRIPTION", 0);
        AFTER_DESCRIPTION = hotelPromoWidgetPosition;
        HotelPromoWidgetPosition hotelPromoWidgetPosition2 = new HotelPromoWidgetPosition("AFTER_REVIEWS", 1);
        AFTER_REVIEWS = hotelPromoWidgetPosition2;
        HotelPromoWidgetPosition[] hotelPromoWidgetPositionArr = {hotelPromoWidgetPosition, hotelPromoWidgetPosition2};
        f162642b = hotelPromoWidgetPositionArr;
        f162643c = kotlin.enums.c.a(hotelPromoWidgetPositionArr);
        CREATOR = new Parcelable.Creator<HotelPromoWidgetPosition>() { // from class: com.avito.android.hotel.model.HotelPromoWidgetPosition.a
            @Override // android.os.Parcelable.Creator
            public final HotelPromoWidgetPosition createFromParcel(Parcel parcel) {
                return HotelPromoWidgetPosition.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final HotelPromoWidgetPosition[] newArray(int i12) {
                return new HotelPromoWidgetPosition[i12];
            }
        };
    }

    private HotelPromoWidgetPosition(String str, int i12) {
    }

    public static HotelPromoWidgetPosition valueOf(String str) {
        return (HotelPromoWidgetPosition) Enum.valueOf(HotelPromoWidgetPosition.class, str);
    }

    public static HotelPromoWidgetPosition[] values() {
        return (HotelPromoWidgetPosition[]) f162642b.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
