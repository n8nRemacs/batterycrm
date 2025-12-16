package com.avito.android.str_seller_orders.orders_filters.domain.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersFiltersDisplaying.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/domain/models/StrOrdersFiltersDisplaying;", "Landroid/os/Parcelable;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StrOrdersFiltersDisplaying implements Parcelable {

    @k
    public static final Parcelable.Creator<StrOrdersFiltersDisplaying> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f289156b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f289157c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final StrOrdersFiltersItemStyle f289158d;

    /* compiled from: StrOrdersFiltersDisplaying.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrOrdersFiltersDisplaying> {
        @Override // android.os.Parcelable.Creator
        public final StrOrdersFiltersDisplaying createFromParcel(Parcel parcel) {
            return new StrOrdersFiltersDisplaying(parcel.readString(), parcel.readString(), StrOrdersFiltersItemStyle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StrOrdersFiltersDisplaying[] newArray(int i12) {
            return new StrOrdersFiltersDisplaying[i12];
        }
    }

    public StrOrdersFiltersDisplaying(@l String str, @k String str2, @k StrOrdersFiltersItemStyle strOrdersFiltersItemStyle) {
        this.f289156b = str;
        this.f289157c = str2;
        this.f289158d = strOrdersFiltersItemStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrOrdersFiltersDisplaying)) {
            return false;
        }
        StrOrdersFiltersDisplaying strOrdersFiltersDisplaying = (StrOrdersFiltersDisplaying) obj;
        return L.f(this.f289156b, strOrdersFiltersDisplaying.f289156b) && L.f(this.f289157c, strOrdersFiltersDisplaying.f289157c) && this.f289158d == strOrdersFiltersDisplaying.f289158d;
    }

    public final int hashCode() {
        String str = this.f289156b;
        return this.f289158d.hashCode() + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f289157c);
    }

    @k
    public final String toString() {
        return "StrOrdersFiltersDisplaying(headerTitle=" + this.f289156b + ", buttonTitle=" + this.f289157c + ", itemStyle=" + this.f289158d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f289156b);
        parcel.writeString(this.f289157c);
        this.f289158d.writeToParcel(parcel, i12);
    }
}
