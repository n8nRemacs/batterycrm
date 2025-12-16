package com.avito.android.short_term_rent.bookingform.promocode;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.short_term_rent.deeplink.PromoCode;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormPromoCodeDialogFragmentOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/BookingFormPromoCodeDialogFragmentOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BookingFormPromoCodeDialogFragmentOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<BookingFormPromoCodeDialogFragmentOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f282072b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f282073c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f282074d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f282075e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f282076f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<PromoCode> f282077g;

    /* compiled from: BookingFormPromoCodeDialogFragmentOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BookingFormPromoCodeDialogFragmentOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final BookingFormPromoCodeDialogFragmentOpenParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BookingFormPromoCodeDialogFragmentOpenParams.class, parcel, arrayList, iL2, 1);
                }
            }
            return new BookingFormPromoCodeDialogFragmentOpenParams(arrayList, j12, string, string2, string3, string4);
        }

        @Override // android.os.Parcelable.Creator
        public final BookingFormPromoCodeDialogFragmentOpenParams[] newArray(int i12) {
            return new BookingFormPromoCodeDialogFragmentOpenParams[i12];
        }
    }

    public BookingFormPromoCodeDialogFragmentOpenParams(@l List list, long j12, @k String str, @k String str2, @l String str3, @l String str4) {
        this.f282072b = j12;
        this.f282073c = str;
        this.f282074d = str2;
        this.f282075e = str3;
        this.f282076f = str4;
        this.f282077g = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingFormPromoCodeDialogFragmentOpenParams)) {
            return false;
        }
        BookingFormPromoCodeDialogFragmentOpenParams bookingFormPromoCodeDialogFragmentOpenParams = (BookingFormPromoCodeDialogFragmentOpenParams) obj;
        return this.f282072b == bookingFormPromoCodeDialogFragmentOpenParams.f282072b && L.f(this.f282073c, bookingFormPromoCodeDialogFragmentOpenParams.f282073c) && L.f(this.f282074d, bookingFormPromoCodeDialogFragmentOpenParams.f282074d) && L.f(this.f282075e, bookingFormPromoCodeDialogFragmentOpenParams.f282075e) && L.f(this.f282076f, bookingFormPromoCodeDialogFragmentOpenParams.f282076f) && L.f(this.f282077g, bookingFormPromoCodeDialogFragmentOpenParams.f282077g);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(Long.hashCode(this.f282072b) * 31, 31, this.f282073c), 31, this.f282074d);
        String str = this.f282075e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f282076f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PromoCode> list = this.f282077g;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingFormPromoCodeDialogFragmentOpenParams(itemId=");
        sb2.append(this.f282072b);
        sb2.append(", title=");
        sb2.append(this.f282073c);
        sb2.append(", buttonTitle=");
        sb2.append(this.f282074d);
        sb2.append(", inputHint=");
        sb2.append(this.f282075e);
        sb2.append(", bookingContext=");
        sb2.append(this.f282076f);
        sb2.append(", promoCodes=");
        return H.p(sb2, this.f282077g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f282072b);
        parcel.writeString(this.f282073c);
        parcel.writeString(this.f282074d);
        parcel.writeString(this.f282075e);
        parcel.writeString(this.f282076f);
        List<PromoCode> list = this.f282077g;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), i12);
        }
    }
}
