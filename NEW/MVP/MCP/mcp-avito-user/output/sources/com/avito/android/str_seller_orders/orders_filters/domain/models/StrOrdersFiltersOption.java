package com.avito.android.str_seller_orders.orders_filters.domain.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersFiltersOption.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/domain/models/StrOrdersFiltersOption;", "Landroid/os/Parcelable;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StrOrdersFiltersOption implements Parcelable {

    @k
    public static final Parcelable.Creator<StrOrdersFiltersOption> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f289163b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f289164c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f289165d;

    /* compiled from: StrOrdersFiltersOption.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrOrdersFiltersOption> {
        @Override // android.os.Parcelable.Creator
        public final StrOrdersFiltersOption createFromParcel(Parcel parcel) {
            return new StrOrdersFiltersOption(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StrOrdersFiltersOption[] newArray(int i12) {
            return new StrOrdersFiltersOption[i12];
        }
    }

    public StrOrdersFiltersOption(@k String str, @k String str2, boolean z12) {
        this.f289163b = str;
        this.f289164c = str2;
        this.f289165d = z12;
    }

    public static StrOrdersFiltersOption a(StrOrdersFiltersOption strOrdersFiltersOption, boolean z12) {
        String str = strOrdersFiltersOption.f289163b;
        String str2 = strOrdersFiltersOption.f289164c;
        strOrdersFiltersOption.getClass();
        return new StrOrdersFiltersOption(str, str2, z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrOrdersFiltersOption)) {
            return false;
        }
        StrOrdersFiltersOption strOrdersFiltersOption = (StrOrdersFiltersOption) obj;
        return L.f(this.f289163b, strOrdersFiltersOption.f289163b) && L.f(this.f289164c, strOrdersFiltersOption.f289164c) && this.f289165d == strOrdersFiltersOption.f289165d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f289165d) + H.d(this.f289163b.hashCode() * 31, 31, this.f289164c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersFiltersOption(id=");
        sb2.append(this.f289163b);
        sb2.append(", title=");
        sb2.append(this.f289164c);
        sb2.append(", isSelected=");
        return r.x(sb2, this.f289165d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f289163b);
        parcel.writeString(this.f289164c);
        parcel.writeInt(this.f289165d ? 1 : 0);
    }
}
