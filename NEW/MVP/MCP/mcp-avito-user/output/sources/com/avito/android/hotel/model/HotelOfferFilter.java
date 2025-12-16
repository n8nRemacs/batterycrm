package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertHotelRoom.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel/model/HotelOfferFilter;", "Landroid/os/Parcelable;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelOfferFilter implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelOfferFilter> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f162632b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f162633c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f162634d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DeepLink f162635e;

    /* compiled from: AdvertHotelRoom.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelOfferFilter> {
        @Override // android.os.Parcelable.Creator
        public final HotelOfferFilter createFromParcel(Parcel parcel) {
            return new HotelOfferFilter(parcel.readInt(), (PrintableText) parcel.readParcelable(HotelOfferFilter.class.getClassLoader()), (PrintableText) parcel.readParcelable(HotelOfferFilter.class.getClassLoader()), (DeepLink) parcel.readParcelable(HotelOfferFilter.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelOfferFilter[] newArray(int i12) {
            return new HotelOfferFilter[i12];
        }
    }

    public HotelOfferFilter(int i12, @k PrintableText printableText, @k PrintableText printableText2, @k DeepLink deepLink) {
        this.f162632b = i12;
        this.f162633c = printableText;
        this.f162634d = printableText2;
        this.f162635e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelOfferFilter)) {
            return false;
        }
        HotelOfferFilter hotelOfferFilter = (HotelOfferFilter) obj;
        return this.f162632b == hotelOfferFilter.f162632b && L.f(this.f162633c, hotelOfferFilter.f162633c) && L.f(this.f162634d, hotelOfferFilter.f162634d) && L.f(this.f162635e, hotelOfferFilter.f162635e);
    }

    public final int hashCode() {
        return this.f162635e.hashCode() + com.avito.android.actions_sheet.a.f(this.f162634d, com.avito.android.actions_sheet.a.f(this.f162633c, Integer.hashCode(this.f162632b) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelOfferFilter(style=");
        sb2.append(this.f162632b);
        sb2.append(", placeholder=");
        sb2.append(this.f162633c);
        sb2.append(", title=");
        sb2.append(this.f162634d);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f162635e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f162632b);
        parcel.writeParcelable(this.f162633c, i12);
        parcel.writeParcelable(this.f162634d, i12);
        parcel.writeParcelable(this.f162635e, i12);
    }
}
