package com.avito.android.short_term_rent.promo_codes.ui;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.short_term_rent.common.entity.PromoCode;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSoftBookingPromoCodesDialogOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/ui/StrSoftBookingPromoCodesDialogOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StrSoftBookingPromoCodesDialogOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<StrSoftBookingPromoCodesDialogOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f282500b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f282501c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f282502d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f282503e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final PromoCode f282504f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ArrayList f282505g;

    /* compiled from: StrSoftBookingPromoCodesDialogOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrSoftBookingPromoCodesDialogOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final StrSoftBookingPromoCodesDialogOpenParams createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList arrayList = null;
            PromoCode promoCodeCreateFromParcel = parcel.readInt() == 0 ? null : PromoCode.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(PromoCode.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new StrSoftBookingPromoCodesDialogOpenParams(string, string2, string3, string4, promoCodeCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StrSoftBookingPromoCodesDialogOpenParams[] newArray(int i12) {
            return new StrSoftBookingPromoCodesDialogOpenParams[i12];
        }
    }

    public StrSoftBookingPromoCodesDialogOpenParams(@l String str, @l String str2, @l String str3, @l String str4, @l PromoCode promoCode, @l ArrayList arrayList) {
        this.f282500b = str;
        this.f282501c = str2;
        this.f282502d = str3;
        this.f282503e = str4;
        this.f282504f = promoCode;
        this.f282505g = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrSoftBookingPromoCodesDialogOpenParams)) {
            return false;
        }
        StrSoftBookingPromoCodesDialogOpenParams strSoftBookingPromoCodesDialogOpenParams = (StrSoftBookingPromoCodesDialogOpenParams) obj;
        return L.f(this.f282500b, strSoftBookingPromoCodesDialogOpenParams.f282500b) && L.f(this.f282501c, strSoftBookingPromoCodesDialogOpenParams.f282501c) && L.f(this.f282502d, strSoftBookingPromoCodesDialogOpenParams.f282502d) && L.f(this.f282503e, strSoftBookingPromoCodesDialogOpenParams.f282503e) && L.f(this.f282504f, strSoftBookingPromoCodesDialogOpenParams.f282504f) && L.f(this.f282505g, strSoftBookingPromoCodesDialogOpenParams.f282505g);
    }

    public final int hashCode() {
        String str = this.f282500b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f282501c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f282502d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f282503e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PromoCode promoCode = this.f282504f;
        int iHashCode5 = (iHashCode4 + (promoCode == null ? 0 : promoCode.hashCode())) * 31;
        ArrayList arrayList = this.f282505g;
        return iHashCode5 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrSoftBookingPromoCodesDialogOpenParams(advertId=");
        sb2.append(this.f282500b);
        sb2.append(", title=");
        sb2.append(this.f282501c);
        sb2.append(", buttonTitle=");
        sb2.append(this.f282502d);
        sb2.append(", inputPlaceHolder=");
        sb2.append(this.f282503e);
        sb2.append(", selectedPromoCode=");
        sb2.append(this.f282504f);
        sb2.append(", promoCodes=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f282505g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f282500b);
        parcel.writeString(this.f282501c);
        parcel.writeString(this.f282502d);
        parcel.writeString(this.f282503e);
        PromoCode promoCode = this.f282504f;
        if (promoCode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoCode.writeToParcel(parcel, i12);
        }
        ArrayList arrayList = this.f282505g;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
        while (itY.hasNext()) {
            ((PromoCode) itY.next()).writeToParcel(parcel, i12);
        }
    }
}
