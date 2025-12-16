package com.avito.android.str_seller_orders.orders_filters;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersFiltersResult.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/StrOrdersFiltersResult;", "Landroid/os/Parcelable;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StrOrdersFiltersResult implements Parcelable {

    @k
    public static final Parcelable.Creator<StrOrdersFiltersResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f289124b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ArrayList f289125c;

    /* compiled from: StrOrdersFiltersResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrOrdersFiltersResult> {
        @Override // android.os.Parcelable.Creator
        public final StrOrdersFiltersResult createFromParcel(Parcel parcel) {
            return new StrOrdersFiltersResult(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final StrOrdersFiltersResult[] newArray(int i12) {
            return new StrOrdersFiltersResult[i12];
        }
    }

    public StrOrdersFiltersResult(@k String str, @l ArrayList arrayList) {
        this.f289124b = str;
        this.f289125c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrOrdersFiltersResult)) {
            return false;
        }
        StrOrdersFiltersResult strOrdersFiltersResult = (StrOrdersFiltersResult) obj;
        return L.f(this.f289124b, strOrdersFiltersResult.f289124b) && L.f(this.f289125c, strOrdersFiltersResult.f289125c);
    }

    public final int hashCode() {
        int iHashCode = this.f289124b.hashCode() * 31;
        ArrayList arrayList = this.f289125c;
        return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersFiltersResult(filterId=");
        sb2.append(this.f289124b);
        sb2.append(", selectedIds=");
        return e.p(sb2, this.f289125c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f289124b);
        parcel.writeStringList(this.f289125c);
    }
}
