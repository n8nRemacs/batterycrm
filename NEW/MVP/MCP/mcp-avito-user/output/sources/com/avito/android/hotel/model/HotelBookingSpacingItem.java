package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingSpacingItem.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingSpacingItem;", "Lcom/avito/android/hotel/model/HotelBookingFormItem;", "", "height", "<init>", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelBookingSpacingItem implements HotelBookingFormItem {

    @k
    public static final Parcelable.Creator<HotelBookingSpacingItem> CREATOR = new a();

    @c("height")
    @l
    private final Integer height;

    /* compiled from: HotelBookingSpacingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingSpacingItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingSpacingItem createFromParcel(Parcel parcel) {
            return new HotelBookingSpacingItem(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingSpacingItem[] newArray(int i12) {
            return new HotelBookingSpacingItem[i12];
        }
    }

    public HotelBookingSpacingItem(@l Integer num) {
        this.height = num;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HotelBookingSpacingItem) && L.f(this.height, ((HotelBookingSpacingItem) obj).height);
    }

    public final int hashCode() {
        Integer num = this.height;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @k
    public final String toString() {
        return s.j(new StringBuilder("HotelBookingSpacingItem(height="), this.height, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.height;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
