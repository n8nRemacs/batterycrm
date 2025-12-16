package com.avito.android.short_term_rent.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: BookingFormDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/deeplink/BookingFormDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_short-term-rent_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class BookingFormDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<BookingFormDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f282228b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Date f282229c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Date f282230d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f282231e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f282232f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<String> f282233g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Integer f282234h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Boolean f282235i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f282236j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Boolean f282237k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f282238l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f282239m;

    /* compiled from: BookingFormDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BookingFormDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final BookingFormDeepLink createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            Date date = (Date) parcel.readSerializable();
            Date date2 = (Date) parcel.readSerializable();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BookingFormDeepLink(boolValueOf, boolValueOf2, numValueOf, numValueOf2, numValueOf3, string, string2, parcel.readString(), parcel.readString(), date, date2, arrayListCreateStringArrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BookingFormDeepLink[] newArray(int i12) {
            return new BookingFormDeepLink[i12];
        }
    }

    /* compiled from: BookingFormDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/deeplink/BookingFormDeepLink$b;", "", "a", "Lcom/avito/android/short_term_rent/deeplink/BookingFormDeepLink$b$a;", "_avito_short-term-rent_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: BookingFormDeepLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/short_term_rent/deeplink/BookingFormDeepLink$b$a;", "Lcom/avito/android/short_term_rent/deeplink/BookingFormDeepLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_short-term-rent_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f282240b = new a();
        }
    }

    public BookingFormDeepLink(@l Boolean bool, @l Boolean bool2, @l Integer num, @l Integer num2, @l Integer num3, @k String str, @l String str2, @l String str3, @l String str4, @k Date date, @k Date date2, @l List list) {
        this.f282228b = str;
        this.f282229c = date;
        this.f282230d = date2;
        this.f282231e = num;
        this.f282232f = num2;
        this.f282233g = list;
        this.f282234h = num3;
        this.f282235i = bool;
        this.f282236j = str2;
        this.f282237k = bool2;
        this.f282238l = str3;
        this.f282239m = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingFormDeepLink)) {
            return false;
        }
        BookingFormDeepLink bookingFormDeepLink = (BookingFormDeepLink) obj;
        return L.f(this.f282228b, bookingFormDeepLink.f282228b) && L.f(this.f282229c, bookingFormDeepLink.f282229c) && L.f(this.f282230d, bookingFormDeepLink.f282230d) && L.f(this.f282231e, bookingFormDeepLink.f282231e) && L.f(this.f282232f, bookingFormDeepLink.f282232f) && L.f(this.f282233g, bookingFormDeepLink.f282233g) && L.f(this.f282234h, bookingFormDeepLink.f282234h) && L.f(this.f282235i, bookingFormDeepLink.f282235i) && L.f(this.f282236j, bookingFormDeepLink.f282236j) && L.f(this.f282237k, bookingFormDeepLink.f282237k) && L.f(this.f282238l, bookingFormDeepLink.f282238l) && L.f(this.f282239m, bookingFormDeepLink.f282239m);
    }

    public final int hashCode() {
        int iF2 = m.f(this.f282230d, m.f(this.f282229c, this.f282228b.hashCode() * 31, 31), 31);
        Integer num = this.f282231e;
        int iHashCode = (iF2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f282232f;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list = this.f282233g;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.f282234h;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.f282235i;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f282236j;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.f282237k;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.f282238l;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f282239m;
        return iHashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingFormDeepLink(itemId=");
        sb2.append(this.f282228b);
        sb2.append(", checkIn=");
        sb2.append(this.f282229c);
        sb2.append(", checkOut=");
        sb2.append(this.f282230d);
        sb2.append(", totalGuestsCount=");
        sb2.append(this.f282231e);
        sb2.append(", adultGuestsCount=");
        sb2.append(this.f282232f);
        sb2.append(", childrenAges=");
        sb2.append(this.f282233g);
        sb2.append(", guestsDetailedValueVersion=");
        sb2.append(this.f282234h);
        sb2.append(", nonRefundableDiscountEnable=");
        sb2.append(this.f282235i);
        sb2.append(", paymentType=");
        sb2.append(this.f282236j);
        sb2.append(", withPets=");
        sb2.append(this.f282237k);
        sb2.append(", source=");
        sb2.append(this.f282238l);
        sb2.append(", xHash=");
        return C22026a.c(sb2, this.f282239m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f282228b);
        parcel.writeSerializable(this.f282229c);
        parcel.writeSerializable(this.f282230d);
        Integer num = this.f282231e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f282232f;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        parcel.writeStringList(this.f282233g);
        Integer num3 = this.f282234h;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        Boolean bool = this.f282235i;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.f282236j);
        Boolean bool2 = this.f282237k;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeString(this.f282238l);
        parcel.writeString(this.f282239m);
    }
}
