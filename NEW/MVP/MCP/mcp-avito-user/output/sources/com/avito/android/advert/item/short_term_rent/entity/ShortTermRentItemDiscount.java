package com.avito.android.advert.item.short_term_rent.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ShortTermRentItemDiscount.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/entity/ShortTermRentItemDiscount;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ShortTermRentItemDiscount implements Parcelable {

    @k
    public static final Parcelable.Creator<ShortTermRentItemDiscount> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f80024b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f80025c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f80026d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f80027e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f80028f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f80029g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Uri f80030h;

    /* compiled from: ShortTermRentItemDiscount.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ShortTermRentItemDiscount> {
        @Override // android.os.Parcelable.Creator
        public final ShortTermRentItemDiscount createFromParcel(Parcel parcel) {
            return new ShortTermRentItemDiscount(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(ShortTermRentItemDiscount.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortTermRentItemDiscount[] newArray(int i12) {
            return new ShortTermRentItemDiscount[i12];
        }
    }

    public ShortTermRentItemDiscount(@k String str, @k String str2, boolean z12, @k String str3, @k String str4, @k String str5, @l Uri uri) {
        this.f80024b = str;
        this.f80025c = str2;
        this.f80026d = z12;
        this.f80027e = str3;
        this.f80028f = str4;
        this.f80029g = str5;
        this.f80030h = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortTermRentItemDiscount)) {
            return false;
        }
        ShortTermRentItemDiscount shortTermRentItemDiscount = (ShortTermRentItemDiscount) obj;
        return L.f(this.f80024b, shortTermRentItemDiscount.f80024b) && L.f(this.f80025c, shortTermRentItemDiscount.f80025c) && this.f80026d == shortTermRentItemDiscount.f80026d && L.f(this.f80027e, shortTermRentItemDiscount.f80027e) && L.f(this.f80028f, shortTermRentItemDiscount.f80028f) && L.f(this.f80029g, shortTermRentItemDiscount.f80029g) && L.f(this.f80030h, shortTermRentItemDiscount.f80030h);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(r.i(H.d(this.f80024b.hashCode() * 31, 31, this.f80025c), 31, this.f80026d), 31, this.f80027e), 31, this.f80028f), 31, this.f80029g);
        Uri uri = this.f80030h;
        return iD2 + (uri == null ? 0 : uri.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShortTermRentItemDiscount(title=");
        sb2.append(this.f80024b);
        sb2.append(", description=");
        sb2.append(this.f80025c);
        sb2.append(", isToggleEnabled=");
        sb2.append(this.f80026d);
        sb2.append(", totalPrice=");
        sb2.append(this.f80027e);
        sb2.append(", priceWithDiscount=");
        sb2.append(this.f80028f);
        sb2.append(", discountPercent=");
        sb2.append(this.f80029g);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.t(sb2, this.f80030h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f80024b);
        parcel.writeString(this.f80025c);
        parcel.writeInt(this.f80026d ? 1 : 0);
        parcel.writeString(this.f80027e);
        parcel.writeString(this.f80028f);
        parcel.writeString(this.f80029g);
        parcel.writeParcelable(this.f80030h, i12);
    }
}
