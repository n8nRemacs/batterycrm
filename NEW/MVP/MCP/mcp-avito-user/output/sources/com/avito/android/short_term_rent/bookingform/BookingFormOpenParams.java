package com.avito.android.short_term_rent.bookingform;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/BookingFormOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BookingFormOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<BookingFormOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f281214b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Date f281215c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Date f281216d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f281217e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f281218f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final List<String> f281219g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Boolean f281220h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Integer f281221i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Boolean f281222j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f281223k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f281224l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f281225m;

    /* compiled from: BookingFormOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BookingFormOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final BookingFormOpenParams createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            Date date = (Date) parcel.readSerializable();
            Date date2 = (Date) parcel.readSerializable();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BookingFormOpenParams(boolValueOf, boolValueOf2, numValueOf, numValueOf2, numValueOf3, string, parcel.readString(), parcel.readString(), parcel.readString(), date, date2, arrayListCreateStringArrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BookingFormOpenParams[] newArray(int i12) {
            return new BookingFormOpenParams[i12];
        }
    }

    public BookingFormOpenParams(@Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k Date date, @Y61.k Date date2, @Y61.l List list) {
        this.f281214b = str;
        this.f281215c = date;
        this.f281216d = date2;
        this.f281217e = num;
        this.f281218f = num2;
        this.f281219g = list;
        this.f281220h = bool;
        this.f281221i = num3;
        this.f281222j = bool2;
        this.f281223k = str2;
        this.f281224l = str3;
        this.f281225m = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingFormOpenParams)) {
            return false;
        }
        BookingFormOpenParams bookingFormOpenParams = (BookingFormOpenParams) obj;
        return L.f(this.f281214b, bookingFormOpenParams.f281214b) && L.f(this.f281215c, bookingFormOpenParams.f281215c) && L.f(this.f281216d, bookingFormOpenParams.f281216d) && L.f(this.f281217e, bookingFormOpenParams.f281217e) && L.f(this.f281218f, bookingFormOpenParams.f281218f) && L.f(this.f281219g, bookingFormOpenParams.f281219g) && L.f(this.f281220h, bookingFormOpenParams.f281220h) && L.f(this.f281221i, bookingFormOpenParams.f281221i) && L.f(this.f281222j, bookingFormOpenParams.f281222j) && L.f(this.f281223k, bookingFormOpenParams.f281223k) && L.f(this.f281224l, bookingFormOpenParams.f281224l) && L.f(this.f281225m, bookingFormOpenParams.f281225m);
    }

    public final int hashCode() {
        int iF2 = m.f(this.f281216d, m.f(this.f281215c, this.f281214b.hashCode() * 31, 31), 31);
        Integer num = this.f281217e;
        int iHashCode = (iF2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f281218f;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list = this.f281219g;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f281220h;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.f281221i;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool2 = this.f281222j;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.f281223k;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f281224l;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f281225m;
        return iHashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingFormOpenParams(itemId=");
        sb2.append(this.f281214b);
        sb2.append(", checkIn=");
        sb2.append(this.f281215c);
        sb2.append(", checkOut=");
        sb2.append(this.f281216d);
        sb2.append(", totalGuestsCount=");
        sb2.append(this.f281217e);
        sb2.append(", adultGuestsCount=");
        sb2.append(this.f281218f);
        sb2.append(", childrenAges=");
        sb2.append(this.f281219g);
        sb2.append(", withPets=");
        sb2.append(this.f281220h);
        sb2.append(", guestsDetailedValueVersion=");
        sb2.append(this.f281221i);
        sb2.append(", nonRefundableDiscountEnable=");
        sb2.append(this.f281222j);
        sb2.append(", paymentType=");
        sb2.append(this.f281223k);
        sb2.append(", source=");
        sb2.append(this.f281224l);
        sb2.append(", xHash=");
        return C22026a.c(sb2, this.f281225m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f281214b);
        parcel.writeSerializable(this.f281215c);
        parcel.writeSerializable(this.f281216d);
        Integer num = this.f281217e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f281218f;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        parcel.writeStringList(this.f281219g);
        Boolean bool = this.f281220h;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Integer num3 = this.f281221i;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        Boolean bool2 = this.f281222j;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeString(this.f281223k);
        parcel.writeString(this.f281224l);
        parcel.writeString(this.f281225m);
    }
}
