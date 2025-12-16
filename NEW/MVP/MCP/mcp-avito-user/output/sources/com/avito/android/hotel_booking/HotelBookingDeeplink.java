package com.avito.android.hotel_booking;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: HotelBookingDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/HotelBookingDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class HotelBookingDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<HotelBookingDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f163240b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f163241c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ArrayList f163242d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f163243e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f163244f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f163245g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f163246h;

    /* compiled from: HotelBookingDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingDeeplink createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iD2 = 0;
                while (iD2 != i12) {
                    iD2 = com.avito.android.advert.item.delivery_suggests.l.d(parcel, arrayList, iD2, 1);
                }
            }
            return new HotelBookingDeeplink(string, numValueOf, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingDeeplink[] newArray(int i12) {
            return new HotelBookingDeeplink[i12];
        }
    }

    public HotelBookingDeeplink(@k String str, @l Integer num, @l ArrayList arrayList, @l String str2, @l String str3, @l String str4, @l String str5) {
        this.f163240b = str;
        this.f163241c = num;
        this.f163242d = arrayList;
        this.f163243e = str2;
        this.f163244f = str3;
        this.f163245g = str4;
        this.f163246h = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f163240b);
        Integer num = this.f163241c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        ArrayList arrayList = this.f163242d;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                parcel.writeInt(((Number) itY.next()).intValue());
            }
        }
        parcel.writeString(this.f163243e);
        parcel.writeString(this.f163244f);
        parcel.writeString(this.f163245g);
        parcel.writeString(this.f163246h);
    }
}
